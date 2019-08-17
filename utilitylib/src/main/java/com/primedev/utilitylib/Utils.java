package com.primedev.utilitylib;

import android.content.Context;
import android.widget.Toast;

public class Utils {

    /*
    context  : Context of Activity
    message  : String to show
    duration : 1 for Long & 0 for Short duration
    */
    public static void PToast(Context context, String message, int duration) {
        Toast.makeText(context, message, duration).show();
    }
}
