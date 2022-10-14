package com.example.tourguideapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class AttractionFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.listview, container, false);
        final List<Item> items = new ArrayList<>();
        items.add(new Item(getString(R.string.attraction_nehru_museum),getString(R.string.attraction_description_nehru_park),R.drawable.attraction_nehru));
        items.add(new Item(getString(R.string.attraction_description_helipad),getString(R.string.attraction_description_helipad),R.drawable.attraction_helipad));
        items.add(new Item(getString(R.string.attraction_gymkhana_park),getString(R.string.attraction_description_gymkhana_park),R.drawable.attraction_gymkhanapark));
        items.add(new Item(getString(R.string.attraction_lake_park),getString(R.string.attraction_description_lake_park),R.drawable.attraction_lake_park));
        items.add((new Item(getString(R.string.attraction_hijli_eco_park),getString(R.string.attraction_description_hijli_eco_park),R.drawable.attraction_hijli)));


        ItemAdapter adapter = new ItemAdapter(getActivity(),items);

        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;


    }
}