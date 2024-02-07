package com.example.csce3615_moblieapp_project;

import android.app.Activity;
import android.os.Bundle;

public class MainJava extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(new Main_Campus(this));
        // Your code here
    }
}
