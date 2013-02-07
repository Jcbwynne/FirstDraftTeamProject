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
import android.widget.ListAdapter;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener {
	
/** Called when the activity is first created. */
@Override
public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    //Define variables
    Calendar calendar = Calendar.getInstance(Locale.getDefault());
    ImageView previousMonth;
    ImageView nextMonth;
    Button currentMonthButton;
    GridView calendarGrid;
    
	
	//Make a calendar view on the grid view
	calendarGrid = (GridView) this.findViewById(R.id.calendar);	
	/*attempt to throw stuff on grid 
	calendar.add(Calendar.DAY_OF_YEAR, Calendar.SUNDAY - currentDay);
	ListAdapter dateAdapter = new ListAdapter();
	
	{
	int gridColumn = 7; 
	int gridRow = 6;
	int gridValues[][];
	for (int i = 0; i<gridRow; i++){
		for (int j = 0; j< gridColumn;j++){
			gridValues[i][j]=(calendar.get(Calendar.DAY_OF_MONTH));
			}
		}
	calendarGrid.setAdapter(DateAdapter);
}
	*/

	int currentMonth = calendar.get(Calendar.MONTH);
    int currentYear = calendar.get(Calendar.YEAR);
    int currentDay = calendar.get(Calendar.DAY_OF_WEEK);
    
	
    	    
    	    //set a previous month view
    		previousMonth = (ImageView) this.findViewById(R.id.preMonth);
    		previousMonth.setOnClickListener(this);
    		
    		//set a next month view
    		nextMonth = (ImageView) this.findViewById(R.id.nexMonth);
    		nextMonth.setOnClickListener(this);

    		//set a current month
    		currentMonthButton = (Button) this.findViewById(R.id.curMonth);
    		currentMonthButton.setText(currentMonth);
}


@Override
public void onClick(View v) {
	// TODO set onClick events for buttons
	
}	
}


