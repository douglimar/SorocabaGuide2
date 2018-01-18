package br.com.ddmsoftware.sorocabaguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by douglimar on 21/12/17.
 * not default file
 */

public class ItemListBaseAdapter extends BaseAdapter {

    private static ArrayList<Place> placeArrayList;
    private final LayoutInflater layoutInflater;

    public ItemListBaseAdapter(Context context, ArrayList<Place> myListPlaces) {

        placeArrayList = myListPlaces;
        layoutInflater = LayoutInflater.from(context);

    }


    @Override
    public int getCount() {
        return placeArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return placeArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        HolderView holderView;

        if (convertView==null){

            convertView = layoutInflater.inflate(R.layout.item_row, null);
            holderView = new HolderView();

            //System.out.println("LISTVIEW CONTENT:" + listPlaces.get(position).getParkName());

            holderView.tvPlaceName = convertView.findViewById(R.id.tvItemRowTitle);
            holderView.tvPlaceDescription = convertView.findViewById(R.id.tvItemRowDescription);
            holderView.imgPlaceImage = convertView.findViewById(R.id.imgItemRow);

            convertView.setTag(holderView);

        } else {

            holderView = (HolderView) convertView.getTag();

        }

        holderView.tvPlaceName.setText(placeArrayList.get(position).getPlaceName());
        holderView.tvPlaceDescription.setText(placeArrayList.get(position).getPlaceSmallDescription());
        holderView.imgPlaceImage.setImageResource(placeArrayList.get(position).getPlaceThumb());

        return convertView;
    }

    static class HolderView {
        TextView tvPlaceName;
        TextView tvPlaceDescription;
        ImageView imgPlaceImage;
    }
}
