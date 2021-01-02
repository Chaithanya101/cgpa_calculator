package com.example.cgpa_calc_148;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.my_name,menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id= item.getItemId();
        switch (id)
        {
            case R.id.cs1:
                Toast.makeText(this,"1st Sem CGPA:6.25",Toast.LENGTH_LONG).show();
                break;
            case R.id.cs2:
                Toast.makeText(this,"2nd Sem CGPA:6.47",Toast.LENGTH_LONG).show();
                break;
            case R.id.cs3:
                Toast.makeText(this,"3rd Sem CGPA:7.00",Toast.LENGTH_LONG).show();
                break;
            case R.id.cs4:
                Toast.makeText(this,"4th Sem CGPA:7.10",Toast.LENGTH_LONG).show();
                break;
            case R.id.cs5:
                Toast.makeText(this,"5th Sem CGPA:7.29",Toast.LENGTH_LONG).show();
                break;
            case R.id.cs6:
                Toast.makeText(this,"6th Sem CGPA:7.47",Toast.LENGTH_LONG).show();
                break;
            case R.id.cs7:
                Toast.makeText(this,"7th Sem CGPA:7.60",Toast.LENGTH_LONG).show();
                break;
            case R.id.cs8:
                Toast.makeText(this,"8th Sem CGPA:8.00",Toast.LENGTH_LONG).show();
        }
        return super.onOptionsItemSelected(item);



    }}