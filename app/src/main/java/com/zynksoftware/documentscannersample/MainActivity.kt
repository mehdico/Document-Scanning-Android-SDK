package com.zynksoftware.documentscannersample

import android.os.Bundle
import android.widget.RelativeLayout
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var scanLibButton: RelativeLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        scanLibButton = findViewById(R.id.scanLibButton)
        initListners()
    }

    private fun initListners() {
        scanLibButton.setOnClickListener {
            AppScanActivity.start(this)
        }
    }
}