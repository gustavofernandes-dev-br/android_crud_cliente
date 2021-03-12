package br.dev.gustavofernandes.crudclientes.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import br.dev.gustavofernandes.crudclientes.R;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Handler handle = new Handler();
        handle.postDelayed(new Runnable() {
            @Override public void run() {
                mostrarLogin();
            }
        }, 2000);
    }
    private  void mostrarLogin()
    {
        Intent intent = new Intent(SplashScreen.this, ActivityPrincipalLogin.class);
        startActivity(intent);
        finish();
    }
}