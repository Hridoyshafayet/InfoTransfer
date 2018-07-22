package com.example.hridoy.infotransfer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.lang.reflect.AnnotatedElement;

public class MainActivity extends AppCompatActivity {

    EditText userNameEditText, phoneNumberEditText;
    Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userNameEditText = findViewById(R.id.userName_et);
        phoneNumberEditText = findViewById(R.id.phoneNumber_et);
        submitButton = findViewById(R.id.submit_btn);





        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 String userNameString = userNameEditText.getText().toString();
                 String phoneNumberString = phoneNumberEditText.getText().toString();


                if (userNameString.equals("") || phoneNumberString.equals("")){

                    Toast.makeText(MainActivity.this,"You" +
                            " hove to fill all the field",Toast.LENGTH_LONG).show();

                }else {

                    Intent dataTransferIntent = new
                            Intent(MainActivity.this,AnotherActivity.class);
                    dataTransferIntent.putExtra("USERNAME",userNameString);
                    dataTransferIntent.putExtra("PHONENUMBER",phoneNumberString);
                    startActivity(dataTransferIntent);

                }


            }
        });




    }
}
