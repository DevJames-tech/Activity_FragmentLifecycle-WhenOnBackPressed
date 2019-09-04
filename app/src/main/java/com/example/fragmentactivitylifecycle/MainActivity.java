package com.example.fragmentactivitylifecycle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    String activityLifecycle = "Lifecycle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       /* FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().commit();*/


        Log.d(activityLifecycle,"onCreate called");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d(activityLifecycle,"onStart called");

    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d(activityLifecycle,"onResume called");

    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d(activityLifecycle,"onPause called");

    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d(activityLifecycle,"onStop called");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d(activityLifecycle,"onDestroy called");

    }
}
