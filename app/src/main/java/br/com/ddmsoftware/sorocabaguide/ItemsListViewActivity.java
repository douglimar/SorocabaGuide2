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
import com.google.firebase.analytics.FirebaseAnalytics;

import java.util.ArrayList;

public class ItemsListViewActivity extends AppCompatActivity {

    private FirebaseAnalytics mFirebaseAnalytics;

    public static ArrayList<Place> placeArrayList;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_items_list_view);

        // Obtain the FirebaseAnalytics instance.
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);

        listView = findViewById(R.id.myListView);

        Intent intent = getIntent();

        //noinspection ConstantConditions
        String sType = (String) intent.getExtras().get("Type");

        getItemsList(sType);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                LogFirebirdEvents("1", "OnItemClick");
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

                LogFirebirdEvents("2", "Park");
                //linearLayout.setBackgroundColor(getResources().getColor(R.color.lightGray));
                linearLayout.setBackground(getResources().getDrawable(R.drawable.bg_button_parks2));

                Place place = new Place();
                placeArrayList = place.getAllParks(this);
                listView.setAdapter(new ItemListBaseAdapter(this, placeArrayList));
                break;
            }

            case "Culture": {

                LogFirebirdEvents("3", "Culture");
                //linearLayout.setBackgroundColor(getResources().getColor(R.color.lightBlue2));
                linearLayout.setBackground(getResources().getDrawable(R.drawable.bg_button_culture2));

                Place place = new Place();
                placeArrayList = place.getAllCulturePlaces(this);
                listView.setAdapter(new ItemListBaseAdapter(this, placeArrayList));
                break;
            }

            case "Historical": {

                LogFirebirdEvents("4", "Historical");

                //linearLayout.setBackgroundColor(getResources().getColor(R.color.lightBlue2));
                linearLayout.setBackground(getResources().getDrawable(R.drawable.bg_button_historicalplaces));

                Place place = new Place();
                placeArrayList = place.getAllHistoricalPlaces(this);
                listView.setAdapter(new ItemListBaseAdapter(this, placeArrayList));
                break;
            }
        }
    }


    public void LogFirebirdEvents(String id, String name) {

        Bundle bundle = new Bundle();
        bundle.putString(FirebaseAnalytics.Param.ITEM_ID, id);
        bundle.putString(FirebaseAnalytics.Param.ITEM_NAME, name);
        bundle.putString(FirebaseAnalytics.Param.CONTENT_TYPE, "image");
        mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, bundle);
    }


}
