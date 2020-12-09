package edu.poly.datkhamapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class BenhnhanActivity extends AppCompatActivity {
    private EditText edUse;
    private Button btnAdd;
    private FirebaseDatabase db = FirebaseDatabase.getInstance();
    private DatabaseReference root = db.getReference().child("User");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_benhnhan);

        edUse = findViewById(R.id.edTenBN);
        btnAdd = findViewById(R.id.btnAdd);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = edUse.getText().toString();
                root.setValue(name);

                Toast.makeText(BenhnhanActivity.this, "Da luu!!!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}