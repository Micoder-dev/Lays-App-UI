package com.example.laysappui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.daprlabs.cardstack.SwipeDeck;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    // on below line we are creating variable
    // for our array list and swipe deck.
    private SwipeDeck cardStack;
    private ArrayList<LaysModal> laysModalArrayList;
    private ContextCompat mContextCompat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // on below line we are initializing our array list and swipe deck.
        laysModalArrayList = new ArrayList<>();
        cardStack = (SwipeDeck) findViewById(R.id.swipe_deck);

        // on below line we are adding data to our array list.
        laysModalArrayList.add(new LaysModal("Honey Barbecue", R.drawable.lays1, mContextCompat.getColor(this, R.color.l1_yellow)));
        laysModalArrayList.add(new LaysModal("Cheddar & SourCream", R.drawable.lays2, mContextCompat.getColor(this, R.color.l2_orange)));
        laysModalArrayList.add(new LaysModal("SourCream & Onion", R.drawable.lays3, mContextCompat.getColor(this, R.color.l3_green)));
        laysModalArrayList.add(new LaysModal("SourCream & Onion", R.drawable.lays4, mContextCompat.getColor(this, R.color.l4_red)));
        laysModalArrayList.add(new LaysModal("Salt & Vinegar", R.drawable.lays5, mContextCompat.getColor(this, R.color.l5_blue)));

        // on below line we are creating a variable for our adapter class and passing array list to it.
        final DeckAdapter adapter = new DeckAdapter(laysModalArrayList, this);

        // on below line we are setting adapter to our card stack.
        cardStack.setAdapter(adapter);

        // on below line we are setting event callback to our card stack.
        cardStack.setEventCallback(new SwipeDeck.SwipeEventCallback() {
            @Override
            public void cardSwipedLeft(int position) {
                // on card swipe left we are displaying a toast message.
                //Toast.makeText(MainActivity.this, "Card Swiped Left", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void cardSwipedRight(int position) {
                // on card swiped to right we are displaying a toast message.
                //Toast.makeText(MainActivity.this, "Card Swiped Right", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void cardsDepleted() {
                // this method is called when no card is present
                //Toast.makeText(MainActivity.this, "No more courses present", Toast.LENGTH_SHORT).show();
                cardStack.setAdapter(adapter);
            }

            @Override
            public void cardActionDown() {
                // this method is called when card is swiped down.
                //Log.i("TAG", "CARDS MOVED DOWN");
            }

            @Override
            public void cardActionUp() {
                // this method is called when card is moved up.
                //Log.i("TAG", "CARDS MOVED UP");
            }
        });

    }
}