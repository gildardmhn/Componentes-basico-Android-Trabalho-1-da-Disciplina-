package dadm.quixada.ufc.trabalhocomponentes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class ArrayListActivity extends AppCompatActivity {

    ArrayList<Pessoa> pessoas;
    Integer id = 0;
    EditText edtNome;
    EditText edtSobrenome;
    EditText edtIdade;
    EditText edtTelefone;
    TextView txtViewPessoas;
    String minhasPessoas = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_array_list);

        pessoas = new ArrayList<>();

        edtNome = (EditText) findViewById(R.id.editTextNome);
        edtSobrenome = (EditText) findViewById(R.id.editTextSobrenome);
        edtIdade = (EditText) findViewById(R.id.editTextIdade);
        edtTelefone = (EditText) findViewById(R.id.editTextTelefone);
        txtViewPessoas = (TextView) findViewById(R.id.textViewListaPessoas);
    }

    public void onClickAdicionar(View view){
        Pessoa pessoa = new Pessoa();
        id++;
        pessoa.setId(id);
        pessoa.setNome(edtNome.getText().toString());
        pessoa.setSobrenome(edtSobrenome.getText().toString());
        pessoa.setIdade(edtIdade.getText().toString());
        pessoa.setTelefone(edtTelefone.getText().toString());

        if(pessoas.add(pessoa)){
            edtNome.setText("");
            edtSobrenome.setText("");
            edtIdade.setText("");
            edtTelefone.setText("");
        }

        for(Pessoa pes : pessoas){
            minhasPessoas+= " ID: " + pes.getId() + "\n Nome: "+pes.getNome() + "\n Sobrenome: "+pes.getSobrenome()
                    + "\n Idade: "+pes.getIdade() + "\n Telefone: " +pes.getTelefone()+ "\n \n";
        }
        txtViewPessoas.setText(minhasPessoas);
    }

    public void onClickFechar(View view){
        finish();
    }
}
