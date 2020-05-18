package com.docarto.app.indianfastsandfestivals;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

/**
 * Created by ABC on fi-09-2018.
 */

public class adap extends FragmentStatePagerAdapter {
    String s[]=new String[]{"प्रमुख व्रत","प्रमुख त्यौहार","आरती","चालीसा"};
    int num=4;
    public adap(FragmentManager fm)
    {
        super(fm);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return s[position];
    }



    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:return new October();
            case 1:return new November();
            case 2:return new Arti();
            case 3:return new Chalisha();
        }
        return null;
    }

    @Override
    public int getCount() {
        return num;
    }
}

