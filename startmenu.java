package com.example.user.perstorpalpha;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by User on 15/09/2015.
 */
public class startmenu extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.startmenu);


    }

    public void startMap(View view){

        if(view.getId()==R.id.perstorpButton){

            Intent i = new Intent(startmenu.this, MapsAlpha.class);
            startActivity(i);

        }

    }
}
