package com.example.webview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {

    private val BASE_URL = "https://1f53-181-166-174-199.sa.ngrok.io"
    private val BASE_URL2 = "192.168.0.10:3003"
    private val BASE_URL3 = "https://www.google.com.ar"


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setTitle("Mobile")
        setContentView(R.layout.activity_main)

        //webView
        val miVisorWeb: WebView = findViewById(R.id.webView1)

        miVisorWeb.webChromeClient = object : WebChromeClient(){

        }

        miVisorWeb.webViewClient = object : WebViewClient () {

        }

        val settings = miVisorWeb.settings

        settings.javaScriptEnabled = true

        miVisorWeb.loadUrl(BASE_URL3)






    }
}