package com.scoutaway.app.scoutaway.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.Toast;

import com.scoutaway.app.scoutaway.R;
import com.scoutaway.app.scoutaway.utils.ScoutListAdapter;
import com.scoutaway.app.scoutaway.data.Scouts;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by doconnor on 02/09/2016.
 *
 *
 *
 */
public class ScoutFragment extends Fragment {


    private ListView listViewScouts;
    private SeekBar volumeControl = null;


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_scout, container, false);




        final List<Scouts> scoutList = new ArrayList<Scouts>();

        scoutList.add(new Scouts("Winter01","denis","Cork","fish"));
        scoutList.add(new Scouts("GetMeDrunk","denis","Cork","fish"));
        scoutList.add(new Scouts("Boooooooooo","denis","Cork","fish"));
        scoutList.add(new Scouts("Winter01","denis","Cork","fish"));
        scoutList.add(new Scouts("GetMeDrunk","denis","Cork","fish"));
        scoutList.add(new Scouts("Boooooooooo","denis","Cork","fish"));
        scoutList.add(new Scouts("Winter01","denis","Cork","fish"));
        scoutList.add(new Scouts("GetMeDrunk","denis","Cork","fish"));
        scoutList.add(new Scouts("Boooooooooo","denis","Cork","fish"));
        scoutList.add(new Scouts("Winter01","denis","Cork","fish"));
        scoutList.add(new Scouts("GetMeDrunk","denis","Cork","fish"));
        scoutList.add(new Scouts("Boooooooooo","denis","Cork","fish"));
        scoutList.add(new Scouts("Winter01","denis","Cork","fish"));
        scoutList.add(new Scouts("GetMeDrunk","denis","Cork","fish"));
        scoutList.add(new Scouts("Boooooooooo","denis","Cork","fish"));

        listViewScouts = (ListView) view.findViewById(R.id.Scouts_List);

        listViewScouts.setAdapter( new ScoutListAdapter(getActivity(),R.layout.scout_row, scoutList));


        volumeControl = (SeekBar) view.findViewById(R.id.volume_bar);

        volumeControl.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressChanged = 0;

            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser){
                progressChanged = progress;
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }

            public void onStopTrackingTouch(SeekBar seekBar) {



                Toast.makeText(getActivity(),"Distance: "+progressChanged+" KM",
                        Toast.LENGTH_SHORT).show();
            }
        });




        return view;



    }







}



