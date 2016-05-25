package org.institutoserpis.ed.acategoria;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;

/**
 * Created by mati on 25/05/16.
 */
class DbPruebaOpenHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "dbprueba.db";
    private static final int DATABASE_VERSION = 1;

    public abstract class TableCategoria implements BaseColumns{
        public static  final String NAME ="categoria";
        public static  final String COLUMN_NOMBRE = "nombre";

    }

    private static final String CREATE_TABLE_CATEGORIA =
            "create table" + TableCategoria.NAME +"(" +
                    TableCategoria._ID + " " +"," +
                    TableCategoria.COLUMN_NOMBRE + " text" +
                    ");";

    public DbPruebaOpenHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db){

    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){

    }
}
