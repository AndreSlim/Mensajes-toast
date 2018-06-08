package com.andreslim.prueba;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button boton1;
    Button boton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton1 = (Button) findViewById(R.id.boton1);

        boton2 = (Button) findViewById(R.id.boton2);

        boton1.setOnClickListener(this);
        boton2.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.boton1:
                Toast.makeText(getApplicationContext(),R.string.mensaje1,Toast.LENGTH_SHORT).show();
                break;

            case R.id.boton2:
                Toast.makeText(getApplicationContext(),R.string.mensaje2,Toast.LENGTH_SHORT).show();
                break;

            default:
                break;
        }

    }
}
