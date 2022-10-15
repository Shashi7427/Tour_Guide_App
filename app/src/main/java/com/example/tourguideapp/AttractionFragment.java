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
import android.widget.Toast;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class AttractionFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.listview, container, false);
        final List<Item> items = new ArrayList<>();
        items.add(new Item(getString(R.string.attraction_nehru_museum),getString(R.string.attraction_description_nehru_park),R.drawable.attraction_nehru,"https://goo.gl/maps/sao8uGQckXsLbWwo7"));
        items.add(new Item(getString(R.string.attraction_helipad),getString(R.string.attraction_description_helipad),R.drawable.attraction_helipad,"https://goo.gl/maps/uQAuwUVAnmvCGY2j6"));
        items.add(new Item(getString(R.string.attraction_gymkhana_park),getString(R.string.attraction_description_gymkhana_park),R.drawable.attraction_gymkhanapark,"https://goo.gl/maps/QSKx1UEL97DUYnLD9"));
        items.add(new Item(getString(R.string.attraction_lake_park),getString(R.string.attraction_description_lake_park),R.drawable.attraction_lake_park,"https://goo.gl/maps/LxT5mrZ3SvrDT7Ev7"));
        items.add((new Item(getString(R.string.attraction_hijli_eco_park),getString(R.string.attraction_description_hijli_eco_park),R.drawable.attraction_hijli,"https://goo.gl/maps/FFKoQ9Wj9N6Txudk7")));


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