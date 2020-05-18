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

public class Typekkadashi1 extends AppCompatActivity {
    ListView listView;
    TextView tv;
    String s1,s2,url1,url2;
    int[] listviewImage;
    String[] listviewdec=new String[]{" "," "};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_typekkadashi);
        Bundle bundle = getIntent().getExtras();
         s1=bundle.getString("title1");
        s2=bundle.getString("title2");
        url1=bundle.getString("url1");
        url2=bundle.getString("url2");
            listviewImage = new int[]{
                    R.drawable.indiraekadashivrat, R.drawable.indiraekadashivrat};

        String[] listviewTitle = new String[]{s1,s2};
        listView=(ListView)findViewById(R.id.list);
        List<HashMap<String, String>> aList = new ArrayList<HashMap<String, String>>();
        for (int i = 0; i < listviewTitle.length; i++) {
            HashMap<String, String> hm = new HashMap<String, String>();
            hm.put("listview_title", listviewTitle[i]);
            hm.put("listviewdec",listviewdec[i]);
            hm.put("listview_image", Integer.toString(listviewImage[i]));
            aList.add(hm);
            //C:\Users\ABC\AndroidStudioProjects\IndianFastandFestival\app\src\main\res\layout\listview.xml
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
                    case 0:Intent i = new Intent(Typekkadashi1.this,vratandVidhi.class);
                        i.putExtra("message",url1);
                        startActivity(i);
                        break;
                    case 1:Intent i1 = new Intent(Typekkadashi1.this,vratandVidhi.class);
                        i1.putExtra("message",url2);
                        startActivity(i1);
                        break;
                }
            }
        });

    }
}
