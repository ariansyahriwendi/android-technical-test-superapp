# Automate Mobile App Testing with Appium and Java

## Configuration
Before start to test, you must have to install all of this configuration
1. Java JDK
2. Maven
3. Appium
4. Android SDK
5. Intellij IDEA
6. Appium Server GUI
7. Appium Inspector

## Open project with Intellij IDEA
1. Open Intellij IDEA
2. Project > Get from VCS
3. Input URL "https://github.com/ariansyahriwendi/android-technical-test-superapp.git"
4. Input directory
5. Clone

## Connect Android Phone to Computer
1. Connect Android Phone to Computer with USB Cable
2. Open Phone Settings
3. Activate Developer Mode
4. Activate USB Debugging

## Open Appium Server GUI
1. Open Appium Server GUI
2. Input Host "0.0.0.0"
3. Input Port "4723"
4. StartServer

## Open Appium Inspector
1. Open Appium Inspector
2. Click Desired Capabilities
3. Input | "platformName" | "text" | "Android" |
4. Input | "appium:deviceName" | "text" | "(your device name)"
5. Click start session

## Preparation
1. Open Intellij IDEA
2. Open Project > src > main > java > BaseClass > BaseSetUp
3. Change "caps.setCapability(DEVICE_NAME, "(your device name")" to your device name
4. Download testing apk to your phone. You can download at Project > apk

## Start Testing
1. Open Intellij IDEA
2. Open Project > src > test > java > BDD > Login.feature
3. Click run test icon beside "feature" to run all test scenario on the feature
4. Click run test icon beside "scenario" to run 1 test scenario on the feature

## Second Option To Start Testing
1. Open Intellij IDEA
2. Open Project > src > test > java > BaseClass > TestRunner
3. Change tags that you want feature/scenario you want test from the BDD. Example "tags = "@LoginSuite", so it will run the login suite feature
4. Click run test icon beside public class TestRunner
