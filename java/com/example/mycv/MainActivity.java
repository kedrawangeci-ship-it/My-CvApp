package com.example.mycv;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import com.example.mycv.R;

public class MainActivity extends Activity {

    Button btnContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnContact = findViewById(R.id.btnContact);

        btnContact.setOnClickListener(v -> {
            Toast.makeText(
                    MainActivity.this,
                    "Thank you for viewing my CV!",
                    Toast.LENGTH_LONG
            ).show();
        });
    }
}