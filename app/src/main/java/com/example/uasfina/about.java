package com.example.uasfina;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class about extends FragmentActivity implements View.OnClickListener {
    private Button btnBiodata, btnSharing, btnSosmed, btnExit;
    biodata biodata;
    sharing sharing;
    sosmed sosmed;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        btnBiodata = (Button) findViewById(R.id.biodata);
        btnSharing = (Button) findViewById(R.id.sharing);
        btnSosmed = (Button) findViewById(R.id.sosmed);
        btnExit = (Button) findViewById(R.id.exit);

        btnBiodata.setOnClickListener(this);
        btnSharing.setOnClickListener(this);
        btnSosmed.setOnClickListener(this);
        btnExit.setOnClickListener(this);

    }

    void mBiodata(){
        biodata = new biodata ();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction().replace(R.id.container, biodata);
        ft.commit();

    }
    void mSharing(){
        sharing = new sharing ();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction().replace(R.id.container,sharing);
        ft.commit();
    }
    void mSosmed(){
         sosmed = new sosmed ();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction().replace(R.id.container, sosmed);
        ft.commit();

    }
    void mExit() {
        finish();
    }


    @Override
    public void onClick(View view) {

        if (view == btnBiodata) {
            mBiodata();
        }
        if (view == btnSharing) {
            mSharing();
        }
        if (view == btnSosmed) {
            mSosmed();
        }
        if (view == btnExit) {
            mExit();
        }
    }
}
