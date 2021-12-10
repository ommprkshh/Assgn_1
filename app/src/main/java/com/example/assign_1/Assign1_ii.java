package com.example.assign_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Assign1_ii extends AppCompatActivity {
    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assign1_ii);
        next = findViewById(R.id.next);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Assign1_ii.this, Assign_iii.class);
                startActivity(intent);
                //   Toast.makeText(MainActivity.this, "kux vii", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

