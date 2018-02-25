package com.example.root.loginandroid;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.HONEYCOMB){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }else{
            getActionBar().setDisplayHomeAsUpEnabled(true);
        }

        Intent intent = getIntent();
        String usuario_ref="Hitler";
        String password_ref="siegheil";
        String usuario = intent.getStringExtra("USUARIO");
        String password = intent.getStringExtra("PASSWORD");
        String escuela = intent.getStringExtra("ESCUELA");
        Log.i("LOGIN",usuario);
        Log.i("LOGIN",password);
        Log.i("LOGIN",usuario_ref);
        Log.i("LOGIN",password_ref);
        if(usuario.equals(usuario_ref) && password.equals(password_ref)){
            TextView txt= (TextView) findViewById(R.id.textView5);
            txt.setText("Bienvenido "+usuario+" de la escuela "+escuela);
        }else{
            Log.i("tes","tes");
            TextView txt= (TextView) findViewById(R.id.textView5);
            txt.setText("Usuario incorrecto");
        }

    }

}
