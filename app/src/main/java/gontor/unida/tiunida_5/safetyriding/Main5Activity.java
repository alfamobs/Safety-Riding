package gontor.unida.tiunida_5.safetyriding;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
    }

    public void peringatan(View view) {
        Intent intent = new Intent(Main5Activity.this, peringatan.class);
        startActivity(intent);
    }

    public void larangan(View view) {
        Intent intent = new Intent(Main5Activity.this, larangan.class);
        startActivity(intent);
    }

    public void perintah(View view) {
        Intent intent = new Intent(Main5Activity.this, perintah.class);
        startActivity(intent);
    }

    public void petunjuk(View view) {
        Intent intent = new Intent(Main5Activity.this, petunjuk.class);
        startActivity(intent);
    }

    public void papantambahan(View view) {
        Intent intent = new Intent(Main5Activity.this, papantambahan.class);
        startActivity(intent);
    }

    public void nomorrute(View view) {
        Intent intent = new Intent(Main5Activity.this, nomorrute.class);
        startActivity(intent);
    }
}
