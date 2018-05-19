package com.example.belekas.tour;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of number vocabulary places.
 */
public class RestaurantsFragment extends Fragment {

    public RestaurantsFragment() {
        /** Required one empty public constructor */
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        // Create a list of places
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.string.restaurant_contact_one, R.string.Restaurant_One,
                R.drawable.restaurant_one));
        places.add(new Place(R.string.restaurant_contact_two, R.string.Restaurant_Two,
                R.drawable.restaurant_two));
        places.add(new Place(R.string.restaurant_contact_three, R.string.Restaurant_Three,
                R.drawable.restaurant_three));
        places.add(new Place(R.string.restaurant_contact_four, R.string.Restaurant_Four,
                R.drawable.restaurant_four));
        places.add(new Place(R.string.restaurant_contact_five, R.string.Restaurant_Five,
                R.drawable.restaurant_five));
        places.add(new Place(R.string.restaurant_contact_six, R.string.Restaurant_Six,
                R.drawable.restaurant_six));
        places.add(new Place(R.string.restaurant_contact_seven, R.string.Restaurant_Seven,
                R.drawable.restaurant_seven));
        places.add(new Place(R.string.restaurant_contact_eight, R.string.Restaurant_Eight,
                R.drawable.restaurant_eight));
        places.add(new Place(R.string.restaurant_contact_nine, R.string.Restaurant_Nine,
                R.drawable.restaurant_nine));
        places.add(new Place(R.string.restaurant_contact_ten, R.string.Restaurant_Ten,
                R.drawable.restaurant_ten));

        /**
         * created @PlaceAdapter with data from array Place with color provided
         */
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.cat_Restaurants);

        /**
         * Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
         * There should be a {@link ListView} with the view ID called list, which is declared Contact one in the
         * tour_list.xml layout file.
         * */
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        /** display list items from adapter*/
        listView.setAdapter(adapter);

        return rootView;
    }

}
