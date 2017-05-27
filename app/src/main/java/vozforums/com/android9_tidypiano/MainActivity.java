package vozforums.com.android9_tidypiano;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.toString();
    private ImageButton ibC1;
    private ImageButton ibD1;
    private ImageButton ibE1;
    private ImageButton ibF1;
    private ImageButton ibG1;
    private ImageButton ibA1;
    private ImageButton ibB1;
    private ImageButton ibC2;
    private ImageButton ibD3;
    private ImageButton ibE3;
    private ImageButton ibG3;
    private ImageButton ibA3;
    private ImageButton ibB3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ibC1 = (ImageButton) findViewById(R.id.ib_C1);
        ibD1 = (ImageButton) findViewById(R.id.ib_D1);
        ibE1 = (ImageButton) findViewById(R.id.ib_E1);
        ibF1 = (ImageButton) findViewById(R.id.ib_F1);
        ibG1 = (ImageButton) findViewById(R.id.ib_G1);
        ibA1 = (ImageButton) findViewById(R.id.ib_A1);
        ibB1 = (ImageButton) findViewById(R.id.ib_B1);
        ibC2 = (ImageButton) findViewById(R.id.ib_C2);
        ibD3 = (ImageButton) findViewById(R.id.ib_D3);
        ibE3 = (ImageButton) findViewById(R.id.ib_E3);
        ibG3 = (ImageButton) findViewById(R.id.ib_G3);
        ibA3 = (ImageButton) findViewById(R.id.ib_A3);
        ibB3 = (ImageButton) findViewById(R.id.ib_B3);


        ibC1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: C1");
            }
        });
        ibD1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: D1");
            }
        });
        ibE1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: E1");
            }
        });
        ibF1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: F1");
            }
        });
        ibG1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: G1");
            }
        });
        ibA1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: A1");
            }
        });
        ibB1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: B1");
            }
        });
        ibC2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: C2");
            }
        });

        ibD3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: Db - C#");
            }
        });
        ibE3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: Eb - D#");
            }
        });
        ibG3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: Gb - F#");
            }
        });
        ibA3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: Ab - G#");
            }
        });
        ibB3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: Bb - A#");
            }
        });
    }
}
