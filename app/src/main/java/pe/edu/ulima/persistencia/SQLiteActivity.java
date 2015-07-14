package pe.edu.ulima.persistencia;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class SQLiteActivity extends Activity implements View.OnClickListener{
    Button butNuevo, butListar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sqlite);
        butNuevo = (Button) findViewById(R.id.butNuevo);
        butListar = (Button) findViewById(R.id.butListar);

        butNuevo.setOnClickListener(this);
        butListar.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.butNuevo){
            startActivity(new Intent(this, NuevoActivity.class));
        }else{
            startActivity(new Intent(this, ListarActivity.class));
        }
    }
}
