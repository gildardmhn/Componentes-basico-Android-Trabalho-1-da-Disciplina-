package dadm.quixada.ufc.trabalhocomponentes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

public class GridActivity extends AppCompatActivity {

    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);

        int[] lista = new int[]{R.drawable.broly11, R.drawable.goku11, R.drawable.gogeta11, R.drawable.vegeta11,
                R.drawable.broly11, R.drawable.goku11, R.drawable.gogeta11, R.drawable.vegeta11,
                R.drawable.broly11, R.drawable.goku11, R.drawable.gogeta11, R.drawable.vegeta11,
                R.drawable.broly11, R.drawable.goku11, R.drawable.gogeta11, R.drawable.vegeta11};


        gridView = (GridView)findViewById(R.id.gridView1);

    }
}
