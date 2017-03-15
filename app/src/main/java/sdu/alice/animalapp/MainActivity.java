package sdu.alice.animalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Explicit
    String nameString;
    EditText nameEditText;
    Button startButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameEditText = (EditText) findViewById(R.id.txtName);
        startButton = (Button) findViewById(R.id.btnStart);

        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nameString = nameEditText.getText().toString().trim();

                //Check Space
                if (nameString.length() == 0) {     //Chk ค่าว่าง
                    Toast.makeText(getApplicationContext(), "Please enter your name!!", Toast.LENGTH_SHORT).show();

                } else {

                    Toast.makeText(getApplicationContext(), "็Hello " + nameString + " Let's go! ",
                            Toast.LENGTH_SHORT).show();

                    // Start Game
                    Intent startIntent = new Intent(MainActivity.this, Game.class);
                    startIntent.putExtra("Name", nameString);
                    startActivity(startIntent);
                }
            }
        });

    }   //Main Method

}   //Main Class
