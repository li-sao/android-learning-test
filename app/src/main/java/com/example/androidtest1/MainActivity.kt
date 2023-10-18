package com.example.androidtest1

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.androidtest1.R
import com.example.androidtest1.demo.HiLogDemoActivity


class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.tv_hilog -> {
                startActivity(Intent(this, HiLogDemoActivity::class.java))
            }
        }
    }
}
