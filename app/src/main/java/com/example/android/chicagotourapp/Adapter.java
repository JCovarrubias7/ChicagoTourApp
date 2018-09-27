package com.example.android.chicagotourapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adapter extends ArrayAdapter<CategoryClass> {
    public Adapter(Activity context, ArrayList<CategoryClass> locations) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, locations);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.card_view, parent, false);
        }

        CategoryClass currentLocation = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.card_view_location_name_text_view);
        nameTextView.setText(currentLocation.getLocationName());

        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.card_view_description_text_view);
        descriptionTextView.setText(currentLocation.getLocationDescription());

        TextView phoneTextView = (TextView) listItemView.findViewById(R.id.card_view_phone_text_view);
        phoneTextView.setText(currentLocation.getLocationPhone());

        TextView addressTextView = (TextView) listItemView.findViewById(R.id.card_view_address_text_view);
        addressTextView.setText(currentLocation.getLocationAddress());

        ImageView locationImage = (ImageView) listItemView.findViewById(R.id.card_view_image);
        locationImage.setImageResource(currentLocation.getImageResourceId());

        return listItemView;

    }
}
