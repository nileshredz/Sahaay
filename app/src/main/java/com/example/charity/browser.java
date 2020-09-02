package com.example.charity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.Toast;

public class browser extends AppCompatActivity {
    WebView webview;
    SwipeRefreshLayout superSwipeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browser);


        ImageView share;

        webview = findViewById(R.id.webview);
        superSwipeLayout = findViewById(R.id.mySwipelayout);
        share = findViewById(R.id.share);


        final String website = getIntent().getExtras().getString("website");

        Toast.makeText(browser.this,"URL: "+website,Toast.LENGTH_SHORT).show();


        webview.loadUrl(website);
        WebSettings webSettings  = webview.getSettings();
        webSettings.setJavaScriptEnabled(true);

        webview.setWebViewClient(new WebViewClient(){
            @Override
            public void onPageFinished(WebView view, String url) {
                superSwipeLayout.setRefreshing(false);
                super.onPageFinished(view, url);
            }
        });

        superSwipeLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                webview.reload();
            }
        });

        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                String subject = "Hey! \nI would like you to check out this NGO. Let's help them. \nLink: " +website+" \n \n Do Checkout Sahaay.";
                //intent.putExtra(Intent.EXTRA_SUBJECT,website);
                intent.putExtra(Intent.EXTRA_TEXT,subject);
                startActivity(Intent.createChooser(intent,"Share the link using:"));

            }
        });



    }
    @Override
    public void onBackPressed() {
        if (webview.canGoBack()) {
            webview.goBack();
        } else {
            super.onBackPressed();
        }
    }

}
