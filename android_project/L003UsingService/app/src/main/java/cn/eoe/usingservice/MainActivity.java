package cn.eoe.usingservice;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity implements View.OnClickListener,ServiceConnection {

    private Button btnStartService,btnStopService,btnBindService,btnUnBindService,btnGetCurrentNumber;
    private Intent serviceIntent;
    private EchoService echoService=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        serviceIntent = new Intent(this,EchoService.class);

        btnStartService = (Button) findViewById(R.id.btnStartService);
        btnStopService = (Button) findViewById(R.id.btnStopService);
        btnBindService = (Button) findViewById(R.id.btnBindService);
        btnUnBindService = (Button) findViewById(R.id.btnUnBindService);
        btnGetCurrentNumber = (Button) findViewById(R.id.btnGetCurrentNum);

        btnStartService.setOnClickListener(this);
        btnStopService.setOnClickListener(this);
        btnBindService.setOnClickListener(this);
        btnUnBindService.setOnClickListener(this);
        btnGetCurrentNumber.setOnClickListener(this);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnStartService:
                startService(serviceIntent);
                break;
            case R.id.btnStopService:
                stopService(serviceIntent);
                break;
            case R.id.btnBindService:
                bindService(serviceIntent,this, Context.BIND_AUTO_CREATE);
                break;
            case R.id.btnUnBindService:
                unbindService(this);
                echoService=null;
                break;
            case R.id.btnGetCurrentNum:
                if (echoService != null) {
                    System.out.println("当前服务中的数字是:  "+echoService.getCurrentNum());
                }
                break;
        }

    }


    @Override
    public void onServiceConnected(ComponentName name, IBinder binder) {
        System.out.println("onServiceConnected");

        echoService=((EchoService.EchoServiceBinder)binder).getService();


    }

    @Override
    public void onServiceDisconnected(ComponentName name) {
    }
}
