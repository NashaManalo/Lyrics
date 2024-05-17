package com.example.lyricviewerapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.lyricviewerapp.databinding.ActivityEspressoBinding

class Espresso : AppCompatActivity() {
    private lateinit var binding: ActivityEspressoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEspressoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val lyrics = "I'm working late 'cause I'm a singer\n" +
                "Oh, he looks so cute wrapped around my finger\n" +
                "My twisted humor, make him laugh so often\n" +
                "My honey bee, come and get this pollen\n\n" +

                "Too bad your ex don't do it for ya\n" +
                "Walked in and dream came trued it for ya\n" +
                "Soft skin and I perfumed it for ya\n" +
                "I know I Mountain Dew it for ya\n" +
                "That morning coffee, brewed it for ya\n" +
                "One touch and I brand newed it for ya\n\n" +

                "Now he's thinkin' 'bout me every night, oh\n" +
                "Is it that sweet? I guess so\n" +
                "Say you can't sleep, baby, I know\n" +
                "That's that me, espresso\n" +
                "Move it up, down, left, right, oh\n" +
                "Switch it up like Nintendo\n" +
                "Say you can't sleep, baby, I know\n" +
                "That's that me, espresso\n\n" +

                "He's thinkin' 'bout me every night, oh\n" +
                "Is it that sweet? I guess so\n" +
                "Say you can't sleep, baby, I know\n" +
                "That's that me, espresso\n" +
                "Move it up, down, left, right, oh\n" +
                "Switch it up like Nintendo\n" +
                "Say you can't sleep, baby, I know\n" +
                "That's that me, espresso\n\n" +

                "Is it that sweet? I guess so\n" +
                "That's that me, espresso"
        binding.txtEspressoLyrics.setText(lyrics)
    }
}
