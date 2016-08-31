package tech.thdev.bintraysample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import tech.thdev.bintray_library.Sample;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Library test
        TextView textView = (TextView) findViewById(R.id.tv);
        textView.setText(Sample.getString());
    }
}
