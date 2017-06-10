package vozforums.com.android9_tidypiano;

import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
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
    private ImageView ibD2;
    private ImageView ibE2;
    private ImageView ibG2;
    private ImageView ibA2;
    private ImageView ibB2;

    public void playSoundC1(View view) {
        if (loaded) {
            float leftVolumn = volume;
            float rightVolumn = volume;
            int streamId = this.soundPool.play(this.soundC1, leftVolumn, rightVolumn, 1, 0, 1f);
        }
    }

    public void playSoundD1(View view) {
        if (loaded) {
            float leftVolumn = volume;
            float rightVolumn = volume;
            int streamId = this.soundPool.play(this.soundD1, leftVolumn, rightVolumn, 1, 0, 1f);
        }
    }

    public void playSoundE1(View view) {
        if (loaded) {
            float leftVolumn = volume;
            float rightVolumn = volume;
            int streamId = this.soundPool.play(this.soundE1, leftVolumn, rightVolumn, 1, 0, 1f);
        }
    }

    public void playSoundF1(View view) {
        if (loaded) {
            float leftVolumn = volume;
            float rightVolumn = volume;
            int streamId = this.soundPool.play(this.soundF1, leftVolumn, rightVolumn, 1, 0, 1f);
        }
    }

    public void playSoundG1(View view) {
        if (loaded) {
            float leftVolumn = volume;
            float rightVolumn = volume;
            int streamId = this.soundPool.play(this.soundG1, leftVolumn, rightVolumn, 1, 0, 1f);
        }
    }

    public void playSoundA1(View view) {
        if (loaded) {
            float leftVolumn = volume;
            float rightVolumn = volume;
            int streamId = this.soundPool.play(this.soundA1, leftVolumn, rightVolumn, 1, 0, 1f);
        }
    }

    public void playSoundB1(View view) {
        if (loaded) {
            float leftVolumn = volume;
            float rightVolumn = volume;
            int streamId = this.soundPool.play(this.soundB1, leftVolumn, rightVolumn, 1, 0, 1f);
        }
    }

    public void playSoundD2(View view) {
        if (loaded) {
            float leftVolumn = volume;
            float rightVolumn = volume;
            int streamId = this.soundPool.play(this.soundD2, leftVolumn, rightVolumn, 1, 0, 1f);
        }
    }

    public void playSoundE2(View view) {
        if (loaded) {
            float leftVolumn = volume;
            float rightVolumn = volume;
            int streamId = this.soundPool.play(this.soundE2, leftVolumn, rightVolumn, 1, 0, 1f);
        }
    }

    public void playSoundG2(View view) {
        if (loaded) {
            float leftVolumn = volume;
            float rightVolumn = volume;
            int streamId = this.soundPool.play(this.soundG2, leftVolumn, rightVolumn, 1, 0, 1f);
        }
    }

    public void playSoundA2(View view) {
        if (loaded) {
            float leftVolumn = volume;
            float rightVolumn = volume;
            int streamId = this.soundPool.play(this.soundA2, leftVolumn, rightVolumn, 1, 0, 1f);
        }
    }

    public void playSoundB2(View view) {
        if (loaded) {
            float leftVolumn = volume;
            float rightVolumn = volume;
            int streamId = this.soundPool.play(this.soundB2, leftVolumn, rightVolumn, 1, 0, 1f);
        }
    }

    private SoundPool soundPool;

    private AudioManager audioManager;

    // Maximumn sound stream.
    private static final int MAX_STREAMS = 5;

    // Stream type.
    private static final int streamType = AudioManager.STREAM_MUSIC;

    private boolean loaded;

    private int soundIdDestroy;
    private int soundC1;
    private int soundD1;
    private int soundE1;
    private int soundF1;
    private int soundG1;
    private int soundA1;
    private int soundB1;
    private int soundD2;
    private int soundE2;
    private int soundG2;
    private int soundA2;
    private int soundB2;
    private float volume;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // AudioManager audio settings for adjusting the volume
        audioManager = (AudioManager) getSystemService(AUDIO_SERVICE);

        // Current volumn Index of particular stream type.
        float currentVolumeIndex = (float) audioManager.getStreamVolume(streamType);

        // Get the maximum volume index for a particular stream type.
        float maxVolumeIndex = (float) audioManager.getStreamMaxVolume(streamType);

        // Volumn (0 --> 1)
        this.volume = currentVolumeIndex / maxVolumeIndex;

        // Suggests an audio stream whose volume should be changed by
        // the hardware volume controls.
        this.setVolumeControlStream(streamType);

        // For Android SDK >= 21
        if (Build.VERSION.SDK_INT >= 21) {

            AudioAttributes audioAttrib = new AudioAttributes.Builder()
                    .setUsage(AudioAttributes.USAGE_GAME)
                    .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                    .build();

            SoundPool.Builder builder = new SoundPool.Builder();
            builder.setAudioAttributes(audioAttrib).setMaxStreams(MAX_STREAMS);

            this.soundPool = builder.build();
        }
        // for Android SDK < 21
        else {
            // SoundPool(int maxStreams, int streamType, int srcQuality)
            this.soundPool = new SoundPool(MAX_STREAMS, AudioManager.STREAM_MUSIC, 0);
        }

        // When Sound Pool load complete.
        this.soundPool.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() {
            @Override
            public void onLoadComplete(SoundPool soundPool, int sampleId, int status) {
                loaded = true;
            }
        });

        this.soundC1 = this.soundPool.load(this, R.raw.sound_1, 1);
        this.soundD1 = this.soundPool.load(this, R.raw.sound_3, 1);
        this.soundE1 = this.soundPool.load(this, R.raw.sound_5, 1);
        this.soundF1 = this.soundPool.load(this, R.raw.sound_6, 1);
        this.soundG1 = this.soundPool.load(this, R.raw.sound_8, 1);
        this.soundA1 = this.soundPool.load(this, R.raw.sound_10, 1);
        this.soundB1 = this.soundPool.load(this, R.raw.sound_12, 1);
        this.soundD2 = this.soundPool.load(this, R.raw.sound_2, 1);
        this.soundE2 = this.soundPool.load(this, R.raw.sound_4, 1);
        this.soundG2 = this.soundPool.load(this, R.raw.sound_7, 1);
        this.soundA2 = this.soundPool.load(this, R.raw.sound_9, 1);
        this.soundB2 = this.soundPool.load(this, R.raw.sound_11, 1);


        ibC1 = (ImageView) findViewById(R.id.ib_C1);
        ibD1 = (ImageView) findViewById(R.id.ib_D1);
        ibE1 = (ImageView) findViewById(R.id.ib_E1);
        ibF1 = (ImageView) findViewById(R.id.ib_F1);
        ibG1 = (ImageView) findViewById(R.id.ib_G1);
        ibA1 = (ImageView) findViewById(R.id.ib_A1);
        ibB1 = (ImageView) findViewById(R.id.ib_B1);
        ibD2 = (ImageView) findViewById(R.id.ib_D2);
        ibE2 = (ImageView) findViewById(R.id.ib_E2);
        ibG2 = (ImageView) findViewById(R.id.ib_G2);
        ibA2 = (ImageView) findViewById(R.id.ib_A2);
        ibB2 = (ImageView) findViewById(R.id.ib_B2);

        ibC1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        Log.d(TAG, "DOWN: x: " + event.getX() + " - y:" + event.getY());
                        playSoundC1(new View(getBaseContext()));
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
                        playSoundD1(new View(getBaseContext()));
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
                        playSoundE1(new View(getBaseContext()));
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
                        playSoundF1(new View(getBaseContext()));
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
                        playSoundG1(new View(getBaseContext()));
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
                        playSoundA1(new View(getBaseContext()));
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
                        playSoundB1(new View(getBaseContext()));
                        ibB1.setImageResource(R.drawable.pressed_white_key);
                        return true;
                    case MotionEvent.ACTION_UP:
                        ibB1.setImageResource(R.drawable.default_white_key);
                        return true;
                }
                return false;
            }
        });
        ibD2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        playSoundD2(new View(getBaseContext()));
                        ibD2.setImageResource(R.drawable.pressed_black_key);
                        return true;
                    case MotionEvent.ACTION_UP:
                        ibD2.setImageResource(R.drawable.default_black_key);
                        return true;
                }
                return false;
            }
        });
        ibE2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        playSoundE2(new View(getBaseContext()));
                        ibE2.setImageResource(R.drawable.pressed_black_key);
                        return true;
                    case MotionEvent.ACTION_UP:
                        ibE2.setImageResource(R.drawable.default_black_key);
                        return true;
                }
                return false;
            }
        });
        ibG2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        playSoundG2(new View(getBaseContext()));
                        ibG2.setImageResource(R.drawable.pressed_black_key);
                        return true;
                    case MotionEvent.ACTION_UP:
                        ibG2.setImageResource(R.drawable.default_black_key);
                        return true;
                }
                return false;
            }
        });
        ibA2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        playSoundA2(new View(getBaseContext()));
                        ibA2.setImageResource(R.drawable.pressed_black_key);
                        return true;
                    case MotionEvent.ACTION_UP:
                        ibA2.setImageResource(R.drawable.default_black_key);
                        return true;
                }
                return false;
            }
        });
        ibB2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        playSoundB2(new View(getBaseContext()));
                        ibB2.setImageResource(R.drawable.pressed_black_key);
                        return true;
                    case MotionEvent.ACTION_UP:
                        ibB2.setImageResource(R.drawable.default_black_key);
                        return true;
                }
                return false;
            }
        });
    }
}
