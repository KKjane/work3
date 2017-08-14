package com.tngp17.homework3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editText = (EditText) findViewById(R.id.editText);

        ImageButton ibPlay = (ImageButton) findViewById(R.id.ibPlay);

        ibPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editText.getText().length() != 0){
                    Intent intent = new Intent(MainActivity.this, TapActivity.class);
                    intent.putExtra("tapNo", editText.getText().toString());
                    startActivity(intent);
                }
            }
        });
    }

}
