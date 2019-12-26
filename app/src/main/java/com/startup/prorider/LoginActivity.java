package com.startup.prorider;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private Animation frombottom;
    private TextView tvl;
    private TextView tv2l;
    private EditText passl;
    private EditText emaill;
    private Button b1l;
    String email1l,pass1l;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        frombottom = AnimationUtils.loadAnimation(this, R.anim.frombottom);
        passl = findViewById(R.id.etRegPass);
        emaill = findViewById(R.id.etRegEmail);
        tvl = findViewById(R.id.tvReg);
        tv2l = findViewById(R.id.tvRegtoLog);
        b1l = findViewById(R.id.btReg);
        b1l.setAnimation(frombottom);
        tvl.setText("Login");
        tv2l.setText("New User? Register");
        emaill.setHint("E-mail ID");
        passl.setHint("Enter Password");
        b1l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                email1l = emaill.getText().toString().trim();
                pass1l = passl.getText().toString().trim();
                if (email1l.isEmpty() || pass1l.isEmpty()) {
                    Toast.makeText(LoginActivity.this, "Field cannot be empty", Toast.LENGTH_SHORT).show();
                } else {
                    emaill.setText("");
                    passl.setText("");
                    Toast.makeText(LoginActivity.this, "Successfully Registered", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
