package com.omerakturk.gazetewithmenu.util;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Ömer Aktürk on 17.10.2017.
 */

public class Util {

    private static  Util INSTANCE ;

    public Util(Context context) {
    }

    public static Util getInstance(Context context){

        if(INSTANCE==null){
            INSTANCE =new Util(context);
        }
        return INSTANCE;
    }

    public static void showMessage(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}

