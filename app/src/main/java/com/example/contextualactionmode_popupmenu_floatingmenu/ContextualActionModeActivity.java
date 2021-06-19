package com.example.contextualactionmode_popupmenu_floatingmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class ContextualActionModeActivity extends AppCompatActivity {

    private static ActionMode actionMode;
    private ContextualActionModeActivity modeActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contextual_action_mode);

        ImageView imageView = findViewById(R.id.video);
        modeActivity = this;

        imageView.setOnLongClickListener(new View.OnLongClickListener() {
            // Called when the user long-clicks on a View
            public boolean onLongClick(View view) {
                if (actionMode != null) {
                    return false;
                }
                // Start the CAB using the ActionMode.Callback defined below
                actionMode = modeActivity.startActionMode(actionModeCallback);
                view.setSelected(true);
                return true;
            }
        });
    }

    private ActionMode.Callback actionModeCallback = new ActionMode.Callback() {

        // Called when the action mode is created; startActionMode() was called
        @Override
        public boolean onCreateActionMode(ActionMode mode, Menu menu) {
            MenuInflater inflater = mode.getMenuInflater();  inflater.inflate(R.menu.context_menu, menu);
            return true;
        }

        // Called each time the action mode is shown. Always called after onCreateActionMode, but
        // may be called multiple times if the mode is invalidated.
        @Override
        public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
            return false;
        }

        @Override
        public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
            switch (item.getItemId()) {
                case R.id.previous:
                    Toast.makeText(getBaseContext(), "PREVIOUS", Toast.LENGTH_SHORT).show();
                    mode.finish(); // Action picked, so close the CAB
                    return true;
                case R.id.pause:
                    Toast.makeText(getBaseContext(), "PAUSE", Toast.LENGTH_SHORT).show();
                    mode.finish();
                    return true;
                case R.id.play:
                    Toast.makeText(getBaseContext(), "PLAY", Toast.LENGTH_SHORT).show();
                    mode.finish();
                    return true;
                case R.id.next:
                    Toast.makeText(getBaseContext(), "NEXT", Toast.LENGTH_SHORT).show();
                    mode.finish();
                    return true;
                case R.id.download:
                    Toast.makeText(getBaseContext(), "DOWNLOAD", Toast.LENGTH_SHORT).show();
                    mode.finish();
                    return true;
                case R.id.help:
                    Toast.makeText(getBaseContext(), "HELP", Toast.LENGTH_SHORT).show();
                    mode.finish();
                    return true;
                case R.id.preferences:
                    Toast.makeText(getBaseContext(), "PREFERENCES", Toast.LENGTH_SHORT).show();
                    mode.finish();
                    return true;
                default:
                    return false;
            }
        }

        // Called when the user exits the action mode
        @Override
        public void onDestroyActionMode(ActionMode mode) {
            actionMode = null;
        }
    };
}
