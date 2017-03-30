package com.codepath.android.booksearch;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Basic beginning of an instrumentation test
 *
 * Created by luke on 30/3/17.
 */
@RunWith(AndroidJUnit4.class)
public class AndroidTest {

    @Test
    public void testAndroid(){
        Context context = InstrumentationRegistry.getTargetContext();
        context.getString(R.string.app_name);
    }

}
