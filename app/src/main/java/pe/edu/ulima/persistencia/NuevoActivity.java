package pe.edu.ulima.persistencia;

import android.app.Activity;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import pe.edu.ulima.persistencia.sqlite.DictionaryOpenHelper;


public class NuevoActivity extends Activity implements View.OnClickListener{
    EditText eteNombrePokemon;
    Button butGuardarPokemon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nuevo);

        eteNombrePokemon = (EditText) findViewById(R.id.eteNombrePokemon);
        butGuardarPokemon = (Button) findViewById(R.id.butGuardarPokemon);

        butGuardarPokemon.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        DictionaryOpenHelper helper = new DictionaryOpenHelper(this);
        SQLiteDatabase db = helper.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put("nombre", eteNombrePokemon.getText().toString());
        long msg = db.insert("pokemon", null, values);

        Toast.makeText(this, "Se guardo", Toast.LENGTH_LONG).show();
    }
}
