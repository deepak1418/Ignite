package com.appmanagement.event.ignite;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        }

    public void signUpp(View view){

        Intent intent = new Intent(this,home.class);
        startActivity(intent);
    }
    public void fb1(View view)
    {
        Intent intent =new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.facebook.com/"));
        startActivity(intent);
    }

    public void g1(View view)
    {
        Intent intent =new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.gmail.com/"));
        startActivity(intent);
    }
}
