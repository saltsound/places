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
 * {@link Fragment} that displays a list of Bars names and their locations.
 */
public class BarsFragment extends Fragment {

    public BarsFragment() {
        /** Required one empty public constructor */
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        // Create a list of places
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.string.bar_contact_one, R.string.fancy_bar_one,
                R.drawable.bar_one));
        places.add(new Place(R.string.bar_contact_two, R.string.fancy_bar_two,
                R.drawable.bar_two));
        places.add(new Place(R.string.bar_contact_three, R.string.fancy_bar_three,
                R.drawable.bar_three));
        places.add(new Place(R.string.bar_contact_four, R.string.fancy_bar_four,
                R.drawable.bar_four));
        places.add(new Place(R.string.bar_contact_five, R.string.fancy_bar_five,
                R.drawable.bar_five));
        places.add(new Place(R.string.bar_contact_six, R.string.fancy_bar_six,
                R.drawable.bar_six));
        places.add(new Place(R.string.bar_contact_seven, R.string.fancy_bar_seven,
                R.drawable.bar_seven));
        places.add(new Place(R.string.bar_contact_eight, R.string.fancy_bar_eight,
                R.drawable.bar_eight));
        places.add(new Place(R.string.bar_contact_nine, R.string.fancy_bar_nine,
                R.drawable.bar_nine));
        places.add(new Place(R.string.bar_contact_ten, R.string.fancy_bar_ten,
                R.drawable.bar_ten));

        /**
         * created @PlaceAdapter with data from array Place with color provided
         */
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.cat_bars);

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
