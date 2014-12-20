package cn.eoe.uicontrols;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.Toast;

/**
 * Created by lyb on 14-12-19.
 */
public class AtyUsingRatingBar extends Activity {

    private RatingBar ratingBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aty_using_ratingbar);

        ratingBar = (RatingBar) findViewById(R.id.ratingBar);
        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                Toast.makeText(AtyUsingRatingBar.this,"评价为  "+rating,Toast.LENGTH_SHORT).show();
            }
        });
    }
}
