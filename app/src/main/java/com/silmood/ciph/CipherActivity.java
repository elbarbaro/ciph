package com.silmood.ciph;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class CipherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cipher);

    }

    public void cipher(View button){
        String message = extractTextFrom(R.id.editText);

        if(message.isEmpty()){
            setError(R.id.editText, R.string.error_empty);
        } else {
            String result = Cipher.rot13(message);
            setTextTo(R.id.txtCipher, result);
        }
    }

    private String  extractTextFrom(int inputId){
        EditText input = findViewById(inputId);
        return input.getText().toString();
    }

    private void  setTextTo(int labelId, String text){
        TextView label = findViewById(labelId);
        label.setText(text);
    }

    private void  setError(int labelId, int errorId){
        EditText label = findViewById(labelId);
        label.setError(getString(errorId));
    }
}
