package uk.ac.brighton.as1189.drumpad;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;


public class drum_view extends AppCompatActivity {

    public Button padTrigger1, padTrigger2, padTrigger3, padTrigger4,
            padTrigger5, padTrigger6, padTrigger7, padTrigger8, padTrigger9,
            padTrigger10, padTrigger11, padTrigger12;

    public Spinner soundSpinner1, soundSpinner2, soundSpinner3, soundSpinner4, soundSpinner5,
            soundSpinner6, soundSpinner7, soundSpinner8, soundSpinner9, soundSpinner10,
            soundSpinner11, soundSpinner12;

    int padTriggerClip1, padTriggerClip2, padTriggerClip3, padTriggerClip4, padTriggerClip5,
            padTriggerClip6, padTriggerClip7, padTriggerClip8, padTriggerClip9, padTriggerClip10,
            padTriggerClip11 ,padTriggerClip12;

    MediaPlayer PT1, PT2, PT3, PT4, PT5, PT6, PT7, PT8, PT9, PT10, PT11, PT12;

    public String clipname1;

    Vibrator triggerPadVib;

    private void stopPlaying(MediaPlayer mp) {
        if (mp != null) {
            mp.stop();
            mp.release();
            mp = null;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        setContentView(R.layout.activity_drum_view);

        soundSpinner1 = findViewById(R.id.soundSpinner1);
        soundSpinner2 = findViewById(R.id.soundSpinner2);
        soundSpinner3 = findViewById(R.id.soundSpinner3);
        soundSpinner4 = findViewById(R.id.soundSpinner4);
        soundSpinner5 = findViewById(R.id.soundSpinner5);
        soundSpinner6 = findViewById(R.id.soundSpinner6);
        soundSpinner7 = findViewById(R.id.soundSpinner7);
        soundSpinner8 = findViewById(R.id.soundSpinner8);
        soundSpinner9 = findViewById(R.id.soundSpinner9);
        soundSpinner10 = findViewById(R.id.soundSpinner10);
        soundSpinner11 = findViewById(R.id.soundSpinner11);
        soundSpinner12 = findViewById(R.id.soundSpinner12);

        List<String> soundList = new ArrayList<>();
        soundList.add("sample_1");
        soundList.add("sample_2");
        soundList.add("sample_3");
        soundList.add("sample_4");
        soundList.add("sample_5");
        soundList.add("sample_6");
        soundList.add("sample_7");
        soundList.add("sample_8");
        soundList.add("sample_9");
        soundList.add("sample_10");
        soundList.add("sample_11");
        soundList.add("sample_12");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_dropdown_item_1line,
                soundList );

        soundSpinner1.setAdapter(arrayAdapter);
        soundSpinner2.setAdapter(arrayAdapter);
        soundSpinner3.setAdapter(arrayAdapter);
        soundSpinner4.setAdapter(arrayAdapter);
        soundSpinner5.setAdapter(arrayAdapter);
        soundSpinner6.setAdapter(arrayAdapter);
        soundSpinner7.setAdapter(arrayAdapter);
        soundSpinner8.setAdapter(arrayAdapter);
        soundSpinner9.setAdapter(arrayAdapter);
        soundSpinner10.setAdapter(arrayAdapter);
        soundSpinner11.setAdapter(arrayAdapter);
        soundSpinner12.setAdapter(arrayAdapter);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        clipname1 = soundSpinner1.getSelectedItem().toString();

        padTriggerClip1 = getResources().getIdentifier(clipname1, "raw", this.getPackageName());
        padTriggerClip2 = getResources().getIdentifier(clipname1, "raw", this.getPackageName());
        padTriggerClip3 = getResources().getIdentifier(clipname1, "raw", this.getPackageName());
        padTriggerClip4 = getResources().getIdentifier(clipname1, "raw", this.getPackageName());
        padTriggerClip5 = getResources().getIdentifier(clipname1, "raw", this.getPackageName());
        padTriggerClip6 = getResources().getIdentifier(clipname1, "raw", this.getPackageName());
        padTriggerClip7 = getResources().getIdentifier(clipname1, "raw", this.getPackageName());
        padTriggerClip8 = getResources().getIdentifier(clipname1, "raw", this.getPackageName());
        padTriggerClip9 = getResources().getIdentifier(clipname1, "raw", this.getPackageName());
        padTriggerClip10 = getResources().getIdentifier(clipname1, "raw", this.getPackageName());
        padTriggerClip11 = getResources().getIdentifier(clipname1, "raw", this.getPackageName());
        padTriggerClip12 = getResources().getIdentifier(clipname1, "raw", this.getPackageName());

        triggerPadVib = (Vibrator) this.getSystemService(VIBRATOR_SERVICE);

        super.onCreate(savedInstanceState);

        padTrigger1 = findViewById(R.id.padTrigger1);
        padTrigger1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopPlaying(PT1);
                PT1 = MediaPlayer.create(drum_view.this, padTriggerClip1);
                padTriggerClip1 = getResources().getIdentifier(clipname1, "raw", getPackageName());
                PT1.start();
                padTrigger1.setText(getResources().getResourceEntryName(padTriggerClip1));
                triggerPadVib.vibrate(50);
            }
        });


        padTrigger2 = findViewById(R.id.padTrigger2);
        padTrigger2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopPlaying(PT2);
                PT2 = MediaPlayer.create(drum_view.this, padTriggerClip2);
                padTriggerClip2 = getResources().getIdentifier(clipname1, "raw", getPackageName());
                PT2.start();
                padTrigger2.setText(getResources().getResourceEntryName(padTriggerClip2));
                triggerPadVib.vibrate(50);
            }
        });

        padTrigger3 = findViewById(R.id.padTrigger3);
        padTrigger3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopPlaying(PT3);
                PT3 = MediaPlayer.create(drum_view.this, padTriggerClip3);
                padTriggerClip3 = getResources().getIdentifier(clipname1, "raw", getPackageName());
                PT3.start();
                padTrigger3.setText(getResources().getResourceEntryName(padTriggerClip3));
                triggerPadVib.vibrate(50);
            }
        });

        padTrigger4 = findViewById(R.id.padTrigger4);
        padTrigger4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopPlaying(PT4);
                PT4 = MediaPlayer.create(drum_view.this, padTriggerClip4);
                padTriggerClip4 = getResources().getIdentifier(clipname1, "raw", getPackageName());
                PT4.start();
                padTrigger4.setText(getResources().getResourceEntryName(padTriggerClip4));
                triggerPadVib.vibrate(50);
            }
        });

        padTrigger5 = findViewById(R.id.padTrigger5);
        padTrigger5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopPlaying(PT5);
                PT5 = MediaPlayer.create(drum_view.this, padTriggerClip5);
                padTriggerClip5 = getResources().getIdentifier(clipname1, "raw", getPackageName());
                PT5.start();
                padTrigger5.setText(getResources().getResourceEntryName(padTriggerClip5));
                triggerPadVib.vibrate(50);
            }
        });

        padTrigger6 = findViewById(R.id.padTrigger6);
        padTrigger6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopPlaying(PT6);
                PT6 = MediaPlayer.create(drum_view.this, padTriggerClip6);
                padTriggerClip6 = getResources().getIdentifier(clipname1, "raw", getPackageName());
                PT6.start();
                padTrigger6.setText(getResources().getResourceEntryName(padTriggerClip6));
                triggerPadVib.vibrate(50);
            }
        });

        padTrigger7 = findViewById(R.id.padTrigger7);
        padTrigger7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopPlaying(PT7);
                PT7 = MediaPlayer.create(drum_view.this, padTriggerClip7);
                padTriggerClip7 = getResources().getIdentifier(clipname1, "raw", getPackageName());
                PT7.start();
                padTrigger7.setText(getResources().getResourceEntryName(padTriggerClip7));
                triggerPadVib.vibrate(50);
            }
        });

        padTrigger8 = findViewById(R.id.padTrigger8);
        padTrigger8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopPlaying(PT8);
                PT8 = MediaPlayer.create(drum_view.this, padTriggerClip8);
                padTriggerClip8 = getResources().getIdentifier(clipname1, "raw", getPackageName());
                PT8.start();
                padTrigger8.setText(getResources().getResourceEntryName(padTriggerClip8));
                triggerPadVib.vibrate(50);
            }
        });

        padTrigger9 = findViewById(R.id.padTrigger9);
        padTrigger9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopPlaying(PT9);
                PT9 = MediaPlayer.create(drum_view.this, padTriggerClip9);
                padTriggerClip9 = getResources().getIdentifier(clipname1, "raw", getPackageName());
                PT9.start();
                padTrigger9.setText(getResources().getResourceEntryName(padTriggerClip9));
                triggerPadVib.vibrate(50);
            }
        });

        padTrigger10 = findViewById(R.id.padTrigger10);
        padTrigger10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopPlaying(PT10);
                PT10 = MediaPlayer.create(drum_view.this, padTriggerClip10);
                padTriggerClip10 = getResources().getIdentifier(clipname1, "raw", getPackageName());
                PT10.start();
                padTrigger10.setText(getResources().getResourceEntryName(padTriggerClip10));
                triggerPadVib.vibrate(50);
            }
        });

        padTrigger11 = findViewById(R.id.padTrigger11);
        padTrigger11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopPlaying(PT11);
                PT11 = MediaPlayer.create(drum_view.this, padTriggerClip11);
                padTriggerClip11 = getResources().getIdentifier(clipname1, "raw", getPackageName());
                PT11.start();
                padTrigger11.setText(getResources().getResourceEntryName(padTriggerClip11));
                triggerPadVib.vibrate(50);
            }
        });

        padTrigger12 = findViewById(R.id.padTrigger12);
        padTrigger12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopPlaying(PT12);
                PT12 = MediaPlayer.create(drum_view.this, padTriggerClip12);
                padTriggerClip12 = getResources().getIdentifier(clipname1, "raw", getPackageName());
                PT12.start();
                padTrigger12.setText(getResources().getResourceEntryName(padTriggerClip12));
                triggerPadVib.vibrate(50);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_drum_view, menu);
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
