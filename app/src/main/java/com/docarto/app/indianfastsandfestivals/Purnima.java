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

public class Purnima extends AppCompatActivity {
    ListView listView;
    String[] listviewTitle = new String[]{
            "पूर्णिमा व्रत","शरद पूर्णिमा-आश्विन मास"
    };
    String[] listviewdec=new String[]{"व्रत विधि एवं कथा","व्रत विधि एवं कथा"};

    int[] listviewImage = new int[]{
            R.drawable.sharadpoornima,R.drawable.sharadpoornima};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_purnima);
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
            case 0:String url="https://app.docarto.com/poornima-vrat/";
                Intent i=new Intent(Purnima.this,vratandVidhi.class);
                i.putExtra("message",url);
                startActivity(i);
                break;
            case 1:String url1="https://app.docarto.com/sharad-poornima/";
                Intent i1=new Intent(Purnima.this,vratandVidhi.class);
                i1.putExtra("message",url1);
                startActivity(i1);
                break;

        }

    }
});
    }
}
