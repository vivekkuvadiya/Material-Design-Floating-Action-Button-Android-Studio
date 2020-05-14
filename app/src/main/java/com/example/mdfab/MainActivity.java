package com.example.mdfab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    private FloatingActionButton mMainFab, mPersonFab, mContectFab;
    private TextView mPersonTxt, mContectTxt;
    private Boolean isOpene;
    private Animation mFabOpenAnim, mFabCloseAnim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mMainFab = findViewById(R.id.main_fab);
        mPersonFab = findViewById(R.id.person_fab);
        mContectFab = findViewById(R.id.contect_fab);

        mPersonTxt = findViewById(R.id.person_text);
        mContectTxt = findViewById(R.id.contect_text);

        mFabOpenAnim = AnimationUtils.loadAnimation(MainActivity.this,R.anim.fab_open);
        mFabCloseAnim = AnimationUtils.loadAnimation(MainActivity.this,R.anim.fab_closed);

        isOpene = false;

        mMainFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (isOpene){//false

                    mPersonFab.setAnimation(mFabCloseAnim);
                    mContectFab.setAnimation(mFabCloseAnim);
                    mPersonTxt.setVisibility(View.INVISIBLE);
                    mContectTxt.setVisibility(View.INVISIBLE);

                    isOpene = false;

                }else {

                    mPersonFab.setAnimation(mFabOpenAnim);
                    mContectFab.setAnimation(mFabOpenAnim);
                    mPersonTxt.setVisibility(View.VISIBLE);
                    mContectTxt.setVisibility(View.VISIBLE);

                    isOpene = true;

                }

            }
        });




    }
}
