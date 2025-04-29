var exec = require('cordova/exec');

exports.login = function (success, error) {
  exec(success, error, 'OWMobilePlugin', 'login', []);
};

exports.logout = function (success, error) {
  exec(success, error, 'OWMobilePlugin', 'logout', []);
};

exports.register = function (success, error) {
  exec(success, error, 'OWMobilePlugin', 'register', []);
};
