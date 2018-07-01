package com.silmood.ciph;

import android.widget.Button;
import android.widget.EditText;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

import static org.junit.Assert.assertEquals;

@RunWith(RobolectricTestRunner.class)
public class MainActivityRoboelectricTest {

    @Test
    public void clickingCipher_shouldShowErrorTest(){
        CipherActivity activity = Robolectric.setupActivity(CipherActivity.class);
        Button btnCipher = activity.findViewById(R.id.btnCipher);
        EditText inputMessage = activity.findViewById(R.id.editText);
        btnCipher.performClick();
        assertEquals("Message empty", inputMessage.getError().toString());
    }
}
