package com.luridevlabs.dopuzzle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem

class PlayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_play)
        val display = supportActionBar
        display?.title = "DoPuzzle"
        display?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId) {
            android.R.id.home -> {
                finish()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}