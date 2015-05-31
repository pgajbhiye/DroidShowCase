package droid.sample.com.showcasesample;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by pallavi on 4/9/2015.
 */
public class GuideActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.guidelayout);


    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        finish();
        return true;
    }
}
