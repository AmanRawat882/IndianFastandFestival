package com.docarto.app.indianfastsandfestivals;


import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class October extends Fragment {
    TextView tv;
    String[] listviewTitle = new String[]{
             "साप्ताहिक व्रत", "12 महीनों की एकादशी ", "नवरात्री","चौथ व्रत","प्रदोष व्रत","16 सोमवार व्रत","वैभव लक्ष्मी व्रत",
    "सत्यनारायण व्रत कथा","पूर्णिमा व्रत","गोवत्स द्वादशी","सन्तान सप्तमी व्रत","शिव चतुर्दशी व्रत","अहोई अष्टमी व्रत","उपांग ललिता व्रत","हरितालिका व्रत"};
String[] listviewdec=new String[]{"व्रत विधि एवं कथा","व्रत विधि एवं कथा","व्रत विधि एवं कथा","व्रत विधि एवं कथा","व्रत विधि एवं कथा","व्रत विधि एवं कथा",
        "व्रत विधि एवं कथा","व्रत विधि एवं कथा","व्रत विधि एवं कथा","व्रत विधि एवं कथा","व्रत विधि एवं कथा","व्रत विधि एवं कथा","व्रत विधि एवं कथा",
        "व्रत विधि एवं कथा","व्रत विधि एवं कथा"};

    int[] listviewImage = new int[]{
            R.drawable.side1, R.drawable.indiraekadashivrat, R.drawable.durga,R.drawable.chauth,R.drawable.shiv_chaturdashi,R.drawable.somvar,
            R.drawable.laxmi,R.drawable.papankush_ekadashi20oct,R.drawable.sharadpoornima,R.drawable.gay,R.drawable.shiv,
            R.drawable.shiv_chaturdashi,R.drawable.ahoi,R.drawable.upang,R.drawable.hartalika
    };

    public October() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_october, container, false);
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
        SimpleAdapter simpleAdapter = new SimpleAdapter(getContext(), aList, R.layout.list, from, to);
        ListView androidListView = (ListView) view.findViewById(R.id.list);
        androidListView.setAdapter(simpleAdapter);
        androidListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position)
                {case 0:Intent i = new Intent(getContext(),SaptahikVrat.class);
                        startActivity(i);
                        break;
                    case 1:Intent i1 = new Intent(getContext(),Ekadashivrat.class);
                          startActivity(i1);
                        break;
                    case 2:Intent i2 = new Intent(getContext(),Navratri.class);
                        startActivity(i2);
                        break;
                    case 3:Intent i3 = new Intent(getContext(),choth.class);
                        startActivity(i3);
                        break;
                    case 4:String url5="https://app.docarto.com/praodsh-vrat/";
                        Intent i4 = new Intent(getContext(),vratandVidhi.class);
                        i4.putExtra("message",url5);
                        startActivity(i4);
                        break;
                    case 5:String url1="https://app.docarto.com/16somvar/";
                        Intent i5 = new Intent(getContext(),vratandVidhi.class);
                        i5.putExtra("message",url1);
                        startActivity(i5);
                        break;
                    case 6:String url="https://app.docarto.com/679-2/";
                        Intent i6 = new Intent(getContext(),vratandVidhi.class);
                        i6.putExtra("message",url);
                        startActivity(i6);
                        break;
                    case 7:String url2="https://app.docarto.com/683-2/";
                        Intent i7 = new Intent(getContext(),vratandVidhi.class);
                        i7.putExtra("message",url2);
                        startActivity(i7);
                        break;
                    case 8:Intent i8 = new Intent(getContext(),Purnima.class);
                        startActivity(i8);
                        break;
                    case 9:String url3="https://app.docarto.com/govats-dwadashi/";
                        Intent i9 = new Intent(getContext(),vratandVidhi.class);
                        i9.putExtra("message",url3);
                        startActivity(i9);
                        break;
                    case 10:String url4="https://app.docarto.com/722-2/";
                        Intent i10 = new Intent(getContext(),vratandVidhi.class);
                        i10.putExtra("message",url4);
                        startActivity(i10);
                        break;
                    case 11:String url6="https://app.docarto.com/7oct-shiv-vrat/";
                        Intent i11 = new Intent(getContext(),vratandVidhi.class);
                        i11.putExtra("message",url6);
                        startActivity(i11);
                        break;
                    case 12:String url7="https://app.docarto.com/31oct/";
                        Intent i12 = new Intent(getContext(),vratandVidhi.class);
                        i12.putExtra("message",url7);
                        startActivity(i12);
                        break;
                    case 13:String url8="https://app.docarto.com/13-oct/";
                        Intent i13 = new Intent(getContext(),vratandVidhi.class);
                        i13.putExtra("message",url8);
                        startActivity(i13);
                        break;
                    case 14:String url9="https://app.docarto.com/hartalika-teej/";
                        Intent i14 = new Intent(getContext(),vratandVidhi.class);
                        i14.putExtra("message",url9);
                        startActivity(i14);
                        break;




                }
            }});
return view;
    }}
