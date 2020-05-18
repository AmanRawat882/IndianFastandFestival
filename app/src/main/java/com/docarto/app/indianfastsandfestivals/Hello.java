package com.docarto.app.indianfastsandfestivals;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import androidx.viewpager.widget.ViewPager;

import com.google.android.material.navigation.NavigationView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class Hello extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    private static final int REQUEST_CALL = 1;
    private AdView mAdView;
    //ApplicationClass applicationClass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);

       // applicationClass=new ApplicationClass(this);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ViewPager viewPager = (ViewPager) findViewById(R.id.pager);

        AdView adView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder()
                .setRequestAgent("android_studio:ad_template").build();
        adView.loadAd(adRequest);
        adap myPagerAdapter = new adap(getSupportFragmentManager());
        viewPager.setAdapter(myPagerAdapter);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tablayout);
        tabLayout.setupWithViewPager(viewPager);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


    }


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
            finish();
        } else {
            super.onBackPressed();
            finish();

        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.hello, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            final String appPackageName = getPackageName(); // getPackageName() from Context or Activity object
            try {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + appPackageName)));
            } catch (android.content.ActivityNotFoundException anfe) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=" + appPackageName)));
            }

            return true;
        }
        else if(id==R.id.sh)
        {
            try {
                Intent shareIntent = new Intent();
                shareIntent.setAction(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                String shareMessage= "नमस्कार, मै आराधना एप्प का इस्तेमाल कर रहा हूँ जो कि 2 MB की है और इसमें हमें भारतीय व्रत, त्योंहारो, विधि, कथा, चालीसा एवं आरती के बारे में संपूर्ण जानकारी वीडियो सहित"+
                        " दी गयी है| आप भी इसे निचे दिए गए लिंक से डाउनलोड कर सकते है| >>https://play.google.com/store/apps/details?id=com.docarto.app.indianfastsandfestivals\n";
                shareIntent.putExtra(Intent.EXTRA_TEXT, shareMessage);
                startActivity(Intent.createChooser(shareIntent, "Share With"));
            } catch(Exception e) {
                //e.toString();
            }
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
       if(id==R.id.listing)
        {
            String url6 = "https://app.docarto.com/list/";
            Intent intent=new Intent(Hello.this,sidebar.class);
            intent.putExtra("message",url6);
            startActivity(intent);
            finish();

        }
       else if (id == R.id.about) {
            String url5 = "https://app.docarto.com/about-us/";
            Intent intent=new Intent(Hello.this,sidebar.class);
            intent.putExtra("message",url5);
            startActivity(intent);
            finish();
            // Handle the camera action
        }
        else if(id==R.id.customize)
       {
           String url7 = "http://app.docarto.com/contact-us/";
           Intent intent=new Intent(Hello.this,sidebar.class);
           intent.putExtra("message",url7);
           startActivity(intent);
           finish();
       }
        else if (id == R.id.contact) {

           Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                   "mailto","docarto.india@gmail.com", null));
           intent.putExtra(Intent.EXTRA_SUBJECT, "");
           intent.putExtra(Intent.EXTRA_TEXT, "");

           startActivity(Intent.createChooser(intent, "Send Email"));

       }
       else if (id == R.id.share) {

            try {
               Intent shareIntent = new Intent();
                       shareIntent.setAction(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
               String shareMessage= "नमस्कार, मै आराधना एप्प का इस्तेमाल कर रहा हूँ जो कि 2 MB की है और इसमें हमें भारतीय व्रत, त्योंहारो, विधि, कथा, चालीसा एवं आरती के बारे में संपूर्ण जानकारी वीडियो सहित"+
                       " दी गयी है| आप भी इसे निचे दिए गए लिंक से डाउनलोड कर सकते है| >>https://play.google.com/store/apps/details?id=com.docarto.app.indianfastsandfestivals\n";
               shareIntent.putExtra(Intent.EXTRA_TEXT, shareMessage);
               startActivity(Intent.createChooser(shareIntent, "Share With"));
           } catch(Exception e) {
               //e.toString();
           }


        }
        else if(id==R.id.fb)
       {
           Intent facebookIntent = new Intent(Intent.ACTION_VIEW);
           String facebookUrl = getFacebookPageURL(this);
           facebookIntent.setData(Uri.parse(facebookUrl));
           startActivity(facebookIntent);


//method to get the right URL to use in the intent

       }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    private String getFacebookPageURL(Hello hello) {
        String FACEBOOK_URL = "https://m.facebook.com/hindiaradhana";
         String FACEBOOK_PAGE_ID = "hindiaradhana";

        PackageManager packageManager = hello.getPackageManager();
        try {
            int versionCode = packageManager.getPackageInfo("com.facebook.katana", 0).versionCode;
            if (versionCode >= 3002850) { //newer versions of fb app
                return "fb://facewebmodal/f?href=" + FACEBOOK_URL;
            } else { //older versions of fb app
                return "fb://page/" + FACEBOOK_PAGE_ID;
            }
        } catch (PackageManager.NameNotFoundException e) {
            return FACEBOOK_URL; //normal web url
        }
    }
}
