package dadm.quixada.ufc.trabalhocomponentes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListViewActivity extends AppCompatActivity {

    ListView listViewContatos;
    ArrayList<String> listaContatos;
    ArrayAdapter adapater;
    int selected;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        selected = -1;

        listaContatos = new ArrayList<String>();
        listaContatos.add("Gildard");
        listaContatos.add("Robson");
        listaContatos.add("Gabriel");
        listaContatos.add("Weliton");
        listaContatos.add("Lilton");

        adapater = new ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1, listaContatos);

        listViewContatos = (ListView) findViewById(R.id.listViewNomes);
        listViewContatos.setAdapter(adapater);
        listViewContatos.setSelector(android.R.color.holo_blue_light);

        listViewContatos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ListViewActivity.this, "" + listaContatos.get(position).toString(), Toast.LENGTH_SHORT).show();
                selected = position;
            }
        });
    }
}
