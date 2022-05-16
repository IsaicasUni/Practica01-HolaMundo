package com.example.app01;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btnSaludar;
    private Button btnBorrar;
    private Button btnSalir;
    private EditText txtNombre;
    private TextView lblSaludo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSaludar = (Button) findViewById(R.id.btnSaludo);
        btnBorrar = (Button) findViewById(R.id.btnLimpiar);
        btnSalir = (Button) findViewById(R.id.btnCerrar);
        txtNombre = (EditText) findViewById(R.id.lblSaludo2);
        lblSaludo = (TextView) findViewById(R.id.lblSaludo);


        btnSaludar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtNombre.getText().toString().matches("")) {
                    Toast.makeText(MainActivity.this, "Favor de ingresar un nombre", Toast.LENGTH_SHORT).show();
                }
                else {
                    String txtSaludar = txtNombre.getText().toString();
                    lblSaludo.setText("Hola " + txtSaludar + " Como Estas ? UwU");
                }
            }
        });

        btnBorrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtNombre.getText().toString().matches("")) {
                    Toast.makeText(MainActivity.this, "La caja esta vacia", Toast.LENGTH_SHORT).show();
                }
                else {
                    lblSaludo.setText("");
                }
            }
        });

        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}