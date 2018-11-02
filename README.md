# bluetooth_services
minimalist android application which uses Android Bluetooth LE API library to scan ibeacon in the background

this project contains 1 activity and 1 services:-
a. mainactivity.java - main ui thread
b. ScanBT.java - other thread which runs the bluetooth scanning in the background.

This app continues to scan eventhough the app is closed. scanning stops after apply "force stop" on this app.
