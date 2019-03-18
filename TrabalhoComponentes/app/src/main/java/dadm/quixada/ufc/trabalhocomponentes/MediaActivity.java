package dadm.quixada.ufc.trabalhocomponentes;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MediaActivity extends AppCompatActivity {

    MediaPlayer mySound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media);

        mySound = MediaPlayer.create(this, R.raw.betternow);
    }

    protected void onPause() {
        super.onPause();
        mySound.release();
    }

    public void playMusic(View view) {
        mySound.start();
    }
}
