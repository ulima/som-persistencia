package pe.edu.ulima.persistencia;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class InternalActivity extends Activity implements View.OnClickListener{
    EditText eteQuehizo, eteNombre, eteApellido;
    Button butGuardarInternal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_internal);

        eteQuehizo = (EditText) findViewById(R.id.eteQuehizo);
        eteNombre = (EditText) findViewById(R.id.eteNombre);
        eteApellido = (EditText) findViewById(R.id.eteApellido);

        butGuardarInternal = (Button) findViewById(R.id.butGuardarInternal);
        butGuardarInternal.setOnClickListener(this);

        String FILENAME = "archivo";
        try {
            FileInputStream fis = openFileInput(FILENAME);
            String datos = Utiles.convertFisToString(fis);

            String[] arr = datos.split("-");

            if (arr != null && arr.length == 3) {

                eteNombre.setText(arr[0]);
                eteApellido.setText(arr[1]);
                eteQuehizo.setText(arr[2]);
            }
        } catch (FileNotFoundException e) {

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onClick(View view) {
        String FILENAME = "archivo";
        String string = String.format("%s-%s-%s",
                eteNombre.getText().toString(),
                eteApellido.getText().toString(),
                eteQuehizo.getText().toString());

        FileOutputStream fos = null;
        try {
            fos = openFileOutput(FILENAME, Context.MODE_PRIVATE);
            fos.write(string.getBytes());
            fos.close();
            Toast.makeText(this, "Se guardo", Toast.LENGTH_LONG).show();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
