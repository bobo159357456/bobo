package cn.eoe.usingbc;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by lyb on 14-12-9.
 */
public class MyBC extends BroadcastReceiver{

    public static final String ACION = "cn.eoe.usingbc.intent.action.MyBC";

    @Override
    public void onReceive(Context context, Intent intent) {
        System.out.println("onRecevie,data="+intent.getStringExtra("txt"));
    }

}
