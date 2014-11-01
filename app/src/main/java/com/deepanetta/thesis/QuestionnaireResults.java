package com.deepanetta.thesis;


import android.app.Activity;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v4.app.*;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.jjoe64.graphview.GraphView.GraphViewData;
import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.BarGraphView;
import com.jjoe64.graphview.GraphViewSeries;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class QuestionnaireResults extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questionnaire_results);
        GraphViewSeries exampleSeries = new GraphViewSeries(new GraphViewData[]{
                new GraphViewData(1, 40)
                , new GraphViewData(2, 12)
                , new GraphViewData(3, 7)
                , new GraphViewData(2, 8)
                , new GraphViewData(2, 10)
                , new GraphViewData(3, 26)
                , new GraphViewData(1, 37)
                , new GraphViewData(1, 53)
                , new GraphViewData(3, 253)
        });
        GraphView graphView = new BarGraphView(
                this // context
                , "Job Status Graph" // heading
        );
        graphView.addSeries(exampleSeries); // data
        LinearLayout layout = (LinearLayout) findViewById(R.id.layout);
        layout.addView(graphView);
    }
}




/*

        class ScreenSlidePagerAdapter extends FragmentStatePagerAdapter {
            public ScreenSlidePagerAdapter(FragmentManager fm) {
                super(fm);
            }

            @Override
            public android.support.v4.app.Fragment getItem(int position) {
                return new ScreenSlidePageFragment();
            }

            @Override
            public int getCount() {
                return NUM_PAGES;
            }
        }


/*
    // init example series data
    GraphViewSeries QuestionnaireSeries = new GraphViewSeries(new GraphViewData[] {
            new GraphViewData(1, 2.0d)
            , new GraphViewData(2, 1.5d)
            , new GraphViewData(3, 2.5d)
            , new GraphViewData(4, 1.0d)
    });

    GraphView graphView = new BarGraphView() GraphView(
            this // context
            , "GraphViewDemo" // heading
    );
    graphView.addSeries(QuestionnaireSeries); // data

    LinearLayout layout = (LinearLayout) findViewById(R.id.layout);
    layout.addView(graphView);




    // graph with dynamically generated horizontal and vertical labels
    GraphView graphView = new GraphView(
            this // context
            , new GraphViewData[] {
            new GraphViewData(1, 2.0d)
            , new GraphViewData(2, 1.5d)
            , new GraphViewData(2.5, 3.0d) // another frequency
            , new GraphViewData(3, 2.5d)
            , new GraphViewData(4, 1.0d)
            , new GraphViewData(5, 3.0d)
    } // data
            , "GraphViewDemo" // heading
            , null // dynamic labels
            , null // dynamic labels
    );
    LinearLayout layout = (LinearLayout) findViewById(R.id.graph1);
    layout.addView(graphView);
    */

