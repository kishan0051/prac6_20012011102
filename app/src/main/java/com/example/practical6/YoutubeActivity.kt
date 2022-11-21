package com.example.practical6

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebSettings
import androidx.core.view.WindowCompat
import com.example.practical6.databinding.ActivityMainBinding
import com.example.practical6.databinding.ActivityYoutubeBinding

class YoutubeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityYoutubeBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        WindowCompat.setDecorFitsSystemWindows(window, false)
        super.onCreate(savedInstanceState)
        binding = ActivityYoutubeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initYoutubePlayer()
    }

    private val youtubeid = "fJn9B64Znrk"
    private fun initYoutubePlayer() {
        val webSettings: WebSettings = binding.youtubeWebView.settings
        webSettings.javaScriptEnabled = true
        webSettings.loadWithOverviewMode = true
        webSettings.useWideViewPort = true
        binding.youtubeWebView.loadUrl("https://www.youtube.com/embed/$youtubeid")
    }
}

