package com.example.ddgetoedge

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.core.view.WindowCompat

class MainActivity : AppCompatActivity() {
    val list = arrayOf("Item A", "Item B","Item C", "Item D","Item E", "Item F",
        "Item G", "Item H","Item I", "Item J","Item K", "Item L", "Item M","Item N", "Item O")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView:ListView = findViewById(R.id.lstView)
        val arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, list)
        listView.adapter = arrayAdapter

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            WindowCompat.setDecorFitsSystemWindows(window, false)
        }

    }
}