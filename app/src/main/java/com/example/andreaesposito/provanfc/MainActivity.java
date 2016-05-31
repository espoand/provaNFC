package com.example.andreaesposito.provanfc;


import android.nfc.NdefMessage;
import android.nfc.NfcAdapter;

import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
NfcAdapter mNfcAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnSend = (Button) findViewById(R.id.btnSend);
        mNfcAdapter = NfcAdapter.getDefaultAdapter(this);
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            // Register callback to set NDEF message
                mNfcAdapter.setNdefPushMessageCallback(new NdefCallBack(), MainActivity.this);
                // Register callback to listen for message-sent success
            }
        });

    }


}
