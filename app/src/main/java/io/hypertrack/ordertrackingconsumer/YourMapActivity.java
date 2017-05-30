package io.hypertrack.ordertrackingconsumer;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.hypertrack.lib.HyperTrackMapAdapter;
import com.hypertrack.lib.HyperTrackMapFragment;

/**
 * Created by Aman Jain on 06/03/17.
 */

public class YourMapActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_track);

        initUI();
    }

    private void initUI(){

        /** Initialize Map Fragment added in Activity Layout to getMapAsync
         *  Once map is created onMapReady callback will be fire with GoogleMap object
         */
        HyperTrackMapFragment hyperTrackMapFragment; hyperTrackMapFragment =
                (HyperTrackMapFragment) getSupportFragmentManager().findFragmentById(R.id.htMapfragment);

        /**
         * Call the method below to enable UI customizations for Live Tracking View, an instance of HyperTrackMapAdapter needs to be set as depicted below
         */
        HyperTrackMapAdapter mapAdapter = new MyMapAdapter(this);
        hyperTrackMapFragment.setHTMapAdapter(mapAdapter);

         /*
         * Call the method below to register for any callbacks/updates on Live Tracking View/Map
         */
        MyMapFragmentCallback mapFragmentCallback = new MyMapFragmentCallback();
        hyperTrackMapFragment.setMapFragmentCallback(mapFragmentCallback);

    }

}
