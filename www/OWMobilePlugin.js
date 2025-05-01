// Empty constructor
function OWMobilePlugin() {}


OWMobilePlugin.prototype.login = function(username, password, successCallback, errorCallback) {
  cordova.exec(successCallback, errorCallback, 'OWMobilePlugin', 'login', [username,password]);
}


OWMobilePlugin.prototype.logout = function(username, successCallback, errorCallback) {
  cordova.exec(successCallback, errorCallback, 'OWMobilePlugin', 'logout', [username]);
}


OWMobilePlugin.prototype.register = function(username, password, successCallback, errorCallback) {
  cordova.exec(successCallback, errorCallback, 'OWMobilePlugin', 'register', [username,password]);
}



// Installation constructor that binds OWMobilePlugin to window
OWMobilePlugin.install = function() {
  if (!window.plugins) {
    window.plugins = {};
  }
  window.plugins.OWMobilePlugin = new OWMobilePlugin();
  return window.plugins.OWMobilePlugin;
};

cordova.addConstructor(OWMobilePlugin.install);
