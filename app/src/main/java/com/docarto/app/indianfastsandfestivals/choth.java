package com.docarto.app.indianfastsandfestivals;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class choth extends AppCompatActivity {

    ListView listView;
    String[] listviewTitle = new String[]{
            "12 महीने की चौथ माता की कहानी","करवा चौथ व्रत ", "माघ चौथ -तिल चौथ व्रत", "बिंदायक जी की कहानी"
    };
    String[] listviewdec=new String[]{"व्रत विधि एवं कथा","व्रत विधि एवं कथा","व्रत विधि एवं कथा","व्रत विधि एवं कथा"};

    int[] listviewImage = new int[]{
            R.drawable.chauth, R.drawable.karva,R.drawable.chauth,R.drawable.budh};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choth);
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
                    case 0:String url="https://app.docarto.com/12-mhine-chauth-mata/";
                        Intent i=new Intent(choth.this,vratandVidhi.class);
                        i.putExtra("message",url);
                        startActivity(i);
                        break;
                    case 1:String url1="https://app.docarto.com/27-oct/";
                        Intent i1=new Intent(choth.this,vratandVidhi.class);
                        i1.putExtra("message",url1);
                        startActivity(i1);
                        break;

                    case 2:String url2="https://app.docarto.com/til-chauth/";
                        Intent i2=new Intent(choth.this,vratandVidhi.class);
                        i2.putExtra("message",url2);
                        startActivity(i2);
                        break;

                    case 3:String url3="https://app.docarto.com/780-2/";
                        Intent i3=new Intent(choth.this,vratandVidhi.class);
                        i3.putExtra("message",url3);
                        startActivity(i3);
                        break;

                }
            }
        });

    }
}
