package com.scoutaway.app.scoutaway.utils;

import android.util.Log;
import android.view.LayoutInflater;
import java.util.List;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.scoutaway.app.scoutaway.R;
import com.scoutaway.app.scoutaway.data.Scouts;

public class ScoutListAdapter extends ArrayAdapter<Scouts> {
    private int resource;
    private LayoutInflater inflater;
    private Context context;
    public ScoutListAdapter ( Context ctx, int resourceId, List<Scouts> objects) {
        super( ctx, resourceId, objects );
        resource = resourceId;
        inflater = LayoutInflater.from( ctx );
        context=ctx;
    }
    @Override
    public View getView ( int position, View convertView, ViewGroup parent ) {
        convertView = ( RelativeLayout ) inflater.inflate( resource, null );
      Scouts scout = getItem( position );


        TextView scoutName = (TextView) convertView.findViewById(R.id.ScoutID);
        scoutName.setText(scout.getScoutID());



       TextView location = (TextView) convertView.findViewById(R.id.Location);
        location.setText(scout.getLocation());


       ImageView scoutImage = (ImageView) convertView.findViewById(R.id.scoutImage);
        String uri = "drawable/" + scout.getScoutImage();

        int imageResource = context.getResources().getIdentifier(uri, null, context.getPackageName());
        Drawable image = context.getResources().getDrawable(imageResource);
        scoutImage.setImageDrawable(image);


        ImageView StatusImage = (ImageView) convertView.findViewById(R.id.Status);
        uri = "drawable/" + scout.getStringStatusKM();
        Log.v("Denis", ""+scout.getStringStatusKM());
        imageResource = context.getResources().getIdentifier(uri, null, context.getPackageName());
        image = context.getResources().getDrawable(imageResource);
        StatusImage.setImageDrawable(image);



        return convertView;
    }
}