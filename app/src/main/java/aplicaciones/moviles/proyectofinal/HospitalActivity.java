package aplicaciones.moviles.proyectofinal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class HospitalActivity extends AppCompatActivity {

    ListView listView;

    String mTitle [] = {"CLÍNICA FOIANINI",
            "CLÍNICA BUENA SALUD",
            "CLÍNICA INCOR",
            "CLÍNICA NIÑO JESÚS",
            "HOSPITAL SAN JUAN DE DIOS",
            "HOSPITAL OBRERO",
            "HOSPITAL JAPONES"
    };

    String mDescription [] ={"Presione paravisitar el sitio web",
            "Presione para visitar el sitio web",
            "Presione para visitar el sitio web",
            "Presione para visitar el sitio web",
            "Presione para visitar el sitio web",
            "Presione para visitar el sitio web",
            "Presione para visitar el sitio web"};

    int image[] = {R.drawable.clinica_foianini,
            R.drawable.clinica_buena_salud,
            R.drawable.clinica_incor,
            R.drawable.hospital_de_ninos,
            R.drawable.hospital_san_juan_de_dios,
            R.drawable.hospital_obrero,
            R.drawable.hospital_japones};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital);

        listView = findViewById(R.id.listView);

        MyAdapter adapter = new MyAdapter(this,mTitle,mDescription,image);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position==0){
                    Intent intent = new Intent(HospitalActivity.this, WebHospital1.class);
                    startActivity(intent);
                    Toast.makeText(HospitalActivity.this,"Cargando...",Toast.LENGTH_SHORT).show();
                    //class
                }
                if(position==1){
                    Intent intent = new Intent(HospitalActivity.this, WebHospital1.class);
                    startActivity(intent);
                    Toast.makeText(HospitalActivity.this,"Cargando...",Toast.LENGTH_SHORT).show();
                    // class
                }
                if(position==2){
                    Intent intent = new Intent(HospitalActivity.this, WebHospital1.class);
                    startActivity(intent);
                    Toast.makeText(HospitalActivity.this,"Cargando...",Toast.LENGTH_SHORT).show();
                    // class
                }
                if(position==3){
                    //class
                    Intent intent = new Intent(HospitalActivity.this, WebHospital1.class);
                    startActivity(intent);
                    Toast.makeText(HospitalActivity.this,"Cargando...",Toast.LENGTH_SHORT).show();
                }
                if ((position == 4)) {
                    Intent intent = new Intent(HospitalActivity.this, WebHospital1.class);
                    startActivity(intent);
                    Toast.makeText(HospitalActivity.this,"Cargando...",Toast.LENGTH_SHORT).show();
                    //class
                }
                if(position==5){
                    Intent intent = new Intent(HospitalActivity.this, WebHospital1.class);
                    startActivity(intent);
                    Toast.makeText(HospitalActivity.this,"Cargando...",Toast.LENGTH_SHORT).show();
                    // class
                }
                if(position==6){
                    //class
                    Intent intent = new Intent(HospitalActivity.this, WebHospital1.class);
                    startActivity(intent);
                    Toast.makeText(HospitalActivity.this,"Cargando...",Toast.LENGTH_SHORT).show();
                }
                if ((position == 7)) {
                    Intent intent = new Intent(HospitalActivity.this, WebHospital1.class);
                    startActivity(intent);
                    Toast.makeText(HospitalActivity.this,"Cargando...",Toast.LENGTH_SHORT).show();
                    //class
                }
            }
        });
    }

    class MyAdapter extends ArrayAdapter<String>{

        Context context;
        String  rTitle[];
        String  rDescription[];
        int rimgs[];

        MyAdapter (Context c, String title[], String description[],int imgs[]){
            super(c,R.layout.row2,R.id.textView1,title);
            this.context = c;
            this.rTitle = title;
            this.rDescription = description;
            this.rimgs = imgs;

        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            View row2 = layoutInflater.inflate(R.layout.row2,parent,false);

            ImageView images = row2.findViewById(R.id.image);

            TextView myTitle = row2.findViewById(R.id.textView1);

            TextView myDescription = row2.findViewById(R.id.textView2);

            images.setImageResource(rimgs[position]);
            myTitle.setText(rTitle[position]);
            myDescription.setText(rDescription[position]);


            return row2;
        }
    }
}