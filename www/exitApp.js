var exec = require('cordova/exec');

exports.sendCMD = function (ip,
                            message,
                            success, error) {
  exec(success, error, "socketwrapper", "sendCMD",
    [
      ip,
      message
    ]);
};
exports.exitApp = function () {
  exec(null, null, "exitApp", "exitApp",
    []);
};
