package com.example.tablelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button mButton;
    EditText mEdit;
    EditText mEdit1;
    EditText mEdit2;
    EditText mEdit3;
    EditText mEdit4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton=(Button)findViewById(R.id.button);
        mEdit=(EditText)findViewById(R.id.edittext_1);
        mEdit1=(EditText)findViewById(R.id.edittext_2);
        mEdit2=(EditText)findViewById(R.id.edittext_3);
        mEdit3=(EditText)findViewById(R.id.edittext_4);
        mEdit4=(EditText)findViewById(R.id.edittext_5);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.v("EditText",mEdit.getText().toString());
                Log.v("EditText",mEdit1.getText().toString());
                Log.v("EditText",mEdit2.getText().toString());
                Log.v("EditText",mEdit3.getText().toString());
                Log.v("EditText",mEdit4.getText().toString());
            }
        });
    }
}