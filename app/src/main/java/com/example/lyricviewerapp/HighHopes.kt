package com.example.lyricviewerapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.lyricviewerapp.databinding.ActivityHighHopesBinding

class HighHopes : AppCompatActivity() {
    private lateinit var binding: ActivityHighHopesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHighHopesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val lyrics = "Had to have high, high hopes for a living\n" +
                "Shooting for the stars when I couldn't make a killing\n" +
                "Didn't have a dime but I always had a vision\n" +
                "Always had high, high hopes\n" +
                "Had to have high, high hopes for a living\n" +
                "Didn't know how but I always had a feeling\n" +
                "I was gonna be that one in a million\n" +
                "Always had high, high hopes\n\n" +

                "Mama said\n" +
                "Fulfill the prophecy\n" +
                "Be something greater\n" +
                "Go make a legacy\n" +
                "Manifest destiny\n" +
                "Back in the days\n" +
                "We wanted everything, wanted everything\n" +
                "Mama said\n" +
                "Burn your biographies\n" +
                "Rewrite your history\n" +
                "Light up your wildest dreams\n" +
                "Museum victories, everyday\n" +
                "We wanted everything, wanted everything\n\n" +

                "Mama said don't give up, it's a little complicated\n" +
                "All tied up, no more love and I'd hate to see you waiting\n\n" +

                "Had to have high, high hopes for a living\n" +
                "Shooting for the stars when I couldn't make a killing\n" +
                "Didn't have a dime but I always had a vision\n" +
                "Always had high, high hopes\n"
        binding.txtHighHopesLyrics.setText(lyrics)
    }
}