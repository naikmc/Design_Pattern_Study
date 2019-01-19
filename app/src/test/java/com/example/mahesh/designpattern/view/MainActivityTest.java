package com.example.mahesh.designpattern.view;

import android.widget.TextView;

import com.example.mahesh.designpattern.R;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

import static org.junit.Assert.*;

@RunWith(RobolectricTestRunner.class)
public class MainActivityTest {

    @Test
    public void getData() {
        MainActivity activity = Robolectric.setupActivity(MainActivity.class);

        activity.findViewById(R.id.get_data).performClick();

        Assert.assertEquals("Naik, Mahesh",  ((TextView)activity.findViewById(R.id.text_data)).getText());
    }
}