package com.example.tourguideapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
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
        items.add(new Item(getString(R.string.veggiesRestaurant),getString(R.string.veggiesDescription),R.drawable.restaurant_veggies,"https://goo.gl/maps/2rDuxvKsKifUwhpm8"));
        items.add(new Item(getString(R.string.heritageRestaurant),getString(R.string.heritageDescription),R.drawable.restaurant_heritage,"https://goo.gl/maps/ra3oCK3vRjmR5veU8"));
        items.add(new Item(getString(R.string.smartPindRestaurant),getString(R.string.smartpindDescription),R.drawable.restaurant_smart_pind,"https://goo.gl/maps/efQSF3kw656Ua5397"));
        items.add(new Item(getString(R.string.tikkaRestaurant),getString(R.string.tikkaDescription),R.drawable.restaurant_tikka,"https://goo.gl/maps/68sumfKiNXZnkJ5y8"));
        items.add(new Item(getString(R.string.dreamlandRestaurant),getString(R.string.dreamlandDescription),R.drawable.restaurant_dreamland,"https://goo.gl/maps/JrWFxbgmxX2GLj95A"));

        ItemAdapter adapter = new ItemAdapter(getActivity(),items);

        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Item item = items.get(position);
                if (item.locationProvided){
                    // Create a Uri from an intent string. Use the result to create an Intent.
                    Uri gmmIntentUri = Uri.parse(item.getLocation());

                    Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                    mapIntent.setPackage("com.google.android.apps.maps");
                    startActivity(mapIntent);

                }
            }
        });

        return rootView;
    }
}