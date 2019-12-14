package com.example.uasfina;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class food extends AppCompatActivity {
    ListView listView;
    String mTitle [] = {"Pempek","Laksan","Celimpungan","Srikayo","Tekwan","Tempoyak"};
    int image[] = {R.drawable.pempek,R.drawable.laksan,R.drawable.celimpungan,R.drawable.srikayo,R.drawable.tekwan,R.drawable.tempoyak};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
        listView = findViewById(R.id.mylistview);

        MyAdapter adapter = new MyAdapter(this, mTitle, image);
        listView.setAdapter(adapter);
    }

    class MyAdapter extends ArrayAdapter<String> {

        Context context;
        String rTitle[];
        int rImg[];

        MyAdapter (Context c, String title[], int img[]){

            super(c, R.layout.row, R.id.textview1,title);
            this.context = c;
            this.rTitle = title;
            this.rImg = img;
        }

        @NonNull
        @Override
        public View getView (int position, View convertView, ViewGroup parent){

            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.row, parent, false);
            ImageView image = row.findViewById(R.id.imagee);
            TextView myTitle = row.findViewById(R.id.textview1);

            image.setImageResource(rImg[position]);
            myTitle.setText(rTitle[position]);

            return row;
        }
    }
}
