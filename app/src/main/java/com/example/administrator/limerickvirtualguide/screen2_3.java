package com.example.administrator.limerickvirtualguide;

import android.content.Intent;
import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;


public class screen2_3 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2_3);


        //inherited toolbar
        Toolbar toolbar= (Toolbar) findViewById(R.id.app_toolbar);
        setSupportActionBar(toolbar);

        //set and display Back to previous screen icon
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_screen2_3, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        //functionality to get back to main screen from action bar
        if (id==android.R.id.home){
            NavUtils.navigateUpFromSameTask(this);
        }

        //switch for options in menu
        switch (id) {
            case R.id.screeen3_1:
                Intent myIntent = new Intent(this, screen3_1.class);
                startActivityForResult(myIntent, 0);
                break;
            case R.id.about:
                Intent myIntent2 = new Intent(this, screen4.class);
                startActivityForResult(myIntent2, 0);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
