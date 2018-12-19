package com.example.guill.calculatrice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView calculatrice;
    private EditText op1;
    private EditText op2;
    private Button plus;
    private Button moins;
    private Button div;
    private Button fois;
    private TextView resultat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.op1 = findViewById(R.id.op1);
        this.op2 = findViewById(R.id.op2);
        this.plus = findViewById(R.id.plus);
        this.moins = findViewById(R.id.moins);
        this.div = findViewById(R.id.div);
        this.fois = findViewById(R.id.fois);
        this.resultat = findViewById(R.id.resultat);
    }

    public void addition(View view){
        float memoire = Float.parseFloat(op1.getText().toString());
        String total = String.valueOf(memoire + Float.parseFloat(this.op2.getText().toString()));
        this.resultat.setText(total);
    }
    public void soustraction(View view){
        float memoire = Float.parseFloat(op1.getText().toString());
        String total = String.valueOf(Float.parseFloat(this.op2.getText().toString()) - memoire);
        this.resultat.setText(total);
    }
    public void division(View view){
        if(this.op2.getText().toString().equals("0")){
            Log.e("erreur", "if******************************************");
            this.resultat.setText("erreur");
        }
        else {

            float memoire = Float.parseFloat(op1.getText().toString());
            String total = String.valueOf(Float.parseFloat(this.op2.getText().toString()) / memoire);
            this.resultat.setText(total);
        }
    }
    public void multiplication(View view){
        float memoire = Float.parseFloat(op1.getText().toString());
        String total = String.valueOf(memoire * Float.parseFloat(this.op2.getText().toString()));
        this.resultat.setText(total);
    }
}
