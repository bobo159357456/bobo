package cn.eoe.uicontrols;

import android.content.Context;
import android.content.Intent;

/**
 * Created by lyb on 14-12-17.
 */
public class ListCellData {

    public ListCellData(Context context,String controlName,Intent relatedIntent){
        this.controlName = controlName;
        this.context = context;
        this.relatedIntent=relatedIntent;
    }

    private String  controlName="";

    public String getControlName(){
        return controlName;
    }

    private  Context context=null;

    public Context getContext() {
        return context;
    }

    private Intent relatedIntent=null;

    public Intent getRelatedIntent(){
        return relatedIntent;
    }

    public void startActivity(){

        getContext().startActivity(getRelatedIntent());
    }

    @Override
    public String toString() {
        return getControlName();
    }
}
