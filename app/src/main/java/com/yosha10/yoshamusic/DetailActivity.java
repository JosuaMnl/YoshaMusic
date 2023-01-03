package com.yosha10.yoshamusic;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class DetailActivity extends AppCompatActivity {
    private TextView tvJudulDetail, tvKeteranganDetail, tvVideoid;
    private YouTubePlayerView ypvVideo;
    private Button btnKembali;
    private String judul, keterangan, videoid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tvJudulDetail = findViewById(R.id.tv_judul_detail);
        tvKeteranganDetail = findViewById(R.id.tv_keterangan_detail);
//        tvVideoid = findViewById(R.id.tv_videoid);
        ypvVideo = findViewById(R.id.ypv_video);
        btnKembali = findViewById(R.id.btn_kembali);

        Intent getIntent = getIntent();
        judul = getIntent.getStringExtra("varJudul");
        keterangan = getIntent.getStringExtra("varKeterangan");
        videoid = getIntent.getStringExtra("varVideoid");

//        Toast.makeText(DetailActivity.this, "Judul :" + judul + " | Keterangan :" + keterangan + " | VideoId :" + videoid, Toast.LENGTH_SHORT).show();
        tvJudulDetail.setText(judul);
        tvKeteranganDetail.setText(keterangan);

        ypvVideo.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
            @Override
            public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                youTubePlayer.cueVideo(videoid, 0);
            }
        });

        btnKembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ypvVideo.release(); // Agar tidak play video di background saat kembali di klik
                startActivity(new Intent(DetailActivity.this, MainActivity.class));
                finish();
            }
        });

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ypvVideo.release(); // Saat masuk lifecycle ondestroy, video nya akan di stop
    }
}