package com.example.tourguideapp;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {
    public CategoryAdapter(Context context, @NonNull FragmentManager fm) {
        super(fm);
        mContext = context;
    }
    private Context mContext;


    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new AttractionFragment();
        } else if (position == 1) {
            return new AccommodationsFragment();
        } else if (position == 2) {
            return new RestaurantFragment();
        } else {
            return new EventsFragment();
        }
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_attraction);
        } else if (position == 1) {
            return mContext.getString(R.string.category_accommodation);
        } else if (position == 2) {
            return mContext.getString(R.string.category_restaurant);
        } else {
            return mContext.getString(R.string.category_events);
        }
    }

    @Override
    public int getCount() {
        return 4;
    }


}
