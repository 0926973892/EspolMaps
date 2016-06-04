package com.example.dstorres.espolmaps;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.SurfaceView;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.dstorres.espolmaps.load_src.GifRun;


/**
 * Created by dstorres on 27/05/2016.
 */
public class MenuActivity  extends AppCompatActivity {
    Button ib_menu_b = null;
    Button ib_menu_l = null;
    private Intent rutasActivity= null;
    GifRun w;
    SurfaceView v;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        v= (SurfaceView) findViewById(R.id.surfaceView);
        ib_menu_b = (Button)findViewById(R.id.ButtonUbicacion);
        ib_menu_l = (Button)findViewById(R.id.imageButtonLista);
        w = new GifRun();
        w.LoadGiff(v,this,R.drawable.one_piece);

        ib_menu_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MenuActivity.this, "Pulsaste el boton de buscar", Toast.LENGTH_SHORT).show();
            }
        });

        ib_menu_l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rutasActivity = new Intent(MenuActivity.this, rutasActivity.class);
                startActivity(rutasActivity);

            }
        });

        w.LoadGiff(v,MenuActivity.this,R.drawable.one_piece);
    }
}
