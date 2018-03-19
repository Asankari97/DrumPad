package uk.ac.brighton.as1189.drumpad;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;


public class drum_view extends AppCompatActivity {

    private Button padTrigger1, padTrigger2, padTrigger3, padTrigger4,
            padTrigger5, padTrigger6, padTrigger7, padTrigger8, padTrigger9,
            padTrigger10, padTrigger11, padTrigger12;

    private Spinner soundSpinner1, soundSpinner2, soundSpinner3, soundSpinner4, soundSpinner5,
            soundSpinner6, soundSpinner7, soundSpinner8, soundSpinner9, soundSpinner10,
            soundSpinner11, soundSpinner12;

    private int padTriggerClip1, padTriggerClip2, padTriggerClip3, padTriggerClip4, padTriggerClip5,
            padTriggerClip6, padTriggerClip7, padTriggerClip8, padTriggerClip9, padTriggerClip10,
            padTriggerClip11, padTriggerClip12;

    MediaPlayer PT1, PT2, PT3, PT4, PT5, PT6, PT7, PT8, PT9, PT10, PT11, PT12;

    private String clipname1, clipname2, clipname3, clipname4, clipname5, clipname6, clipname7,
            clipname8, clipname9, clipname10, clipname11, clipname12;

    Vibrator triggerPadVib;

    private void stopPlaying(MediaPlayer mp) {
        if (mp != null) {
            mp.stop();
            mp.release();
        }
    }

    private void changeButtonColor(View v) {
        v.setBackground(getResources().getDrawable(R.drawable.button_color_changer));
    }

    private void playSound(MediaPlayer mp, int clip, Button b, Spinner s, String name, View view){
        stopPlaying(mp);
        //mp = MediaPlayer.create(drum_view.this, clip);
        if(!(name.equals(s.getSelectedItem().toString()))){
            clip = getResources().getIdentifier(s.getSelectedItem().toString(), "raw", getPackageName());
            mp = MediaPlayer.create(drum_view.this, clip);
            b.setText(s.getSelectedItem().toString());
            mp.start();
            triggerPadVib.vibrate(50);
            changeButtonColor(view);
            mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                public void onCompletion(MediaPlayer mp) {
                    mp.release(); // finish current activity
                }
            });
        }
        else{
            b.setText(s.getSelectedItem().toString());
            mp = MediaPlayer.create(drum_view.this, clip);
            mp.start();
            triggerPadVib.vibrate(50);
            changeButtonColor(view);
            mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                public void onCompletion(MediaPlayer mp) {
                    mp.release(); // finish current activity
                }
            });
        }
        b.setText(s.getSelectedItem().toString());
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
        soundList.add("kick_1");
        soundList.add("snare_1");
        soundList.add("clap_1");
        soundList.add("closed_hat_1");
        soundList.add("open_hat_1");
        soundList.add("percussion_1");
        soundList.add("kick_2");
        soundList.add("snare_2");
        soundList.add("clap_2");
        soundList.add("closed_hat_2");
        soundList.add("open_hat_2");
        soundList.add("percussion_2");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_dropdown_item_1line,
                soundList);

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
        clipname2 = soundSpinner1.getSelectedItem().toString();
        clipname3 = soundSpinner1.getSelectedItem().toString();
        clipname4 = soundSpinner1.getSelectedItem().toString();
        clipname5 = soundSpinner1.getSelectedItem().toString();
        clipname6 = soundSpinner1.getSelectedItem().toString();
        clipname7 = soundSpinner1.getSelectedItem().toString();
        clipname8 = soundSpinner1.getSelectedItem().toString();
        clipname9 = soundSpinner1.getSelectedItem().toString();
        clipname10 = soundSpinner1.getSelectedItem().toString();
        clipname11 = soundSpinner1.getSelectedItem().toString();
        clipname12 = soundSpinner1.getSelectedItem().toString();

        padTriggerClip1 = getResources().getIdentifier(soundSpinner1.getSelectedItem().toString(), "raw", this.getPackageName());
        padTriggerClip2 = getResources().getIdentifier(soundSpinner2.getSelectedItem().toString(), "raw", this.getPackageName());
        padTriggerClip3 = getResources().getIdentifier(soundSpinner3.getSelectedItem().toString(), "raw", this.getPackageName());
        padTriggerClip4 = getResources().getIdentifier(soundSpinner4.getSelectedItem().toString(), "raw", this.getPackageName());
        padTriggerClip5 = getResources().getIdentifier(soundSpinner5.getSelectedItem().toString(), "raw", this.getPackageName());
        padTriggerClip6 = getResources().getIdentifier(soundSpinner6.getSelectedItem().toString(), "raw", this.getPackageName());
        padTriggerClip7 = getResources().getIdentifier(soundSpinner7.getSelectedItem().toString(), "raw", this.getPackageName());
        padTriggerClip8 = getResources().getIdentifier(soundSpinner8.getSelectedItem().toString(), "raw", this.getPackageName());
        padTriggerClip9 = getResources().getIdentifier(soundSpinner9.getSelectedItem().toString(), "raw", this.getPackageName());
        padTriggerClip10 = getResources().getIdentifier(soundSpinner10.getSelectedItem().toString(), "raw", this.getPackageName());
        padTriggerClip11 = getResources().getIdentifier(soundSpinner11.getSelectedItem().toString(), "raw", this.getPackageName());
        padTriggerClip12 = getResources().getIdentifier(soundSpinner12.getSelectedItem().toString(), "raw", this.getPackageName());

        triggerPadVib = (Vibrator) this.getSystemService(VIBRATOR_SERVICE);

        super.onCreate(savedInstanceState);

        padTrigger1 = findViewById(R.id.padTrigger1);
        padTrigger1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(PT1, padTriggerClip1, padTrigger1, soundSpinner1, clipname1, view);
            }
        });


        padTrigger2 = findViewById(R.id.padTrigger2);
        padTrigger2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(PT2, padTriggerClip2, padTrigger2, soundSpinner2, clipname2,view);
            }
        });

        padTrigger3 = findViewById(R.id.padTrigger3);
        padTrigger3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(PT3, padTriggerClip3, padTrigger3, soundSpinner3, clipname3, view);
            }
        });

        padTrigger4 = findViewById(R.id.padTrigger4);
        padTrigger4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(PT4, padTriggerClip4, padTrigger4, soundSpinner4, clipname4, view);
            }
        });

        padTrigger5 = findViewById(R.id.padTrigger5);
        padTrigger5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(PT5, padTriggerClip5, padTrigger5, soundSpinner5, clipname5, view);
            }
        });

        padTrigger6 = findViewById(R.id.padTrigger6);
        padTrigger6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(PT6, padTriggerClip6, padTrigger6, soundSpinner6, clipname6, view);
            }
        });

        padTrigger7 = findViewById(R.id.padTrigger7);
        padTrigger7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(PT7, padTriggerClip7, padTrigger7, soundSpinner7, clipname7, view);
            }
        });

        padTrigger8 = findViewById(R.id.padTrigger8);
        padTrigger8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(PT8, padTriggerClip8, padTrigger8, soundSpinner8, clipname8, view);
            }
        });

        padTrigger9 = findViewById(R.id.padTrigger9);
        padTrigger9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(PT9, padTriggerClip9, padTrigger9, soundSpinner9, clipname9, view);
            }
        });

        padTrigger10 = findViewById(R.id.padTrigger10);
        padTrigger10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(PT10, padTriggerClip10, padTrigger10, soundSpinner10, clipname10, view);
            }
        });

        padTrigger11 = findViewById(R.id.padTrigger11);
        padTrigger11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(PT11, padTriggerClip11, padTrigger11, soundSpinner11, clipname11, view);
            }
        });

        padTrigger12 = findViewById(R.id.padTrigger12);
        padTrigger12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(PT12, padTriggerClip12, padTrigger12, soundSpinner12, clipname12, view);
            }
        });
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_drum_view, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }
}
