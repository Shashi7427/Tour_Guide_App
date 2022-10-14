package com.example.tourguideapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class EventsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.listview, container, false);
        final List<Item> items = new ArrayList<>();
        items.add(new Item(getString(R.string.event_kshitij),getString(R.string.khitijDescription),R.drawable.event_kshitij));
        items.add(new Item(getString(R.string.event_independence),getString(R.string.independenceDescription),R.drawable.event_independence_day));
        items.add(new Item(getString(R.string.event_durga_puja),getString(R.string.durgaDescription),R.drawable.event_durga_puja));
        items.add(new Item(getString(R.string.event_movies),getString(R.string.movieDescription),R.drawable.event_movies));

        ItemAdapter adapter = new ItemAdapter(getActivity(),items);

        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}