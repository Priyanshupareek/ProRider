package com.startup.prorider;

import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    private Animation frombottom;
    private TextView tv;
    private TextView tv2;
    private EditText name;
    private EditText pass;
    private EditText email;
    private EditText conf;
    private Button b1;
    private String name1;
    private String email1;
    private String pass1;
    private String conf1;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        frombottom = AnimationUtils.loadAnimation(this, R.anim.frombottom);

        name = findViewById(R.id.etRegName);
        pass = findViewById(R.id.etRegPass);
        conf = findViewById(R.id.etRegPassConf);
        email = findViewById(R.id.etRegEmail);
        tv = findViewById(R.id.tvReg);
        tv2 = findViewById(R.id.tvRegtoLog);
        b1 = findViewById(R.id.btReg);

        b1.setAnimation(frombottom);
        tv.setText("Registration");
        tv2.setText("Already Signed up? Login");
        tv.setTextColor(Color.BLACK);
        tv2.setTextColor(Color.BLACK);
        name.setHint("Name");
        email.setHint("E-mail ID");
        pass.setHint("Set Password");
        conf.setHint("Confirm Password");
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                name1 = name.getText().toString().trim();
                email1 = email.getText().toString().trim();
                pass1 = pass.getText().toString().trim();
                conf1 = conf.getText().toString().trim();
                if (name1.isEmpty() || email1.isEmpty() || pass1.isEmpty() || conf1.isEmpty()) {
                    Toast.makeText(RegisterActivity.this, "Field cannot be empty", Toast.LENGTH_SHORT).show();
                } else {
                    name.setText("");
                    email.setText("");
                    pass.setText("");
                    conf.setText("");
                    Toast.makeText(RegisterActivity.this, "Successfully Registered", Toast.LENGTH_SHORT).show();
                }
            }
            });
        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(i2);
            }
        });

    }

/*
    @Override
    public void onClick(View v) {
        int id = v.getId();
        System.out.println("ID value = " + id);//debug
        switch (id) {
            case R.id.btReg:
                if (validate()) {
                    name.setText("");
                    email.setText("");
                    pass.setText("");
                    conf.setText("");
                    Toast.makeText(RegisterActivity.this, "Successfully Registered", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.tvRegtoLog:
                    Intent i2 = new Intent(this, LoginActivity.class);
                    startActivity(i2);
                break;
        }
    }
    private Boolean validate()
    {
        Boolean result = false;
        if(name1.isEmpty() || email1.isEmpty() || pass1.isEmpty() || conf1.isEmpty())
        {
            Toast.makeText(RegisterActivity.this, "Field cannot be empty", Toast.LENGTH_SHORT).show();
        }
        else {
            result = true;
        }
        return result;
    }*/
}
