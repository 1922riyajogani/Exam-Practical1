package com.example.exam_practical;

import static com.example.exam_practical.R.drawable.*;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    String name[] = {"UMAID BHAWAN PALACE","THE OBEROI","AMAN-I-KHAS","THE TAJ MAHAL PALACE ","ANANDA IN THE HIMALAYAS","TAJ FALAKNUMA PALACE","THE OBEROI AMARVILAS","TAJ LAKE PALACE","AMANBAGH"};

    int image[] = {h1,h2,h3,h4,h5,h6,h7,h8,h9,h10};

    String location[] = {"JODHPUR"," NEW DELHI"," RHANTAMBORE NATIONAL PARK","MUMBAI","HIMALAYA"," HYDERABAD","AMARVILAS","UDAIPUR","RAJASTHAN"};

    String famousfor[] = {"Hospitality","Rooms","Dining","Angdai","Art","Rooms","Dining","Hospitality","Dining","Angdai"};

    String food[] = {"Khandvi","Handvo","Thepla","Undhiyu","Momos","Kebab","Butter Chicken","Nihari","Chaat","Doughnuts"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}