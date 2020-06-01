package net.xumk.applife;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class NextActivity extends AppCompatActivity {
    private static final String TAG = "NextActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        Intent intent=getIntent();
        String name=intent.getStringExtra("Name");
        int age=intent.getIntExtra("Age",-1);
        Log.i(TAG,"Name="+name+", Age"+age);

    }
}
