package com.example.mycv;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import com.example.mycv.R;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnContact = findViewById(R.id.btnContact);

        btnContact.setOnClickListener(v ->
                Toast.makeText(this,
                        "Thank you for viewing my CV!",
                        Toast.LENGTH_SHORT).show()
        );
    }
}
