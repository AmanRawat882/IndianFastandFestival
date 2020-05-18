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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class November extends Fragment {

    String[] listviewTitle = new String[]{
            "चैत्र माह के त्यौहार ", "वैषाख माह के त्यौहार", "ज्येष्ठ माह के त्यौहार ", "आषाढ़ माह के त्यौहार ",
            "श्रावण माह के त्यौहार ", "भाद्रपद माह के त्यौहार ", "अश्विन माह के त्यौहार", "कार्तिक माह के त्यौहार",
    "मार्गशीर्ष माह के त्यौहार ","पौष माह के त्यौहार ","माघ माह के त्यौहार ","फाल्गुन माह के त्यौहार "};
    String[] listviewdec=new String[]{"मार्च-अप्रेल","अप्रेल -मई","मई-जून","जून-जुलाई","जुलाई- अगस्त","अगस्त -सितम्बर",
            "सितम्बर- अक्टूबर","अक्टूबर – नवम्बर","नवम्बर – दिसम्बर","दिसम्बर- जनवरी","जनवरी-फरवरी","फरवरी -मार्च"};

    int[] listviewImage = new int[]{
            R.drawable.side2, R.drawable.side1, R.drawable.side2,
            R.drawable.side1,R.drawable.side2,R.drawable.side1,R.drawable.side2,R.drawable.side1,R.drawable.side2,
            R.drawable.side1,R.drawable.side2,R.drawable.side1
    };

    public November() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_november, container, false);
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
                {
                    case 0:Intent i = new Intent(getContext(),chtre.class);
                        startActivity(i);
                        break;
                    case 1:Intent i1 = new Intent(getContext(),veshak.class);
                    i1.putExtra("title1","अक्षय तृतीया, आखातीज");
                        i1.putExtra("title2","परशुराम जयंती");
                        i1.putExtra("title3","बुद्ध पूर्णिमा");
                        i1.putExtra("title4","नृसिंह जयन्ती");
                        i1.putExtra("url1","https://app.docarto.com/akshay/");
                        i1.putExtra("url2","https://app.docarto.com/parsuram/");
                        i1.putExtra("url3","https://app.docarto.com/budhpurnima/");
                        i1.putExtra("url4","https://app.docarto.com/narasimha-jayanti/");
                        i1.putExtra("name","fir");
                         startActivity(i1);
                        break;
                    case 2:Intent i2 = new Intent(getContext(),Festivals.class);
                        i2.putExtra("title1","गंगा दशहरा");
                        i2.putExtra("title2","निर्जला एकादशी");
                        i2.putExtra("url1","https://app.docarto.com/ganga-dussehra/");
                        i2.putExtra("url2","https://app.docarto.com/428-2/");
                        i2.putExtra("name","b1");
                        startActivity(i2);
                        break;
                    case 3:Intent i3 = new Intent(getContext(),Festivals.class);
                        i3.putExtra("title1","भगवान जगन्नाथ रथोत्सव");
                        i3.putExtra("title2","गुरू पुर्णिमा");
                        i3.putExtra("url1","https://app.docarto.com/god/");
                        i3.putExtra("url2","https://app.docarto.com/gurupurnima/");
                        i3.putExtra("name","b2");
                        startActivity(i3);
                        break;

                    case 4:Intent i4 = new Intent(getContext(),sawan.class);
                        startActivity(i4);
                        break;
                    case 5:Intent i5 = new Intent(getContext(),Bhadrpad.class);
                        i5.putExtra("title1","बड़ी/बुडी/कजली तीज");
                        i5.putExtra("title2","जन्माष्टमी");
                        i5.putExtra("title3","गोगानवमी(विशाल मेला)");
                        i5.putExtra("title4","रामदेव जयन्ती/मेला प्रारम्भ");
                        i5.putExtra("title5","गणेश चतुर्थी");
                        i5.putExtra("url1","https://app.docarto.com/badi/");
                        i5.putExtra("url2","https://app.docarto.com/janmastami/");
                        i5.putExtra("url3","https://app.docarto.com/goga/");
                        i5.putExtra("url4","https://app.docarto.com/ramdev-jaynti/");
                        i5.putExtra("url5","https://app.docarto.com/ganeshchaturti/");
                        i5.putExtra("name","bd");
                        startActivity(i5);
                        break;
                    case 6:Intent i6 = new Intent(getContext(),Bhadrpad.class);
                        i6.putExtra("title1","गांधी जयंती");
                        i6.putExtra("title2","मातृ नवमी");
                        i6.putExtra("title3","महाराज अग्रसेन जयंती");
                        i6.putExtra("title4","दुर्गा अष्टमी");
                        i6.putExtra("title5","दशहरा/विजयदशमी");
                        i6.putExtra("url1","https://app.docarto.com/oct2-gandhi-jayanti/");
                        i6.putExtra("url2","https://app.docarto.com/3oct/");
                        i6.putExtra("url3","https://app.docarto.com/maharaj-agrasen-jayanti/");
                        i6.putExtra("url4","https://app.docarto.com/durga-ashtami/");
                        i6.putExtra("url5","https://app.docarto.com/18oct/");

                        i6.putExtra("name","asv");
                        startActivity(i6);

                        break;
                    case 7:Intent i7 = new Intent(getContext(),kartik.class);
                         startActivity(i7);
                        break;
                    case 8:Intent i8 = new Intent(getContext(),festthree.class);
                        i8.putExtra("title1","भैरव जयन्ती");
                        i8.putExtra("title2","दत्तात्रेय जयन्ती");
                        i8.putExtra("title3","क्रिसमस का त्यौहार");
                        i8.putExtra("url1","https://app.docarto.com/bhairav-jayanti/");
                        i8.putExtra("url2","https://app.docarto.com/dattatreya/");
                        i8.putExtra("url3","https://app.docarto.com/krishmas/");
                        i8.putExtra("name","tr");
                        startActivity(i8);

                        break;
                    case 9:Intent i9 = new Intent(getContext(),festthree.class);
                        i9.putExtra("title1","लोहड़ी का त्यौहार");
                        i9.putExtra("title2","मकर सक्रांति");
                        i9.putExtra("title3","पौंगल ");
                        i9.putExtra("url1","https://app.docarto.com/lohri/");
                        i9.putExtra("url2","https://app.docarto.com/makar/");
                        i9.putExtra("url3","https://app.docarto.com/pongal/");
                        i9.putExtra("name","four");
                         startActivity(i9);

                        break;
                    case 10:Intent i10 = new Intent(getContext(),Festivals.class);
                        i10.putExtra("title1","बसंत पचमी");
                        i10.putExtra("title2","गणतंत्र  दिवस");
                        i10.putExtra("url1","https://app.docarto.com/basant-panchami/");
                        i10.putExtra("url2","https://app.docarto.com/26-jan/");
                        i10.putExtra("name","b3");
                        startActivity(i10);
                        break;
                    case 11:Intent i11 = new Intent(getContext(),Festivals.class);
                        i11.putExtra("title1","महाशिवरात्रि");
                        i11.putExtra("title2","होलीका दहन/धुलंडी");
                        i11.putExtra("url1","https://app.docarto.com/shivratri/");
                        i11.putExtra("url2","https://app.docarto.com/holi/");
                        i11.putExtra("name","b4");
                        startActivity(i11);

                        break;


                }

            }
        });
         return view; }

}
