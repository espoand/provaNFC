package com.example.andreaesposito.provanfc;

import android.nfc.NdefMessage;
import android.nfc.NdefRecord;
import android.nfc.NfcAdapter;
import android.nfc.NfcEvent;
import android.widget.Toast;

/**
 * Created by andreaesposito on 29/05/16.
 */
public class NdefCallBack implements NfcAdapter.CreateNdefMessageCallback,
        NfcAdapter.OnNdefPushCompleteCallback {
    @Override
    public NdefMessage createNdefMessage(NfcEvent event){
        NdefMessage msg = new NdefMessage(NdefRecord.createMime(
                "andrea", null));

        return msg;
    }
    @Override
    public void onNdefPushComplete(NfcEvent arg0) {
        // A handler is needed to send messages to the activity when this
        // callback occurs, because it happens from a binder thread
    }
}
