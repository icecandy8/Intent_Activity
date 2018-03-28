package com.example.student.calculator;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickDisplayToast(View view){
        EditText user = (EditText) findViewById(R.id.UserText);
        String username = String.valueOf(user.getText());

        EditText pass = (EditText) findViewById(R.id.PassText);
        String password = String.valueOf(pass.getText());

        Context context = getApplicationContext();

        //Toast toast1 = Toast.makeText(context, username, Toast.LENGTH_LONG);
        //Toast toast2 = Toast.makeText(context, password, Toast.LENGTH_LONG);

        //toast1.show();
        //toast2.show();

        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("user",username);
        intent.putExtra("pass",password);
        startActivity(intent);
    }
}
