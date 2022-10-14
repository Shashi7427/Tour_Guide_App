package com.example.tourguideapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class AccommodationsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.listview, container, false);
        final List<Item> items = new ArrayList<>();
        items.add(new Item(getString(R.string.guesthouse1),getString(R.string.guesthouseaddress1),R.drawable.guest_house_visvesvaraya));
        items.add(new Item(getString(R.string.guesthouse2),getString(R.string.guesthouseaddress2),R.drawable.guest_house_technology));
        items.add(new Item(getString(R.string.guesthouse3),getString(R.string.guesthouseaddress3),R.drawable.guest_house_salt_lake));
        items.add(new Item(getString(R.string.guesthouse4),getString(R.string.guesthouseaddress4),R.drawable.guest_house_new_technology));

        ItemAdapter adapter = new ItemAdapter(getActivity(),items);

        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;


    }
}