package br.edu.ifsp.scl.sdm.ciclodevida;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.util.Log;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // TAG para o filtro no LOGCAT
    private final String CDV_LOGCAT_TAG = "CDV_LOGCAT_TAG";

    // Views dinâmicas
    private TextView telefoneTextView ;
    private EditText telefoneEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Iniciando ciclo de vida completo
        Log.v(CDV_LOGCAT_TAG, "onCreate: Iniciado ciclo COMPLETO");

        // Views dinâmicas
        telefoneTextView = new TextView(this);
        telefoneTextView.setText("Telefone");
        telefoneEditText = new EditText(this);
        telefoneEditText.setInputType(InputType.TYPE_CLASS_PHONE);

        LinearLayout linearLayout = findViewById(R.id.linearLayout);
        linearLayout.addView(telefoneTextView);
        linearLayout.addView(telefoneEditText);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        // Salvar os dados de estado dinâmicos
        outState.putString("TELEFONE", telefoneEditText.getText().toString());
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        // Restaurando dados de estado dinâmicos de execução anterior
        if (savedInstanceState != null) {
            String telefone = savedInstanceState.getString("TELEFONE", null);
            if (telefone != null) {
                telefoneEditText.setText(telefone);
            }
        }
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
