package com.gzeinnumer.simpletextwatcher_example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import com.gzeinnumer.stw.SimpleTextWatcher;
import com.gzeinnumer.stw.interfaceCallBack.AfterTextChanged;
import com.gzeinnumer.stw.interfaceCallBack.BeforeTextChanged;
import com.gzeinnumer.stw.interfaceCallBack.OnTextChanged;

public class MainActivity extends AppCompatActivity {

    EditText ed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed = findViewById(R.id.ed);

        example1();
        example2();
    }

    private void example1() {
        ed.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                ///tidak terpakai
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                //tidak terpakai
            }

            @Override
            public void afterTextChanged(Editable editable) {
                //terpakai
            }
        });
    }

    private void example2() {
        ed.addTextChangedListener(new SimpleTextWatcher(new BeforeTextChanged() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }
        }));

        ed.addTextChangedListener(new SimpleTextWatcher(new OnTextChanged() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }
        }));
        
        ed.addTextChangedListener(new SimpleTextWatcher(new AfterTextChanged() {
            @Override
            public void afterTextChanged(Editable s) {

            }
        }));
    }
}