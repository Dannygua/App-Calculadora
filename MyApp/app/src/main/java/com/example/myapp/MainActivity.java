package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private EditText text1;
    private EditText text2;
    private TextView view1;
    private Spinner spinner1;
    private String Simbolo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text1=(EditText)findViewById(R.id.numero3);
        text2=(EditText)findViewById(R.id.numero2);
        view1=(TextView)findViewById(R.id.Resultado2);
        spinner1=findViewById(R.id.lista2);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.operaciones, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter);
        spinner1.setOnItemSelectedListener(this);

    }


    public void operaciones2 (View view){
        switch (Simbolo){
            case"Cos":
                cose();
                break;
            case"Sen":
                seno();
                break;
            case"Tan":
                tang();
                break;
            case"CosH":
                coseh();
                break;
            case"SenH":
                senoh();
                break;
            case"TanH":
                tangh();
                break;
            case"Suma":
                sumar();
                break;
            case"Resta":
                resta();
                break;
            case"Multiplicacion":
                multiplicacion();
                break;
            case"Division":
                Division();
                break;
            case"Potencia":
                potencia();
                break;
            case"Raiz":
                raiz();
                break;
            default:
        }
    }

    public void cose(){
        String valor1=text1.getText().toString();
        int nro1=Integer.parseInt(valor1);
        double cose = Math.cos(nro1);
        String result=String.valueOf(cose);
        view1.setText(result);
    }

    public void seno(){
        String valor1=text1.getText().toString();
        int nro1=Integer.parseInt(valor1);
        double seno = Math.sin(nro1);
        String result=String.valueOf(seno);
        view1.setText(result);
    }

    public void tang(){
        String valor1=text1.getText().toString();
        int nro1=Integer.parseInt(valor1);
        double tang = Math.tan(nro1);
        String result=String.valueOf(tang);
        view1.setText(result);
    }

    public void coseh(){
        String valor1=text1.getText().toString();
        int nro1=Integer.parseInt(valor1);
        double coseh = Math.cosh(nro1);
        String result=String.valueOf(coseh);
        view1.setText(result);
    }

    public void senoh(){
        String valor1=text1.getText().toString();
        int nro1=Integer.parseInt(valor1);
        double senoh = Math.sinh(nro1);
        String result=String.valueOf(senoh);
        view1.setText(result);
    }

    public void tangh(){
        String valor1=text1.getText().toString();
        int nro1=Integer.parseInt(valor1);
        double tangh = Math.tanh(nro1);
        String result=String.valueOf(tangh);
        view1.setText(result);
    }

    public void raiz(){
        String valor1=text1.getText().toString();
        int nro1=Integer.parseInt(valor1);
        double raiz = Math.sqrt(nro1);
        String result=String.valueOf(raiz);
        view1.setText(result);
    }


    public void sumar(){
        String valor1=text1.getText().toString();
        String valor2=text2.getText().toString();
        int nro1=Integer.parseInt(valor1);
        int nro2=Integer.parseInt(valor2);
        double  suma=nro1+nro2;
        String result=String.valueOf(suma);
        view1.setText(result);

    }

    public void resta(){
        String valor1=text1.getText().toString();
        String valor2=text2.getText().toString();
        int nro1=Integer.parseInt(valor1);
        int nro2=Integer.parseInt(valor2);
        double  suma=nro1-nro2;
        String result=String.valueOf(suma);
        view1.setText(result);

    }

    public void multiplicacion(){
        String valor1=text1.getText().toString();
        String valor2=text2.getText().toString();
        int nro1=Integer.parseInt(valor1);
        int nro2=Integer.parseInt(valor2);
        double  suma=nro1*nro2;
        String result=String.valueOf(suma);
        view1.setText(result);

    }

    public void Division(){
        String valor1=text1.getText().toString();
        String valor2=text2.getText().toString();
        int nro1=Integer.parseInt(valor1);
        int nro2=Integer.parseInt(valor2);
        double suma=nro1/nro2;
        String result=String.valueOf(suma);
        view1.setText(result);

    }

    public void potencia(){
        String valor1=text1.getText().toString();
        String valor2=text2.getText().toString();
        int nro1=Integer.parseInt(valor1);
        int nro2=Integer.parseInt(valor2);
        double suma=Math.pow(nro1,nro2);
        String result=String.valueOf(suma);
        view1.setText(result);

    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        Toast.makeText(parent.getContext(),
                "Seleccionar: " +parent.getItemAtPosition(position).toString(),Toast.LENGTH_LONG ).show();
        Simbolo =parent.getItemAtPosition(position).toString();

        if(Simbolo.equals("Suma")||Simbolo.equals("Resta")||Simbolo.equals("Multiplicacion")||Simbolo.equals("Division")||Simbolo.equals("Potencia")){
            text2.setVisibility(View.VISIBLE);
        }else{
            text2.setVisibility(View.INVISIBLE);
        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}