package br.com.ddmsoftware.sorocabaguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class CategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        Button btnParks = findViewById(R.id.btnParques);
        Button btnCulture = findViewById(R.id.btnCulturaEntretenimento);
        Button btnHistorical = findViewById(R.id.btnHistoricalPlaces);

        btnParks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ItemsListViewActivity.class);
                intent.putExtra("Type", "Park");
                startActivity(intent);
            }
        });

        btnCulture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ItemsListViewActivity.class);
                intent.putExtra("Type", "Culture");
                startActivity(intent);
            }
        });


        btnHistorical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
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
}
