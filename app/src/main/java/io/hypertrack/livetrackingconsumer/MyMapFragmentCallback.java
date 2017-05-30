package io.hypertrack.livetrackingconsumer;

import com.google.android.gms.maps.GoogleMap;
import com.hypertrack.lib.HyperTrackMapFragment;
import com.hypertrack.lib.MapFragmentCallback;
import com.hypertrack.lib.models.Action;

import java.util.List;

/**
 * Created by Aman Jain on 30/05/17.
 */

public class MyMapFragmentCallback extends MapFragmentCallback {

    @Override
    public void onMapReadyCallback(HyperTrackMapFragment hyperTrackMapFragment, GoogleMap map) {
        //Write your code here
        super.onMapReadyCallback(hyperTrackMapFragment, map);
    }

    /**
     * Called when status of any action changes during live order tracking.
     * @param changedStatusActionIds The List of ActionIDs for which the status changed.
     * @param changedStatusActions The List of Actions for which the status changed.
     */
    @Override
    public void onActionStatusChanged(List<String> changedStatusActionIds, List<Action> changedStatusActions) {
        //Write your code here
        super.onActionStatusChanged(changedStatusActionIds, changedStatusActions);
    }

    /**
     * Called when action refreshed during live order tracking.
     *  @param refreshedActionIds is the list of action IDs that are refreshed
     *  @param refreshedActions The List of refreshed Actions.
     */
    @Override
    public void onActionRefreshed(List<String> refreshedActionIds, List<Action> refreshedActions) {
        //Write your code here
        super.onActionRefreshed(refreshedActionIds, refreshedActions);
    }
}
