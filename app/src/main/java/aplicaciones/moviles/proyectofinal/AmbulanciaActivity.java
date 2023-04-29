package aplicaciones.moviles.proyectofinal;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class AmbulanciaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ambulancia);



        Button llamarambulancia1 = findViewById(R.id.llamarabulancias1);
        llamarambulancia1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:+59133362211"));
                startActivity(intent);
            }

        });

        Button llamarambulancia2 = findViewById(R.id.llamarambulancia2);
        llamarambulancia2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:+59133467666"));
                startActivity(intent);
            }

        });


        Button llamarambulancia3 = findViewById(R.id.llamarambulancia3);
        llamarambulancia3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:+59133520444"));
                startActivity(intent);
            }
        });
        Button llamarambulancia4 = findViewById(R.id.llamarambulancia4);
        llamarambulancia4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:+59133366969"));
                startActivity(intent);
            }
        });
        Button llamarambulancia5 = findViewById(R.id.llamarambulancia5);
        llamarambulancia5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:+59133352866"));
                startActivity(intent);
            }
        });
        Button llamarambulancia6 = findViewById(R.id.llamarambulancia6);
        llamarambulancia6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:+59133393354"));
                startActivity(intent);
            }
        });
        Button llamarambulancia7 = findViewById(R.id.llamarambulancia7);
        llamarambulancia7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:+59133462031"));
                startActivity(intent);
            }
        });


    }
}