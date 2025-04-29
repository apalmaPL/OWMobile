var exec = require('cordova/exec');

exports.login = function (success, error) {
  exec(success, error, 'OneWelcomePlugin', 'login', []);
};

exports.logout = function (success, error) {
  exec(success, error, 'OneWelcomePlugin', 'logout', []);
};

exports.register = function (success, error) {
  exec(success, error, 'OneWelcomePlugin', 'register', []);
};
