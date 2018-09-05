package com.example.danielbustamante.futboleta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class PerfilActivity extends AppCompatActivity {
    private String correo, contra;
    private TextView tmail, tpass;


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu1, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


        int id = item.getItemId();

        switch (id){
            case R.id.mPrincipal:
                finish();
                break;
            case R.id.mcerrarsecion:
                Intent intent2 =new Intent();
                setResult(RESULT_OK, intent2);
                finish();
                break;

        }



        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        tmail=findViewById(R.id.tmail);
        tpass=findViewById(R.id.tpass);

        Intent intent2 = getIntent();
        correo = intent2.getStringExtra("correo");
         contra = intent2.getStringExtra("pass");
        tmail.setText("Correo: \n"+ correo);
        tpass.setText("Contraseña: \n"+ contra);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();

    }
}
