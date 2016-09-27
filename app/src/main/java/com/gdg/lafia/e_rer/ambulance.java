package com.gdg.lafia.e_rer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class ambulance extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ambulance);
    }

    public void accident(View view) {
        Intent ambaccidentIntent = new Intent(this, ambaccident.class);
        Toast.makeText(getApplicationContext(), "Accident has been clicked", Toast.LENGTH_SHORT).show();
        startActivity(ambaccidentIntent);
    }

    public void medical(View view) {
        Intent ambmedicalIntent = new Intent(this, ambmedical.class);
        Toast.makeText(getApplicationContext(), "Medical  has been clicked", Toast.LENGTH_SHORT).show();
        startActivity(ambmedicalIntent);
    }

    public void fire(View view) {
        Intent ambfireIntent = new Intent(this, ambfire.class);
        Toast.makeText(getApplicationContext(), "Fire has been clicked", Toast.LENGTH_SHORT).show();
        startActivity(ambfireIntent);

    }

    public void riot(View view) {
        Intent ambriotIntent = new Intent(this, ambriot.class);
        Toast.makeText(getApplicationContext(), "Riot has been clicked", Toast.LENGTH_SHORT).show();
        startActivity(ambriotIntent);
    }
}
