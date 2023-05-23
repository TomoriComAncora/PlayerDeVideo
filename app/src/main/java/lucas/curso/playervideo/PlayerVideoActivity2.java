package lucas.curso.playervideo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class PlayerVideoActivity2 extends AppCompatActivity {


    private VideoView video;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_video2);

        video = findViewById(R.id.videoView);
        View decorView = getWindow().getDecorView();
        int uiOpcao = View.SYSTEM_UI_FLAG_FULLSCREEN | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION;

        decorView.setSystemUiVisibility(uiOpcao);

        getSupportActionBar().hide();

        video.setMediaController(new MediaController(this));
        video.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.video);
        video.start();
    }
}