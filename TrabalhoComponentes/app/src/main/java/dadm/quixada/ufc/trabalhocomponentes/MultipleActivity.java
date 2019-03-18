package dadm.quixada.ufc.trabalhocomponentes;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.net.Inet4Address;

public class MultipleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiple);
    }

    public void onLongClick(View view){
        Intent intent =  new Intent(this, LongClickActivity.class);
        startActivity(intent);
    }

    public void onMainActivityClick(View view){
        Intent intent =  new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    public void onTabbed(View view){
        Intent intent = new Intent(this, TabbedActivity.class);
        startActivity(intent);
    }

    public void onClickListView(View view){
        Intent intent = new Intent(this, ListViewActivity.class);
        startActivity(intent);
    }

    public void onClickMusica(View view){
        Intent intent = new Intent(this, MediaActivity.class);
        startActivity(intent);
    }
}
