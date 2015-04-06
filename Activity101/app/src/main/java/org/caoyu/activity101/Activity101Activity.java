package org.caoyu.activity101;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;


public class Activity101Activity extends Activity {

    private String tag = "Lifecycle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.activity_activity101);

        Log.d(tag, "In the onCreate event");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(tag, "In the onStart event");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(tag, "In the onResume event");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(tag, "In the onPause event");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(tag, "In the onStop event");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(tag, "In the onRestart event");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(tag, "In the onDestroy event");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_activity101, menu);
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
