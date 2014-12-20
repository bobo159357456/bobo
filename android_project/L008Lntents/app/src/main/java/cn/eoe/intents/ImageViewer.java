package cn.eoe.intents;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ImageView;

/**
 * Created by lyb on 14-12-11.
 */
public class ImageViewer extends ActionBarActivity {

    private ImageView iv;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        iv = new ImageView(this);
        setContentView(iv);

        iv.setImageURI(getIntent().getData());
    }
}
