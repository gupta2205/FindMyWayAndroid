package com.example.mgupta.findmywayandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.util.Base64;
import android.util.Log;
import android.widget.TextView;

import com.android.volley.AuthFailureError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.JsonRequest;
import com.android.volley.toolbox.Volley;
import com.android.volley.RequestQueue;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.google.gson.Gson;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class Result_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_);

        Intent i = getIntent();

        String Message = i.getStringExtra(MainActivity.FLightNumebrMessage);
        final TextView resultText = (TextView)findViewById(R.id.resultFlight);


        resultText.setText( "Flight Number :" + Message);


        //======================API CALL =======================================


        final TextView AircraftType = (TextView) findViewById(R.id.AircraftType);
        final TextView DepartureGate = (TextView) findViewById(R.id.DepartureGate);
        final TextView ArrivalGate = (TextView) findViewById(R.id.ArrivalGate);
        final TextView DepartureTime = (TextView) findViewById(R.id.DepartureTime);

        // Instantiate the RequestQueue.
        RequestQueue queue = Volley.newRequestQueue(this);
        String url = "https://flightxml.flightaware.com/json/FlightXML3/FlightInfoStatus?ident=ASA"+Message+"&include_ex_data=true";

        // Request a string response from the provided URL.
        JsonObjectRequest JsonRequest = new JsonObjectRequest(Request.Method.GET,
                url, null,
                new Response.Listener<JSONObject>() {

                    @Override
                    public void onResponse(JSONObject response) {
                        System.out.print(response);
                        try {
                            String test=  response.getString("FlightInfoStatusResult");
                            Gson gson = new Gson();
                            final FlightInfoStatusResult flightInfoStatusResult = gson.fromJson(test, FlightInfoStatusResult.class);
//                            test = flightInfoStatusResult.getFlights().get(0).getAircrafttype();
//
//                            AircraftType.setText("Aircraft Type: "+ test);
                           // DepartureGate.setText("DepartureGate");


                            final String AircraftTypeText = flightInfoStatusResult.getFlights().get(0).getAircrafttype();
                            final String DepartureGateText = flightInfoStatusResult.getFlights().get(0).getGateOrig();
                            final String ArrivalGateText = flightInfoStatusResult.getFlights().get(0).getGateDest();
                            final String DepartureTimeText = flightInfoStatusResult.getFlights().get(0).getFiledDepartureTime().getTime();

                            AircraftType.setText("Aircraft Type : "+ AircraftTypeText);
                            DepartureGate.setText("Departure Gate : "+ DepartureGateText);
                            ArrivalGate.setText("Arrival Gate : " + ArrivalGateText);
                            DepartureTime.setText("Departure Time : " +DepartureTimeText);


                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                       // JSONObject textVal = response["FlightInfoStatusResult"]["flights"][0]["filed_departure_time"]["date"] ;




                        //mTextView.setText("Response is: "+ test.toString());
                    }
                },

                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        AircraftType.setText("That didn't work!");
                    }}
            )

        {
            @Override
            public Map<String, String> getHeaders() throws AuthFailureError {
                Map<String, String> headers = new HashMap<>();
                String credentials = "kimate:6ea9e24e929403785d2f2bd99684a76fda3aed14";
                String auth = "Basic "
                        + Base64.encodeToString(credentials.getBytes(), Base64.NO_WRAP);
                headers.put("Content-Type", "application/json");
                headers.put("Authorization", auth);
                return headers;
            }


        };


        // Add the request to the RequestQueue.
        queue.add(JsonRequest);


        // ==============================END API CALL========================
    }
}



//================
//JsonObjectRequest jsonObjReq = new JsonObjectRequest(Request.Method.GET,
//        url, null,
//        new Response.Listener() {
//            @Override
//            public void onResponse(JSONObject response) {
//                //Success Callback
//            }
//        },
//        new Response.ErrorListener() {
//            @Override
//            public void onErrorResponse(VolleyError error) {
//                //Failure Callback
//            }
//        })
//{
//    /** Passing some request headers* */
//    @Override
//    public Map getHeaders() throws AuthFailureError {
//        HashMap headers = new HashMap();
//        headers.put("Content-Type", "application/json");
//        headers.put("apiKey", "xxxxxxxxxxxxxxx");
//        return headers;
//    }
//};