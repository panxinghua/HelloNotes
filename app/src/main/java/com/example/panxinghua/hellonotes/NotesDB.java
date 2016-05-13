package com.example.panxinghua.hellonotes;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by panxinghua on 16/5/10.
 */
public class NotesDB extends SQLiteOpenHelper {

    public static final String TABLE_NAME = "notes";
    public static final String CONTENT = "content";  /* 表列 */
    public static final String PATH = "path";
    public static final String VIDEO = "video";
    public static final String ID = "_id"; /* underline id*/
    public static final String TIME = "time"; /* better to add time to every database*/

    public NotesDB(Context context) {
        super(context,"notes", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + TABLE_NAME + "("
                + ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                + CONTENT + " TEXT NOT NULL,"
                + PATH + " TEXT NOT NULL,"
                + VIDEO + " TEXT NOT NULL,"
                + TIME + " TEXT NOT NULL)" ); /*最好用大写 CREATE TABLE NOTES (_id
       INTEGER PRIMARY KEY AUTOINCREMENT, content TEXT NOT NULL, time TEXT NOT NULL)  记得加空格*/

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }


}
