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
public class Chalisha extends Fragment {
    String[] listviewTitle = new String[]{
            "श्री गणेश चालीसा ", "श्री हनुमान चालीसा", "श्री दुर्गा चालीसा", "श्री महालक्ष्मी चालीसा ",
            "श्री सरस्वती चालीसा","श्री शनि चालीसा","श्री राधा चालीसा","श्री काली चालीसा","श्री पार्वती चालीसा",
            "श्री गायत्री चालीसा","श्री विन्धयेस्वरी चालीसा","श्री लक्ष्मी चालीसा","श्री नवग्रह चालीसा","श्री सूर्य चालीसा",
            "श्री भैरव चालीसा","श्री कृष्ण चालीसा","श्री विष्णु चालीसा","श्रीराम चालीसा","शिव चालीसा"};
    int[] listviewImage = new int[]{
            R.drawable.budh, R.drawable.mangal, R.drawable.durga,
            R.drawable.laxmi,R.drawable.basant,R.drawable.shani,R.drawable.radhaji,R.drawable.kalima,R.drawable.parvatimaa,
            R.drawable.gayatrima,
            R.drawable.durga,R.drawable.laxmi,R.drawable.navgrah,R.drawable.ravi,
            R.drawable.bhairav,R.drawable.janmashthami,R.drawable.indiraekadashivrat,R.drawable.ramnavami,R.drawable.shiv
    };


    public Chalisha() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_chalisha, container, false);
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
        SimpleAdapter simpleAdapter = new SimpleAdapter(getContext(), aList, R.layout.list1, from, to);
        ListView androidListView = (ListView) view.findViewById(R.id.list);
        androidListView.setAdapter(simpleAdapter);
        androidListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position)
                {
                    case 0:String url="https://app.docarto.com/ganesh-chalisa/";
                        Intent i=new Intent(getContext(),vratandVidhi.class);
                        i.putExtra("message",url);
                        startActivity(i);
                        break;
                    case 1:String url1="https://app.docarto.com/hanuman-chalisa/";
                        Intent i1=new Intent(getContext(),vratandVidhi.class);
                        i1.putExtra("message",url1);
                        startActivity(i1);
                        break;
                    case 2:String url2="https://app.docarto.com/durga-chalisa/";
                        Intent i2=new Intent(getContext(),vratandVidhi.class);
                        i2.putExtra("message",url2);
                        startActivity(i2);
                        break;
                    case 3:String url3="https://app.docarto.com/mahalaxmi-chalisa/";
                        Intent i3=new Intent(getContext(),vratandVidhi.class);
                        i3.putExtra("message",url3);
                        startActivity(i3);
                        break;
                    case 4:String url4="https://app.docarto.com/saravati-chalisa/";
                        Intent i4=new Intent(getContext(),vratandVidhi.class);
                        i4.putExtra("message",url4);
                        startActivity(i4);
                        break;
                    case 5:String url5="https://app.docarto.com/shani-chalisa/";
                        Intent i5=new Intent(getContext(),vratandVidhi.class);
                        i5.putExtra("message",url5);
                        startActivity(i5);
                        break;
                    case 6:String url6="https://app.docarto.com/radha-chalisa/";
                        Intent i6=new Intent(getContext(),vratandVidhi.class);
                        i6.putExtra("message",url6);
                        startActivity(i6);
                        break;
                    case 7:String url7="https://app.docarto.com/kali-chalisa/";
                        Intent i7=new Intent(getContext(),vratandVidhi.class);
                        i7.putExtra("message",url7);
                        startActivity(i7);
                        break;
                    case 8:String url8="https://app.docarto.com/parvati-chalisa/";
                        Intent i8=new Intent(getContext(),vratandVidhi.class);
                        i8.putExtra("message",url8);
                        startActivity(i8);
                        break;
                    case 9:String url9="https://app.docarto.com/gayatri-chalisa/";
                        Intent i9=new Intent(getContext(),vratandVidhi.class);
                        i9.putExtra("message",url9);
                        startActivity(i9);
                        break;
                    case 10:String url10="https://app.docarto.com/vindheswari-chalisa/";
                        Intent i10=new Intent(getContext(),vratandVidhi.class);
                        i10.putExtra("message",url10);
                        startActivity(i10);
                        break;
                    case 11:String url11="https://app.docarto.com/laxmi-chalisa/";
                        Intent i11=new Intent(getContext(),vratandVidhi.class);
                        i11.putExtra("message",url11);
                        startActivity(i11);
                        break;
                    case 12:String url12="https://app.docarto.com/navgrah/";
                        Intent i12=new Intent(getContext(),vratandVidhi.class);
                        i12.putExtra("message",url12);
                        startActivity(i12);
                        break;
                    case 13:String url13="https://app.docarto.com/surya-chalisa/";
                        Intent i13=new Intent(getContext(),vratandVidhi.class);
                        i13.putExtra("message",url13);
                        startActivity(i13);
                        break;
                    case 14:String url14="https://app.docarto.com/bhairav-chalisa/";
                        Intent i14=new Intent(getContext(),vratandVidhi.class);
                        i14.putExtra("message",url14);
                        startActivity(i14);
                        break;
                    case 15:String url15="https://app.docarto.com/krishna-chalisa/";
                        Intent i15=new Intent(getContext(),vratandVidhi.class);
                        i15.putExtra("message",url15);
                        startActivity(i15);
                        break;
                    case 16:String url16="https://app.docarto.com/vishnu-chalisa/";
                        Intent i16=new Intent(getContext(),vratandVidhi.class);
                        i16.putExtra("message",url16);
                        startActivity(i16);
                        break;
                    case 17:String url17="https://app.docarto.com/ram-chalisa/";
                        Intent i17=new Intent(getContext(),vratandVidhi.class);
                        i17.putExtra("message",url17);
                        startActivity(i17);
                        break;
                    case 18:String url18="http://app.docarto.com/shiv-chalisa/";
                        Intent i18=new Intent(getContext(),vratandVidhi.class);
                        i18.putExtra("message",url18);
                        startActivity(i18);
                        break;


                }
            }
        });
        return view;
    }

}
