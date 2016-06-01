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
        //    DbPruebaHelper.getInstance().insertCategoria("categoria 1");
        //    DbPruebaHelper.getInstance().insertCategoria("categoria 2");
        //    DbPruebaHelper.getInstance().insertCategoria("categoria 3");
        List<Categoria> categorias = DbPruebaHelper.getInstance().getCategoria();

        ListView listView = (ListView) findViewById(R.id.listView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_expandable_list_item_1,
                categorias;
        );
        listView.setAdapter(arrayAdapter);
                    }
}
