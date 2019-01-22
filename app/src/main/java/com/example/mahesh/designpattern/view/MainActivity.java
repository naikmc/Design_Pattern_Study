package com.example.mahesh.designpattern.view;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.mahesh.designpattern.R;
import com.example.mahesh.designpattern.ViewModel.MainActivityViewModel;

public class MainActivity extends AppCompatActivity{

MainActivityViewModel mainActivityViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainActivityViewModel  = ViewModelProviders.of(this).get(MainActivityViewModel.class);
        mainActivityViewModel.getFullName().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                ((TextView)findViewById(R.id.text_data)).setText(s);

            }
        });
    }

    public void getData(View view){
        mainActivityViewModel.loadData();
    }

}
