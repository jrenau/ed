package org.institutoserpis.ed.acategoria;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DbPruebaHelper.init(this);
//        DbPruebaHelper.getInstance().insertCategoria("categoría 1");
//        DbPruebaHelper.getInstance().insertCategoria("categoría 2");
//        DbPruebaHelper.getInstance().insertCategoria("categoría 3");

        List<Categoria> categorias = DbPruebaHelper.getInstance().getCategorias();

        ListView listView = (ListView)findViewById(R.id.listView);
        ArrayAdapter<Categoria> arrayAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                categorias
        );
        listView.setAdapter(arrayAdapter);
    }
}
