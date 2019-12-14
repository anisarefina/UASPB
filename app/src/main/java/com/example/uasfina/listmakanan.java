package com.example.uasfina;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class listmakanan extends AppCompatActivity {
    private ArrayList<resep> myResep = new ArrayList<>();
    private RecyclerView recyclerView;
    private RecyclerViewAdapter recyclerViewAdapter;
    private int id_categories;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listmakanan);

        recyclerView = findViewById(R.id.recycler);
        recyclerViewAdapter = new RecyclerViewAdapter(myResep, this);
        recyclerView.setAdapter(recyclerViewAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        Intent intent = getIntent();
        id_categories = intent.getIntExtra("CategoriesId", 0);

        MyArrayList();
    }
    private void MyArrayList(){
        RequestQueue queue = Volley.newRequestQueue(getApplicationContext());
        String url = "https://www.themealdb.com/api/json/v1/1/filter.php?c=Chicken"+id_categories;
        final JsonObjectRequest jsonReq = new JsonObjectRequest(url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try {
                    JSONArray arr = response.getJSONArray("meals");

                    for (int i=0; i<arr.length(); i++) {
                        JSONObject obj = arr.getJSONObject(i);
                        String strMeal = obj.getString("strMeal");
                        String strMealThumb = obj.getString("strMealThumb");
                        myResep.add(new resep(strMeal, strMealThumb));

                }
                    recyclerViewAdapter.notifyDataSetChanged();
                } catch (JSONException e) {
                    e.printStackTrace();
                    Toast.makeText(getApplication(),e.getMessage(),Toast.LENGTH_LONG).show();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
        queue.add(jsonReq);
    }
}
