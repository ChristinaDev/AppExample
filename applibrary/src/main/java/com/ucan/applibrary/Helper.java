package com.ucan.applibrary;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

public class Helper {

    static public void setDrawableColor(Drawable drawable, int color) {
        try {
            drawable.mutate().setColorFilter(color, PorterDuff.Mode.SRC_IN);
        } catch (Throwable t){
            drawable.setColorFilter(color, PorterDuff.Mode.SRC_IN);
        }
    }
}
