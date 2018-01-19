package br.com.ddmsoftware.sorocabaguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.firebase.analytics.FirebaseAnalytics;

public class CategoryActivity extends AppCompatActivity {

    private FirebaseAnalytics mFirebaseAnalytics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        // Obtain the FirebaseAnalytics instance.
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);

        Button btnParks = findViewById(R.id.btnParques);
        Button btnCulture = findViewById(R.id.btnCulturaEntretenimento);
        Button btnHistorical = findViewById(R.id.btnHistoricalPlaces);

        btnParks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LogFirebirdEvents("1", "Category_Park");

                Intent intent = new Intent(getApplicationContext(), ItemsListViewActivity.class);
                intent.putExtra("Type", "Park");
                startActivity(intent);
            }
        });

        btnCulture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LogFirebirdEvents("1", "Category_Culture");
                Intent intent = new Intent(getApplicationContext(), ItemsListViewActivity.class);
                intent.putExtra("Type", "Culture");
                startActivity(intent);
            }
        });


        btnHistorical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                LogFirebirdEvents("1", "Category_Historical");
                Intent intent = new Intent(getApplicationContext(), ItemsListViewActivity.class);
                intent.putExtra("Type", "Historical");
                startActivity(intent);
            }
        });

        AdView adView = findViewById(R.id.adViewCategory);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);

        // add back arrow to toolbar
        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // handle arrow click here
        if (item.getItemId() == android.R.id.home) {

            finish(); // close this activity and return to preview activity (if there is any)
        }

        return super.onOptionsItemSelected(item);
    }


    public void LogFirebirdEvents(String id, String name) {

        Bundle bundle = new Bundle();
        bundle.putString(FirebaseAnalytics.Param.ITEM_ID, id);
        bundle.putString(FirebaseAnalytics.Param.ITEM_NAME, name);
        bundle.putString(FirebaseAnalytics.Param.CONTENT_TYPE, "image");
        mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, bundle);
    }
}
