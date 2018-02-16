package com.example.broadcast_receiver_order;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class Receiver3 extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		Toast.makeText(context, "Receiver3", Toast.LENGTH_SHORT).show();
		//abortBroadcast();
		setResultData("Hey..");
	}
}
