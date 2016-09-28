package com.gdg.lafia.e_rer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setLogo(R.mipmap.ic_launcher);
        setSupportActionBar(toolbar);

    }

    public void police(View view) {
        startActivity(new Intent(this, police.class));
    }

    public void fire(View view) {
        startActivity(new Intent(this, fire.class));
    }

    public void ambulance(View view) {
        startActivity(new Intent(this, ambulance.class));
    }

    public void roadSafety(View view) {

        startActivity(new Intent(this, frsc.class));
    }

    public void nema(View view) {
        startActivity(new Intent(this, nema.class));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            // Code that run when activity is button is clicked
            startActivity(new Intent(this, about.class));
            return true;
        } else if (id == R.id.about_dev) {
            startActivity(new Intent(this, about_dev.class));
        }
        return super.onOptionsItemSelected(item);
    }
}
