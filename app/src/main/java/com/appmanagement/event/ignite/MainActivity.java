package com.appmanagement.event.ignite;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void login(View view){

        Intent intent = new Intent(this,LogInActivity.class);
        startActivity(intent);
    }
    public void signUpOrganiser(View view)
    {
        Intent intent = new Intent(this,SignUpOrganisor.class);
        startActivity(intent);
    }
    public void signUp(View view)
    {
        Intent intent = new Intent(this,SignUpActivity.class);
        startActivity(intent);
    }

    public void othersHomepage(View view){

        Intent intent = new Intent(this,home.class);
        startActivity(intent);
    }



}
