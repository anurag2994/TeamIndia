package com.example.root.assignment1;

import android.app.ListActivity;
import android.os.Bundle;

public class MainActivity extends ListActivity {

    String[] teamindia = {
            "M.S. Dhoni",
            "Virat Kohli",
            "R. Ashwin",
            "Sikhar Dhawan",
            "Suresh Raina",
            "Rohit Sharma",
            "R. Jadeja",
            "Murali Vijay",
            "Umesh Yadav",
            "Ishant Sharma",
            "Mohit Sharma"
    };

    String[] playerdes ={
            "Captain, Wicketkeeper Batsman",
            "Vice Captain, Batsman",
            "Allrounder ",
            "Top Order Batsman",
            "Batsamn",
            "Batsman",
            "Allrounder",
            "Batsman",
            "Bowler",
            "Bowler",
            "Bowler"
    };

    Integer[] imageIDs = {
            R.drawable.pic1,
            R.drawable.pic2,
            R.drawable.pic3,
            R.drawable.pic4,
            R.drawable.pic5,
            R.drawable.pic6,
            R.drawable.pic7,
            R.drawable.pic8,
            R.drawable.pic9,
            R.drawable.pic10,
            R.drawable.pic11
    };

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        AdvancedCustomArrayAdapter adapter =new AdvancedCustomArrayAdapter(this, teamindia, imageIDs, playerdes);
        setListAdapter(adapter);

    }


}
