package uk.ac.brighton.as1189.drumpad;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class drum_view extends AppCompatActivity {
    public Button padTrigger1, padTrigger2, padTrigger3, padTrigger4,
            padTrigger5, padTrigger6, padTrigger7, padTrigger8, padTrigger9,
            padTrigger10, padTrigger11, padTrigger12;
//    public ListView soundListView = findViewById(R.id.soundListView1);
//    public final TextView sampleName1 = findViewById(R.id.sampleName1);
//    String soundFileName = "kicksound";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_drum_view);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        String clipname = "kicksound";
        final int padTriggerClip1 = getResources().getIdentifier(clipname, "raw", this.getPackageName());
        final MediaPlayer PT1 = MediaPlayer.create(this, padTriggerClip1);
        final MediaPlayer PT2 = MediaPlayer.create(this, padTriggerClip1);
        final MediaPlayer PT3 = MediaPlayer.create(this, padTriggerClip1);
        final MediaPlayer PT4 = MediaPlayer.create(this, padTriggerClip1);
        final MediaPlayer PT5 = MediaPlayer.create(this, padTriggerClip1);
        final MediaPlayer PT6 = MediaPlayer.create(this, padTriggerClip1);
        final MediaPlayer PT7 = MediaPlayer.create(this, padTriggerClip1);
        final MediaPlayer PT8 = MediaPlayer.create(this, padTriggerClip1);
        final MediaPlayer PT9 = MediaPlayer.create(this, padTriggerClip1);
        final MediaPlayer PT10 = MediaPlayer.create(this, padTriggerClip1);
        final MediaPlayer PT11 = MediaPlayer.create(this, padTriggerClip1);
        final MediaPlayer PT12 = MediaPlayer.create(this, padTriggerClip1);
        super.onCreate(savedInstanceState);
        padTrigger1 = findViewById(R.id.padTrigger1);
        padTrigger1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PT1.start();
                padTrigger1.setText(getResources().getResourceEntryName(padTriggerClip1));
            }
        });
        padTrigger2 = findViewById(R.id.padTrigger2);
        padTrigger2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PT2.start();
                padTrigger2.setText(getResources().getResourceEntryName(padTriggerClip1));
            }
        });
        padTrigger3 = findViewById(R.id.padTrigger3);
        padTrigger3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PT3.start();
                padTrigger3.setText(getResources().getResourceEntryName(padTriggerClip1));
            }
        });
        padTrigger4 = findViewById(R.id.padTrigger4);
        padTrigger4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PT4.start();
                padTrigger4.setText(getResources().getResourceEntryName(padTriggerClip1));
            }
        });
        padTrigger5 = findViewById(R.id.padTrigger5);
        padTrigger5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PT5.start();
                padTrigger5.setText(getResources().getResourceEntryName(padTriggerClip1));
            }
        });
        padTrigger6 = findViewById(R.id.padTrigger6);
        padTrigger6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PT6.start();
                padTrigger6.setText(getResources().getResourceEntryName(padTriggerClip1));
            }
        });
        padTrigger7 = findViewById(R.id.padTrigger7);
        padTrigger7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PT7.start();
                padTrigger7.setText(getResources().getResourceEntryName(padTriggerClip1));
            }
        });
        padTrigger8 = findViewById(R.id.padTrigger8);
        padTrigger8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PT8.start();
                padTrigger8.setText(getResources().getResourceEntryName(padTriggerClip1));
            }
        });
        padTrigger9 = findViewById(R.id.padTrigger9);
        padTrigger9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PT9.start();
                padTrigger9.setText(getResources().getResourceEntryName(padTriggerClip1));
            }
        });
        padTrigger10 = findViewById(R.id.padTrigger10);
        padTrigger10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PT10.start();
                padTrigger10.setText(getResources().getResourceEntryName(padTriggerClip1));
            }
        });
        padTrigger11 = findViewById(R.id.padTrigger11);
        padTrigger11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PT11.start();
                padTrigger11.setText(getResources().getResourceEntryName(padTriggerClip1));
            }
        });
        padTrigger12 = findViewById(R.id.padTrigger12);
        padTrigger12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PT12.start();
                padTrigger12.setText(getResources().getResourceEntryName(padTriggerClip1));
            }
        });
    }

//    public void playSoundPadTrigger1() {
//
//    }

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
