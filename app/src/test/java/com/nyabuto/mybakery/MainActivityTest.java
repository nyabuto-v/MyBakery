package com.nyabuto.mybakery;

import android.widget.TextView;

import com.nyabuto.mybakery.MainActivity;
import com.nyabuto.mybakery.R;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

import static junit.framework.TestCase.assertTrue;

@RunWith(RobolectricTestRunner.class)
public class MainActivityTest {

    private MainActivity activity;

    @Before
    public void setup(){
        activity = Robolectric.setupActivity(MainActivity.class);
    }
    @Test
    public void validateTextViewContent(){
        TextView bakeryTextView = activity.findViewById(R.id.bakeryTextView);
        assertTrue("MyBakery".equals(bakeryTextView.getText().toString()));
    }

}
