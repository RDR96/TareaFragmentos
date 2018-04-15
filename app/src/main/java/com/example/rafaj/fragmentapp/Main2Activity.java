package com.example.rafaj.fragmentapp;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView text;
    TextView content;
    ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        text = findViewById(R.id.textId);
        image = findViewById(R.id.image);
        content = findViewById(R.id.contentId);
        Intent callingIntent = getIntent();
        String intentAction = callingIntent.getAction();
        String intentType = callingIntent.getType();

        if (Intent.ACTION_SEND.equals(intentAction) && intentType != null){
            if (intentType.equals("text/plain")){
                handleReceivedText(callingIntent);

            }
        }

    }

    private void handleReceivedText(Intent intent){
        String intentText[]= intent.getStringExtra(Intent.EXTRA_TEXT).split("]");

        if (text != null){
            text.setText(intentText[0]);
            content.setText(intentText[1]);
            setImage(Integer.parseInt(intentText[2]));
        }
    }

    public void setImage(int num){
        switch (num){
            case 0:
                image.setImageResource(R.drawable.sun);
                break;
            case 1:
                image.setImageResource(R.drawable.mercurio);
                break;
            case 2:
                image.setImageResource(R.drawable.venus);
                break;
            case 3:
                image.setImageResource(R.drawable.tierra);
                break;
            case 4:
                image.setImageResource(R.drawable.mars);
                break;
            case 5:
                image.setImageResource(R.drawable.jupiter);
                break;
            case 6:
                image.setImageResource(R.drawable.saturn);
                break;
            case 7:
                image.setImageResource(R.drawable.uranus);
                break;
            case 8:
                image.setImageResource(R.drawable.neptune);
                break;
        }
    }
}
