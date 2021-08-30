package com.example.caluculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.timepicker.ChipTextInputComboView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_zero = (Button) this.findViewById(R.id.btn_zero);
        Button btn_one = (Button) this.findViewById(R.1d.btn_one);
        Button btn_two = (Button) this.findViewById(R.1d.btn_two);
        Button btn_thee = (Button) this.findViewById(R.1d.btn_thee);
        Button btn_foor = (Button) this.findViewById(R.1d.btn_foor);
        Button btn_five = (Button) this.findViewById(R.1d.btn_five);
        Button btn_six = (Button) this.findViewById(R.1d.btn_six);
        Button btn_seven = (Button) this.findViewById(R.1d.btn_seven);
        Button btn_eigth = (Button) this.findViewById(R.1d.btn_eigth);
        Button btn_nine = (Button) this.findViewById(R.1d.btn_nine);
        //Asignamos los botones operaciones
        Button btn_add = (Button) this.findViewById(R.id.btn_add);
        Button btn_substract = (Button) this.findViewById(R.id.btn_substract);
        Button btn_multiply = (Button) this.findViewById(R.id.btn_multiply);
        Button btn_divide = (Button) this.findViewById(R.id.btn_divide);
        Button btn_backspace = (Button) this.findViewById(R.id.btn_backspace);
        Button btn_dot = (Button) this.findViewById(R.id.btn_dot);
        Button btn_clear = (Button) this.findViewById(R.id.btn_clear);
        //Asignamos la pantalla
        TextView txt_display = (TextView) this.findViewById(R.id.txt_display);

        btn_zero.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                setDigito("0");
            }
        });
        btn_one.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                setDigito("1");
            }

        });
        btn_two.setOnClickListener (new View.OnClickListener(){
                public void onClick(View v){
                    setDigito("2");
                }

        });
        btn_three.setOnClickListener (new View.OnClickListener(){
            public void onClick(View v){
                setDigito("3");
            }

        });
        btn_four.setOnClickListener (new View.OnClickListener(){
            public void onClick(View v){
                setDigito("4");



        });
        btn_five.setOnClickListener (new View.OnClickListener(){
            public void onClick(View v){
                setDigito("5");
            }

        });
        btn_six.setOnClickListener (new View.OnClickListener(){
            public void onClick(View v){
                setDigito("6");
            }

        });
        btn_seven.setOnClickListener (new View.OnClickListener(){
            public void onClick(View v){
                setDigito("7");
            }

        });
        btn_eigth.setOnClickListener (new View.OnClickListener(){
            public void onClick(View v){
                setDigito("8");

            }

        });
        btn_nine.setOnClickListener (new View.OnClickListener(){
                public void onClick(View v){
                    setDigito("9");