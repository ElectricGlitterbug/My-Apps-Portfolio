package com.mymeeps.myappportfolio;

import android.app.Application;
import android.test.ApplicationTestCase;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.TextView;

protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog);
        }

/**
 * This method is called when the one of the App buttons is clicked.
 */
public void goToAppOnClick(View view) {
        System.out.println("clicked");
        }
        Context context = getApplicationContext();
        CharSequence text = "Hello toast!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

