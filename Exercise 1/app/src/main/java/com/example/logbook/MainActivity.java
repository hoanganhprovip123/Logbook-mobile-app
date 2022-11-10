package com.example.logbook;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import com.squareup.picasso.Picasso;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<String> imageList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView img = findViewById(R.id.imageView);
        EditText inputURL = findViewById(R.id.inputURL);
        inputURL.setText("https://i.pinimg.com/236x/e4/21/92/e42192b0682ede9d80d92260fb5e17cd.jpg");

        Button btn = findViewById(R.id.button);
        btn.setOnClickListener(view -> {
            String url = inputURL.getText().toString();
            Picasso.get()
                    .load(url)
                    .into(img);
        });
    }
}