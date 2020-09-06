package gontor.unida.tiunida_5.safetyriding;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main6Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
    }

    public void membujur(View view) {
        Intent intent = new Intent(Main6Activity.this, membujur.class);
        startActivity(intent);
    }

    public void melintang(View view) {
        Intent intent = new Intent(Main6Activity.this, melintang.class);
        startActivity(intent);
    }

    public void serong(View view) {
        Intent intent = new Intent(Main6Activity.this, serong.class);
        startActivity(intent);
    }

    public void lambang(View view) {
        Intent intent = new Intent(Main6Activity.this, lambang.class);
        startActivity(intent);
    }
}
