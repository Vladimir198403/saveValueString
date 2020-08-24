package com.volodin.save;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    private static final String LENG = "LENG";
    String mes;
    TextView textView1;
    String text;
    //String len = textView1.getText().toString();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void send(View view) {// метод передачи значения спинера в вью
        Spinner spinner = (Spinner)findViewById(R.id.spinner);//определил спинер
        textView1 = (TextView)findViewById(R.id.textViewa);// определил вью, в которую положу значение спинера
        mes = String.valueOf(spinner.getSelectedItem());//определил переменную и положил в нее значение, которое было выбрано на спинере
        textView1.setText(mes);//передал это значение во вью
        Log.d("My tag", mes);
    }


    @SuppressLint("ResourceType")
    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
 //      Toast.makeText(getApplicationContext(), "onSaveInstanceState()", Toast.LENGTH_SHORT).show();
       Log.d("My tag", "onSaveInstanceState активити настроек ");
 //       text = textView1.getText().toString();//определил значение переменной, вытянул его из вью и привел к стринге
        text = mes;
        outState.putString(LENG, text); //положил значение переменной в бандл
        Log.d("My tag", "значение переменной равно - " + text);
    }
    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
//        Toast.makeText(getApplicationContext(), "Повторный запуск - onRestoreInstanceState()", Toast.LENGTH_SHORT).show();
        Log.d("My tag", "onRestoreInstanceState активити настроек ");
        text = savedInstanceState.getString(LENG); //восстановил значение переменной по ключу
        Log.d("My tag", "значние переменной после восстановления равно " + text);
        textView1.setText(text);//передал значение переменной во вью
    }
    @Override
    protected void onStart() {
        super.onStart();
//        Toast.makeText(getApplicationContext(), "onStart()", Toast.LENGTH_SHORT).show();
       Log.d("My tag", "onStart активити настроек ");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
//        Toast.makeText(getApplicationContext(), "onResume()", Toast.LENGTH_SHORT).show();
       Log.d("My tag", "onPostResume активити настроек ");
    }

    @Override
    protected void onPause() {
        super.onPause();
//        Toast.makeText(getApplicationContext(), "onPause", Toast.LENGTH_SHORT).show();
        Log.d("My tag", "onPause активити настроек ");
    }

    @Override
    protected void onStop() {
        super.onStop();
//        Toast.makeText(getApplicationContext(), "onStop", Toast.LENGTH_SHORT).show();
       Log.d("My tag", "onStop активити настроек ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
//        Toast.makeText(getApplicationContext(), "onResume", Toast.LENGTH_SHORT).show();
        Log.d("My tag", "onRestart активити настроек ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
//        Toast.makeText(getApplicationContext(), "onDestroy", Toast.LENGTH_SHORT).show();
       Log.d("My tag", "onDestroy активити настроек ");
    }
}