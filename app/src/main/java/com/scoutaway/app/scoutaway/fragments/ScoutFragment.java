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
import java.util.Iterator;
import java.util.List;

/**
 * Created by doconnor on 02/09/2016.
 *
 *
 *
 */
public class ScoutFragment extends Fragment {


    private ListView listViewScouts;
    private SeekBar listControl = null;


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_scout, container, false);




        final List<Scouts> scoutList = new ArrayList<Scouts>();

        scoutList.add(new Scouts("Winter01","denis","Cork", 10));
        scoutList.add(new Scouts("GetMeDrunk","denis","Cork",10));
        scoutList.add(new Scouts("Boooooooooo","denis","Cork",15));
        scoutList.add(new Scouts("Winter01","denis","Cork",15));
        scoutList.add(new Scouts("GetMeDrunk","denis","Cork",20));
        scoutList.add(new Scouts("Boooooooooo","denis","Cork",20));
        scoutList.add(new Scouts("Winter01","denis","Cork",25));
        scoutList.add(new Scouts("GetMeDrunk","denis","Cork",25));
        scoutList.add(new Scouts("Boooooooooo","denis","Cork",30));
        scoutList.add(new Scouts("Winter01","denis","Cork",30));
        scoutList.add(new Scouts("GetMeDrunk","denis","Cork",35));
        scoutList.add(new Scouts("Boooooooooo","denis","Cork",35));
        scoutList.add(new Scouts("Winter01","denis","Cork",40));
        scoutList.add(new Scouts("GetMeDrunk","denis","Cork",40));
        scoutList.add(new Scouts("Boooooooooo","denis","Cork",45));
        scoutList.add(new Scouts("Boooooooooo","denis","Cork",45));
        scoutList.add(new Scouts("Boooooooooo","denis","Cork",50));
        scoutList.add(new Scouts("Boooooooooo","denis","Cork",50));


        listViewScouts = (ListView) view.findViewById(R.id.Scouts_List);

        listViewScouts.setAdapter( new ScoutListAdapter(getActivity(),R.layout.scout_row, scoutList));


        listControl = (SeekBar) view.findViewById(R.id.volume_bar);

        listControl.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressChanged = 0;

            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser){
                progressChanged = progress;
            }

            public void onStartTrackingTouch(SeekBar seekBar) {

              //  scoutList.removeIf(Scouts -> Scouts.getStatusKM() != progressChanged);


              /*  for(Iterator<Scouts> iterator = scoutList.iterator(); iterator.hasNext();)  {
                    if(iterator.next().getStatusKM() < progressChanged)
                        iterator.remove();
                    scoutList.notify();
                }
    */


            }

            public void onStopTrackingTouch(SeekBar seekBar) {




            }
        });




        return view;



    }







}



