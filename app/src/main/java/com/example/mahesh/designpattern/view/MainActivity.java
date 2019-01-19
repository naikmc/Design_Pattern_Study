package com.example.mahesh.designpattern.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.mahesh.designpattern.R;
import com.example.mahesh.designpattern.model.UserModel;

public class MainActivity extends AppCompatActivity {
   private UserModel userModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userModel = new UserModel();
    }


    public void getData(View view){
        ((TextView)findViewById(R.id.text_data)).setText(userModel.getUserData());
    }
}
