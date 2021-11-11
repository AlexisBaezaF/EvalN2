package com.example.evaln2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText user, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user = (EditText) findViewById(R.id.userRequest);
        pass = (EditText) findViewById(R.id.passwordRequest);
    }

    public void ingresarApp(View view){
        String v_user = user.getText().toString();
        String v_pass = pass.getText().toString();

        if(v_user.equals("test@test.cl") && v_pass.equals("test")){
            Intent intento = new Intent(this, MenuPrincipal.class);
            startActivity(intento);
        }else{
            Toast.makeText(this, "Usuario y/o contraseña incorrectos. Intente nuevamente.", Toast.LENGTH_SHORT).show();
        }
    }
}