package com.appmanagement.event.ignite;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.*;
import android.view.View;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void events(View view){

        Intent intent = new Intent(this,Events.class);
        startActivity(intent);
    }

    public void score(View view)
    {
        Intent intent = new Intent(this,Score.class);
        startActivity(intent);
    }

//    public void direction(View view)
//    {
//        Intent intent = new Intent(this,Direction.class);
//        startActivity(intent);
//    }
}
