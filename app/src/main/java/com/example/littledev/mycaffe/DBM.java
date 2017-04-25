package com.example.littledev.mycaffe;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

class DBM extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "Test";
    private static final String TABLE_NAME_1 = "Storage";
    private static final String TABLE_NAME_2 = "Meals";
    private static final String TABLE_NAME_3 = "Sells";
    //private static final String TABLE_NAME_4 = "Categories";
    private  String table_name;
    DBM(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    void setTable_name(String name){
        table_name = name;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("create table " + TABLE_NAME_1 +" ( ID INTEGER PRIMARY KEY AUTOINCREMENT, Name TEXT, Category TEXT, Quantity INT)");
        db.execSQL("create table " + TABLE_NAME_2 +" ( ID INTEGER PRIMARY KEY AUTOINCREMENT)");
        db.execSQL("create table " + TABLE_NAME_3 +" ( ID INTEGER PRIMARY KEY AUTOINCREMENT, Name TEXT, Quantity INT, Price INT, Date DATE)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void onAddMeal(String meal, List<String> ingredients, String price){
        SQLiteDatabase db = this.getWritableDatabase();

        db.execSQL("ALTER TABLE " + TABLE_NAME_2 + " ADD COLUMN " + meal + " TEXT");
        Cursor dbCursor = db.query(TABLE_NAME_2, null, null, null, null, null, null);
        String[] columnNames = dbCursor.getColumnNames();
        for  (String column : columnNames){
            Log.i("test", column);
        }
        Log.i("test", "Insert into " + TABLE_NAME_2 + " (" + meal + ") Values ('" + price + "')");
        db.execSQL("Insert into " + TABLE_NAME_2 + " (" + meal + ") Values ('" + price + "')");

        for (String ingredient: ingredients
             ) {
            db.rawQuery("Insert into " + TABLE_NAME_2 + " (" + meal + ") Values ('" + ingredient + "')", null);
        }
        Log.i("test", "Meal added");
    }

    public void onAddItem(String name, String category, int quantity){
        SQLiteDatabase db = this.getWritableDatabase();
        db.rawQuery("Insert into" + TABLE_NAME_1 + " (Name, Category, Quantity) Values (" + name + ", " + category + ", " + quantity + ")", null);
    }

    public  void onOrder(String name, int quantity, int price){
        SQLiteDatabase db = this.getWritableDatabase();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
        Date date = new Date();
        ContentValues values = new ContentValues();
        values.put("Name", name);
        values.put("Quantity", quantity);
        values.put("Price", price);
        values.put("Date", simpleDateFormat.format(date));
        db.insert(TABLE_NAME_3, null, values);
        //db.rawQuery("Insert into " + TABLE_NAME_3 + " (Name, Quantity, Price, Date) Values (" + name + ", " + quantity + ", " + price + ", " + Calendar.DATE + ")", null);

    }

}
