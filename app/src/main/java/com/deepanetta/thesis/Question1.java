package com.deepanetta.thesis;

/**
 * Created by David on 10/25/2014.
 */

        import android.os.Bundle;
        import android.view.View.OnClickListener;
        import android.support.v4.app.Fragment;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ImageButton;
        import android.widget.Toast;

public class Question1 extends Fragment {
    /*imageViewQuestion1.setOnClickListener(new OnClickListener()
    {

        public void onClick(View v)
        {
                imageViewQuestion1.setImageResource(R.drawable.ic_launcher);

        }
    });*/

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.question1, container, false);

        return rootView;
    }

    public void Question1image1click    {
        question1image1.setImageResource(R.ic_launcher);
    }
    }
}