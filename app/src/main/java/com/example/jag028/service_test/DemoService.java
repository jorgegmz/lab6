package com.example.jag028.service_test;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class DemoService extends Service {
    public DemoService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
