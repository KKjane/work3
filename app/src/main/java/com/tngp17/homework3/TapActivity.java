package com.tngp17.homework3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by TNGP17-001 on 14-Aug-17.
 */

public class TapActivity extends AppCompatActivity {
    String tapNo = "";
    int count = 0;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tap);

        final TextView tvTap = (TextView) findViewById(R.id.tvTap);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            tapNo = bundle.getString("tapNo");
        }

        tvTap.setText("0");

        ImageButton ibCoin = (ImageButton) findViewById(R.id.ibCoin);
        ibCoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Integer.parseInt(tapNo) != count) {
                    count++;
                    tvTap.setText(count+"");
                } else {
                    Intent intent = new Intent(TapActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        });
    }
}
