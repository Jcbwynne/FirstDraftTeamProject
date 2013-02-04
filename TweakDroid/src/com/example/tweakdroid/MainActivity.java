//Package name
package com.example.tweakdroid;

//Possible import-able libraries
import android.app.Activity;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener {
	
/** Called when the activity is first created. */
@Override
public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    //Define variables
    Calendar calendar;
    int month;
    int year;
    int day;
    ImageView previousMonth;
    ImageView nextMonth;
    GridView calendarGrid;
    int currentDay;
    
    //Make a calendar exist
    calendar = Calendar.getInstance(Locale.getDefault());
    month = calendar.get(Calendar.MONTH);
    year = calendar.get(Calendar.YEAR);
    currentDay = calendar.get(Calendar.DAY_OF_WEEK);
    
    //set a previous month view
	previousMonth = (ImageView) this.findViewById(R.id.preMonth);
	previousMonth.setOnClickListener(this);
	
	//set a next month view
	nextMonth = (ImageView) this.findViewById(R.id.nexMonth);
	nextMonth.setOnClickListener(this);

	//Make a calendar view on the grid view
	//TODO find a way to throw stuff ON the Grid View
	calendarGrid = (GridView) this.findViewById(R.id.calendar);	
	calendar.add(Calendar.DAY_OF_YEAR, Calendar.SUNDAY - currentDay);
	int gridColumn = 7; 
	int gridRow = 6;
	for (int i = 0; i<gridRow; i++){
		for (int j = 0; j< gridColumn;j++){
			System.out.print(calendar.get(Calendar.DAY_OF_MONTH));
			System.out.print(" ");
			calendar.add(Calendar.DAY_OF_YEAR, 1);
		}
		System.out.print("");
	}
}

@Override
public void onClick(View v) {
	// TODO set onClick events for buttons
	
}	
}


