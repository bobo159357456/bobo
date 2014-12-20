package cn.eoe.uicontrols;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;


/**
 * Created by lyb on 14-12-18.
 */
public class AtyUsingAutoCompleteTextView extends Activity{

    private AutoCompleteTextView actv;
    private MultiAutoCompleteTextView mactv;
    private ArrayAdapter<String> actvadapter,mactvAdapter;
    private String[] strs = new String[]{
            "hello",
            "hello eoe",
            "hello eoe.cn",
            "hello eoe.Android",
            "hello eoe ios",
            "java",
            "javascript",
            "php",
            "python"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aty_using_autocompletetextview);

        actvadapter = new ArrayAdapter<String>(this,R.layout.aty_using_autocompletetextview_dropdown_item,strs);


        actv = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);
        actv.setAdapter(actvadapter);

        mactv = (MultiAutoCompleteTextView) findViewById(R.id.multiAutoCompleteTextView);
        mactvAdapter = new ArrayAdapter<String>(this,R.layout.aty_using_autocompletetextview_dropdown_item);
        mactv.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
        mactv.setAdapter(mactvAdapter);
    }
}
