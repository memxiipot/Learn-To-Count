package com.app.learntocount.learntocount;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class count1 extends ActionBarActivity {

    ImageView img1;
    Button btn01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_count1);
        img1 = (ImageView)findViewById(R.id.img1);
        btn01 = (Button)findViewById(R.id.btn01);
    }

    public void countAnimals(View view) {

        switch(view.getId()) {
            case R.id.img1:
                img1.setImageResource(R.drawable.one);
                Toast.makeText(getApplicationContext(), "ONE CAT!", Toast.LENGTH_LONG).show();
                btn01.setVisibility(view.VISIBLE);
                break;

        }
    }

    public void goNext(View view) {
        Intent i = new Intent(this, count2.class);
        startActivity(i);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_count1, menu);
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
