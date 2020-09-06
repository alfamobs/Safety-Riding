package gontor.unida.tiunida_5.safetyriding;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void perlengkapan(View view) {
        Intent intent = new Intent(MainActivity.this, Main3Activity.class);
        startActivity(intent);
    }

    public void safetyriding(View view) {
        Intent intent = new Intent(MainActivity.this, Main4Activity.class);
        startActivity(intent);
    }

    public void rambu(View view) {
        Intent intent = new Intent(MainActivity.this, Main5Activity.class);
        startActivity(intent);
    }

    public void marka(View view) {
        Intent intent = new Intent(MainActivity.this, Main6Activity.class);
        startActivity(intent);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.optionmenu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.about) {
            startActivity(new Intent(this, Main7Activity.class));
        } else if (item.getItemId() == R.id.rating) {
            startActivity(new Intent(this, Main2Activity.class));
        }

        return true;
    }
}
