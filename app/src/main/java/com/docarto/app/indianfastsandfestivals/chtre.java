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

public class chtre extends AppCompatActivity {
    ListView listView;
    TextView tv;
    String[] listviewTitle = new String[]{
            "भारतीय नववर्ष", "शीतलाष्टमी", "गुड़ी पड़वा",
            "गणगौर", "रामनवमी", "महावीर जयन्ती","हनुमान जयन्ती","गुड फ्राइडे","अशोकाष्टमी" };

    String[] listviewdec=new String[]{"","","","","","","","",""};
    int[] listviewImage = new int[]{
            R.drawable.side1, R.drawable.sheetla, R.drawable.gudi, R.drawable.gangaur,
            R.drawable.ramnavami, R.drawable.mahaveer, R.drawable.mangal,R.drawable.godfriday,R.drawable.side1
            };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chtre);
        listView=(ListView)findViewById(R.id.list);
        List<HashMap<String, String>> aList = new ArrayList<HashMap<String, String>>();
        for (int i = 0; i < listviewTitle.length; i++) {
            HashMap<String, String> hm = new HashMap<String, String>();
            hm.put("listview_title", listviewTitle[i]);
           // hm.put("listviewdec",listviewdec[i]);
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
                    case 0:String url="https://app.docarto.com/navvarsh/";
                        Intent i=new Intent(chtre.this,vratandVidhi.class);
                        i.putExtra("message",url);
                        startActivity(i);
                        break;
                    case 1:String url1="https://app.docarto.com/sitlaastami/";
                        Intent i1=new Intent(chtre.this,vratandVidhi.class);
                        i1.putExtra("message",url1);
                        startActivity(i1);
                        break;

                    case 2:String url2="https://app.docarto.com/gudi-padva/";
                        Intent i2=new Intent(chtre.this,vratandVidhi.class);
                        i2.putExtra("message",url2);
                        startActivity(i2);
                        break;

                    case 3:String url3="https://app.docarto.com/gangaur/";
                        Intent i3=new Intent(chtre.this,vratandVidhi.class);
                        i3.putExtra("message",url3);
                        startActivity(i3);
                        break;
                    case 4:String url4="https://app.docarto.com/ram-navami/";
                        Intent i4=new Intent(chtre.this,vratandVidhi.class);
                        i4.putExtra("message",url4);
                        startActivity(i4);
                        break;
                    case 5:String url5="https://app.docarto.com/mahavir-jayanti/";
                        Intent i5=new Intent(chtre.this,vratandVidhi.class);
                        i5.putExtra("message",url5);
                        startActivity(i5);
                        break;
                    case 6:String url6="https://app.docarto.com/hanumanjaynti/";
                        Intent i6=new Intent(chtre.this,vratandVidhi.class);
                        i6.putExtra("message",url6);
                        startActivity(i6);
                        break;

                    case 7:String url7="https://app.docarto.com/good-friday/";
                        Intent i7=new Intent(chtre.this,vratandVidhi.class);
                        i7.putExtra("message",url7);
                        startActivity(i7);
                        break;
                    case 8:String url8="https://app.docarto.com/ashokashtami/";
                        Intent i8=new Intent(chtre.this,vratandVidhi.class);
                        i8.putExtra("message",url8);
                        startActivity(i8);
                        break;



                }
            }
        });

    }
}
