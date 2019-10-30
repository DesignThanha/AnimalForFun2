package com.example.animalforfun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String nameString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ผูกตัวแปร
        final EditText nameEditText = findViewById(R.id.edt1);
        Button startButton = findViewById(R.id.bt1);


        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nameString = nameEditText.getText().toString();
                if (nameString.length() == 0) {
                    Toast.makeText(getApplicationContext(), "ใส่ข้อมูลหน่อยเว้ยยยยยยยยยยยยยย.", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(),"ยินดีต้อนรับคุณ "+nameString+"เข้าสู่เกม",Toast.LENGTH_SHORT).show();
                    // intent ไปยังหน้าเกม
                    Intent startIntent = new Intent(MainActivity.this,Game.class);
                    startIntent.putExtra("Name",nameString);
                    startActivity(startIntent);
                }
            }
        });
    }
}
