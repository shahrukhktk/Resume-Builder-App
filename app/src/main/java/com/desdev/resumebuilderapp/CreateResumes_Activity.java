package com.desdev.resumebuilderapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.desdev.resumebuilderapp.Fragments.CareerObjective_Fragment;
import com.desdev.resumebuilderapp.Fragments.Education_fragment;
import com.desdev.resumebuilderapp.Fragments.PersonalInfo_fragment;

public class CreateResumes_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_resumes_);
    }

    public void CreateCV(View view)
    {
        if(view == findViewById(R.id.personal_info))
        {
            Fragment fragment = new PersonalInfo_fragment();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.frame_container, fragment);
            ft.commit();
        }

        if(view == findViewById(R.id.objective))
        {
            Fragment fragment = new CareerObjective_Fragment();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.frame_container, fragment);
            ft.commit();
        }

        if(view == findViewById(R.id.education))
        {
            Fragment fragment = new Education_fragment();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.frame_container, fragment);
            ft.commit();
        }

        if(view == findViewById(R.id.skills))
        {
            Fragment fragment = new PersonalInfo_fragment();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.frame_container, fragment);
            ft.commit();
        }

        if(view == findViewById(R.id.experience))
        {
            Fragment fragment = new PersonalInfo_fragment();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.frame_container, fragment);
            ft.commit();
        }

        if(view == findViewById(R.id.languages))
        {
            Fragment fragment = new PersonalInfo_fragment();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.frame_container, fragment);
            ft.commit();
        }

        if(view == findViewById(R.id.projects))
        {
            Fragment fragment = new PersonalInfo_fragment();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.frame_container, fragment);
            ft.commit();
        }

        if(view == findViewById(R.id.achievements))
        {
            Fragment fragment = new PersonalInfo_fragment();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.frame_container, fragment);
            ft.commit();
        }

        if(view == findViewById(R.id.references))
        {
            Fragment fragment = new PersonalInfo_fragment();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.frame_container, fragment);
            ft.commit();
        }

    }
}
