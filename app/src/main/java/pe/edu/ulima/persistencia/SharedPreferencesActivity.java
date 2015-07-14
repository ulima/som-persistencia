package pe.edu.ulima.persistencia;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.EditText;


public class SharedPreferencesActivity extends ActionBarActivity {
    EditText eteQuehizo, eteNombre, eteApellido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_preferences);

        eteQuehizo = (EditText) findViewById(R.id.eteQuehizo);
        eteNombre = (EditText) findViewById(R.id.eteNombre);
        eteApellido = (EditText) findViewById(R.id.eteApellido);

        /*SharedPreferences sp = getSharedPreferences("sp_app", 0);
        eteNombre.setText(sp.getString("nombre", ""));
        eteApellido.setText(sp.getString("apellido", ""));
        eteQuehizo.setText(sp.getString("quehizo", ""));*/

    }

    /*@Override
    protected void onPause() {
        super.onPause();

        SharedPreferences sp = getSharedPreferences("sp_app", 0);
        SharedPreferences.Editor editor = sp.edit();

        editor.putString("nombre", eteNombre.getText().toString());
        editor.putString("apellido", eteApellido.getText().toString());
        editor.putString("quehizo", eteQuehizo.getText().toString());

        editor.commit();
    }*/
}
