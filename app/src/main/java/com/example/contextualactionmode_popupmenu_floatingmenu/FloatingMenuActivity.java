package com.example.contextualactionmode_popupmenu_floatingmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ActionMode;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class FloatingMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_floating_menu);

        ImageView image = findViewById(R.id.image1);
        registerForContextMenu(image);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View view, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, view, menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.floating_menu, menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.download:
                Toast.makeText(getBaseContext(), "Download image", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.open:
                Toast.makeText(getBaseContext(), "Open image in new tab", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.google:
                Toast.makeText(getBaseContext(), "Search Google for this image", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.share:
                Toast.makeText(getBaseContext(), "Share image", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onContextItemSelected(item);
        }
    }
}
