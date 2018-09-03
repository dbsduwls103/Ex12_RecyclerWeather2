package com.dbsduwls103.ex12_recyclerweather2.Utils;

import android.Manifest;
import android.app.Activity;
import android.content.pm.PackageManager;
import android.location.LocationListener;
import android.location.LocationManager;
import android.support.v4.app.ActivityCompat;

public class PermitGps {
    public static void check(Activity activity,
                                LocationManager lm,
                                int min, int distance) {
        int permitGrant = PackageManager.PERMISSION_GRANTED;
        String finePermit = Manifest.permission.ACCESS_FINE_LOCATION;
        String coarsePermit = Manifest.permission.ACCESS_COARSE_LOCATION;
        int selfFine = ActivityCompat.checkSelfPermission(activity.getApplicationContext(), finePermit);
        int selfCoarse = ActivityCompat.checkSelfPermission(activity.getApplicationContext(), coarsePermit);

        if (selfFine != permitGrant && selfCoarse != permitGrant) {
            ActivityCompat.requestPermissions(
                    activity,
                    new String[] {finePermit, coarsePermit},
                    100);
            return;
        }
        lm.requestLocationUpdates(
                LocationManager.GPS_PROVIDER, min, distance, (LocationListener) activity);
        lm.requestLocationUpdates(
                LocationManager.NETWORK_PROVIDER, min, distance, (LocationListener) activity);
    }
}
