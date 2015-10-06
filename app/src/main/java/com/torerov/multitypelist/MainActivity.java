package com.torerov.multitypelist;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ChattingAdapter mAdapter;
    RadioGroup category;
    EditText messageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView)findViewById(R.id.listView);
        mAdapter = new ChattingAdapter();
        listView.setAdapter(mAdapter);
        category = (RadioGroup)findViewById(R.id.radioGroup);
        messageView = (EditText)findViewById(R.id.edit_message);
        Button btn = (Button)findViewById(R.id.btn_input);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = messageView.getText().toString();
                switch(category.getCheckedRadioButtonId()){
                    case R.id.radio_send : {


                    }
                }
            }
        });
    }
}
