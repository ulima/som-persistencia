package pe.edu.ulima.persistencia;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;

import pe.edu.ulima.persistencia.sqlite.DictionaryOpenHelper;


public class ListarActivity extends ActionBarActivity {
    TextView tviPokemons;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar);

        tviPokemons = (TextView) findViewById(R.id.tviPokemons);

        DictionaryOpenHelper helper = new DictionaryOpenHelper(this);
        SQLiteDatabase db = helper.getWritableDatabase();
        String[] campos = {"nombre"};
        String where = null;
        String[] whereArgs = null;
        String groupBy = null;
        String having = null;
        String orderBy = null;
        Cursor cur = db.query("pokemon", campos, where, whereArgs, groupBy, having, orderBy);

        cur.moveToFirst();
        while (cur.isAfterLast() == false) {
            String anterior = tviPokemons.getText().toString();
            tviPokemons.setText(anterior +" \n " + cur.getString(0));
            cur.moveToNext();
        }

        cur.close();
    }



}
