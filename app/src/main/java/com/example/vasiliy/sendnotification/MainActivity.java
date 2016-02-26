package com.example.vasiliy.sendnotification;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    TextView showName;
    EditText editName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    public void nameButtonClick(View view) {
        showName = (TextView) findViewById(R.id.nameView);
        editName = (EditText) findViewById(R.id.editName);

        String name = editName.getText().toString();
        showName.setText(name);
    }

    public void newActivityOnClick(View view){
        startActivity(new Intent("com.example.SecondActivity"));
    }
};

