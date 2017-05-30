# HyperTrack Live Tracking View Consumer Android app
[![Slack Status](http://slack.hypertrack.com/badge.svg)](http://slack.hypertrack.com)

Live Tracking View Consumer application built with the `HyperTrack SDK` for Android.

## Requirements
1. [Android Studio](https://developer.android.com/studio/index.html) with emulator (or test device)
2. HyperTrack API keys. Learn more about them [here](https://docs.hypertrack.com/gettingstarted/authentication.html), and sign up for them [here](https://dashboard.hypertrack.com/signup).
3. [Action](https://docs.hypertrack.com/sdks/android/reference/action.html) ID of the order.

## Usage:
![Live Tracking View example](readme-imgs/live_tracking_view_consumer.gif)

The live tracking view consumer application implements tracking a driver performing a delivery. Read our [introduction](https://docs.hypertrack.com/) to know more.

Recommended: Take a look at the Android [documentation](https://docs.hypertrack.com/sdks/android/setup.html).

**STEPS**

1. Sync the Gradle files to download the HyperTrack SDKs.
2. Replace `YOUR_PUBLISHABLE_KEY` with your Hypertrack API key in `LiveTrackingConsumerApplication.java` [here](https://github.com/hypertrack/live-tracking-consumer-example-android/blob/master/app/src/main/java/io/hypertrack/livetrackingconsumer/LiveTrackingConsumerApplication.java#L19).
3. Setup a Google Maps API key. More info [here](https://developers.google.com/maps/documentation/android-api/start) and the steps to get an API key are [here](https://developers.google.com/maps/documentation/android-api/start#step_4_get_a_google_maps_api_key).
4. Add the API key to the manifest [here](https://github.com/hypertrack/live-tracking-consumer-example-android/blob/master/app/src/main/AndroidManifest.xml#L26).
6. Once you assign an Action on the [Use Case Android App](https://github.com/hypertrack/use-cases-example-android), get the action ID of order and add into the [actions](https://github.com/hypertrack/live-tracking-consumer-example-android/blob/master/app/src/main/java/io/hypertrack/livetrackingconsumer/MainActivity.java#L61) and call [`HyperTrack.trackAction`](https://github.com/hypertrack/live-tracking-consumer-example-android/blob/master/app/src/main/java/io/hypertrack/livetrackingconsumer/MainActivity.java#L66).
6. Run in emulator or directly on a phone either by connecting to your computer or by creating an APK and then installing it manually. You also will need to follow [these steps](https://developer.android.com/studio/run/emulator.html#extended) for the emulator.

## Documentation
For detailed documentation of the methods and [customizations](https://docs.hypertrack.com/usecases/livetracking/android/installing.html), please visit the official [docs](https://docs.hypertrack.com/).

## Contribute
Please use the [issues tracker](https://github.com/hypertrack/live-tracking-consumer-example-android/issues) to raise bug reports and feature requests. We'd love to see your pull requests - send them in!

## Support
Join our [Slack community](http://slack.hypertrack.com) for instant responses, or interact with our growing [Community](https://community.hypertrack.com). You can also email us at help@hypertrack.com.
