package com.scoutaway.app.scoutaway.fragments;

/**
 * Created by doconnor on 02/09/2016.
 */
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.scoutaway.app.scoutaway.R;

public class VideoFragment extends Fragment {

    private ListView listViewScouts;


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_scout, container, false);




        return view;



    }

}

