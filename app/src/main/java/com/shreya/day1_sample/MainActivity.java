package com.shreya.day1_sample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    private EditText edtUserEmail;
    private EditText edtPassword;
    private Button btnLogin;
    private TextView txtMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtUserEmail = findViewById(R.id.edtUserEmail);
        edtPassword = findViewById(R.id.edtPassword);
        btnLogin = findViewById(R.id.btnLogin);
        txtMessage = findViewById(R.id.txtWelcome);

        btnLogin.setOnClickListener( new  View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
//               Toast t = Toast.makeText(MainActivity.this,"Login Successful",Toast.LENGTH_LONG);
//               t.show();

                String name = edtUserEmail.getText().toString();
                Log.d("NAME", name);

                txtMessage.setText("LogIn Successful");

            }

        });

    }
}
