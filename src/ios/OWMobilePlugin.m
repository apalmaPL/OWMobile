/********* OWMobilePlugin.m Cordova Plugin Implementation *******/

#import <Cordova/CDV.h>

@interface OWMobilePlugin : CDVPlugin {
  // Member variables go here.
}
- (void)login:(CDVInvokedUrlCommand*)command;
- (void)logout:(CDVInvokedUrlCommand*)command;
- (void)register:(CDVInvokedUrlCommand*)command;
@end

@implementation OWMobilePlugin

- (void)login:(CDVInvokedUrlCommand*)command
{
  // TODO: Integrate OneWelcome iOS SDK login here

    CDVPluginResult* pluginResult = [CDVPluginResult resultWithStatus:CDVCommandStatus_OK messageAsString:@"Login triggered from native iOS!"];
    [self.commandDelegate sendPluginResult:pluginResult callbackId:command.callbackId];
}

- (void)logout:(CDVInvokedUrlCommand*)command
{
  // TODO: Integrate OneWelcome iOS SDK logout here

    CDVPluginResult* pluginResult = [CDVPluginResult resultWithStatus:CDVCommandStatus_OK messageAsString:@"Logout triggered from native iOS!"];
    [self.commandDelegate sendPluginResult:pluginResult callbackId:command.callbackId];
}

- (void)register:(CDVInvokedUrlCommand*)command
{
  // TODO: Integrate OneWelcome iOS SDK register here

    CDVPluginResult* pluginResult = [CDVPluginResult resultWithStatus:CDVCommandStatus_OK messageAsString:@"Register triggered from native iOS!"];
    [self.commandDelegate sendPluginResult:pluginResult callbackId:command.callbackId];
}

@end
