package com.example.pedra_papel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class principal extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

    }

    //exibir a tela do final
    public void fechar (View view){
        Intent itent = new Intent(getApplicationContext(), fim.class);
        startActivity(itent);
   }

    //voltar para área inicial
    public void area_inicial(View view){
        Intent itent = new Intent(getApplicationContext(), principal.class);
        startActivity(itent);
    }

    public void pedra(View view){
        this.opccao("pedra");
    }

    public void papel(View view){
        this.opccao("papel");
    }

    public void tesoura (View view){
        this.opccao("tesoura");
    }

    public void opccao(String opccao){
        ImageView imgresult = findViewById(R.id.imgresult);
        TextView resultado = findViewById(R.id.resultado);

        int numero = new Random().nextInt(3);
        String [] opccoes = {"pedra" , "papel" , "tesoura" };

        String selecao = opccoes[numero];

        if(selecao == "pedra")
            imgresult.setImageResource(R.drawable.pedra);
        else if(selecao == "papel")
            imgresult.setImageResource(R.drawable.papel);
        else if(selecao == "tesoura")
            imgresult.setImageResource(R.drawable.tesoura);

        //APP GANHA.
        if((selecao == "pedra" && opccao == "tesoura") || (selecao == "tesoura" && opccao=="papel") || (selecao=="papel" && opccao=="pedra")) //Validação do app
            resultado.setText("Você Perdeu!");
        //USUARIO GANHA
         else if ((selecao == "tesoura" && opccao == "pedra") || (selecao == "papel" && opccao=="tesoura") || (selecao=="pedra" && opccao=="papel"))
            resultado.setText("Você Ganhou!!");

         //AQUI ACONTECE O EMPATE
         else
            resultado.setText("Empate");
    }


}