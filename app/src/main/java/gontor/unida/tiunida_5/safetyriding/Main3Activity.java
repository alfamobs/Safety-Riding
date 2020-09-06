package gontor.unida.tiunida_5.safetyriding;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void celana(View view) {
        Intent intent = new Intent(Main3Activity.this, celana.class);
        startActivity(intent);
    }

    public void helm(View view) {
        Intent intent = new Intent(Main3Activity.this, helm.class);
        startActivity(intent);
    }

    public void jaket(View view) {
        Intent intent = new Intent(Main3Activity.this, jaket.class);
        startActivity(intent);
    }

    public void sarungtangan(View view) {
        Intent intent = new Intent(Main3Activity.this, sarungtangan.class);
        startActivity(intent);
    }

    public void sepatu(View view) {
        Intent intent = new Intent(Main3Activity.this, sepatu.class);
        startActivity(intent);
    }
}
