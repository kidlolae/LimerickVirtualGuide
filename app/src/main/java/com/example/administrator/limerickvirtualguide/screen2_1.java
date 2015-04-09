package com.example.administrator.limerickvirtualguide;

import android.content.Intent;
import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v7.widget.Toolbar;
import android.widget.Button;
import android.view.View;

public class screen2_1 extends ActionBarActivity implements View.OnClickListener {

    //object variables to set Medieval, Georgian and River Shannon buttons
    Button medieval_button, georgian_button, river_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2_1);

        //inherited toolbar
        Toolbar toolbar= (Toolbar) findViewById(R.id.app_toolbar);
        setSupportActionBar(toolbar);

        //set listeners to the Medieval, Georgian and River Shannon buttons
        medieval_button = (Button) findViewById(R.id.medieval_button);
        medieval_button.setOnClickListener(this);

        georgian_button = (Button) findViewById(R.id.georgian_button);
        georgian_button.setOnClickListener(this);

        river_button = (Button) findViewById(R.id.river_button);
        river_button.setOnClickListener(this);


        //back to MainScreen button on the left of action bar
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_screen2_1, menu);
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

    //switch for Medieval, Georgian and River Shannon buttons
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.medieval_button:
                medieval_map();
                break;
            case R.id.georgian_button:
                georgian_map ();
                break;
            case R.id.river_button:
                river_map ();
                break;
        }
    }
    //methods to move to Medieval, Georgian and River Shannon Map screens (2_2,2_3,2_4)
    public void medieval_map (){
        startActivity(new Intent(this, screen2_2.class));
    }
    public void georgian_map (){
        startActivity(new Intent(this, screen2_3.class));
    }
    public void river_map (){
        startActivity(new Intent(this, screen2_4.class));
    }
}
