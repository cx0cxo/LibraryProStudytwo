package com.study.libraryprostudytwo.model;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class MyDBHelp extends SQLiteOpenHelper {


	private static String mDBName = "my.db";
	private static int Version = 1;
	
	
	public MyDBHelp(Context context) {
		super(context, mDBName, null, Version);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {

	
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {

	}

}
