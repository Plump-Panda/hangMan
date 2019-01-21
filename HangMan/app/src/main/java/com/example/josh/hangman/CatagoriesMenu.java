package com.example.josh.hangman;

        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.view.View;
        import android.widget.Button;

public class CatagoriesMenu extends AppCompatActivity {

    //Adds listeners to the buttons
    private void configureButtons(){
        Button playButton = findViewById(R.id.countries);
        Button backButton = findViewById(R.id.back);
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Add stuff here
            }
        });

        //Adds listener to back button
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Uses default back button command to bring it back to the previous window
                finish();
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catagories_menu);
        configureButtons();
    }
}
