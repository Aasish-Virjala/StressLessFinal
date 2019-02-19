package com.google.vr.sdk.samples.simplevideowidget;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class FirstScreen extends AppCompatActivity {

    private RelativeLayout relativeLayout;
    private TextView touchToContinue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_screen);
        touchToContinue = (TextView)findViewById(R.id.TouchToContinue);
        Animation anim = new AlphaAnimation(0.0f, 1.0f);
        anim.setDuration(80); //You can manage the time of the blink with this parameter
        anim.setStartOffset(500);
        anim.setRepeatMode(Animation.REVERSE);
        anim.setRepeatCount(Animation.INFINITE);
        touchToContinue.startAnimation(anim);
        relativeLayout = (RelativeLayout) findViewById(R.id.ReLayout);
        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FirstScreen.this,MainActivity.class));
            }
        });
    }
}
