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
 * {@link Fragment} that displays a list of family vocabulary places.
 */
public class MuseumsFragment extends Fragment {

    public MuseumsFragment() {
        /** Required one empty public constructor */
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        // Create a list of places
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.string.museums_contact_one, R.string.museum_one,
                R.drawable.museum_one));
        places.add(new Place(R.string.museums_contact_two, R.string.museum_two,
                R.drawable.museum_two));
        places.add(new Place(R.string.museums_contact_three, R.string.museum_three,
                R.drawable.museum_three));
        places.add(new Place(R.string.museums_contact_four, R.string.museum_four,
                R.drawable.museum_four));
        places.add(new Place(R.string.museums_contact_five, R.string.museum_five,
                R.drawable.museum_five));
        places.add(new Place(R.string.museums_contact_six, R.string.museum_six,
                R.drawable.museum_six));
        places.add(new Place(R.string.museums_contact_seven, R.string.museum_seven,
                R.drawable.museum_seven));
        places.add(new Place(R.string.museums_contact_eight, R.string.museum_eight,
                R.drawable.museum_eight));
        places.add(new Place(R.string.museums_contact_nine, R.string.museum_nine,
                R.drawable.museum_nine));
        places.add(new Place(R.string.museums_contact_ten, R.string.museum_ten,
                R.drawable.museum_ten));

        /**
         * created @PlaceAdapter with data from array Place with color provided
         */
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.cat_Museums);

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
