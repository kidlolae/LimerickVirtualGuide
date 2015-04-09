package com.example.administrator.limerickvirtualguide;

import android.content.Intent;
import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

//View.OnClickListener create onClick Method
public class screen3_1 extends ActionBarActivity implements View.OnClickListener{

    //object variables to set Medieval, Georgian and River Shannon buttons
    Button entButton, artButton, sportButton, kidsButton, allEvents;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen3_1);

        //inherited toolbar
        Toolbar toolbar= (Toolbar) findViewById(R.id.app_toolbar);
        setSupportActionBar(toolbar);

        //back to MainScreen button on the left of action bar
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //set listeners to the Medieval, Georgian and River Shannon buttons
        entButton = (Button) findViewById(R.id.ent_button);
        entButton.setOnClickListener(this);

        sportButton = (Button) findViewById(R.id.sport_button);
        sportButton.setOnClickListener(this);

        artButton = (Button) findViewById(R.id.art_button);
        artButton.setOnClickListener(this);

        kidsButton = (Button) findViewById(R.id.kids_button);
        kidsButton.setOnClickListener(this);

        allEvents = (Button) findViewById(R.id.all_ev_button);
        allEvents.setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_screen3_1, menu);
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
        switch (id){
            case R.id.screeen2_1:
                Intent myIntent = new Intent(this, screen2_1.class);
                startActivityForResult(myIntent, 0);
                break;
            case R.id.about:
                Intent myIntent2 = new Intent(this, screen4.class);
                startActivityForResult(myIntent2, 0);
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    //switch for events buttons
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.ent_button:
                entertainment ();
                break;
            case R.id.art_button:
                art ();
                break;
            case R.id.sport_button:
                sport ();
                break;
            case R.id.kids_button:
                kids ();
                break;
            case R.id.all_ev_button:
                all_events ();
                break;
        }
    }

    public void entertainment (){
        startActivity(new Intent(this, screen3_3_1.class));
    }
    public void art (){
        startActivity(new Intent(this, screen3_4_1.class));
    }
    public void sport (){
        startActivity(new Intent(this, screen3_5_1.class));
    }
    public void kids (){
        startActivity(new Intent(this, screen3_6_1.class));
    }
    public void all_events (){
        startActivity(new Intent(this, screen3_2_1.class));
    }
}
