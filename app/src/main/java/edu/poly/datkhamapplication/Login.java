package edu.poly.datkhamapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Login extends AppCompatActivity {
    Button btnLogin;
    Image imgAdd;
    EditText edUser, edPassword;
    DatabaseReference databaseLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setup();

        btnLogin = (Button) findViewById(R.id.btnLogin);
        edUser = (EditText) findViewById(R.id.edUser);
        edPassword = (EditText) findViewById(R.id.edPass);

        databaseLogin = FirebaseDatabase.getInstance().getReference("path");

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                asd();
            }
        });




    }

    private void setup(){
        findViewById(R.id.imgAdd).setOnClickListener(v -> {
            startActivity(new Intent(Login.this, RegisterActivity.class));
        });
    }

    private void asd(){
        String name = edUser.getText().toString().trim();
        String pass = edPassword.getText().toString().trim();
        String id = databaseLogin.push().getKey();

        if (name.isEmpty()&& pass.isEmpty()){
            Toast.makeText(this,"You should enter your user or pass!!!", Toast.LENGTH_LONG).show();
        } else if (name.equals("abc") && pass.equals("123456")){
            Toast.makeText(this, "Login successfull!!", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(Login.this, MainActivity.class);
            startActivity(intent);
        } else {
            Toast.makeText(this,"Login failed!!!", Toast.LENGTH_LONG).show();
        }
    }

}