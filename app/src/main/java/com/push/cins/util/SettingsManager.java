package com.push.cins.util;

import android.content.Context;

import com.push.cins.R;

/**
 * Created by christopher on 5/20/16.
 */
public class SettingsManager {
    public static boolean shouldShowAuthor(Context context) {
        String showAuthorString = context.getResources().getString(R.string.show_author).toLowerCase();
        if(showAuthorString.equalsIgnoreCase("false")) {
            return false;
        }

        return true;
    }
}