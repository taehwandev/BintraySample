package tech.thdev.bintraysample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import tech.thdev.samplebase.Sample;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Sample.print();
    }
}
