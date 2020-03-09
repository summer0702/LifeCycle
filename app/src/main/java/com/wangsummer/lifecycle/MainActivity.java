package com.wangsummer.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Integer create = 0;
    Integer restart = 0;
    Integer start = 0;
    Integer destroy = 0;
    Integer resume = 0;
    Integer stop = 0;
    Integer pause = 0;
    Integer create2;
    Integer restart2;
    Integer start2;
    Integer destroy2;
    Integer resume2;
    Integer stop2;
    Integer pause2;
    String stringcreate;
    String stringrestart;
    String stringstart;
    String stringdestroy;
    String stringresume;
    String stringstop;
    String stringpause;
    TextView textcreate;
    TextView textrestart;
    TextView textstart;
    TextView textdestroy;
    TextView textresume;
    TextView textstop;
    TextView textpause;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        editor = sharedPreferences.edit();
        create++;
        create2 = sharedPreferences.getInt("created", 0) + 1;
        editor.putInt("created", create2);
        editor.apply();
        stringcreate = Integer.toString(create2);
        stringcreate = "onCreate: " + stringcreate + " Temp: " + create.toString();
        textcreate = findViewById(R.id.tvcreate);
        textcreate.setText(stringcreate);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        restart++;
        restart2 = sharedPreferences.getInt("restarted", 0) + 1;
        editor.putInt("restarted", restart2);
        editor.apply();
        stringrestart = Integer.toString(restart2);
        stringrestart = "onRestart: " + stringrestart + " Temp: " + restart.toString();
        textrestart = findViewById(R.id.tvrestart);
        textrestart.setText(stringrestart);
    }

    @Override
    protected void onStart() {
        super.onStart();
        start++;
        start2 = sharedPreferences.getInt("start2", 0) + 1;
        editor.putInt("started", start2);
        editor.apply();
        stringstart = Integer.toString(start2);
        stringstart = "onStart: " + stringstart + " Temp: " + start.toString();
        textstart = findViewById(R.id.tvstart);
        textstart.setText(stringstart);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        destroy++;
        destroy2 = sharedPreferences.getInt("destroyed", 0) + 1;
        editor.putInt("destroyed", destroy2);
        editor.apply();
        stringdestroy = Integer.toString(destroy2);
        stringdestroy = "onDestroy: " + stringdestroy + " Temp: " + destroy.toString();
        textdestroy = findViewById(R.id.tvdestroy);
        textdestroy.setText(stringdestroy);
    }

    @Override
    protected void onResume() {
        super.onResume();
        resume++;
        resume2 = sharedPreferences.getInt("resumed", 0) + 1;
        editor.putInt("resumed", resume2);
        editor.apply();
        stringresume = Integer.toString(resume2);
        stringresume = "onResume: " + stringresume + " Temp: " + resume.toString();
        textresume = findViewById(R.id.tvresume);
        textresume.setText(stringresume);
    }

    @Override
    protected void onStop() {
        super.onStop();
        stop++;
        stop2 = sharedPreferences.getInt("stopped", 0) + 1;
        editor.putInt("stopped", stop2);
        editor.apply();
        stringstop = Integer.toString(stop2);
        stringstop = "onStop: " + stringstop + " Temp: " + stop.toString();
        textstop = findViewById(R.id.tvstop);
        textstop.setText(stringstop);
    }

    @Override
    protected void onPause() {
        super.onPause();
        pause++;
        pause2 = sharedPreferences.getInt("paused", 0) + 1;
        editor.putInt("paused", pause2);
        editor.apply();
        stringpause = Integer.toString(pause2);
        stringpause = "onPause: " + stringpause + " Temp: " + pause.toString();
        textpause = findViewById(R.id.tvpause);
        textpause.setText(stringpause);
    }

}
