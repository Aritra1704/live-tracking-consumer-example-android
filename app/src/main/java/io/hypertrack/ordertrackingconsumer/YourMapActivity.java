package io.hypertrack.ordertrackingconsumer;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.google.android.gms.maps.GoogleMap;
import com.hypertrack.lib.HyperTrackMapAdapter;
import com.hypertrack.lib.HyperTrackMapFragment;
import com.hypertrack.lib.MapFragmentCallback;

/**
 * Created by Aman Jain on 06/03/17.
 */

public class YourMapActivity extends AppCompatActivity {

    private HyperTrackMapFragment hyperTrackMapFragment;
    private MyMapAdapter mapAdapter;
    private MyMapFragmentCallback mapFragmentCallback;

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
        hyperTrackMapFragment = (HyperTrackMapFragment) getSupportFragmentManager().findFragmentById(R.id.htMapfragment);

        /**
         * Call the method below to enable UI customizations for Live Tracking View, an instance of HyperTrackMapAdapter needs to be set as depicted below
         */
        mapAdapter = new MyMapAdapter(this);
        hyperTrackMapFragment.setHTMapAdapter(mapAdapter);

         /*
         * Call the method below to register for any callbacks/updates on Live Tracking View/Map
         */
        hyperTrackMapFragment.setMapFragmentCallback(mapFragmentCallback);

    }

    private class MyMapAdapter extends HyperTrackMapAdapter {
        private Context mContext;

        public MyMapAdapter(Context mContext) {
            super(mContext);
            this.mContext = mContext;
        }
        /*
        * Show the trailing polyline of driver*/
        @Override
        public boolean showTrailingPolyline() {
            return true;
        }
    }

    private class MyMapFragmentCallback extends MapFragmentCallback {

        @Override
        public void onMapReadyCallback(HyperTrackMapFragment hyperTrackMapFragment, GoogleMap map) {
            super.onMapReadyCallback(hyperTrackMapFragment, map);
        }
    }
}
