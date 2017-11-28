package com.example.lastn.swoosh.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.lastn.swoosh.Model.Player
import com.example.lastn.swoosh.R
import com.example.lastn.swoosh.Utillities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)

        searchLeaguesText.text = "Looking for a ${player.skill} ${player.league} league in your area..."
    }
}
