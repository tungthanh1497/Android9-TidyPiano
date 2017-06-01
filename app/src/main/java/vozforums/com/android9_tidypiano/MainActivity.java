package vozforums.com.android9_tidypiano;

import android.content.Context;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.toString();
    private ImageView ibC1;
    private ImageView ibD1;
    private ImageView ibE1;
    private ImageView ibF1;
    private ImageView ibG1;
    private ImageView ibA1;
    private ImageView ibB1;
    private ImageView ibD3;
    private ImageView ibE3;
    private ImageView ibG3;
    private ImageView ibA3;
    private ImageView ibB3;
    MediaPlayer mediaPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ibC1 = (ImageView) findViewById(R.id.ib_C1);
        ibD1 = (ImageView) findViewById(R.id.ib_D1);
        ibE1 = (ImageView) findViewById(R.id.ib_E1);
        ibF1 = (ImageView) findViewById(R.id.ib_F1);
        ibG1 = (ImageView) findViewById(R.id.ib_G1);
        ibA1 = (ImageView) findViewById(R.id.ib_A1);
        ibB1 = (ImageView) findViewById(R.id.ib_B1);
        ibD3 = (ImageView) findViewById(R.id.ib_D3);
        ibE3 = (ImageView) findViewById(R.id.ib_E3);
        ibG3 = (ImageView) findViewById(R.id.ib_G3);
        ibA3 = (ImageView) findViewById(R.id.ib_A3);
        ibB3 = (ImageView) findViewById(R.id.ib_B3);


        ibC1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.sound_1);
                        mediaPlayer.start();
                        ibC1.setImageResource(R.drawable.pressed_white_key);
                        return true;
                    case MotionEvent.ACTION_UP:
                        ibC1.setImageResource(R.drawable.default_white_key);
                        return true;
                }
                return false;
            }
        });
        ibD1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.sound_3);
                        mediaPlayer.start();
                        ibD1.setImageResource(R.drawable.pressed_white_key);
                        return true;
                    case MotionEvent.ACTION_UP:
                        ibD1.setImageResource(R.drawable.default_white_key);
                        return true;
                }
                return false;
            }
        });
        ibE1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.sound_5);
                        mediaPlayer.start();
                        ibE1.setImageResource(R.drawable.pressed_white_key);
                        return true;
                    case MotionEvent.ACTION_UP:
                        ibE1.setImageResource(R.drawable.default_white_key);
                        return true;
                }
                return false;
            }
        });
        ibF1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.sound_6);
                        mediaPlayer.start();
                        ibF1.setImageResource(R.drawable.pressed_white_key);
                        return true;
                    case MotionEvent.ACTION_UP:
                        ibF1.setImageResource(R.drawable.default_white_key);
                        return true;
                }
                return false;
            }
        });
        ibG1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.sound_8);
                        mediaPlayer.start();
                        ibG1.setImageResource(R.drawable.pressed_white_key);
                        return true;
                    case MotionEvent.ACTION_UP:
                        ibG1.setImageResource(R.drawable.default_white_key);
                        return true;
                }
                return false;
            }
        });
        ibA1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.sound_10);
                        mediaPlayer.start();
                        ibA1.setImageResource(R.drawable.pressed_white_key);
                        return true;
                    case MotionEvent.ACTION_UP:
                        ibA1.setImageResource(R.drawable.default_white_key);
                        return true;
                }
                return false;
            }
        });
        ibB1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.sound_12);
                        mediaPlayer.start();
                        ibB1.setImageResource(R.drawable.pressed_white_key);
                        return true;
                    case MotionEvent.ACTION_UP:
                        ibB1.setImageResource(R.drawable.default_white_key);
                        return true;
                }
                return false;
            }
        });
        ibD3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.sound_2);
                        mediaPlayer.start();
                        ibD3.setImageResource(R.drawable.pressed_black_key);
                        return true;
                    case MotionEvent.ACTION_UP:
                        ibD3.setImageResource(R.drawable.default_black_key);
                        return true;
                }
                return false;
            }
        });
        ibE3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.sound_4);
                        mediaPlayer.start();
                        ibE3.setImageResource(R.drawable.pressed_black_key);
                        return true;
                    case MotionEvent.ACTION_UP:
                        ibE3.setImageResource(R.drawable.default_black_key);
                        return true;
                }
                return false;
            }
        });
        ibG3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.sound_7);
                        mediaPlayer.start();
                        ibG3.setImageResource(R.drawable.pressed_black_key);
                        return true;
                    case MotionEvent.ACTION_UP:
                        ibG3.setImageResource(R.drawable.default_black_key);
                        return true;
                }
                return false;
            }
        });
        ibA3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.sound_9);
                        mediaPlayer.start();
                        ibA3.setImageResource(R.drawable.pressed_black_key);
                        return true;
                    case MotionEvent.ACTION_UP:
                        ibA3.setImageResource(R.drawable.default_black_key);
                        return true;
                }
                return false;
            }
        });
        ibB3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.sound_11);
                        mediaPlayer.start();
                        ibB3.setImageResource(R.drawable.pressed_black_key);
                        return true;
                    case MotionEvent.ACTION_UP:
                        ibB3.setImageResource(R.drawable.default_black_key);
                        return true;
                }
                return false;
            }
        });
    }
}
