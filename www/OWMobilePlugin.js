// Empty constructor
function OWMobilePlugin() {}


OWMobilePlugin.prototype.login = function(username, password, successCallback, errorCallback) {
  var options = {};
  options.username = username;
  options.password = password;
  cordova.exec(successCallback, errorCallback, 'OWMobilePlugin', 'login', [options]);
}


OWMobilePlugin.prototype.logout = function(username, successCallback, errorCallback) {
  var options = {};
  options.username = username;
  cordova.exec(successCallback, errorCallback, 'OWMobilePlugin', 'logout', [options]);
}


OWMobilePlugin.prototype.register = function(username, password, successCallback, errorCallback) {
  var options = {};
  options.username = username;
  options.password = password;
  cordova.exec(successCallback, errorCallback, 'OWMobilePlugin', 'register', [options]);
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
