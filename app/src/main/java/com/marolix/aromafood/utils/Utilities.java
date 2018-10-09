package com.marolix.aromafood.utils;

import android.content.Context;
import android.content.SharedPreferences;

import static android.content.Context.MODE_PRIVATE;

public class Utilities {

   /* public static void setPreferncLogin(Context context, String TAG, String value) {
        System.out.println("ContextSet=" + context);
        SharedPreferences preferences = context.getApplicationContext().getSharedPreferences(Constants.LOGIN_PREFERENCES, MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString(TAG, value);
        editor.apply();
    }*/

    /*public static String getPreferncLogin(Context context, String TAG) {
        System.out.println("Contextget=" + context);
        SharedPreferences preferences = context.getApplicationContext().getSharedPreferences(Constants.LOGIN_PREFERENCES, MODE_PRIVATE);
        String value = preferences.getString(TAG, "");
        return value;
    }*/

    public static void setBoolean(Context context, String TAG, boolean val){
        SharedPreferences preferences = context.getSharedPreferences(Constants.MYPREFERENCES, MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putBoolean(TAG, val);
        editor.apply();
    }

    public static boolean getBoolean(Context context, String TAG){
        SharedPreferences preferences = context.getSharedPreferences(Constants.MYPREFERENCES, MODE_PRIVATE);
        return preferences.getBoolean(TAG, false);
    }

    public static void setPrefernc(Context context, String TAG, String value) {
        System.out.println("ContextSet=" + context);
        SharedPreferences preferences = context.getApplicationContext().getSharedPreferences(Constants.MYPREFERENCES, MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString(TAG, value);
        editor.apply();
    }

    public static String getPrefernc(Context context, String TAG) {
        System.out.println("Contextget=" + context);
        SharedPreferences preferences = context.getApplicationContext().getSharedPreferences(Constants.MYPREFERENCES, MODE_PRIVATE);
        String value = preferences.getString(TAG, "");
        return value;
    }

    public static void clearAllPrefernces(Context context) {
        System.out.println("Contextclear=" + context);
        /*if(Constants.clearing_context!=null)
            context=Constants.clearing_context;*/

        if (context != null) {
            SharedPreferences.Editor editor = context.getApplicationContext().getSharedPreferences(Constants.MYPREFERENCES, Context.MODE_PRIVATE).edit();
            editor.clear();
            editor.apply();
            editor.commit();
        }
        if (context != null) {
            SharedPreferences.Editor editor = context.getApplicationContext().getSharedPreferences("PROJECT_NAME", Context.MODE_PRIVATE).edit();
            editor.clear();
            editor.apply();
            editor.commit();
        }

    }

}
