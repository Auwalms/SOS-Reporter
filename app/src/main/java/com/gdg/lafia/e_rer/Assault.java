package com.gdg.lafia.e_rer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import static com.gdg.lafia.e_rer.R.id.armedbox;

public class Assault extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assault);
    }

    public void report(View view) {
        EditText locationField = (EditText) findViewById(R.id.locationid);
        String location = locationField.getText().toString();

        CheckBox withArm = (CheckBox) findViewById(armedbox);
        String armedbox = (withArm.isChecked()) ? "Yes" : "No";

        String content = smsSummary(location, armedbox);
        String number = "1";
        SmsManager smsManager = SmsManager.getDefault();
        Toast.makeText(getApplicationContext(), "Thank You for Reporting, Dispatch Team will be sent Immediately", Toast.LENGTH_LONG).show();
        smsManager.sendTextMessage(number, null, content, null, null);
        Intent close = new Intent(this, MainActivity.class);
        startActivity(close);


    }

    private String smsSummary(String location, String armedbox) {
        String content = "We need help, there is an assault at " + location + "\nArmed Status = " + armedbox;
        return content;

    }
}
