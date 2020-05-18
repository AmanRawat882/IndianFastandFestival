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

public class SaptahikVrat extends AppCompatActivity {
ListView listView;
    TextView tv;
    String[] listviewTitle = new String[]{
            "सोमवार व्रत", "मंगलवार व्रत", "बुधवार व्रत", "गुरुवार व्रत",
            "शुक्रवार व्रत", "शनिवार व्रत", "रविवार व्रत" };

    String[] listviewdec=new String[]{"व्रत विधि एवं कथा","व्रत विधि एवं कथा","व्रत विधि एवं कथा","व्रत विधि एवं कथा","व्रत विधि एवं कथा","व्रत विधि एवं कथा","व्रत विधि एवं कथा"};
    int[] listviewImage = new int[]{
            R.drawable.somvar, R.drawable.mangal, R.drawable.budh, R.drawable.guru,
            R.drawable.sukra, R.drawable.shani, R.drawable.ravi };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saptahik_vrat);
        listView=(ListView)findViewById(R.id.list);
        List<HashMap<String, String>> aList = new ArrayList<HashMap<String, String>>();
        for (int i = 0; i < listviewTitle.length; i++) {
            HashMap<String, String> hm = new HashMap<String, String>();
            hm.put("listview_title", listviewTitle[i]);
            hm.put("listviewdec",listviewdec[i]);
            hm.put("listview_image", Integer.toString(listviewImage[i]));
            aList.add(hm);
        }
        String[] from = {"listview_image", "listview_title","listviewdec"};
        int[] to = {R.id.listview_image, R.id.listview_item_title,R.id.des};

        SimpleAdapter simpleAdapter = new SimpleAdapter(getApplicationContext(), aList, R.layout.list, from, to);
        listView.setAdapter(simpleAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position)
                {
                    case 0:String url = "https://app.docarto.com/oct1/";

                        Intent i = new Intent(SaptahikVrat.this,vratandVidhi.class);
                        i.putExtra("message",url);
                       // i.putExtra("activity",SaptahikVrat.class);
                        startActivity(i);
                        break;
                    case 1:String url1 = "https://app.docarto.com/oct2/";
                        Intent i1 = new Intent(SaptahikVrat.this,vratandVidhi.class);
                        i1.putExtra("message",url1);
                        startActivity(i1);
                        break;
                    case 2:String url2 = "https://app.docarto.com/budhwar-vrat/";
                        Intent i2 = new Intent(SaptahikVrat.this,vratandVidhi.class);
                        i2.putExtra("message",url2);
                        startActivity(i2);
                        break;
                    case 3:String url3 = "https://app.docarto.com/guruvar-vrat/";
                        Intent i3 = new Intent(SaptahikVrat.this,vratandVidhi.class);
                        i3.putExtra("message",url3);
                        startActivity(i3);
                        break;
                    case 4:String url4 = "https://app.docarto.com/%E0%A4%B6%E0%A5%81%E0%A4%95%E0%A5%8D%E0%A4%B0%E0%A4%B5%E0%A4%BE%E0%A4%B0/";
                        Intent i4 = new Intent(SaptahikVrat.this,vratandVidhi.class);
                        i4.putExtra("message",url4);
                        startActivity(i4);
                        break;
                    case 5:String url5 = "https://app.docarto.com/shanivar/";
                        Intent i5 = new Intent(SaptahikVrat.this,vratandVidhi.class);
                        i5.putExtra("message",url5);
                        startActivity(i5);
                        break;
                    case 6:String url6 = "https://app.docarto.com/ravivar/";
                        Intent i6 = new Intent(SaptahikVrat.this,vratandVidhi.class);
                        i6.putExtra("message",url6);
                        startActivity(i6);
                        break;
                }
            }
        });

    }

}
