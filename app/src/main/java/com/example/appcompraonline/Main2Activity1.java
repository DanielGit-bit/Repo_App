package com.example.appcompraonline;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Main2Activity1 extends AppCompatActivity {
    private ListView lvItems;
    private Adaptador adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main21);
        lvItems=(ListView) findViewById(R.id.lv_items);
        adaptador=new Adaptador(this,GetArrayItems());
        lvItems.setAdapter(adaptador);
    }
    private ArrayList<Entidades>GetArrayItems(){
        ArrayList<Entidades>listItems=new ArrayList<>();
        listItems.add(new Entidades(R.drawable.bebida,"Bebida Coca-Cola 2L","$1950"));
        listItems.add(new Entidades(R.drawable.cristal,"Cerveza Cristal 1L","$1950"));
        listItems.add(new Entidades(R.drawable.fanta3,"Bebida Fanta 3L","$1950"));
        listItems.add(new Entidades(R.drawable.watts,"Jugo natural Watts","$1950"));
        listItems.add(new Entidades(R.drawable.mantequilla,"Mantequilla Soprole ","$690"));
        listItems.add(new Entidades(R.drawable.next,"Margarina Next ","$690"));
        listItems.add(new Entidades(R.drawable.mortadela,"Mortadela San Jorge ","$690"));
        listItems.add(new Entidades(R.drawable.quesocolun,"Queso Colun ","$690"));
        listItems.add(new Entidades(R.drawable.salame,"Salame PF","$1950"));
        listItems.add(new Entidades(R.drawable.mermeladawatts,"Mermelada mora Watts","$1950"));
        listItems.add(new Entidades(R.drawable.yogurt,"Yogurt Bolsa frutilla Soprole","$1950"));
        listItems.add(new Entidades(R.drawable.lechenatural,"Leche natural Soprole","$1950"));
        listItems.add(new Entidades(R.drawable.huevos,"Bandeja huevos 12","$1950"));
        listItems.add(new Entidades(R.drawable.avena,"Avena Quaker","$1950"));
        listItems.add(new Entidades(R.drawable.milo,"Cereal Milo","$1950"));
        listItems.add(new Entidades(R.drawable.hamburguesa,"Hamburguesa La crianza","$1950"));
        listItems.add(new Entidades(R.drawable.vienesas,"Vienesas 20U San Jorge","$1950"));
        listItems.add(new Entidades(R.drawable.carnemolida,"Carne molida SuperCerdo","$1950"));
        listItems.add(new Entidades(R.drawable.bistec,"3 Bistec Vacuno","$1950"));
        listItems.add(new Entidades(R.drawable.papasfritas,"Papa fritas 'MinutoVerde'","$1950"));
        listItems.add(new Entidades(R.drawable.verduras,"Bebida Coca-Cola 2L","$1950"));
        listItems.add(new Entidades(R.drawable.arvejas,"Bebida Coca-Cola 2L","$1950"));
        listItems.add(new Entidades(R.drawable.choclo,"Bebida Coca-Cola 2L","$1950"));
        listItems.add(new Entidades(R.drawable.tallarines,"Bebida Coca-Cola 2L","$1950"));
        listItems.add(new Entidades(R.drawable.porotos,"Bebida Coca-Cola 2L","$1950"));
        listItems.add(new Entidades(R.drawable.lentejas,"Bebida Coca-Cola 2L","$1950"));
        listItems.add(new Entidades(R.drawable.garbanzos,"Bebida Coca-Cola 2L","$1950"));
        listItems.add(new Entidades(R.drawable.choclo,"Bebida Coca-Cola 2L","$1950"));
        listItems.add(new Entidades(R.drawable.arroz,"Bebida Coca-Cola 2L","$1950"));
        return listItems;
    }
}
