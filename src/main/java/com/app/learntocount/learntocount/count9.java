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


public class count9 extends ActionBarActivity {

    ImageView img1;
    ImageView img2;
    ImageView img3;
    ImageView img4;
    ImageView img5;
    ImageView img6;
    ImageView img7;
    ImageView img8;
    ImageView img9;
    Button btn01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_count9);
        img1 = (ImageView)findViewById(R.id.img1);
        img2 = (ImageView)findViewById(R.id.img2);
        img3 = (ImageView)findViewById(R.id.img3);
        img4 = (ImageView)findViewById(R.id.img4);
        img5 = (ImageView)findViewById(R.id.img5);
        img6 = (ImageView)findViewById(R.id.img6);
        img7 = (ImageView)findViewById(R.id.img7);
        img8 = (ImageView)findViewById(R.id.img8);
        img9 = (ImageView)findViewById(R.id.img9);
        btn01 = (Button)findViewById(R.id.btn01);
    }

    public void countAnimals(View view) {

        switch(view.getId()) {
            case R.id.img1:
                img1.setImageResource(R.drawable.one);
                Toast.makeText(getApplicationContext(), "ONE!", Toast.LENGTH_LONG).show();
                break;
            case R.id.img2:
                img2.setImageResource(R.drawable.two);
                Toast.makeText(getApplicationContext(), "TWO!", Toast.LENGTH_LONG).show();
                break;
            case R.id.img3:
                img3.setImageResource(R.drawable.three);
                Toast.makeText(getApplicationContext(), "THREE!", Toast.LENGTH_LONG).show();
                break;
            case R.id.img4:
                img4.setImageResource(R.drawable.four);
                Toast.makeText(getApplicationContext(), "FOUR!", Toast.LENGTH_LONG).show();
                break;
            case R.id.img5:
                img5.setImageResource(R.drawable.five);
                Toast.makeText(getApplicationContext(), "FIVE!", Toast.LENGTH_LONG).show();
                break;
            case R.id.img6:
                img6.setImageResource(R.drawable.six);
                Toast.makeText(getApplicationContext(), "SIX!", Toast.LENGTH_LONG).show();
                break;
            case R.id.img7:
                img7.setImageResource(R.drawable.seven);
                Toast.makeText(getApplicationContext(), "SEVEN!", Toast.LENGTH_LONG).show();
                break;
            case R.id.img8:
                img8.setImageResource(R.drawable.eight);
                Toast.makeText(getApplicationContext(), "EIGHT!", Toast.LENGTH_LONG).show();
                break;
            case R.id.img9:
                img9.setImageResource(R.drawable.nine);
                Toast.makeText(getApplicationContext(), "NINE JELLYFISHES!", Toast.LENGTH_LONG).show();
                btn01.setVisibility(view.VISIBLE);
                break;

        }
    }

    public void goNext(View view) {
        Intent i = new Intent(this, count10.class);
        startActivity(i);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_count9, menu);
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
