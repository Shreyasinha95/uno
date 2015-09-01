package com.helloshreya.calone;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;


public class MainActivity extends AppCompatActivity{

    int counter;
    Button addB,subB;
    TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        counter =0;
        addB = (Button)findViewById(R.id.addB);
        subB = (Button)findViewById(R.id.subB);
        title = (TextView)findViewById(R.id.title);
        addB.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                counter=counter+2;
                title.setText("Your Total is " + counter);
            }
        }
        );
        subB.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                counter--;
                title.setText("Your Total is " + counter);
            }
        }
        );
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

        return super.onOptionsItemSelected(item);
    }
}
