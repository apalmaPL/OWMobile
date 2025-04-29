/**
 * OWMobilePlugin
 * @constructor
 */
function OWMobilePlugin(pluginName) {
    this.version = 1;
    this.pluginName = pluginName;
}


/**
 * login using OW
 * @param successCallback
 * @param errorCallback
 */
OWMobilePlugin.prototype.login = function(successCallback, errorCallback) {
    cordova.exec(successCallback, errorCallback, this.pluginName, 'login', []);
};

/**
 * logout using OW
 * @param successCallback
 * @param errorCallback
 */
OWMobilePlugin.prototype.logout = function(successCallback, errorCallback) {
    cordova.exec(successCallback, errorCallback, this.pluginName, 'logout', []);
};

/**
 * register using OW
 * @param username
 * @param password
 * @param successCallback
 * @param errorCallback
 */
OWMobilePlugin.prototype.register = function(username, password, successCallback, errorCallback) {
    cordova.exec(successCallback, errorCallback, this.pluginName, 'register', [username, password]);
};


/**
 * export default OWMobilePlugin
 * @type {OWMobilePlugin}
 */
module.exports = new OWMobilePlugin('OWMobilePlugin');
