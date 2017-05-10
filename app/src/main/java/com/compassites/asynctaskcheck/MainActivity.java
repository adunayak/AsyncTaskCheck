package com.compassites.asynctaskcheck;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBar = (ProgressBar) findViewById(R.id.progress);
        new FileDownloader(this).execute();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    public void showProgress(int progress) {
        progressBar.setProgress(progress);
    }
}
