package com.bulbulhossen.hackathon_krishi.Details_class;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.AccelerateDecelerateInterpolator;

import com.bulbulhossen.hackathon_krishi.R;
import com.flaviofaria.kenburnsview.KenBurnsView;
import com.flaviofaria.kenburnsview.RandomTransitionGenerator;

public class Details_Class extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details_layout);

        //Image 1

        KenBurnsView kbv = (KenBurnsView) findViewById(R.id.image);

        AccelerateDecelerateInterpolator ACCELERATE_DECELERATE = new AccelerateDecelerateInterpolator();
        RandomTransitionGenerator generator = new RandomTransitionGenerator(3000, ACCELERATE_DECELERATE);
//duration = 10000ms = 10s and interpolator = ACCELERATE_DECELERATE
        kbv.setTransitionGenerator(generator); //set new transition on kbv


        // image 2

        KenBurnsView kbvv = (KenBurnsView) findViewById(R.id.image1);

        AccelerateDecelerateInterpolator ACCELERATE_DECELERATEE = new AccelerateDecelerateInterpolator();
        RandomTransitionGenerator generatorr = new RandomTransitionGenerator(3000, ACCELERATE_DECELERATEE);
//duration = 10000ms = 10s and interpolator = ACCELERATE_DECELERATE
        kbv.setTransitionGenerator(generatorr); //set new transition on kbv


    }
}
