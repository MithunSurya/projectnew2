package com.ms.projectnew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class register extends AppCompatActivity {

    EditText pass,Confirm,name,user,email,phone;
    Button have,signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        name = findViewById(R.id.name);
        user=findViewById(R.id.User);
        email=findViewById(R.id.email);
        phone=findViewById(R.id.phone);
        signup=findViewById(R.id.signup);


        pass = findViewById(R.id.pass);
        pass.setTransformationMethod(PasswordTransformationMethod.getInstance());

        Confirm = findViewById(R.id.Confirm);
        Confirm.setTransformationMethod(PasswordTransformationMethod.getInstance());

        have = findViewById(R.id.have);
        have.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(register.this,Signup.class);
                startActivity(intent);
            }
        });

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}