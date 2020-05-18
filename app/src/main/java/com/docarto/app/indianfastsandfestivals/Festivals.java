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

public class Festivals extends AppCompatActivity {
    ListView listView;
    TextView tv;
    String s1,s2,url1,url2,name,s3,s4,s5,s6,s7,s8,s9,s10;
    int[] listviewImage;
    String[] listviewTitle;
    String[] listviewdec=new String[]{"व्रत विधि एवं कथा","व्रत विधि एवं कथा","व्रत विधि एवं कथा"};

     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_festivals);
         Bundle bundle = getIntent().getExtras();

         s1=bundle.getString("title1");
         s2=bundle.getString("title2");
         url1=bundle.getString("url1");
         url2=bundle.getString("url2");
       name=bundle.getString("name");
       s3="b1";
       s4="b2";
       s5="b3";
       s6="b4";
         //url2=bundle.getString("url2");
        // Toast.makeText(this, name, Toast.LENGTH_SHORT).show();
         String h="ch";
              listviewTitle = new String[]{s1, s2};
              if(name.equals(s3))
              {
                  listviewImage = new int[]{
                          R.drawable.gangaji, R.drawable.indiraekadashivrat};

              }
              else if(name.equals(s4))
              {
             listviewImage = new int[]{
                     R.drawable.papankush_ekadashi20oct, R.drawable.guru};
              }
              else if(name.equals(s5))
              {
                  listviewImage = new int[]{
                          R.drawable.basant, R.drawable.aug};
              }
        else
              {
                  listviewImage = new int[]{
                          R.drawable.shiv, R.drawable.narsingh};
              }
        List<HashMap<String, String>> aList = new ArrayList<HashMap<String, String>>();

        for (int i = 0; i < listviewTitle.length; i++) {
            HashMap<String, String> hm = new HashMap<String, String>();
            hm.put("listview_title", listviewTitle[i]);
            //hm.put("listviewdec",listviewdec[i]);
            hm.put("listview_image", Integer.toString(listviewImage[i]));
            aList.add(hm);
        }
        String[] from = {"listview_image", "listview_title"};
        int[] to = {R.id.listview_image, R.id.listview_item_title};
        SimpleAdapter simpleAdapter = new SimpleAdapter(Festivals.this, aList, R.layout.list1, from, to);
        ListView androidListView = (ListView)findViewById(R.id.list);
        androidListView.setAdapter(simpleAdapter);
        androidListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
              switch (position)
              {
                  case 0:
                      Intent i=new Intent(Festivals.this,vratandVidhi.class);
                      i.putExtra("message",url1);
                      startActivity(i);
                      break;
                  case 1:
                      Intent i1=new Intent(Festivals.this,vratandVidhi.class);
                      i1.putExtra("message",url2);
                      startActivity(i1);
                      break;


              }
            }
        });

    }
}
