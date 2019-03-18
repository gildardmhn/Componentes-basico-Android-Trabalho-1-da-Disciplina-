package dadm.quixada.ufc.trabalhocomponentes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.PopupMenu;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    ToggleButton toggleBtn;
    TextView txtView;
    EditText edtTextCountLog;
    Integer count = 0;
    AutoCompleteTextView autcompleteCountries;
    Spinner spinnerNumeros;
    Toolbar myToolbar;
    Button popUpButton;


    private final String[] paises = new String[]{
      "Benin", "Brazil", "France", "Belgium", "Argentina"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toggleBtn = (ToggleButton) findViewById(R.id.toggleButton);

        txtView = (TextView) findViewById(R.id.textViewToggle);
        edtTextCountLog = (EditText) findViewById(R.id.editTextCountLog);

        //Autocomplete
        autcompleteCountries = (AutoCompleteTextView) findViewById(R.id.autoCompPaises);
        ArrayAdapter<String> adapterAutoComplete = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, paises);
        autcompleteCountries.setAdapter(adapterAutoComplete);

        //Spinner
        spinnerNumeros = (Spinner) findViewById(R.id.spinnerNumId);
        ArrayAdapter<CharSequence> adapterSpinner = ArrayAdapter.createFromResource(this, R.array.numeros, android.R.layout.simple_spinner_item);
        adapterSpinner.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerNumeros.setAdapter(adapterSpinner);
        spinnerNumeros.setOnItemSelectedListener(this);

        //Toggle
        toggleBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    txtView.setVisibility(View.VISIBLE);
                } else {
                    txtView.setVisibility(View.INVISIBLE);
                }
            }
        });

        //Toolbar
        myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

        //PopupMenu
        popUpButton = (Button) findViewById(R.id.buttonPopup);

        //longClickable
        popUpButton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, LongClickActivity.class);
                startActivity(intent);
                return true;
            }
        });

    }

    public void onClickCount(View view){

        count++;

        if(count == 1){
            edtTextCountLog.setText("Você clicou " + count.toString()+ " vez");
        } else
            edtTextCountLog.setText("Você clicou " + count.toString()+ " vezes");
    }

    public void onClickArrayList(View view){
        Intent intent = new Intent(this, ArrayListActivity.class);
        startActivity(intent);
    }

    public void onClickRadio(View view){
        Intent intent = new Intent(this, RadioButtonActivity.class);
        startActivity(intent);
    }

    public  void onClickMultiple(View view){
        Intent intent = new Intent(this, MultipleActivity.class);
        startActivity(intent);
    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text = parent.getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(), text, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.example_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item1:
                Toast.makeText(this, "Item 1", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.item2:
                Toast.makeText(this, "Item 2", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.item3:
                Toast.makeText(this, "Item 3", Toast.LENGTH_SHORT).show();
                return true;

            default:
                return super.onOptionsItemSelected(item);

        }
    }

    public void showPopup(View view){
        PopupMenu popup = new PopupMenu(this, view);
        MenuInflater inflater = popup.getMenuInflater();
        inflater.inflate(R.menu.example_menu, popup.getMenu());
        popup.show();
    }





}
