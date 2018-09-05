package com.example.danielbustamante.futboleta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class FutboletaActivity extends AppCompatActivity {

    private String mail, pass, correo, contra;
   String close ="";



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();


        switch (id){
            case R.id.mperfil:
               Intent intent2 = new Intent(FutboletaActivity.this, PerfilActivity.class);

                intent2.putExtra("correo", correo);
                intent2.putExtra("pass", contra);
                startActivityForResult(intent2,456);

                break;
            case R.id.mcerrarsecion:
                Intent intent1 =new Intent();

                intent1.putExtra("correo", correo);
                intent1.putExtra("pass", contra);

                setResult(RESULT_OK, intent1);
                finish();
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 456 &&   resultCode == RESULT_OK){
            Intent intent1 =new Intent();

            intent1.putExtra("correo", correo);
            intent1.putExtra("pass", contra);

            setResult(RESULT_OK, intent1);
            finish();

        }




    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_futboleta);

            Intent intent = getIntent();
            correo = intent.getStringExtra("correo");
            contra = intent.getStringExtra("pass");
        }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        finish();
    }
}
