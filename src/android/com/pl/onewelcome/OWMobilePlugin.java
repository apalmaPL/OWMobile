package com.pl.onewelcome;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;

import android.app.Activity;
import android.app.AlertDialog;
import android.util.Log;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

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
    Log.d("OWMobilePlugin", "Login method called!");
    Toast.makeText(cordova.getActivity(), "Cordova login triggered", Toast.LENGTH_SHORT).show();

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

  

}
