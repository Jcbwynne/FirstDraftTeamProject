package com.example.tweakdroid;

import android.app.Activity;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;

public class MainActivity extends Activity {
/** Called when the activity is first created. */
@Override
public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    Cursor cursor=getContentResolver().query(Uri.parse("content://com.android.calendar/calendars"), new String[]{"_id", "displayname"}, null, null, null);

    cursor.moveToFirst();
    // Get calendars name
    String calendarNames[] = new String[cursor.getCount()];
    // Get calendars id
    int[] calendarId = new int[cursor.getCount()];
    for (int i = 0; i < calendarNames.length; i++)
    {
             calendarId[i] = cursor.getInt(0);
             calendarNames[i] = cursor.getString(1);
             cursor.moveToNext();
    }
    cursor.close();

    ContentValues contentEvent = new ContentValues();
     contentEvent.put("calendar_id", 1);
     contentEvent.put("title", "Wedding");
     contentEvent.put("eventLocation", "New York");                
     contentEvent.put("dtstart","1335432431000");
     contentEvent.put("dtend","1335436031000");


     Uri eventsUri = Uri.parse("content://com.android.calendar/events");
     getContentResolver().insert(eventsUri, contentEvent);
}
}