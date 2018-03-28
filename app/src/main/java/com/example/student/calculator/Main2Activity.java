package com.example.student.calculator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends Activity {

    public static final String USERNAME = "user";
    public static final String PASSWORD = "pass";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        TextView user = (TextView) findViewById(R.id.uname);
        TextView pass = (TextView) findViewById(R.id.upass);

        String uname = intent.getStringExtra(USERNAME);
        String upassword = intent.getStringExtra(PASSWORD);

        user.setText(uname);
        pass.setText(upassword);
    }
}
