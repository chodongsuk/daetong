package com.kr.daetong;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        finish();
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://대통인.com"));
        intent.setPackage("com.android.chrome");
        startActivity(intent);
    }
}
