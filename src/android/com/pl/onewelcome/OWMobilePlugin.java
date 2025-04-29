package com.pl.onewelcome;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.app.Activity;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;

import org.json.JSONArray;
import org.json.JSONException;

public class OWMobilePlugin extends CordovaPlugin {

  @Override
  public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
    if ("login".equals(action)) {
      this.login(callbackContext);
      return true;
    }
    if ("logout".equals(action)) {
      this.logout(callbackContext);
      return true;
    }
    if ("register".equals(action)) {
      this.register(callbackContext);
      return true;
    }
    return false;
  }

  private void login(CallbackContext callbackContext) {
    // TODO: Integrate OneWelcome Android SDK login here
    
    final Context context = cordova.getActivity();
    // Show native Android alert
    showAlert(context, "Login triggered from Cordova!");

    callbackContext.success("Login triggered from native Android!");
  }

  private void logout(CallbackContext callbackContext) {
    // TODO: Integrate OneWelcome Android SDK login here
    callbackContext.success("Logout triggered from native Android!");

  }

  private void register(CallbackContext callbackContext) {
    // TODO: Integrate OneWelcome Android SDK login here
    callbackContext.success("Register triggered from native Android!");

  }

    private void showAlert(final Context context, final String message) {
        ((Activity) context).runOnUiThread(new Runnable() {
            @Override
            public void run() {
                new AlertDialog.Builder(context)
                    .setTitle("OneWelcome Login")
                    .setMessage(message)
                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    })
                    .setCancelable(true)
                    .show();
            }
        });
    }

}
