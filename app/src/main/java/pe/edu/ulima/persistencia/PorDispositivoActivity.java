package pe.edu.ulima.persistencia;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class PorDispositivoActivity extends Activity implements View.OnClickListener{
    Button butSharedPreferences, butInternal, butSQLite;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_por_dispositivo);

        butSharedPreferences = (Button) findViewById(R.id.butSharedPreferences);
        butInternal = (Button) findViewById(R.id.butInternal);
        butSQLite = (Button) findViewById(R.id.butSQLite);

        butSharedPreferences.setOnClickListener(this);
        butInternal.setOnClickListener(this);
        butSQLite.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.butSharedPreferences){
            startActivity(new Intent(this, SharedPreferencesActivity.class));
        }else if (view.getId() == R.id.butInternal){
            startActivity(new Intent(this, InternalActivity.class));
        }else {
            startActivity(new Intent(this, SQLiteActivity.class));
        }
    }
}
