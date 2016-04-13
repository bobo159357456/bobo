package cn.eoe.uicontrols;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

/**
 * Created by lyb on 14-12-17.
 */
public class AtyUsingSpinner extends Activity{

    private Spinner spinner;
    private ArrayAdapter<String>adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aty_using_spinner);

        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item);
        adapter.add("Hello");
        adapter.add("eoe");
        adapter.add("eoe.cn");

        spinner = (Spinner) findViewById(R.id.spinner);
        spinner.setAdapter(adapter);
    }
}
