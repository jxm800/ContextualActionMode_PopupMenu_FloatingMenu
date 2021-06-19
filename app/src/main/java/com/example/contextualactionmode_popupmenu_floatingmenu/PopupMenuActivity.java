package com.example.contextualactionmode_popupmenu_floatingmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.Toast;

public class PopupMenuActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup_menu);
    }

    public void showPopup(View view) {
        PopupMenu popup = new PopupMenu(this, view);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.popup_menu);
        popup.show();
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.forward:
                Toast.makeText(getBaseContext(), "FORWARD MESSAGE", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.delete:
                Toast.makeText(getBaseContext(), "DELETE MESSAGE", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return false;
        }
    }
}

