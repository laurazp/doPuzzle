package com.luridevlabs.dopuzzle

import android.content.Intent
import android.database.sqlite.SQLiteDatabase
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    var filePath = "https://www.soundhelix.com/examples/mp3/SoundHelix-Song-13.mp3"
    var MediaPlayer = false
    var musicPlaying = false
    private lateinit var serviceIntent: Intent
    private lateinit var playButton: Button
    private lateinit var settingsButton: Button
    private lateinit var scoreButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        configMusic()
        configButtons()
    }

    private fun configMusic() {
        serviceIntent = Intent(this, MusicService::class.java)
        serviceIntent.putExtra("FilePath", filePath)
    }

    private fun configButtons() {
        //PlayButton
        playButton = findViewById(R.id.playBtn)
        playButton.setBackgroundColor(Color.parseColor("#F7C52C"))
        playButton.setOnClickListener { v ->
            val playIntent = Intent(v.context, PlayActivity::class.java)
            v.context.startActivity(playIntent)
        }

        //SettingsButton
        settingsButton = findViewById(R.id.settingsBtn)
        settingsButton.setBackgroundColor(Color.parseColor("#16C282"))
        settingsButton.setOnClickListener { v ->
            val settingsIntent = Intent(v.context, SettingsActivity::class.java)
            v.context.startActivity(settingsIntent)
        }

        //ScoreButton
        scoreButton = findViewById(R.id.scoreBtn)
        scoreButton.setBackgroundColor(Color.parseColor("#0000FF"))
        scoreButton.setOnClickListener { v ->
            // TODO: Configure SQLite

            val scoreIntent = Intent(v.context, ScoreActivity::class.java)
            v.context.startActivity(scoreIntent)
        }
    }
}