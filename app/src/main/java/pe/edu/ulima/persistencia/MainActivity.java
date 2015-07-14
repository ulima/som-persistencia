package pe.edu.ulima.persistencia;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity implements View.OnClickListener{
    Button butPorAplicacion, butPorDispositivo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        butPorAplicacion = (Button) findViewById(R.id.butPorAplicacion);
        butPorDispositivo = (Button) findViewById(R.id.butPorDispositivo);

        butPorAplicacion.setOnClickListener(this);
        butPorDispositivo.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.butPorAplicacion){
            startActivity(new Intent(this, PorAplicacionActivity.class));
        }else{
            startActivity(new Intent(this, PorDispositivoActivity.class));
        }
    }


}
