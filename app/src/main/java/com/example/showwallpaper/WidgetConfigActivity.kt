package com.example.showwallpaper

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import com.example.showwallpaper.databinding.ActivityMainBinding
import com.example.showwallpaper.databinding.ActivityWidgetConfigBinding

class WidgetConfigActivity : AppCompatActivity() {

    private lateinit var binding: ActivityWidgetConfigBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityWidgetConfigBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}