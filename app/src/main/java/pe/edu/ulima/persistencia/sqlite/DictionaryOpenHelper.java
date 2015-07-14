package pe.edu.ulima.persistencia.sqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by hquintana on 14/07/15.
 */
public class DictionaryOpenHelper extends SQLiteOpenHelper{
    private static final String DATABASE_NAME= "db_pokemons";
    private static final int DATABASE_VERSION = 1;
    private static final String DICTIONARY_TABLE_NAME = "pokemon";
    private static final String DICTIONARY_TABLE_CREATE =
            "CREATE TABLE " + DICTIONARY_TABLE_NAME + " (" +
                     "nombre TEXT);";

    public DictionaryOpenHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(DICTIONARY_TABLE_CREATE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i2) {

    }
}
