package com.soinnovation.taskreminderapplication;

import android.os.Bundle;

/**
 * Created by Sean on 2/23/2016.
 */
public class ReminderEditActivity extends android.app.Activity {

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reminder_edit);

        if(getIntent() != null) {
            Bundle extras = getIntent().getExtras();
            int RowId = extras != null ? extras.getInt("RowId") : -1;
            // Do stuff with the Row Id here
        }
    }
}
