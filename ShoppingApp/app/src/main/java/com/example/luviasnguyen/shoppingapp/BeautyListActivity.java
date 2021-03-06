package com.example.luviasnguyen.shoppingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class BeautyListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beauty_list);
        Log.i("BeautyListActivity","now running onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("BeautyListActivity","now running onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("BeautyListActivity","now running onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("BeautyListActivity","now running onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("BeautyListActivity","now running onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("BeautyListActivity","now running onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("BeautyListActivity","now running onDestroy");
    }

    public void btnBeautyItem1Details(View view){
        Intent i = new Intent(this,Beauty1DetailsActivity.class);
        startActivity(i);
    }
}
