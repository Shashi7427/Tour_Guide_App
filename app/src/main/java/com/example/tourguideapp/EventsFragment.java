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


public class EventsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.listview, container, false);
        final List<Item> items = new ArrayList<>();
        items.add(new Item(getString(R.string.event_kshitij),getString(R.string.khitijDescription),R.drawable.event_kshitij,"https://ktj.in/#/"));
        items.add(new Item(getString(R.string.event_independence),getString(R.string.independenceDescription),R.drawable.event_independence_day,"https://www.iitkgpalumnifoundation.in/n/161171.dz"));
        items.add(new Item(getString(R.string.event_durga_puja),getString(R.string.durgaDescription),R.drawable.event_durga_puja,"https://www.google.com/search?channel=fs&client=ubuntu&q=durga+puja+iit+kgp"));
        items.add(new Item(getString(R.string.event_movies),getString(R.string.movieDescription),R.drawable.event_movies,"https://www.facebook.com/tfs.iitkgp/"));

        ItemAdapter adapter = new ItemAdapter(getActivity(),items);

        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Item item = items.get(position);
                if (item.locationProvided){
                    // Create a Uri from an intent string. Use the result to create an Intent.
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(item.getLocation()));
                    startActivity(browserIntent);

                }
            }
        });
        return rootView;
    }
}