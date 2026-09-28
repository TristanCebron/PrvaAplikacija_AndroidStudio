package com.example.prvaaplikacija;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    Button button;

    com.google.android.material.floatingactionbutton.FloatingActionButton floatingActionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        floatingActionButton = findViewById(R.id.floatingActionButton);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                showToast("My first Android Studio application!");
            }
        });

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
        @Override
            public void onClick(View v) {
                Snackbar.make(v,"Just another option for button", Snackbar.LENGTH_LONG).show();
            }});

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    private void showToast(String msg){
        Toast.makeText(MainActivity.this, msg, Toast.LENGTH_LONG).show();
    }
}