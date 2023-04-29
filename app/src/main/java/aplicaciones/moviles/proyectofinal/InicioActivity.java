package aplicaciones.moviles.proyectofinal;
import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class InicioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        ImageButton button = findViewById(R.id.ambulance);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(InicioActivity.this, AmbulanciaActivity.class);
                startActivity(intent);
            }
        });

        ImageButton button1 = findViewById(R.id.pills);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(InicioActivity.this, EnfermedadActivity.class);
                startActivity(intent);
            }
        });

        ImageButton button2 = findViewById(R.id.nearme);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(InicioActivity.this, HospitalActivity.class);
                startActivity(intent);
            }
        });

        ImageButton button3 = findViewById(R.id.aboutus);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(InicioActivity.this, AboutActivity.class);
                startActivity(intent);
            }
        });


    }
}
