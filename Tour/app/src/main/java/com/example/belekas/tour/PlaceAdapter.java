package com.example.belekas.tour;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

/**
 * {@link WordAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link place} objects.
 */
public class PlaceAdapter extends ArrayAdapter<Place>  {

    /** Resource ID for the background color for this list of places */
    private int mColorResourceId;

    /**
     * Create a new {@link PlaceAdapter} object.
     * @param places is the list of {@link Word}s to be displayed.
     * @param colorResourceId is the resource ID for the background color for this list of places
     */
    public PlaceAdapter(Context context, ArrayList<Place> places, int colorResourceId) {
        super(context, 0, places);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Place currentPlace = getItem(position);

        /**
         * Find the TextView in the list_item.xml layout with the ID place_name_text_view.
         * and stores it in currentPlace
          */

        TextView placeNameTextView = (TextView) listItemView.findViewById(R.id.place_name_text_view);
        placeNameTextView.setText(currentPlace.getPlaceNameId());

        /**
         * Find the TextView in the list_item.xml layout with the ID place_name_text_view.
         * and stores it in currentPlace
         */
        TextView placeContactTextView = (TextView) listItemView.findViewById(R.id.place_contact_text_view);

        placeContactTextView.setText(currentPlace.getPlaceContactId());

        // Find the ImageView in the tour_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        // Check if an image is provided for this word or not
        if (currentPlace.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentPlace.getImageResourceId());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}