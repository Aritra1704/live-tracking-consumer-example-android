package io.hypertrack.ordertrackingconsumer;

import android.content.Context;

import com.hypertrack.lib.HyperTrackMapAdapter;

/**
 * Created by Aman Jain on 30/05/17.
 */

public class MyMapAdapter extends HyperTrackMapAdapter {

    private Context mContext;

    public MyMapAdapter(Context mContext) {
        super(mContext);
        this.mContext = mContext;
    }

    /*
    * Show the trailing polyline of driver
    * */
    @Override
    public boolean showTrailingPolyline() {
        return true;
    }

}
