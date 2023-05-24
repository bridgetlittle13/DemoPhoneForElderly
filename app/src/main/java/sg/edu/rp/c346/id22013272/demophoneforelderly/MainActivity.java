package sg.edu.rp.c346.id22013272.demophoneforelderly;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView btncallson;
    TextView btncalldaughter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btncallson=findViewById(R.id.buttonCallSon);
        btncalldaughter=findViewById(R.id.buttonCallDaughter);

        btncallson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentCall = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+92240336));
                startActivity(intentCall);
            }

        });
        btncalldaughter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentCall1 = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+89675543));
                startActivity(intentCall1);
            }
        });
    }
}