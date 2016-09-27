package com.gdg.lafia.e_rer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class frsc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frsc);
    }

    public void carAccident(View view) {
        Intent carIntent = new Intent(this, accident.class);
        Toast.makeText(getApplicationContext(), "Car Incident has been clicked", Toast.LENGTH_SHORT).show();
        startActivity(carIntent);
    }

    public void fallenVehicle(View view) {
        Intent fallIntent = new Intent(this, fallen.class);
        Toast.makeText(getApplicationContext(), "Fallen Vehicle  has been clicked", Toast.LENGTH_SHORT).show();
        startActivity(fallIntent);
    }

    public void traffic(View view) {
        Intent trafficIntent = new Intent(this, traffic.class);
        Toast.makeText(getApplicationContext(), "Traffic Congestion has been clicked", Toast.LENGTH_SHORT).show();
        startActivity(trafficIntent);

    }



}
