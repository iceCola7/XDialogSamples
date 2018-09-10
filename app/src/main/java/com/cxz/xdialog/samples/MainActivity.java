package com.cxz.xdialog.samples;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.cxz.xdialog.samples.bottomdialog.EditBottomDialog;
import com.cxz.xdialog.samples.bottomdialog.ShareBottomDialog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_share_bottom).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new ShareBottomDialog().show(getSupportFragmentManager());
            }
        });

        findViewById(R.id.btn_edit_bottom).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new EditBottomDialog().show(getSupportFragmentManager());
            }
        });

    }
}
