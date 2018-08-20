package br.edu.ifsp.scl.sdm.ciclodevida;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    // TAG para o filtro no LOGCAT
    private final String CDV_LOGCAT_TAG = "CDV_LOGCAT_TAG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Iniciando ciclo de vida completo
        Log.v(CDV_LOGCAT_TAG, "onCreate: Iniciado ciclo COMPLETO");
    }

    @Override
    protected void onStart() {
        super.onStart();

        // Iniciando ciclo de vida visível
        Log.v(CDV_LOGCAT_TAG, "onStart: Iniciado ciclo VISÍVEL");
    }

    @Override
    protected void onResume() {
        super.onResume();

        // Iniciando ciclo de vida em primeiro plano
        Log.v(CDV_LOGCAT_TAG, "onResume: Iniciado ciclo em PRIMEIRO PLANO");
    }

    @Override
    protected void onPause() {
        super.onPause();

        // Finalizando o ciclo de vida em primeiro plano
        Log.v(CDV_LOGCAT_TAG, "onPause: Finalizado ciclo em PRIMEIRO PLANO");
    }

    @Override
    protected void onStop() {
        super.onStop();

        // Finalizando o ciclo de vida visível
        Log.v(CDV_LOGCAT_TAG, "onStop: Finalizado ciclo VISÍVEL");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        // Finalizando o ciclo de vida completo
        Log.v(CDV_LOGCAT_TAG, "onDestroy: Finalizado ciclo COMPLETO");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        // Executado antes do onStart
        Log.v(CDV_LOGCAT_TAG, "onRestart: Preparando para executar onStart");
    }
}
