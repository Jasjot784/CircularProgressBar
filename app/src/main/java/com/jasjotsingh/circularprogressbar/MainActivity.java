package com.jasjotsingh.circularprogressbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int progress = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        updateProgressBar();

        findViewById(R.id.button_incr).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (progress<=90){
                    progress+=10;
                    updateProgressBar();
                }
            }
        });
        findViewById(R.id.button_decr).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (progress>=10){
                    progress-=10;
                    updateProgressBar();
                }
            }
        });
    }
    private void updateProgressBar(){
        ProgressBar progressBar =  findViewById(R.id.progress_bar);
        progressBar.setProgress(progress);
        TextView progressText =  findViewById(R.id.text_view_progress);
        progressText.setText(progress+"%");
    }
}