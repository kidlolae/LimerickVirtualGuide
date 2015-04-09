package com.example.administrator.limerickvirtualguide;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v7.widget.Toolbar;
import android.widget.Button;
import android.view.View;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {
    //private toolbar variable supported with v7.widgets to set the actionBar
    private Toolbar toolbar;
    Button walking_button;
    Button events_button;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //set the attributes of app_toolbar to action bar
        toolbar= (Toolbar) findViewById(R.id.app_toolbar);
        //use the new action bar
        setSupportActionBar(toolbar);


        walking_button = (Button) findViewById(R.id.walking_button);
        walking_button.setOnClickListener(this);

        events_button = (Button) findViewById(R.id.events_button);
        events_button.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.walking_button:
                walking_screen();
            break;
            case R.id.events_button:
                events_screen();
            break;
        }

    }
    //method to move to Walking routes screen (2_1)
    public void walking_screen (){
        startActivity(new Intent(this, screen2_1.class));
    }
    //method to move to Events screen (3_1)
    public void events_screen (){
        startActivity(new Intent(this, screen3_1.class));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

        switch (id){
            case R.id.about:
                Intent myIntent2 = new Intent(this, screen4.class);
                startActivityForResult(myIntent2, 0);
                break;
        }

        return super.onOptionsItemSelected(item);
    }


}
