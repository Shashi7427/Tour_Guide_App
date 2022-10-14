package com.example.tourguideapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class RestaurantFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.listview, container, false);
        final List<Item> items = new ArrayList<>();
        items.add(new Item(getString(R.string.veggiesRestaurant),getString(R.string.veggiesDescription),R.drawable.restaurant_veggies));
        items.add(new Item(getString(R.string.heritageRestaurant),getString(R.string.heritageDescription),R.drawable.restaurant_heritage));
        items.add(new Item(getString(R.string.smartPindRestaurant),getString(R.string.smartpindDescription),R.drawable.restaurant_smart_pind));
        items.add(new Item(getString(R.string.tikkaRestaurant),getString(R.string.tikkaDescription),R.drawable.restaurant_tikka));
        items.add(new Item(getString(R.string.dreamlandRestaurant),getString(R.string.dreamlandDescription),R.drawable.restaurant_dreamland));

        ItemAdapter adapter = new ItemAdapter(getActivity(),items);

        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}