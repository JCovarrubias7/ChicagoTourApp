package com.example.android.chicagotourapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class FoodFragment extends Fragment {
    // Required empty public constructor
    public FoodFragment(){
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        LocationArrays allFood = new LocationArrays();
        final ArrayList<CategoryClass> food = allFood.getFoodList();

        Adapter adapter = new Adapter(getActivity(), food);
        ListView listView = (ListView) rootView.findViewById(R.id.recycler_view);
        listView.setAdapter(adapter);

        return rootView;

    }
}
