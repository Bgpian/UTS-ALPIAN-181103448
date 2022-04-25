package com.alpan_181103448.UTS_ALPIAN_181103448;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class loginActivity extends AppCompatActivity {

    EditText username,password;
    Button buttonLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = (EditText) findViewById(R.id.et_username);
        password = (EditText) findViewById(R.id.et_password);
        buttonLogin = (Button)  findViewById(R.id.buttonLogin);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usernameKey = username.getText().toString();
                String passwordKey = password.getText().toString();

                if(usernameKey.equals("alpian") && passwordKey.equals("12345")){
                    //jika login berhasil
                    Toast.makeText(getApplicationContext(),"login Sukses", Toast.LENGTH_SHORT).show();
                    Intent intent= new Intent(loginActivity.this, WelcomeActivity.class);
                    loginActivity.this.startActivity(intent);
                    finish();
                }else {
                    //jika login gagal
                    AlertDialog.Builder builder = new AlertDialog.Builder(loginActivity.this);
                    builder.setMessage("Usernama atau password salah")
                            .setNegativeButton("Rerty",null).create().show();
                }
            }
        });

    }
}