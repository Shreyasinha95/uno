package com.helloshreya.calone;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.R.layout;


public class Starting extends AppCompatActivity {
    MediaPlayer song;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        song = MediaPlayer.create(Starting.this,R.raw.song);
        song.start();
        Thread timer = new Thread(){
            public void run(){
                try{
                        sleep(2500);
                }catch(InterruptedException e) {
                    e.printStackTrace();
                }finally{
                    Intent openMainActivity = new Intent("com.helloshreya.calone.MAINACTIVITY");
                    startActivity(openMainActivity);
                }
                }
            };
            timer.start();
        }

    @Override
    protected void onPause() {
        super.onPause();
        song.release();
        finish();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_starting, menu);
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
