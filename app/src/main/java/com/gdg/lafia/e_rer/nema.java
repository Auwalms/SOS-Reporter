package com.gdg.lafia.e_rer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class nema extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nema);
    }

    public void flooding(View view) {
        Intent floodIntent = new Intent(this, flooding.class);
        Toast.makeText(getApplicationContext(), "Flooding has been clicked", Toast.LENGTH_SHORT).show();
        startActivity(floodIntent);
    }

    public void crisis(View view) {
        Intent crisisIntent = new Intent(this, crisis.class);
        Toast.makeText(getApplicationContext(), "Communal Crisis has been clicked", Toast.LENGTH_SHORT).show();
        startActivity(crisisIntent);
    }

    public void outbreak(View view) {
        Intent outbreakIntent = new Intent(this, outbreak.class);
        Toast.makeText(getApplicationContext(), "Disease Outbreak has been clicked", Toast.LENGTH_SHORT).show();
        startActivity(outbreakIntent);
    }

}

