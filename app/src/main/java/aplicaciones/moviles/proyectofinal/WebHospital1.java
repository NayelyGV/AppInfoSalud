package aplicaciones.moviles.proyectofinal;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class WebHospital1 extends AppCompatActivity {

    //WebView webView;
   // String url = "https://developer.android.com/reference/android/webkit/WebView";

    //WebSettings settings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_hospital1);

       // webView = findViewById(R.id.webhospital1);
        WebView webView=findViewById(R.id.webhospital1);
        webView.loadUrl("https://clinicafoianini.com");
    }
}