package com.docarto.app.indianfastsandfestivals;

import android.os.CountDownTimer;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class sidebar extends AppCompatActivity {
    WebView webView;
    String url,act;
    Toast toast;
    TextView im;
    static CountDownTimer timer =null;
    ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sidebar); Bundle bundle = getIntent().getExtras();
        url = bundle.getString("message");
        webView = (WebView) findViewById(R.id.web);
        im=(TextView) findViewById(R.id.text);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setUseWideViewPort(true);
        webView.setScrollBarStyle(WebView.SCROLLBARS_OUTSIDE_OVERLAY);
        webView.setScrollbarFadingEnabled(false);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        webView.getSettings().setCacheMode(WebSettings.LOAD_NO_CACHE);
        webView.loadUrl(url);
         if (!DetectConnection.checkInternetConnection(this)) {
            Toast.makeText(getApplicationContext(),"No  Internet connection please connect" , Toast.LENGTH_LONG).show();
            im.setVisibility(View.VISIBLE);
            webView.setVisibility(View.INVISIBLE);
        }
        else {
             webView.setVisibility(View.VISIBLE);
             im.setText("आपकी विषय-वस्तु लोड हो रही है कृप्या थोड़ी देर प्रतीक्षा करें,धन्यवाद।");
             im.postDelayed(new Runnable() {
                 @Override
                 public void run() {
                     im.setVisibility(View.INVISIBLE);
                 }
             },3000);

             webView.setWebViewClient(new WebViewClient() {
                public boolean shouldOverrideUrlLoading(WebView view, String url) {
                    view.loadUrl(url);
                    return true;
                }});
        }
    }


    @Override
    // Detect when the back button is pressed
    public void onBackPressed() {
        if(webView.canGoBack()) {
            webView.goBack();
        } else {
            Intent intent=new Intent(sidebar.this,Hello.class);
            startActivity(intent);
            finish();
            // super.onBackPressed();
        }
    }


}



