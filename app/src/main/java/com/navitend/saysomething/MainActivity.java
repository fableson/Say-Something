package com.navitend.saysomething;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import android.util.Log;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        Log.i("IBM","Hello there logcat!");

        setContentView(R.layout.activity_main);

        final Button btnHitMe = (Button) findViewById(R.id.hitme);
        final Button btnMapMe = (Button) findViewById(R.id.mapme);
        final TextView tvLabel = (TextView) findViewById(R.id.thelabel);
        final EditText etLatitude = (EditText) findViewById(R.id.etLatitude);
        final EditText etLongitude = (EditText) findViewById(R.id.etLongitude);


        btnHitMe.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    tvLabel.setText("Ouch!");
                }

            }
        );


        btnMapMe.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    String coords = etLatitude.getText()+","+etLongitude.getText();
                    Log.i("IBM",coords);
                    Uri mapsIntentUri = Uri.parse("geo:" + coords);

                    Intent mapIntent = new Intent(Intent.ACTION_VIEW, mapsIntentUri);

                    startActivity(mapIntent);
                }
            }
        );
    }
}
