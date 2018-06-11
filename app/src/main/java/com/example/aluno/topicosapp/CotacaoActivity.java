package com.example.aluno.topicosapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CotacaoActivity extends AppCompatActivity {


    private EditText valor;
    private EditText cotacao;
    private Button calcular;
    private Double reais;
    private TextView conversao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cotacao);

        valor = (EditText) findViewById(R.id.editTextValor);
        cotacao = (EditText) findViewById(R.id.editTextCotacao);
        calcular = (Button) findViewById(R.id.buttonCalcular);
        conversao = (TextView) findViewById(R.id.textConversao);

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double reais = Double.parseDouble(valor.getText().toString());
                double dolar = Double.parseDouble(cotacao.getText().toString());
                double valorReal = reais*dolar;
                conversao.setText("O valor em dólar é: "+valorReal);





            }
        });


    }
}
