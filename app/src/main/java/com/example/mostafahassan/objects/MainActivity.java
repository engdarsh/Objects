package com.example.mostafahassan.objects;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;

import java.util.Objects;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**setImageDrawable(getDrawable(R.drawable.after_cookie));
     * Called when the cookie should be eaten.
     */
    public void eatCookie(View view) {
        // TODO: Find a reference to the ImageView in the layout. Change the image.
        ImageView afterEat =(ImageView) findViewById(R.id.android_cookie_image_view);
        afterEat.setImageResource(R.drawable.after_cookie);

        // TODO: Find a reference to the TextView in the layout. Change the text.
        TextView text = (TextView) findViewById(R.id.status_text_view);
        text.setText("I'm so full");
    }

    public void backCookie(View view) {
        // TODO: Find a reference to the ImageView in the layout. Change the image.
        ImageView afterEat =(ImageView) findViewById(R.id.android_cookie_image_view);
        afterEat.setImageResource(R.drawable.before_cookie);

        // TODO: Find a reference to the TextView in the layout. Change the text.
        TextView text = (TextView) findViewById(R.id.status_text_view);
        text.setText("I'm so hungry");
    }
}