package com.onlinetest.android.mofmapplayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class SelectSubjectActivity extends AppCompatActivity {

    Button mAllButton, mMathButton, mScienceButton, mChemistryButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_subject);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mAllButton = findViewById(R.id.all_button);
        mMathButton = findViewById(R.id.math_button);
        mScienceButton = findViewById(R.id.science_button);
        mChemistryButton = findViewById(R.id.chemistry_button);

        mAllButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toSelectTestActivity();
            }
        });

        mMathButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toSelectTestActivity();
            }
        });

        mScienceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toSelectTestActivity();
            }
        });

        mChemistryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toSelectTestActivity();
            }
        });
    }

    private void toSelectTestActivity(){
        Intent intent = new Intent(SelectSubjectActivity.this, SelectTestActivity.class);
        startActivity(intent);
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
            Intent intent = new Intent(SelectSubjectActivity.this, SettingsActivity.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
