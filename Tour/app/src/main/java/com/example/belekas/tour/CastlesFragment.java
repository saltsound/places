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
 * {@link Fragment} that displays a list of phrases.
 */
public class CastlesFragment extends Fragment {

    public CastlesFragment() {
        /** Required one empty public constructor */
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        // Create a list of places
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.string.castle_contact_one,
                R.string.big_castle_one, R.drawable.castle_one));
        places.add(new Place(R.string.castle_contact_two,
                R.string.big_castle_two,  R.drawable.castle_two));
        places.add(new Place(R.string.castle_contact_three,
                R.string.big_castle_three,  R.drawable.castle_three));
        places.add(new Place(R.string.castle_contact_four,
                R.string.big_castle_four,  R.drawable.castle_four));
        places.add(new Place(R.string.castle_contact_five,
                R.string.big_castle_five,  R.drawable.castle_five));
        places.add(new Place(R.string.castle_contact_six,
                R.string.big_castle_six,  R.drawable.castle_six));
        places.add(new Place(R.string.castle_contact_seven,
                R.string.big_castle_seven,  R.drawable.castle_seven));
        places.add(new Place(R.string.castle_contact_eight,
                R.string.big_castle_eight,  R.drawable.castle_eight));
        places.add(new Place(R.string.castle_contact_nine,
                R.string.big_castle_nine,  R.drawable.castle_nine));
        places.add(new Place(R.string.castle_contact_ten,
                R.string.big_castle_ten,  R.drawable.castle_ten));

        /**
         * created @PlaceAdapter with data from array Place
         */
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.cat_Castles);

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
