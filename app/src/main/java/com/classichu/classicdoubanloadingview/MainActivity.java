package com.classichu.classicdoubanloadingview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.classichu.doubanloadingview.DouBanSmileLoadingView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final DouBanSmileLoadingView id_smile_loading = (DouBanSmileLoadingView) findViewById(R.id.id_smile_loading);
        Button id_start = (Button) findViewById(R.id.id_start);
        Button id_stop = (Button) findViewById(R.id.id_stop);

        id_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id_smile_loading.startLoad();
            }
        });

        id_stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id_smile_loading.stopLoading();
            }
        });
    }
}
