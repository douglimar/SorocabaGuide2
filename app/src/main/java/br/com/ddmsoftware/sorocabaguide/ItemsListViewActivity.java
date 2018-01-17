package br.com.ddmsoftware.sorocabaguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.util.ArrayList;

public class ItemsListViewActivity extends AppCompatActivity {

    public static ArrayList<Place> placeArrayList;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_items_list_view);

        listView = findViewById(R.id.myListView);

        Intent intent = getIntent();

        String sType;
        sType = (String) intent.getExtras().get("Type");

        getItemsList(sType);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(), DetailsActivity.class);

                intent.putExtra("Position", position);
                startActivity(intent);
            }
        });

        // add back arrow to toolbar
        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }



        AdView adView = findViewById(R.id.adViewListView);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // handle arrow click here
        if (item.getItemId() == android.R.id.home) {
            finish(); // close this activity and return to preview activity (if there is any)
        }

        return super.onOptionsItemSelected(item);
    }


    private void getItemsList(String pType) {

        LinearLayout linearLayout = findViewById(R.id.linearListView);

        switch (pType) {

            case "Park": {

                //linearLayout.setBackgroundColor(getResources().getColor(R.color.lightGray));
                linearLayout.setBackground(getResources().getDrawable(R.drawable.bg_button_parks2));

                Place place = new Place();
                placeArrayList = place.getAllParks(this);
                listView.setAdapter(new ItemListBaseAdapter(this, placeArrayList));
                break;
            }

            case "Culture": {

                //linearLayout.setBackgroundColor(getResources().getColor(R.color.lightBlue2));
                linearLayout.setBackground(getResources().getDrawable(R.drawable.bg_button_culture2));

                Place place = new Place();
                placeArrayList = place.getAllCulturePlaces(this);
                listView.setAdapter(new ItemListBaseAdapter(this, placeArrayList));
                break;
            }

            case "Historical": {

                //linearLayout.setBackgroundColor(getResources().getColor(R.color.lightBlue2));
                linearLayout.setBackground(getResources().getDrawable(R.drawable.bg_button_historicalplaces));

                Place place = new Place();
                placeArrayList = place.getAllHistoricalPlaces(this);
                listView.setAdapter(new ItemListBaseAdapter(this, placeArrayList));
                break;
            }
        }
    }

}
