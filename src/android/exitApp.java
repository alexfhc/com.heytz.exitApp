package com.heytz.exitApp;

import android.content.Context;
import android.util.Log;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.json.JSONArray;
import org.json.JSONException;

import java.io.OutputStream;

/**
 * This class starts transmit to activation
 */
public class exitApp extends CordovaPlugin {

    private static String TAG = "=====exitApp.class====";
    private CallbackContext socketCallbackContext;
    private Context context;


    @Override
    public void initialize(CordovaInterface cordova, CordovaWebView webView) {
        super.initialize(cordova, webView);
        context = cordova.getActivity().getApplicationContext();
    }

    @Override
    public boolean execute(String action, JSONArray args, final CallbackContext callbackContext) throws JSONException {
        socketCallbackContext = callbackContext;
        if (action.equals("exitApp")) {
            System.exit(0)
            return true;
        }
        return false;
    }


}
