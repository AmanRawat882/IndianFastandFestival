package com.docarto.app.indianfastsandfestivals;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class kartik extends AppCompatActivity {
    ListView listView;
    TextView tv;
    String[] listviewTitle = new String[]{
            "धन तेरस/ध्वन्तरी जयंती", "नरक चतुर्दशी/रूप चैदस/छोटी दीवाली", "दीपावली(लक्ष्मी पूजन)",
            "गौवर्धन पूजा/अन्नकुट", "यम द्वितीया/भैया दुज","नेहरू जयंती","छठ पूजा"};

    String[] listviewdec=new String[]{"","","","","",""};
    int[] listviewImage = new int[]{
            R.drawable.dhan, R.drawable.choti, R.drawable.laxmi, R.drawable.goverdhan,
            R.drawable.bhaiduj, R.drawable.nehru,R.drawable.chat
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kartik);
        listView=(ListView)findViewById(R.id.list);
        List<HashMap<String, String>> aList = new ArrayList<HashMap<String, String>>();
        for (int i = 0; i < listviewTitle.length; i++) {
            HashMap<String, String> hm = new HashMap<String, String>();
            hm.put("listview_title", listviewTitle[i]);
           hm.put("listview_image", Integer.toString(listviewImage[i]));
            aList.add(hm);
        }
        String[] from = {"listview_image", "listview_title"};
        int[] to = {R.id.listview_image, R.id.listview_item_title};

        SimpleAdapter simpleAdapter = new SimpleAdapter(getApplicationContext(), aList, R.layout.list1, from, to);
        listView.setAdapter(simpleAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position)
                {
                    case 0:String url="https://app.docarto.com/dhanteresh/";
                        Intent i=new Intent(kartik.this,vratandVidhi.class);
                        i.putExtra("message",url);
                        startActivity(i);
                        break;
                    case 1:String url1="https://app.docarto.com/chotidipawli/";
                        Intent i1=new Intent(kartik.this,vratandVidhi.class);
                        i1.putExtra("message",url1);
                        startActivity(i1);
                        break;

                    case 2:String url2="https://app.docarto.com/dipawali/";
                        Intent i2=new Intent(kartik.this,vratandVidhi.class);
                        i2.putExtra("message",url2);
                        startActivity(i2);
                        break;

                    case 3:String url3="https://app.docarto.com/goverdhan/";
                        Intent i3=new Intent(kartik.this,vratandVidhi.class);
                        i3.putExtra("message",url3);
                        startActivity(i3);
                        break;
                    case 4:String url4="https://app.docarto.com/bhaiduj/";
                        Intent i4=new Intent(kartik.this,vratandVidhi.class);
                        i4.putExtra("message",url4);
                        startActivity(i4);
                        break;
                    case 5:String url5="https://app.docarto.com/14-nov/";
                        Intent i5=new Intent(kartik.this,vratandVidhi.class);
                        i5.putExtra("message",url5);
                        startActivity(i5);
                        break;
                    case 6:String url6="https://app.docarto.com/14oct-2/";
                        Intent i6=new Intent(kartik.this,vratandVidhi.class);
                        i6.putExtra("message",url6);
                        startActivity(i6);
                        break;


                }
            }
        });


    }
}
