
var OWMobilePlugin = (function(){
    
    var OWMobilePlugin = {};

    /**
     * login using OW
     * @param successCallback
     * @param errorCallback
     */
    OWMobilePlugin.prototype.login = function(successCallback, errorCallback) {
        cordova.exec(successCallback, errorCallback, 'OWMobilePlugin', 'login', []);
    };
    
    /**
     * logout using OW
     * @param successCallback
     * @param errorCallback
     */
    OWMobilePlugin.prototype.logout = function(successCallback, errorCallback) {
        cordova.exec(successCallback, errorCallback, 'OWMobilePlugin', 'logout', []);
    };
    
    /**
     * register using OW
     * @param username
     * @param password
     * @param successCallback
     * @param errorCallback
     */
    OWMobilePlugin.prototype.register = function(username, password, successCallback, errorCallback) {
        cordova.exec(successCallback, errorCallback, 'OWMobilePlugin', 'register', [username, password]);
    };
        
    
    return OWMobilePlugin;
});


/**
 * export default OWMobilePlugin
 * @type {OWMobilePlugin}
 */
module.exports = new OWMobilePlugin();
