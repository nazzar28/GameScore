package com.example.gamescore;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private int score1 = 0;
    private int score2 = 0;

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

        TextView counter1 = findViewById(R.id.textViewCounter1);
        TextView counter2 = findViewById(R.id.textViewCounter2);

        counter1.setText(String.valueOf(score1));
        counter2.setText(String.valueOf(score2));

        counter1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter1.setText(String.valueOf(++score1));
            }
        });

        counter2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter2.setText(String.valueOf(++score2));
            }
        });
    }
}