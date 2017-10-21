package com.omerakturk.gazetewithmenu.other;

import android.content.Context;
import android.location.LocationListener;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by Ömer Aktürk on 16.10.2017.
 */

public abstract class AbstractLocationListener implements LocationListener
{

    private Context context;

    protected AbstractLocationListener(Context context)
    {
        this.context = context;
    }


    @Override
    public void onStatusChanged(String provider, int status, Bundle extras)
    {
        switch (status)
        {
            case 0:
                Toast.makeText(context, "Saglayici: " + provider + " Durum: Servis Dışı", Toast.LENGTH_SHORT).show();
                break;

            case 1:
                Toast.makeText(context, "Saglayici: " + provider + " Durum: Geçici olarak uygun değil.", Toast.LENGTH_SHORT).show();
                break;

            case 2:
                Toast.makeText(context, "Saglayici: " + provider + " Durum: Uygun", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    @Override
    public void onProviderEnabled(String provider) // Saglayicinin aktif olmasi durumunda tetiklenir.
    {
        Toast.makeText(context,"Saglayici: " + provider, Toast.LENGTH_SHORT).show();
    }
}
