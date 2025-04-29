package com.pl.onewelcome;

import android.content.Context;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;

import android.util.Log;
import android.widget.Toast;

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
    Log.d("OneWelcomePlugin", "Login method called!");
    Toast.makeText(activity, "Cordova login triggered", Toast.LENGTH_SHORT).show();

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
