package com.example.hridoy.infotransfer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AnotherActivity extends AppCompatActivity {
    TextView displayTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);

        displayTextView = findViewById(R.id.display_tv);

        String userNameString = getIntent().getStringExtra("USERNAME");

        String phoneNumberString = getIntent().getStringExtra("PHONENUMBER");

        displayTextView.setText(userNameString + "\n" +phoneNumberString);

    }
}
