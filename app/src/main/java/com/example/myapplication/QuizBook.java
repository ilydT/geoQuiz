package com.example.myapplication;

public class QuizBook {
    public static String[] questions = new String[]{
            "Pasifik Okyanusu o kadar büyüktür ki, tüm kıtaların toplam alanından daha fazla yer kaplar.",
            "Fransa ve Hollanda, Karayip Denizi'nde sınır komşusudur.",
            "Allahüekber dağları Türkiye'nin karadeniz bölgesindedir",
            "Alüvyon deprem ile ilgili bir terimdir",
            " Türkiye'nin en kalabalık 4. şehri Ankaradır",
            "Artvin ilimiz Ermenistanla komşudur",
            "Fransa'nın en uzun sınır hattına sahip olduğu komşu ülkesi Brezilya'dır.",
            "Dünya üzerindeki tatlı suların (içilebilir su) %70-80'i buzullarda bulunur.",


    };
    public static int[] images=new int[]{
        R.drawable.pacific, R.drawable.caribbean, R.drawable.dag, R.drawable.all, R.drawable.ankara, R.drawable.ermenistan, R.drawable.brezilya, R.drawable.buzullar
    };
    public static boolean[] answers= new boolean[]{
            true,true,false,false,false,false,true,true
    };
}
