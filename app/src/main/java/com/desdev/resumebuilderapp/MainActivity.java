package com.desdev.resumebuilderapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void CreateResume(View view)
    {
        startActivity(new Intent(getApplicationContext(), CreateResumes_Activity.class));
    }

    public void ResumesCatalog(View view)
    {

    }

    public void YourResumes(View view)
    {

    }
}
