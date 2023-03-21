package com.ms.projectnew;

import static com.ms.projectnew.R.id.Email;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

public class Signup extends AppCompatActivity {

    EditText Password,username;
    Button newuser,forgotpassword,login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_signup);

        username = findViewById(R.id.Email);
        forgotpassword = findViewById(R.id.forgotpassword);
        login=findViewById(R.id.login);

        Password = findViewById(R.id.password);
        Password.setTransformationMethod(PasswordTransformationMethod.getInstance());

        newuser = findViewById(R.id.newuser);

        newuser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Signup.this,register.class);
                startActivity(intent);
            }
        });

        forgotpassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}