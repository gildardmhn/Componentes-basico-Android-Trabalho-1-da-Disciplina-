package dadm.quixada.ufc.trabalhocomponentes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LongClickActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_long_click);
    }

    public void onClickVoltar(View view){
        finish();
    }
}
