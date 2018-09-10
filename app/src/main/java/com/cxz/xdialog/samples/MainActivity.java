package com.cxz.xdialog.samples;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.cxz.xdialog.samples.bottomdialog.ShareBottomDialog;

public class MainActivity extends AppCompatActivity {

    private Button btn_bottom_dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_bottom_dialog = findViewById(R.id.btn_share_bottom);
        btn_bottom_dialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new ShareBottomDialog().show(getSupportFragmentManager());
            }
        });
    }
}
