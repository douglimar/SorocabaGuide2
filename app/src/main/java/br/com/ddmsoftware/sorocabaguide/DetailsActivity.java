package br.com.ddmsoftware.sorocabaguide;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.firebase.analytics.FirebaseAnalytics;

public class DetailsActivity extends AppCompatActivity {

    private FirebaseAnalytics mFirebaseAnalytics;

    private int iArray_ItemPicture[];
    private int iControlImageArray = 0;
    private ImageView imgItemPicture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Obtain the FirebaseAnalytics instance.
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);

        CollapsingToolbarLayout toolbar_layout = findViewById(R.id.toolbar_layout);

        TextView tvItemName = findViewById(R.id.tvDetails_ItemName);
        TextView tvItemDesc = findViewById(R.id.tvDetails_ItemDescription);
        TextView tvItemFullDesc = findViewById(R.id.tvDetails_FullDescription);
        TextView tvItemAddress = findViewById(R.id.tvDetails_Address);

        imgItemPicture = findViewById(R.id.imgDetails_ItemPicture);

        Intent intent = getIntent();
        @SuppressWarnings("ConstantConditions") int iDataPosition = (int) intent.getExtras().get("Position");

        String sItemName = ItemsListViewActivity.placeArrayList.get(iDataPosition).getPlaceName();
        String sItemDescription = ItemsListViewActivity.placeArrayList.get(iDataPosition).getPlaceSmallDescription();
        final String sItemAddress = ItemsListViewActivity.placeArrayList.get(iDataPosition).getPlaceAddress();
        String sItemFullDescription = ItemsListViewActivity.placeArrayList.get(iDataPosition).getPlaceFullDescription();


        iArray_ItemPicture = ItemsListViewActivity.placeArrayList.get(iDataPosition).getPlacePictures();

        this.setTitle(sItemName);

        tvItemName.setText(sItemName);
        tvItemDesc.setText(sItemDescription);

        tvItemAddress.setText(sItemAddress);
        tvItemFullDesc.setText(sItemFullDescription);

        imgItemPicture.setImageResource(iArray_ItemPicture[0]);

        toolbar_layout.setBackgroundResource(iArray_ItemPicture[0]);

        //Toast.makeText(getApplicationContext(), "CONTEUDO DO ARRAY1: \n" + sItemName + "\n" + sItemDescription + "\n" + iItemPicture, Toast.LENGTH_LONG).show();

        imgItemPicture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                LogFirebirdEvents("1", "Details_Click");


                iControlImageArray++;

                if (iControlImageArray>=iArray_ItemPicture.length) {
                    iControlImageArray = 0;
                }

                imgItemPicture.setImageResource(iArray_ItemPicture[iControlImageArray]);
            }
        });

        Button btnMaps = findViewById(R.id.btnMaps);

        btnMaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getDirection(sItemAddress);
            }
        });

        AdView adView = findViewById(R.id.adViewDetails1);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);


        AdView adView1 = findViewById(R.id.adViewDetails2);
        AdRequest adRequest1 = new AdRequest.Builder().build();
        adView1.loadAd(adRequest1);

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

    private void getDirection(String pAddress){

        //Uri gmmIntentUri = Uri.parse(String.valueOf(R.string.expression_gmaps_geolocation_gasstation));
        //String s_Search_tag = getString(R.string.posto_gasolina);

        //Toast.makeText(MainActivity.this, R.string.expression_gmaps_geolocation_gas_station, Toast.LENGTH_SHORT).show();

        Uri gmmIntentUri = Uri.parse("geo:0,0?q=" + pAddress);
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);

        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);


    }



    public void LogFirebirdEvents(String id, String name) {

        Bundle bundle = new Bundle();
        bundle.putString(FirebaseAnalytics.Param.ITEM_ID, id);
        bundle.putString(FirebaseAnalytics.Param.ITEM_NAME, name);
        bundle.putString(FirebaseAnalytics.Param.CONTENT_TYPE, "image");
        mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, bundle);
    }
}
