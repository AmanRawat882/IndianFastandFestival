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

public class festthree extends AppCompatActivity {
    ListView listView;
    TextView tv;
    String s1,s2,s3,url1,url2,url3,name,first,second,third,four;
    String[] listviewTitle ;
    String[] listviewdec=new String[]{"","","","","","","","",""};
    int[] listviewImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_festthree);
        Bundle bundle = getIntent().getExtras();

        s1=bundle.getString("title1");
        s2=bundle.getString("title2");
        s3=bundle.getString("title3");
        url1=bundle.getString("url1");
        url2=bundle.getString("url2");
        url3=bundle.getString("url3");
        name=bundle.getString("name");
       // first="fir";
        //second="sec";
        third="tr";
        four="four";

         if(name.equals(third))
        {
            listviewImage =new int[]{
                    R.drawable.bhairav, R.drawable.dat, R.drawable.christmas};
        }
        else
        {
            listviewImage =new int[]{
                    R.drawable.lohri, R.drawable.makar, R.drawable.pongal};
        }
        listviewTitle = new String[]{s1, s2,s3};
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
               case 0:
                   Intent i=new Intent(festthree.this,vratandVidhi.class);
                   i.putExtra("message",url1);
                   startActivity(i);
                   break;
               case 1:
                   Intent i1=new Intent(festthree.this,vratandVidhi.class);
                   i1.putExtra("message",url2);
                   startActivity(i1);
                   break;

               case 2:
                   Intent i2=new Intent(festthree.this,vratandVidhi.class);
                   i2.putExtra("message",url3);
                   startActivity(i2);
                   break;

           }
            }
        });

    }
}
