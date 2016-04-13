package cn.eoe.uicontrols;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

/**
 * Created by lyb on 14-12-17.
 */
public class AtyUsingRadioGroup extends Activity{

    private RadioButton radioRight;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aty_using_radiogroup);

        radioRight = (RadioButton) findViewById(R.id.radioRight);

        findViewById(R.id.btnSubmit).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(radioRight.isChecked()){
//                    new AlertDialog.Builder(AtyUsingRadioGroup.this).setTitle("判断").setMessage("回答正确").setPositiveButton("关闭",new DialogInterface.OnClickListener() {
//                        @Override
//                        public void onClick(DialogInterface dialog, int which) {
//
//                        }
//                    }).show();

                    new AlertDialog.Builder(AtyUsingRadioGroup.this).setTitle("判断").setMessage("小伙儿,觉悟挺高啊!").setPositiveButton("关闭",null).show();

                }else {
                    new AlertDialog.Builder(AtyUsingRadioGroup.this).setTitle("判断").setMessage("不是也是艾斯比").setPositiveButton("关闭",null).show();
                }
            }
        });
    }
}
