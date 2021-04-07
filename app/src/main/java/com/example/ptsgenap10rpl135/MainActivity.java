package com.example.ptsgenap10rpl135;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText email;
    private EditText password;
    private Button login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        login = findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Email = email.getText().toString();
                String Password = password.getText().toString();

                if (Email.equalsIgnoreCase("admin@gmail.com")&& Password.equalsIgnoreCase("12345")){
                    Toast.makeText(MainActivity.this, "Sukses Login", Toast.LENGTH_SHORT).show();
                    Intent Intent = new Intent(MainActivity.this, menu.class);
                    startActivity(Intent);
            }else {
                    Toast.makeText(MainActivity.this, "Login Failed", Toast.LENGTH_SHORT).show();
                }
        };
        });
        };
};

