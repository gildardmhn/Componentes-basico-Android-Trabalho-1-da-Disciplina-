package dadm.quixada.ufc.trabalhocomponentes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class RadioButtonActivity extends AppCompatActivity {

    RadioButton radioButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button);

    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radio_um:
                if (checked)
                    radioButton = findViewById(R.id.radio_um);
                    Toast.makeText(this, "Você selecionou: " + radioButton.getText(), Toast.LENGTH_SHORT).show();
                    break;
            case R.id.radio_dois:
                if (checked)
                    radioButton = findViewById(R.id.radio_dois);
                    Toast.makeText(this, "Você selecionou: " + radioButton.getText(), Toast.LENGTH_SHORT).show();
                    break;
            case R.id.radio_tres:
                if (checked)
                    radioButton = findViewById(R.id.radio_tres);
                Toast.makeText(this, "Você selecionou: " + radioButton.getText(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.radio_outro:
                if (checked)
                    radioButton = findViewById(R.id.radio_outro);
                Toast.makeText(this, "Você selecionou: " + radioButton.getText(), Toast.LENGTH_SHORT).show();
                break;
        }

    }

}
