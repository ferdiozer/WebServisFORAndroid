package com.mysterious.merhabaservis;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.widget.Toast;

/**
 * Created by Ferdi on 20.2.2017.
 */

public class Servis extends Service {

    Handler handler = new Handler();

    @Override
    public IBinder  onBind(Intent intent){
        return null;
    }

    @Override
    public void onCreate(){
        super.onCreate();

        Toast.makeText(getApplicationContext(),"Servis Başlatıldı",Toast.LENGTH_SHORT).show();

        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                Toast.makeText(getApplicationContext(),"10 saniye doldu",Toast.LENGTH_SHORT).show();
                handler.postDelayed(this,10000);
            }
        };
        handler.post(runnable);

    }

    @Override
    public void onDestroy(){
        super.onDestroy();

        Toast.makeText(getApplicationContext(),"SERVİS DURDURULDU",Toast.LENGTH_SHORT).show();
    }
}
