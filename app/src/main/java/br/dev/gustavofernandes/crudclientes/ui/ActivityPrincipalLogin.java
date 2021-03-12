package br.dev.gustavofernandes.crudclientes.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.widget.Button;
import android.widget.EditText;

import br.dev.gustavofernandes.crudclientes.R;

public class ActivityPrincipalLogin extends AppCompatActivity {

    private Button btnEntrar;
    private EditText edtUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal_login);
        //getSupportActionBar().hide();
        btnEntrar = findViewById(R.id.activity_principal_login_btn_entrar);
        edtUsuario = findViewById(R.id.activity_principal_login_edt_usuario);

    }

    public void FazerLogin(){
        edtUsuario.setError(null);
        if (edtUsuario.equals(""))
        {
            edtUsuario.setError("Usuário inválido");
        }
    }

}