package sg.edu.rp.c326.id22015010.p06_demophoneforelderly;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button btnCallSon;
Button btnCallDaughter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCallSon=findViewById(R.id.buttonCallSon);
        btnCallDaughter=findViewById(R.id.buttonCallDaughter);

        btnCallSon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentCall= new Intent(Intent.ACTION_DIAL,
                        Uri.parse("tel:"+92240336));
                startActivity(intentCall);
            }
        });
        btnCallDaughter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentCall= new Intent(Intent.ACTION_DIAL,
                        Uri.parse("tel:"+89675543));
                startActivity(intentCall);
            }
        });
    }
}