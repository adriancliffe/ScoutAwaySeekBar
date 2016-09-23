package com.scoutaway.app.scoutaway.utils;

/**
 * Created by doconnor on 02/09/2016.
 */
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.util.Log;

import com.scoutaway.app.scoutaway.fragments.ProfileFragment;
import com.scoutaway.app.scoutaway.fragments.ScoutFragment;
import com.scoutaway.app.scoutaway.fragments.VideoFragment;

public class PagerAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public PagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        Log.d("Denis","Value: "+position);

        switch (position) {
            case 0:
                ScoutFragment tab1 = new ScoutFragment();
                return tab1;
            case 1:
                ProfileFragment tab2 = new ProfileFragment();
                return tab2;
            case 2:
                VideoFragment tab3 = new VideoFragment();
                return tab3;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }

}
