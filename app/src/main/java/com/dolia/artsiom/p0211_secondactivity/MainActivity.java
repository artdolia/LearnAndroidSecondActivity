package com.dolia.artsiom.p0211_secondactivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class MainActivity extends ActionBarActivity implements OnClickListener {

    Button btnActivityTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        btnActivityTwo = (Button) findViewById(R.id.btnActTwo);
        btnActivityTwo.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){

        switch (v.getId()){
            case R.id.btnActTwo:
                Intent intent = new Intent(this, SecondActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}
