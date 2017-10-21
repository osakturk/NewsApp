package com.omerakturk.gazetewithmenu.activity;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import com.omerakturk.gazetewithmenu.R;
import com.omerakturk.gazetewithmenu.fragment.DunyaFragment;
import com.omerakturk.gazetewithmenu.fragment.EkonomiFragment;
import com.omerakturk.gazetewithmenu.fragment.GaleriFragment;
import com.omerakturk.gazetewithmenu.fragment.GundemFragment;
import com.omerakturk.gazetewithmenu.fragment.KadinFragment;
import com.omerakturk.gazetewithmenu.fragment.KulturSanatFragment;
import com.omerakturk.gazetewithmenu.fragment.MagazinFragment;
import com.omerakturk.gazetewithmenu.fragment.SeyahatFragment;
import com.omerakturk.gazetewithmenu.fragment.SporFragment;
import com.omerakturk.gazetewithmenu.fragment.TeknolojiFragment;
import com.omerakturk.gazetewithmenu.fragment.VideoFragment;

public class WebHaberActivity extends Activity {
    private ProgressDialog progressDialog;
    private WebView webView;
    private String gelenFragment;
    private String url;
    private Intent intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_haber);

        progressDialog=new ProgressDialog(this);

        progressDialog.setMessage("Haber Sayfası Yükleniyor Lütfen Bekleyiniz");
        progressDialog.setCancelable(false);
        progressDialog.setInverseBackgroundForced(false);
        progressDialog.setIndeterminate(false);
        gelenFragment=MainActivity.CURRENT_TAG;
        webView= (WebView) findViewById(R.id._haber_web_view);
        intent=getIntent();
        switch (gelenFragment){
            case "gundem":
                url=intent.getStringExtra(GundemFragment.GELEN_SITE);
                break;
            case "ekonomi":
                url=intent.getStringExtra(EkonomiFragment.GELEN_SITE);
                break;
            case "dünya":
                url=intent.getStringExtra(DunyaFragment.GELEN_SITE);
                break;
            case "kadin":
                url=intent.getStringExtra(KadinFragment.GELEN_SITE);
                break;
            case "spor":
                url=intent.getStringExtra(SporFragment.GELEN_SITE);
                break;
            case "teknoloji":
                url=intent.getStringExtra(TeknolojiFragment.GELEN_SITE);
                break;
            case "magazin":
                url=intent.getStringExtra(MagazinFragment.GELEN_SITE);
                break;
            case "kultur":
                url=intent.getStringExtra(KulturSanatFragment.GELEN_SITE);
                break;
            case "seyahat":
                url=intent.getStringExtra(SeyahatFragment.GELEN_SITE);
                break;
            case "video":
                url=intent.getStringExtra(VideoFragment.GELEN_SITE);
                break;
            case "galeri":
                url=intent.getStringExtra(GaleriFragment.GELEN_SITE);
                break;
        }

        webView.setWebViewClient(new WebViewClient() {
            @Override
            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                Toast.makeText(WebHaberActivity.this, "Beklenmedik hata", Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon)
            {
                webView.getSettings().setJavaScriptEnabled(true);
                webView.getSettings().setAllowFileAccess(true);
                webView.getSettings().setSupportZoom(true);
                progressDialog.show();
            }
            @Override
            public void onPageFinished(WebView view, String url) {
                progressDialog.dismiss();
                webView.getUrl();
            }
        });
        webView.loadUrl(url);
    }
}
