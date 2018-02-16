# Android broadcast receiver,  receiver priority order 

Register the receiver in the manifest file with priority. The higher priority will receive the broadcast first.
```
<receiver android:name="com.example.broadcast_receiver_order.Receiver1">
    <intent-filter android:priority="3">
        <action android:name="com.example.RECEIVERS"/>
    </intent-filter>
</receiver>
<receiver android:name="com.example.broadcast_receiver_order.Receiver2">
    <intent-filter android:priority="2">
        <action android:name="com.example.RECEIVERS"/>
    </intent-filter>
</receiver>
<receiver android:name="com.example.broadcast_receiver_order.Receiver3">
    <intent-filter android:priority="10">
        <action android:name="com.example.RECEIVERS"/>
    </intent-filter>
</receiver>
```
