package com.omerakturk.gazetewithmenu.entity.utility;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.location.Location;

import com.omerakturk.gazetewithmenu.util.Util;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ömer Aktürk on 17.10.2017.
 */

public class DBContext {
    private static final String[] KOLONLAR = {DBHelper.LOKASYON_ID,DBHelper.COLUMN_ENLEM,DBHelper.COLUMN_BOYLAM};
    private DBHelper dbHelper;
    private boolean result=false;
    private static DBContext INSTANCE;

    private DBContext(Context context){
        dbHelper=new DBHelper(context);
    }

    public static DBContext getInstance(Context context){

        if(INSTANCE==null){
            INSTANCE =new DBContext(context);
        }
        return INSTANCE;
    }



    public boolean lokasyonEkle(Location lokasyon){

        SQLiteDatabase database=dbHelper.getWritableDatabase();

        ContentValues contentValues=new ContentValues();
        contentValues.put(DBHelper.COLUMN_ENLEM,lokasyon.getLatitude());
        contentValues.put(DBHelper.COLUMN_BOYLAM,lokasyon.getLongitude());
        long id =database.insert(DBHelper.TABLE_NAME,null,contentValues);

        if(id!=-1){
            result= true;
        }
        return result;
    }
    public List<Location> lokasyonGoster(Location location){

        List<Location> lokasyonListesi=new ArrayList<>();

        SQLiteDatabase database=dbHelper.getReadableDatabase();
        Cursor cursor=database.query(DBHelper.TABLE_NAME,KOLONLAR,null,null,null,null,null);

        while(cursor.moveToNext()){


            location.setLatitude(cursor.getDouble(cursor.getColumnIndex(DBHelper.COLUMN_ENLEM)));
            location.setLongitude(cursor.getDouble(cursor.getColumnIndex(DBHelper.COLUMN_BOYLAM)));

            lokasyonListesi.add(location);
        }


        return lokasyonListesi;
    }
    public Cursor showAllDatabases(){
        SQLiteDatabase database=dbHelper.getReadableDatabase();
        String mysql="SELECT * FROM sqlite_master "+ " WHERE type='table'";

        return database.rawQuery(mysql,null);
    }

    //************************İNNER CLASS*************************//
    private class DBHelper extends SQLiteOpenHelper {

        private static final String DATABASE_NAME = "DB_LOKASYON";
        private static final int DATABASE_VERSION =3;
        private static final String TABLE_NAME = "LOKASYONLAR" ;
        private static final String LOKASYON_ID = "LOKASYON_ID" ;
        public static final String COLUMN_ENLEM = "ENLEM";
        public static final String COLUMN_BOYLAM = "BOYLAM";

        private static final String CREATE_TABLE = "CREATE TABLE "+TABLE_NAME +"("+LOKASYON_ID+" INTEGER PRIMARY KEY AUTOINCREMENT, "+
                COLUMN_ENLEM+ " DOUBLE, "+
                COLUMN_BOYLAM+" DOUBLE)";

        private static final String DROP_TABLE = "DROP TABLE IF EXİST "+ TABLE_NAME;


        private Context context;

        public DBHelper(Context context) {
            super(context, DATABASE_NAME, null, DATABASE_VERSION);
            this.context=context;
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            db.execSQL(CREATE_TABLE);
            Util.showMessage(context,"Tablo oluşturuldu");
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            db.execSQL(DROP_TABLE);
            Util.showMessage(context,"Tablo düşürüldü");

            onCreate(db);
        }
    }

}
