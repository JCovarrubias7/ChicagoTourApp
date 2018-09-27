package com.example.android.chicagotourapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class SportsFragment extends Fragment {
    // Required empty public constructor
    public SportsFragment(){
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        LocationArrays allSportVenues = new LocationArrays();
        final ArrayList<CategoryClass> venues = allSportVenues.getSportsList();

        Adapter adapter = new Adapter(getActivity(), venues);
        ListView listView = (ListView) rootView.findViewById(R.id.recycler_view);
        listView.setAdapter(adapter);

        return rootView;

    }
}
