package com.example.iossenac.appradio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void tratarOK(View v){

        RadioGroup radioGroupOpcoes = (RadioGroup) findViewById(R.id.radioGroupOpcoes);
        int resposta = radioGroupOpcoes.getCheckedRadioButtonId();
        if (resposta == -1)
            Toast.makeText(this, "Selecione uma opcao!", Toast.LENGTH_SHORT).show();
        else if (resposta == R.id.radioButtonOpcao1)
            Toast.makeText(this, "Resposta certa!", Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(this, "Resposta errada!", Toast.LENGTH_SHORT).show();
    }
}
