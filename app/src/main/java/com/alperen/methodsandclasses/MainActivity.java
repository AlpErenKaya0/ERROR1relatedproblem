package com.alperen.methodsandclasses;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
String Username;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        testmethod();
        a(4,5);
        System.out.println(a(4 ,5));
        makeMusicians();
        makeAthlete();
    }
    public void testmethod(){
        int x=4+4;
        System.out.println("x="+x);
        Username="ahmet";
        System.out.println(Username);
    }
    public int a(int x,int y){
        int z=x+y;
        Username="mehmet";
        System.out.println(Username);
        return z;
    }
    public void makeMusicians(){
        Musicians MyMusicians= new Musicians();
        MyMusicians.age=53;
        MyMusicians.name="ahmet";
        MyMusicians.position="guitar";
    }
    public void makeAthlete(){
        Athlete athlete= new Athlete(branch:"a",name:"ahmet",age:43);



        //BURADA HATA VAR




    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}