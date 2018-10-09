package com.marolix.aromafood.fragments;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.marolix.aromafood.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

public class FragRestaurant extends Fragment {

    /*ProgressDialog mProgressDialog;
    private List<JobListItem> jobListItems;
    private RecyclerView recyclerView;*/

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag_two, container, false);
       /* recyclerView = view.findViewById(R.id.recyclerView);

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        ArrayList<ChatBean> list = new ArrayList<>();

        jobListItems = new ArrayList<>();*/

        String url = "https://www.androidbegin.com/tutorial/jsonparsetutorial.txt";
//        String url = "https://github.com/Thirupathi76/SearchMap/raw/master/Parkingplaces/job_list.json";

//        new ResponseAsync().execute(url);

        return view;

    }

    /*private class ResponseAsync extends AsyncTask<String, Void, String> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            // Create a progressdialog
           *//* mProgressDialog = new ProgressDialog(getActivity());
            // Set progressdialog title
            mProgressDialog.setTitle("get response Tutorial");
            // Set progressdialog message
            mProgressDialog.setMessage("Loading...");
            mProgressDialog.setIndeterminate(false);
            // Show progressdialog
            mProgressDialog.show();*//*
        }

        @Override
        protected String doInBackground(String... urls) {

            String respURL = urls[0];

            try {
                // Download Image from URL

                URL url = new URL(respURL);
                URLConnection connection = new URL(respURL).openConnection();

                InputStream is = connection.getInputStream();

                StringBuffer buffer = new StringBuffer();
                BufferedReader reader = new BufferedReader(new InputStreamReader(is));

                String line;
                while ((line = reader.readLine()) != null) {
                    buffer.append(line + "\n");
                }

                Log.e("Why data ", buffer.toString());
                return buffer.toString();

            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(String result) {

            Log.e("Response data", result);
            try {
                JSONObject object = new JSONObject(result);
                JSONArray array = object.getJSONArray("job_list");
                for (int i =0; i<array.length(); i++){
                    JobListItem item = new JobListItem();
                    JSONObject list_obj = array.getJSONObject(i);
                    item.setPosName(list_obj.getString("pos_name"));
                    item.setExperience(list_obj.getString("experience"));
                    item.setLocation(list_obj.getString("location"));
                    item.setSalRange(list_obj.getString("sal_range"));
                    item.setKeySkills(list_obj.getString("key_skills"));
//                item.setPosName(list_obj.getString("pos_name"));
                    jobListItems.add(item);
                }
                recyclerView.setAdapter(new JobListAdapter(getActivity(), jobListItems));
            } catch (JSONException e) {
                e.printStackTrace();
            }
            mProgressDialog.dismiss();
        }
    }*/

    /*public String loadJSONFromAsset(String parking_json) {
        try {
            InputStream is = getActivity().getAssets().open(parking_json);
            byte[] buffer = new byte[is.available()];
            is.read(buffer);
            is.close();
            String json = new String(buffer, "UTF-8");
            return json;
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    private void getJson() {

        StringBuilder sb = new StringBuilder();
        try {
            JSONArray j1 = null;

            *//*String language = Utilities.getPreferncDetailes(this, Constants.Language_Selection);
            Log.e("Language", language);
            if ("te".equals(language)) {
                j1 = new JSONObject(loadJSONFromAsset(which_parking)).getJSONArray("data_telugu");
            } else if ("en".equals(language)) {

            }*//*


            *//*j1 = new JSONObject(loadJSONFromAsset(which_parking)).getJSONArray("data");
            Log.e("log json", String.valueOf(j1));
            for (int i = 0; i < j1.length(); i++) {
                JSONObject as = j1.optJSONObject(i);
                ParkingPojo pojo = new ParkingPojo();

                pojo.setId(as.optString("id"));
                pojo.setName(as.optString("parking_name"));
                pojo.setArea(as.optString("parking_area"));
                pojo.setCapacity(as.optString("parking_capacity"));
                pojo.setDistance(as.optString("parking_distance"));
                pojo.setStatus(as.optString("parking_status"));
                pojo.setLatitude(as.optString("parking_lat"));
                pojo.setLongitude(as.optString("parking_lang"));
                pojo.setMaplink(as.optString("parking_map_link"));
                pojo.setDist_gadde(as.optString("dist_gadde"));
                pojo.setDist_bus(as.optString("dist_bus_point"));

                arrayList.add(pojo);

            }
            adapter = new ParkingAdapter(this, arrayList);
            listViewParking.setAdapter(adapter);*//*
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/
}
