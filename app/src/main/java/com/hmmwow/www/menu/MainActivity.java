package com.hmmwow.www.menu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void printToLogs(View view){
        // Find first menu item TextView and print the text to the logs

        TextView textViewItem01 = (TextView) findViewById(R.id.menu_item_1);
        String menuItem01 = textViewItem01.getText().toString();
        Log.v("MainActivity",menuItem01);

        // Find second menu item TextView and print the text to the logs

        TextView textViewItem02 = (TextView) findViewById(R.id.menu_item_2);
        String menuItem02 = textViewItem02.getText().toString();
        Log.v("MainActivity",menuItem02);

        // Find third menu item TextView and print the text to the logs

        TextView textViewItem03 = (TextView) findViewById(R.id.menu_item_3);
        String menuItem03 = textViewItem03.getText().toString();
        Log.v("MainActivity",menuItem03);
    }
}
