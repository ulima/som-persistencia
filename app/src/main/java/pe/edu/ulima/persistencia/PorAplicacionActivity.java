package pe.edu.ulima.persistencia;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class PorAplicacionActivity extends Activity implements View.OnClickListener{
    int numVeces = 0;
    EditText eteMensaje;
    Button butAumentar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_por_aplicacion);

        eteMensaje = (EditText) findViewById(R.id.eteMensaje);
        butAumentar = (Button) findViewById(R.id.butAumentar);

        butAumentar.setOnClickListener(this);

        /*if (savedInstanceState != null){
            numVeces = savedInstanceState.getInt("num_veces");
        }*/
    }

    /*@Override
    public void onSaveInstanceState(Bundle outState) {

        outState.putInt("num_veces", numVeces);
        super.onSaveInstanceState(outState);
    }*/

    @Override
    public void onClick(View view) {
        numVeces++;
        eteMensaje.setText(String.valueOf(numVeces));
    }
}
