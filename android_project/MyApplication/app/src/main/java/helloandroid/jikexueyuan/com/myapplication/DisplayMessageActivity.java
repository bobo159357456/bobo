package helloandroid.jikexueyuan.com.myapplication;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by zmzp on 14-12-3.
 */
public class DisplayMessageActivity extends ActionBarActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        if (savedInstanceState==null){
            getSupportFragmentManager().beginTransaction().add(R.id.cantainer,new PlaceholderFragment()).commit();
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if(id==R.id.action_settings){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment{
        public PlaceholderFragment(){

            @Override
            public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState){
                View rootView = inflater.inflate(R.layout.frament_display_message,cantainer,false);
                return rootView;
            }
        }
    }

}
