package com.appmanagement.event.ignite;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class SignUpOrganisor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_organisor);
    }
    public void signUpO(View view){

        Intent intent = new Intent(this,home.class);
        startActivity(intent);
    }
    public void fb2(View view)
    {
        Intent intent =new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.facebook.com/"));
        startActivity(intent);
    }

    public void g2(View view)
    {
        Intent intent =new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.gmail.com/"));
        startActivity(intent);
    }
}
