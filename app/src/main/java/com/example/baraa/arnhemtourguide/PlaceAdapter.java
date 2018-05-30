package com.example.baraa.arnhemtourguide;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PlaceAdapter extends ArrayAdapter<Place> {


    public PlaceAdapter(Activity context, ArrayList<Place> places) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, places);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Place} object located at this position in the list
        Place currentPlace = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID address_text_view.
        TextView placeAddress = listItemView.findViewById(R.id.address_text_view);
        // Get the place address from the current place object and
        // set this text on the address TextView
        placeAddress.setText(currentPlace.getPlaceAddress());

        // Find the TextView in the list_item.xml layout with the ID place_text_view.
        TextView placeName = listItemView.findViewById(R.id.place_text_view);
        // Get the place name from the current Place object and
        // set this text on the name TextView
        placeName.setText(currentPlace.getPlaceName());

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = listItemView.findViewById(R.id.image);
        // set this image on the place ImageView
        imageView.setImageResource(currentPlace.getmImageResourceId());
        // Make sure the view is visible
        imageView.setVisibility(View.VISIBLE);

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }

}