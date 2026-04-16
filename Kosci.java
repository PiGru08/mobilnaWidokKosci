package com.example.kosci2;

import java.util.Random;

public class Kosci {
    static public int liczbaKosci;
    public String[] obrazyKosci = new String[]{"kosc0.png", "kosc1.png", "kosc2.png", "kosc3.png",
            "kosc4.png", "kosc5.png", "kosc6.png"};
    public int  liczbawyrzuconychOczek;
    public int identyfikatorPlikuGraficznego;
    public boolean czyDostepna;

    public  Kosci(int liczbawyrzuconychOczek) {
        if(liczbawyrzuconychOczek < 1 || liczbawyrzuconychOczek > 6){
            this.liczbawyrzuconychOczek = 0;
        }else
        {
            this.liczbawyrzuconychOczek = liczbawyrzuconychOczek;
        }
        identyfikatorPlikuGraficznego = this.liczbawyrzuconychOczek;
        czyDostepna = true;
        liczbaKosci++;

    }

    public  Kosci() {
        Random random = new Random();

        int liczba = random.nextInt(6) + 1;
        liczbawyrzuconychOczek = liczba;
        identyfikatorPlikuGraficznego = liczba;
        czyDostepna = true;
        liczbaKosci++;
    }

    public void rzucKosciaJezeliDostepna(){

        if(czyDostepna){
            Random random = new Random();
            int liczba = random.nextInt(6) + 1;
            liczbawyrzuconychOczek = liczba;
            identyfikatorPlikuGraficznego = liczba;
        }
    }

    public void blokujKosc(){
        czyDostepna = false;
    }
    public String zwrocWartoscNaKosciTekstowo(){
        String[] wartosciTekstowo = new String[]{
                "zero", "jeden", "dwa", "trzy", "cztery", "piec", "szesc"
        };

        return wartosciTekstowo[liczbawyrzuconychOczek];

    }
}
