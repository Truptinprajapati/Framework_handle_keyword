package com.example.trupti.framework_handle_keyboard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements TextView.OnEditorActionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText ed=(EditText)findViewById(R.id.edittext);
        ed.setOnEditorActionListener(this);

    }

//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//
//        int id=item.getItemId();
//        if (id == R.id.actionsetting){
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }

    @Override
    public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {


        if (actionId == EditorInfo.IME_ACTION_DONE)
        {
            Toast.makeText(getApplicationContext(),"your clicked button",Toast.LENGTH_LONG).show();
            return  true;
        }

        return false;
    }
}
