package ow.plugins;

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
      this.login(args, callbackContext);
      return true;
    }
    else if ("logout".equals(action)) {
      this.logout(args, callbackContext);
      return true;
    }
    else if ("register".equals(action)) {
      this.register(args, callbackContext);
      return true;
    }
    return false;
  }

  private void login(JSONArray args, CallbackContext callbackContext) {
    // TODO: Integrate OneWelcome Android SDK login here
    final String username = args.getString(0);
    final String password = args.getString(1);


    
    this.logMessage("OW login triggered: " + username, true);
    callbackContext.success("Login triggered from native Android!");
  }

  private void logout(JSONArray args, CallbackContext callbackContext) {
    // TODO: Integrate OneWelcome Android SDK login here
    final String username = args.getString(0);

    
    this.logMessage("OW logout triggered: " + username, true);
    callbackContext.success("Logout triggered from native Android!");
  }

  private void register(JSONArray args, CallbackContext callbackContext) {
    // TODO: Integrate OneWelcome Android SDK login here
    final String username = args.getString(0);
    final String password = args.getString(1);



    
    this.logMessage("OW register triggered. Username:"+username+" Password:"+password, true);
    callbackContext.success("Register triggered from native Android!");
  }


  
private void logMessage(String message, Boolean isShowToast){
    Log.d("OWMobilePlugin", message);
    if(isShowToast)
      Toast.makeText(cordova.getActivity(), message, Toast.LENGTH_SHORT).show();
}
  

}
