package com.gdg.lafia.e_rer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class Vehicle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vehicle);
    }

    public void report(View view) {
        EditText locationField = (EditText) findViewById(R.id.locationid);
        String location = locationField.getText().toString();

        EditText vehicleTypeField = (EditText) findViewById(R.id.vtypeid);
        String vehicleType = vehicleTypeField.getText().toString();

        EditText plateNoField = (EditText) findViewById(R.id.plateid);
        String plateno = plateNoField.getText().toString();

        EditText timeField = (EditText) findViewById(R.id.timeid);
        String time = timeField.getText().toString();

        CheckBox withArm = (CheckBox) findViewById(R.id.armedbox);
        String armedbox = (withArm.isChecked()) ? "Yes" : "No";

        String content = smsSummary(location, vehicleType, plateno, time, armedbox);
        String number = "1";
        SmsManager smsManager = SmsManager.getDefault();
        Toast.makeText(getApplicationContext(), "Thank You for Reporting, Dispatch Team will be sent Immediately", Toast.LENGTH_LONG).show();
        smsManager.sendTextMessage(number, null, content, null, null);
    }

    public String smsSummary(String location, String vehicleType, String plateno, String time, String armedbox) {
        String content = "Vehicle Theft at " + location;
        content += "\nVehicle Type = " + vehicleType;
        content += "\nPlate Number = " + plateno;
        content += "Time of Theft = " + time;
        content += "Armed Status = " + armedbox;
        return content;
    }
}
