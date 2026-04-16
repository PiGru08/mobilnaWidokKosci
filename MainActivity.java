package com.example.kosci2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
ImageView imageViewKosc1;
    ImageView imageViewKosc2;
    ImageView imageViewKosc3;
    ImageView imageViewKosc4;
    ImageView imageViewKosc5;
    TextView textViewWynik;
    Button button;
    int sumaWyrzuconych = 0;
    int obrazKosci[]= new int[]{
            R.drawable.kosc0,
            R.drawable.kosc1,
            R.drawable.kosc2,
            R.drawable.kosc3,
            R.drawable.kosc4,
            R.drawable.kosc5,
            R.drawable.kosc6,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        imageViewKosc1 = findViewById(R.id.k1);
        imageViewKosc2 = findViewById(R.id.k2);
        imageViewKosc3 = findViewById(R.id.k3);
        imageViewKosc4 = findViewById(R.id.k4);
        imageViewKosc5 = findViewById(R.id.k5);
        textViewWynik = findViewById(R.id.txtWynik);
        button = findViewById(R.id.btnRzut);
        Kosci kosc1 = new Kosci();
        Kosci kosc2 = new Kosci();
        Kosci kosc3 = new Kosci();
        Kosci kosc4 = new Kosci();
        Kosci kosc5 = new Kosci();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kosc1.rzucKosciaJezeliDostepna();
                imageViewKosc1.setImageResource(obrazKosci[kosc1.liczbawyrzuconychOczek]);
                kosc2.rzucKosciaJezeliDostepna();
                imageViewKosc2.setImageResource(obrazKosci[kosc2.liczbawyrzuconychOczek]);
                kosc3.rzucKosciaJezeliDostepna();
                imageViewKosc3.setImageResource(obrazKosci[kosc3.liczbawyrzuconychOczek]);
                kosc4.rzucKosciaJezeliDostepna();
                imageViewKosc4.setImageResource(obrazKosci[kosc4.liczbawyrzuconychOczek]);
                kosc5.rzucKosciaJezeliDostepna();
                imageViewKosc5.setImageResource(obrazKosci[kosc5.liczbawyrzuconychOczek]);

                sumaWyrzuconych= sumaWyrzuconych+kosc1.liczbawyrzuconychOczek;
                sumaWyrzuconych= sumaWyrzuconych+kosc2.liczbawyrzuconychOczek;
                sumaWyrzuconych= sumaWyrzuconych+kosc3.liczbawyrzuconychOczek;
                sumaWyrzuconych= sumaWyrzuconych+kosc4.liczbawyrzuconychOczek;
                sumaWyrzuconych= sumaWyrzuconych+kosc5.liczbawyrzuconychOczek;
                textViewWynik.setText(sumaWyrzuconych+"");
            }
        });
        imageViewKosc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(kosc1.czyDostepna){
                    kosc1.blokujKosc();
                    view.setAlpha(0.5f);
                }else{
                    kosc1.czyDostepna=true;
                    view.setAlpha(1f);
                }

            }
        });
        imageViewKosc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(kosc2.czyDostepna){
                    kosc2.blokujKosc();
                    view.setAlpha(0.5f);
                }else{
                    kosc2.czyDostepna=true;
                    view.setAlpha(1f);
                }
            }
        });
        imageViewKosc3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(kosc3.czyDostepna){
                    kosc3.blokujKosc();
                    view.setAlpha(0.5f);
                }else{
                    kosc3.czyDostepna=true;
                    view.setAlpha(1f);
                }
            }
        });
        imageViewKosc4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(kosc4.czyDostepna){
                    kosc4.blokujKosc();
                    view.setAlpha(0.5f);
                }else{
                    kosc4.czyDostepna=true;
                    view.setAlpha(1f);
                }
            }
        });
        imageViewKosc5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(kosc5.czyDostepna){
                    kosc5.blokujKosc();
                    view.setAlpha(0.5f);
                }else{
                    kosc5.czyDostepna=true;
                    view.setAlpha(1f);
                }
            }
        });
    }
}