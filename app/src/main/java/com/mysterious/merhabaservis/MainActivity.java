package com.mysterious.merhabaservis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    boolean servisDurumu=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btServis = (Button) findViewById(R.id.btServis);

        btServis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!servisDurumu)
                {
                    Intent i = new Intent(MainActivity.this,Servis.class);
                    startService(i);
                    servisDurumu=true;
                    btServis.setText("SERVİSİ DURDUR");
                }
                else
                {
                    Intent i = new Intent(MainActivity.this,Servis.class);
                    stopService(i);
                    servisDurumu=false;
                    btServis.setText("SERVİSİ BAŞLAT");
                }
            }
        });

    }
}
