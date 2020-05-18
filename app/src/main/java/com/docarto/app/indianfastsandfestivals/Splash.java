package com.docarto.app.indianfastsandfestivals;

import android.content.Intent;
import android.graphics.Bitmap;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Splash extends AppCompatActivity {
WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        webView=(WebView)findViewById(R.id.web_engine);
        webView.setWebViewClient(new Customclint());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.setOverScrollMode(WebView.OVER_SCROLL_NEVER);

        webView.loadUrl("https://app.docarto.com");
        /*new Handler().postDelayed(new Runnable() {


            @Override
            public void run() {
                // This method will be executed once the timer is over
                Intent i = new Intent(Splash.this, Hello.class);
                startActivity(i);
                finish();
            }
        }, 3000);*/

    }
    private class Customclint extends WebViewClient
    {
        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
               // findViewById(R.id.main_view).setVisibility(View.INVISIBLE);
                //webView.setVisibility(View.INVISIBLE);

        }

        @Override
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);
          Intent intent=new Intent(Splash.this,Hello.class);
           startActivity(intent);
           finish();
        }

    }


}
