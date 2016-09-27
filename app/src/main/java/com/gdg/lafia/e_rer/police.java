package com.gdg.lafia.e_rer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class police extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_police);
    }

    public void robbery(View view) {
        Intent robIntent = new Intent(this, Robbery.class);
        Toast.makeText(getApplicationContext(), "Robbery has been clicked", Toast.LENGTH_LONG).show();
        startActivity(robIntent);
    }

    public void riot(View view) {
        Intent riotIntent = new Intent(this, Riot.class);
        Toast.makeText(getApplicationContext(), "Riot has been clicked", Toast.LENGTH_SHORT).show();
        startActivity(riotIntent);

    }

    public void assault(View view) {
        Intent assaultIntent = new Intent(this, Assault.class);
        Toast.makeText(getApplicationContext(), "Assault has been clicked", Toast.LENGTH_SHORT).show();
        startActivity(assaultIntent);
    }

    public void rape(View view) {
        Intent rapeIntent = new Intent(this, Rape.class);
        Toast.makeText(getApplicationContext(), "Rape is clicked", Toast.LENGTH_SHORT).show();
        startActivity(rapeIntent);

    }

    public void vtheft(View view) {
        Intent theftIntent = new Intent(this, Vehicle.class);
        Toast.makeText(getApplicationContext(), "Vehicle Thief is clicked", Toast.LENGTH_SHORT).show();
        startActivity(theftIntent);

    }

}

