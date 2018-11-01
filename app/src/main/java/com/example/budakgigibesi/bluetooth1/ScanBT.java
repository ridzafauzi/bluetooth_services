package com.example.budakgigibesi.bluetooth1;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

public class ScanBT extends Service {  
	
    Handler handler = new Handler();
	
	private Runnable runnableCode = new Runnable() {
		@Override
		public void run() {
		  // Do something here on the main thread
		  Log.d("ScanBT", "Start Scanning");
		  handler.postDelayed(runnableCode, 2000);	// Repeat this the same runnable code block again another 2 seconds
		}
	};
	
	public ScanBT() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
	
	@Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Toast.makeText(this, "ScanBT Started", Toast.LENGTH_LONG).show();
		
		handler.post(runnableCode);
		
		return super.onStartCommand(intent, flags, startId);	
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "ScanBT Destroyed", Toast.LENGTH_LONG).show();
    }	
	
	
	
	
}
