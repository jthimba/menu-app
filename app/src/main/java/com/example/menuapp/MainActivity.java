package com.example.menuapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.example_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.search_item:
                Toast.makeText(this, "Item1 selected", Toast.LENGTH_LONG).show();
                        return true;
            case R.id.upload_item:
                Toast.makeText(this, "Upload selected", Toast.LENGTH_LONG).show();
                return true;

            case R.id.copy_item:
                Toast.makeText(this, "Copy selected", Toast.LENGTH_LONG).show();
                return true;

            case R.id.print_item:
                Toast.makeText(this, "print selected", Toast.LENGTH_LONG).show();
                return true;

            case R.id.share_item:
                Toast.makeText(this, "Share selected", Toast.LENGTH_LONG).show();
                return true;

            case R.id.bookmark_item:
                Toast.makeText(this, "BookMark selected", Toast.LENGTH_LONG).show();
                return true;

            default: return super.onOptionsItemSelected(item);

        }
        
    }

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn= (Button) findViewById(R.id.btnShow);
        registerForContextMenu(btn);

    }
}