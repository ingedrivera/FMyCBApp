package mx.uach.fm.fmycbapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override//Declaracion Inicial para acceder a Pagina Ppal al crear la App
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView viewconf = (WebView) findViewById(R.id.wv_ppal);
        viewconf.getSettings().setJavaScriptEnabled(true);
        viewconf.getSettings().setBuiltInZoomControls(true);
        viewconf.loadUrl("http://uach.mx");

// Rutina para que navegue dentro de el mismo WebView sin llamar aplicaciones externas.
        viewconf.setWebViewClient(new WebViewClient(){

            public boolean shouldOverriceUrlLoading(WebView view, String url){
                return false;
            }


        });
        //Fin de Rutina
        
    }
/*************************************************************************************/
 /*             Cambios de cada seccion segun el elemento clickeado                  */
 /************************************************************************************/
 public void onClickNoticias(View view){
        WebView viewconf = (WebView) findViewById(R.id.wv_ppal);
        Toast.makeText(MainActivity.this, "Cargando...", Toast.LENGTH_LONG).show();
        viewconf.loadUrl("http://uach.mx");

    }

    public void onClickAvisos(View view){
        WebView viewconf = (WebView) findViewById(R.id.wv_ppal);
        Toast.makeText(MainActivity.this, "Cargando...", Toast.LENGTH_LONG).show();
        viewconf.loadUrl("http://fmycb-avisos.blogspot.mx/");

    }
    public void onClickVideos(View view){
        WebView viewconf = (WebView) findViewById(R.id.wv_ppal);
        Toast.makeText(MainActivity.this, "Cargando...", Toast.LENGTH_LONG).show();
        viewconf.loadUrl("https://www.youtube.com/playlist?list=PLjdzuORisgK8lIj_2GqgEzoKl7fqjVzl6");

    }
    public void onClickEventos(View view){
        WebView viewconf = (WebView) findViewById(R.id.wv_ppal);
        Toast.makeText(MainActivity.this, "Cargando...", Toast.LENGTH_LONG).show();
        viewconf.loadUrl("https://calendar.google.com/calendar/embed?src=5nfsubjh30mc0mejj7uv2b43k0%40group.calendar.google.com&ctz=America/Mazatlan");

    }

/****************************** Fin de Seccion de Cambios*************************************/

}
