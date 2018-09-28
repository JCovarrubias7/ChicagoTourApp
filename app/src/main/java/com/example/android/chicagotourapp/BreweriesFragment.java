package com.example.android.chicagotourapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class BreweriesFragment extends Fragment {
    // Required empty public constructor
    public BreweriesFragment(){
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        LocationArrays allBreweries = new LocationArrays();
        final ArrayList<CategoryClass> breweries = allBreweries.getBreweryLocations();

        Adapter adapter = new Adapter(getActivity(), breweries);
        ListView listView = (ListView) rootView.findViewById(R.id.list_view);
        listView.setAdapter(adapter);

        return rootView;

    }
}
