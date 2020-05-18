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

public class Ekadashivrat extends AppCompatActivity {
    ListView listView;
    TextView tv;
    String[] listviewTitle = new String[]{
            "चैत्र शुक्ल और कृष्ण पक्ष", "वैशाख शुक्ल और कृष्ण पक्ष", "जेष्ठ शुक्ल और कृष्ण पक्ष", "आषाढ़ शुक्ल और कृष्ण पक्ष",
            "सावन शुक्ल और कृष्ण पक्ष", "भाद्रपद शुक्ल और कृष्ण पक्ष", "अश्विन शुक्ल और कृष्ण पक्ष","कार्तिक शुक्ल और कृष्ण पक्ष","मार्गशीर्ष शुक्ल और कृष्ण पक्ष",
    "पौष शुक्ल और कृष्ण पक्ष","माघ शुक्ल और कृष्ण पक्ष","फाल्गुन शुक्ल और कृष्ण पक्ष","अदिकमास(पुरषोतम)"};

    String[] listviewdec=new String[]{"व्रत विधि एवं कथा","व्रत विधि एवं कथा","व्रत विधि एवं कथा","व्रत विधि एवं कथा","व्रत विधि एवं कथा",
            "व्रत विधि एवं कथा","व्रत विधि एवं कथा","व्रत विधि एवं कथा","व्रत विधि एवं कथा","व्रत विधि एवं कथा","व्रत विधि एवं कथा","व्रत विधि एवं कथा","व्रत विधि एवं कथा"};
    int[] listviewImage = new int[]{
            R.drawable.indiraekadashivrat, R.drawable.indiraekadashivrat, R.drawable.indiraekadashivrat, R.drawable.indiraekadashivrat,
            R.drawable.indiraekadashivrat, R.drawable.indiraekadashivrat, R.drawable.indiraekadashivrat,R.drawable.indiraekadashivrat,R.drawable.indiraekadashivrat,
            R.drawable.indiraekadashivrat,R.drawable.indiraekadashivrat,R.drawable.indiraekadashivrat,R.drawable.indiraekadashivrat};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ekadashivrat);
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
                    case 0: Intent i = new Intent(Ekadashivrat.this,Typekkadashi1.class);
                    i.putExtra("title1","चैत्र कृष्ण पक्ष एकादशी-पापमोचनी एकादशी,व्रत विधि एवं कथा");
                    i.putExtra("url1","https://app.docarto.com/papmochini/");
                    i.putExtra("title2"," चैत्र शुक्ल पक्ष एकादशी-कामदा एकादशी,व्रत विधि एवं कथा");
                    i.putExtra("url2","https://app.docarto.com/kamada-ekadashi/");
                         startActivity(i);
                        break;
                    case 1: Intent i1 = new Intent(Ekadashivrat.this,Typekkadashi1.class);
                        i1.putExtra("title1","वैशाख कृष्ण एकादशी-वरूथिनी एकादशी,व्रत विधि एवं कथा");
                        i1.putExtra("title2","वैशाख शुक्ल एकादशी-मोहिनी एकादशी,व्रत विधि एवं कथा");
                        i1.putExtra("url1","https://app.docarto.com/varuthini-ekadashi/");
                        i1.putExtra("url2","https://app.docarto.com/mohini-ekadashi/");
                        startActivity(i1);
                        break;
                    case 2:Intent i2 = new Intent(Ekadashivrat.this,Typekkadashi1.class);
                        i2.putExtra("title1","ज्येष्ठ कृष्ण एकादशी - अपरा एकादशी,व्रत विधि एवं कथा");
                        i2.putExtra("title2","ज्येष्ठ शुक्ल एकादशी - निर्जला एकादशी,व्रत विधि एवं कथा");
                        i2.putExtra("url1","https://app.docarto.com/424-2/");
                        i2.putExtra("url2","https://app.docarto.com/428-2/");
                        startActivity(i2);
                        break;
                    case 3:Intent i3 = new Intent(Ekadashivrat.this,Typekkadashi1.class);
                        i3.putExtra("title1","आषाढ़ कृष्ण एकादशी - योगिनी एकादशी,व्रत विधि एवं कथा");
                        i3.putExtra("title2","आषाढ़ शुक्ल एकादशी-देवशयनी एकादशी,व्रत विधि एवं कथा");
                        i3.putExtra("url1","https://app.docarto.com/438-2/");
                        i3.putExtra("url2","https://app.docarto.com/devshaynai/");
                        startActivity(i3);
                        break;
                    case 4:Intent i4 = new Intent(Ekadashivrat.this,Typekkadashi1.class);
                        i4.putExtra("title1","श्रावण कृष्ण एकादशी-कामिका एकादशी,व्रत विधि एवं कथा");
                        i4.putExtra("title2","श्रावण शुक्ल एकादशी-पुत्रदा एकादशी,व्रत विधि एवं कथा");
                        i4.putExtra("url1","https://app.docarto.com/kamika/");
                        i4.putExtra("url2","https://app.docarto.com/551-2/");
                        startActivity(i4);
                        break;
                    case 5:Intent i5 = new Intent(Ekadashivrat.this,Typekkadashi1.class);
                        i5.putExtra("title1","भाद्रपद  कृष्ण एकादशी-अजा एकादशी,व्रत विधि एवं कथा");
                        i5.putExtra("title2","भाद्रपद शुक्ल एकादशी-पद्मा एकादशी,व्रत विधि एवं कथा");
                        i5.putExtra("url1","https://app.docarto.com/562-2/");
                        i5.putExtra("url2","https://app.docarto.com/558-2/");
                        startActivity(i5);
                        break;
                    case 6:Intent i6 = new Intent(Ekadashivrat.this,Typekkadashi1.class);
                        i6.putExtra("title1","अश्विन कृष्ण पक्ष एकादशी -इंदिरा एकादशी,व्रत विधि एवं कथा ");
                        i6.putExtra("title2","आश्विन शुक्ल एकादशी - पापाकुंशा एकादशी,व्रत विधि एवं कथा");
                        i6.putExtra("url1","https://app.docarto.com/indira-ekadashi/");
                        i6.putExtra("url2","https://app.docarto.com/papankush-ekadashi/");
                        startActivity(i6);
                        break;
                    case 7:Intent i7 = new Intent(Ekadashivrat.this,Typekkadashi1.class);
                        i7.putExtra("title1","कार्तिक कृष्ण एकादशी - रमा एकादशी,व्रत विधि एवं कथा ");
                        i7.putExtra("title2","कार्तिक शुक्ल एकादशी - देवप्रबोधनी एकादशी,व्रत विधि एवं कथा");
                        i7.putExtra("url1","https://app.docarto.com/rama-ekadashi/");
                        i7.putExtra("url2","https://app.docarto.com/prabodhini/");
                        startActivity(i7);
                        break;
                    case 8:Intent i8 = new Intent(Ekadashivrat.this,Typekkadashi1.class);
                        i8.putExtra("title1","मार्गशीर्ष शुक्ल-मोक्षदा एकादशी,व्रत विधि एवं कथा");
                        i8.putExtra("title2","मार्गशीर्ष कृष्ण एकादशी-उत्पन्ना एकादशी,व्रत विधि एवं कथा");
                        i8.putExtra("url1","https://app.docarto.com/570-2/");
                        i8.putExtra("url2","https://app.docarto.com/571-2/");
                        startActivity(i8);
                        break;
                    case 9:Intent i9 = new Intent(Ekadashivrat.this,Typekkadashi1.class);
                        i9.putExtra("title1","पौष कृष्ण एकादशी-सफला एकादशी ,व्रत विधि एवं कथा");
                        i9.putExtra("title2","पौष शुक्ल एकादशी -पुत्रदा एकादशी,व्रत विधि एवं कथा");
                        i9.putExtra("url1","https://app.docarto.com/588-2/");
                        i9.putExtra("url2","https://app.docarto.com/putrada-ekadashi/");
                        startActivity(i9);
                        break;
                    case 10:Intent i10 = new Intent(Ekadashivrat.this,Typekkadashi1.class);
                        i10.putExtra("title1","माघ कृष्ण एकादशी-षटतिला एकादशी,व्रत विधि एवं कथा ");
                        i10.putExtra("title2","माघ शुक्ल एकादशी - जया एकादशी ,व्रत विधि एवं कथा");
                        i10.putExtra("url1","https://app.docarto.com/shattila/");
                        i10.putExtra("url2","https://app.docarto.com/594-2/");
                        startActivity(i10);
                        break;
                    case 11:Intent i11 = new Intent(Ekadashivrat.this,Typekkadashi1.class);
                        i11.putExtra("title1","फाल्गुन कृष्ण एकादशी-विजया एकादशी,व्रत विधि एवं कथा");
                        i11.putExtra("title2","फाल्गुन शुक्ल एकादशी-आमलकी एकादशी,व्रत विधि एवं कथा");
                        i11.putExtra("url1","https://app.docarto.com/617-2/");
                        i11.putExtra("url2","https://app.docarto.com/608-2/");
                        startActivity(i11);
                        break;
                    case 12:Intent i12 = new Intent(Ekadashivrat.this,Typekkadashi1.class);
                        i12.putExtra("title1","पुरुषोत्तम(अधिकमास)कृष्ण पक्ष की एकादशी-परमा एकादशी");
                        i12.putExtra("title2","पुरुषोत्तम(अधिकमास)शुक्ल पक्ष की एकादशी-पद्मिनी एकादशी");
                        i12.putExtra("url1","https://app.docarto.com/624-2/");
                        i12.putExtra("url2","https://app.docarto.com/629-2/");
                        startActivity(i12);
                        break;
                }
            }
        });
    }
}
