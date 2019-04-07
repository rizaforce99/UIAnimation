package com.mriksani.uianimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ImageView iView;
    private Animation smalltobig,btta,btta2;
    private TextView tView1,tView2;
    private Button btn;
    private EditText eText1,eText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Load Animation
        smalltobig = AnimationUtils.loadAnimation(this,R.anim.smalltobig);
        btta = AnimationUtils.loadAnimation(this,R.anim.btta);
        btta2 = AnimationUtils.loadAnimation(this,R.anim.btta2);

        iView = findViewById(R.id.person);

        tView1 = findViewById(R.id.tView1);
        tView2 = findViewById(R.id.tView2);

        btn = findViewById(R.id.btn);

        eText1 = findViewById(R.id.eText1);
        eText2 = findViewById(R.id.eText2);

        //Passing Animation
        iView.startAnimation(smalltobig);
        tView1.startAnimation(btta);
        tView2.startAnimation(btta);

        btn.startAnimation(btta2);

        eText1.startAnimation(btta2);
        eText2.startAnimation(btta2);

    }
}
