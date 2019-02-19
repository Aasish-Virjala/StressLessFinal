package com.google.vr.sdk.samples.simplevideowidget;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Summary extends AppCompatActivity {
    private TextView Summary, Before, After;
    private String emotion;
    //Slider.temp
    //Slider.FeelingSlider
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);
        if(MainActivity.mood=="angry")
            emotion="anger";
        if(MainActivity.mood=="happy")
            emotion = "happiness";
        if(MainActivity.mood=="sad")
            emotion="sadness";
        Summary = (TextView)findViewById(R.id.Summary);
        Before = (TextView)findViewById(R.id.before);
        After = (TextView)findViewById(R.id.after);
        Before.setText("Before the VR experience, your "+ emotion+" was: "+ Slider.temp);
        After.setText("After the VR experience, your "+ emotion+" was: "+ Slider.FeelingSlider);
    }
}
