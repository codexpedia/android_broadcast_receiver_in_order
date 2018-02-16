package com.example.broadcast_receiver_order;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class Receiver2 extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		String res = getResultData();
		Toast.makeText(context, "Receiver2.."+res, Toast.LENGTH_SHORT).show();
	}
}
