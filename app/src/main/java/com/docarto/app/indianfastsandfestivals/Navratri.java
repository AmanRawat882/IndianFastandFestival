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

public class Navratri extends AppCompatActivity {
    TextView tv;
    ListView listView;
    String[] listviewTitle = new String[]{
            "घट स्थापन एवं माँ शैलपुत्री पूजा ","मां ब्रह्मचारिणी की पूजा", " माँ चंद्रघंटा पूजा"," माँ कुष्मांडा पूजा"," माँ स्कंदमाता पूजा",
            " माँ कात्यायनी पूजा"," माँ कालरात्रि पूजा","दुर्गा अष्टमी","महानवमी"
            };
    String[] listviewdec=new String[]{"व्रत विधि एवं कथा","व्रत विधि एवं कथा","व्रत विधि एवं कथा","व्रत विधि एवं कथा","व्रत विधि एवं कथा",
            "व्रत विधि एवं कथा","व्रत विधि एवं कथा","व्रत विधि एवं कथा","व्रत विधि एवं कथा",};

    int[] listviewImage = new int[]{
            R.drawable.durga, R.drawable.durga,R.drawable.durga,R.drawable.durga,R.drawable.durga,
            R.drawable.durga,R.drawable.durga,R.drawable.durga,R.drawable.durga};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navratri);
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
    case 0:String url="https://app.docarto.com/navratri1/";
        Intent i=new Intent(Navratri.this,vratandVidhi.class);
        i.putExtra("message",url);
        startActivity(i);
        break;
    case 1:String url1="https://app.docarto.com/navratri-day2/";
        Intent i1=new Intent(Navratri.this,vratandVidhi.class);
        i1.putExtra("message",url1);
        startActivity(i1);
        break;
    case 2:String url2="https://app.docarto.com/navratriday3/";
        Intent i2=new Intent(Navratri.this,vratandVidhi.class);
        i2.putExtra("message",url2);
        startActivity(i2);
        break;
    case 3:String url3="https://app.docarto.com/4navratri/";
        Intent i3=new Intent(Navratri.this,vratandVidhi.class);
        i3.putExtra("message",url3);
        startActivity(i3);
        break;
    case 4:String url4="https://app.docarto.com/navratiri-day5/";
        Intent i4=new Intent(Navratri.this,vratandVidhi.class);
        i4.putExtra("message",url4);
        startActivity(i4);
        break;
    case 5:String url5="https://app.docarto.com/6navratri/";
        Intent i5=new Intent(Navratri.this,vratandVidhi.class);
        i5.putExtra("message",url5);
        startActivity(i5);
        break;
    case 6:String url6="https://app.docarto.com/navratri-day7/";
        Intent i6=new Intent(Navratri.this,vratandVidhi.class);
        i6.putExtra("message",url6);
        startActivity(i6);
        break;
    case 7:String url7="https://app.docarto.com/durga-ashtami/";
        Intent i7=new Intent(Navratri.this,vratandVidhi.class);
        i7.putExtra("message",url7);
        startActivity(i7);
        break;
    case 8:String url8="https://app.docarto.com/mhanavmi/";
        Intent i8=new Intent(Navratri.this,vratandVidhi.class);
        i8.putExtra("message",url8);
        startActivity(i8);
        break;
}
    }
});
    }
}
