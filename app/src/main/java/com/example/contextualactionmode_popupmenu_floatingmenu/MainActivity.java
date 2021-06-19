package com.example.contextualactionmode_popupmenu_floatingmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void contextual(View view) {
        Intent intent = new Intent(this, ContextualActionModeActivity.class);
        startActivity(intent);
    }

    public void popup(View view) {
        Intent intent = new Intent(this, PopupMenuActivity.class);
        startActivity(intent);
    }

    public void floating(View view) {
        Intent intent = new Intent(this, FloatingMenuActivity.class);
        startActivity(intent);
    }
}