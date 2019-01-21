package com.example.josh.hangman;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {


    private void configurePlayButton(){
        Button button = (Button)findViewById(R.id.play);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,CatagoriesMenu.class));
            }
        });
    }



    public void readCountries(){
        try {
            File file = new File("CountryNameList.txt");
            File testFile = new File("test.txt");
            Scanner fileReader = new Scanner(file);
            PrintWriter printer = new PrintWriter(testFile);
            String [] countryList = new String[255];

            for(int x = 0; x < countryList.length; x++){
                countryList[x] = fileReader.nextLine();
                printer.println(countryList[x]);
                Log.i("Countries",countryList[x]);
            }
        }catch(Exception e){}
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //readCountries();
        configurePlayButton();
    }
}
