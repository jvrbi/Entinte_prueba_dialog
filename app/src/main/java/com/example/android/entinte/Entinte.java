package com.example.android.entinte;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.Button;
import android.widget.Toast;
import com.example.android.entinte.ExampleDialog2;
import com.example.android.entinte.PedidoEntinte;
import com.example.android.entinte.PedidoEntinteAdapter;



import java.util.ArrayList;

public class Entinte extends AppCompatActivity implements View.OnClickListener, ExampleDialog2.ExampleDialogListener {

    private Spinner spinner_entonador;
    private  String nuevo_entonador;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entinte);

        //spinner_entonador = (Spinner) findViewById(R.id.spinner_entonadores);


        final ArrayList<PedidoEntinte> entinte = new ArrayList<PedidoEntinte>();

        //pedidos.add("Entregas");
        //pedidos.add("18050001");
        //pedidos.add(new Pedidos('18050001, Alejandro Hernández, alejandro.hernandez@nervion.com.mx, Cliente 1, 43256'));
        entinte.add(new PedidoEntinte(1,18110439,"POLYNER 75 COLOR PASTEL","BEIGE SEGUN MUESTRA", "CUBETA 10",3, "10/10/2018", "11/10/2018", "Por verificar", "0", "Geovannie" ));
        entinte.add(new PedidoEntinte(2,18110440,"POLYNER 75 GRIS ENTONADO","GRIS RATA", "BOTE 4",4, "11/10/2018", "", "Pendiente", "0", "" ));
        entinte.add(new PedidoEntinte(3,18110448,"ACRYNER 15 AZUL ENTONADO","AZUL ALBERCA", "CUBETA 20",1, "13/10/2018", "13/10/2018", "Por verificar", "0", "Julio" ));
        entinte.add(new PedidoEntinte(4,18110449,"NERVION 50 AMARILLO ENTONADO","AMARILLO TRAFICO", "CUBETA 20",1, "13/10/2018", "13/10/2018", "Por verificar", "0", "Toño" ));
        entinte.add(new PedidoEntinte(5,18110455,"POLYNER 75 GRIS ENTONADO","GRIS CEMEX", "BOTE 1",4, "15/10/2018", "", "Pendiente", "0", "" ));



        final PedidoEntinteAdapter entinteadapter = new PedidoEntinteAdapter(this, entinte);

        final ListView listView = findViewById(R.id.lvPedidoEntinte);

        listView.setAdapter(entinteadapter);



        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                PedidoEntinte position2 = entinte.get((int) id);
                PedidoEntinte id2 = entinte.get(position);

                // When clicked, show a toast with the TextView text, http://fundoocode.net/android-listview-checkbox-example-onitemclicklistener-and-onclicklistener/
                PedidoEntinte estePedido = (PedidoEntinte) parent.getItemAtPosition(position);
//                Toast.makeText(getApplicationContext(),"Clicked on Row: " + esteModulo.getNombreModulo(), Toast.LENGTH_LONG).show();
                String EntonadorDeEstePedido = (estePedido.getmPersonaAsignada());
                //esteSurtido







                    openDialog();
                    // applyText();

                    Toast.makeText(Entinte.this,position2.toString(),Toast.LENGTH_LONG).show();

                    estePedido.setmPersonaAsignada("Otro");







            }
        });





    }


    public final void openDialog() {
        ExampleDialog2 exampleDialog = new ExampleDialog2();
        exampleDialog.show(getSupportFragmentManager(),"example dialog");
    }


    @Override
    public void onClick(View v) {

    }

    @Override
    public void applyText(String codigo_barras) {

    }
}
