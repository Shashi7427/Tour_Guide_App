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


public class AccommodationsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.listview, container, false);
        final List<Item> items = new ArrayList<>();
        items.add(new Item(getString(R.string.guesthouse1),getString(R.string.guesthouseaddress1),R.drawable.guest_house_visvesvaraya,"https://goo.gl/maps/fEH7SaV1N9oY8Ghy6"));
        items.add(new Item(getString(R.string.guesthouse2),getString(R.string.guesthouseaddress2),R.drawable.guest_house_technology,"https://goo.gl/maps/84VkVnue4UBuaaaEA"));
        items.add(new Item(getString(R.string.guesthouse3),getString(R.string.guesthouseaddress3),R.drawable.guest_house_salt_lake,"https://goo.gl/maps/poaVRxJyBzUrnaPFA"));
        items.add(new Item(getString(R.string.guesthouse4),getString(R.string.guesthouseaddress4),R.drawable.guest_house_new_technology,"https://goo.gl/maps/84VkVnue4UBuaaaEA"));

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