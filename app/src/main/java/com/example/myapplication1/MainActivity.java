package com.example.myapplication1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private Button btnSend;
    private EditText edtName;
    private Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        btnSend = findViewById(R.id.btn_send);
        edtName = findViewById(R.id.edt_name);

    }

    public void onClick(View v) {
        Toast.makeText(this, "Xin chào", Toast.LENGTH_SHORT).show();
    }

    public void onCLickCustom(View view) {
        Toast.makeText(this, "Xin chào", Toast.LENGTH_SHORT).show();
    }

    public void change(View view) {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        Bundle myObject = new Bundle();
        myObject.putString("name", edtName.getText().toString());
        intent.putExtras(myObject);
//        String name = edtName.getText().toString();
//        intent.putExtra("name", name);
        startActivity(intent);
    }
}