package com.docarto.app.indianfastsandfestivals;

import android.graphics.Bitmap;
import android.os.CountDownTimer;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

//import java.lang.reflect.InvocationTargetException;

public class vratandVidhi extends AppCompatActivity {
    WebView webView;
    Button refershbutton;
    String url,act;
Toast toast;
    static CountDownTimer timer =null;
TextView im;
 ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vratand_vidhi);
        Bundle bundle = getIntent().getExtras();
        url = bundle.getString("message");
        act = bundle.getString("activity");
        webView = (WebView) findViewById(R.id.web);
        AdView adView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder()
                .setRequestAgent("android_studio:ad_template").build();
        adView.loadAd(adRequest);

        im = (TextView) findViewById(R.id.text);
        refershbutton=(Button)findViewById(R.id.ref);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setUseWideViewPort(true);
        webView.setScrollBarStyle(WebView.SCROLLBARS_OUTSIDE_OVERLAY);
        webView.setScrollbarFadingEnabled(false);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setDisplayZoomControls(false);
        webView.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        webView.getSettings().setCacheMode(WebSettings.LOAD_NO_CACHE);
        webView.loadUrl(url);
        refershbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                  webView.reload();
                webView.setVisibility(View.VISIBLE);
                im.setVisibility(View.INVISIBLE);

            }
        });
       // webView.loadUrl(url);

        // webView.setWebViewClient(new myWebClient());


        if (!DetectConnection.checkInternetConnection(this)) {
            Toast.makeText(getApplicationContext(), "No  Internet connection please connect", Toast.LENGTH_LONG).show();
            im.setVisibility(View.VISIBLE);
            findViewById(R.id.imag).setVisibility(View.INVISIBLE);
           // webView.setVisibility(View.INVISIBLE);
        } else {
           // webView.setVisibility(View.VISIBLE);
            //show not internet connectedn text
            im.setVisibility(View.INVISIBLE);

            webView.setWebViewClient(new myWebClient());
           // webView.getSettings().setJavaScriptEnabled(true);

        }
    }
        public class myWebClient extends WebViewClient
        {
            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
// TODO Auto-generated method stub
                super.onPageStarted(view, url, favicon);
                //show gif image
                findViewById(R.id.imag).setVisibility(View.VISIBLE);

            }
            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                // hide gif image
                findViewById(R.id.imag).setVisibility(View.INVISIBLE);
                //show webview
                webView.setVisibility(View.VISIBLE);


            }


           /* @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
// TODO Auto-generated method stub

                view.loadUrl(url);
                return true;

            }*/
        }

        @Override
        public boolean onKeyDown(int keyCode, KeyEvent event)
        {
            if ((keyCode == android.view.KeyEvent.KEYCODE_BACK) && webView.canGoBack()) {
                webView.goBack();
                return true;
            }
            return super.onKeyDown(keyCode, event);
        }



       /* @Override
    // Detect when the back button is pressed
    public void onBackPressed() {
        if(webView.canGoBack()) {
            webView.goBack();
        } else {
            super.onBackPressed();
             finish();

        }
    }*/
  /*  @Override
    public void onPause() {
        super.onPause();

        try {
            Class.forName("android.webkit.WebView")
                    .getMethod("onPause", (Class[]) null)
                    .invoke(webView, (Object[]) null);

        } catch(ClassNotFoundException cnfe) {

        } catch(NoSuchMethodException nsme) {

        } catch(InvocationTargetException ite) {

        } catch (IllegalAccessException iae) {

        }
    }
*/

}





