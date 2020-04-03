package com.example.java_calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int[] numberIds = new int[]
                {
                        R.id.zero,
                        R.id.one,
                        R.id.two,
                        R.id.three,
                        R.id.four,
                        R.id.five,
                        R.id.six,
                        R.id.seven,
                        R.id.eight,
                        R.id.nine
                };
        int[] actionIds = new int[] {
          R.id.plus,
          R.id.minus,
          R.id.multiply,
          R.id.division,
        };
    }
}
