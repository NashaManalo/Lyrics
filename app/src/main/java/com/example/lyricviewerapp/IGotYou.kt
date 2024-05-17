package com.example.lyricviewerapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.lyricviewerapp.databinding.ActivityIgotYouBinding

class IGotYou : AppCompatActivity() {
    private lateinit var binding: ActivityIgotYouBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIgotYouBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val lyrics = "A little reckless around the edges\n" +
                "Call it young, dumb love and it's just enough\n" +
                "Keep me guessing (keep me guessing)\n" +
                "How the story unfolds with you (you)\n" +
                "When I'm walking into the darkness\n" +
                "I know you'll be right there, lighting up the flares\n" +
                "When it's starless, I will follow you to the moon (moon, ayy)\n\n" +

                "No, we'll never fall apart (never fall apart)\n" +
                "Even million miles apart (million miles apart)\n" +
                "We were lightning from the start (lightning from the start)\n" +
                "And it keeps me going to know that\n\n" +

                "Ooh, no matter what, you got me\n" +
                "I got you and I wouldn't want it any other way\n" +
                "Ooh, no drop of doubt, I know deep down that\n" +
                "We'll make it through (it through)\n" +
                "Just like we always do\n\n" +

                "Ayy, every second, every minute\n" +
                "Want you close to me like you're supposed to be\n" +
                "Ain't no limit (ain't no limit)\n" +
                "To what I would do for you, oh, oh\n" +
                "And you know, you turn my whole world upside down\n" +
                "Catch me before I ever hit the ground\n" +
                "And I'd do the same for you, oh, whoa\n\n"
 binding.txtIGotYouLyrics.setText(lyrics)
    }
}