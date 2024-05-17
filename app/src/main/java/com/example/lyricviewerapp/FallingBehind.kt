package com.example.lyricviewerapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.lyricviewerapp.databinding.ActivityFallingBehindBinding

class FallingBehind : AppCompatActivity() {
    private lateinit var binding: ActivityFallingBehindBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFallingBehindBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val lyrics = "Moved out to a new city\n" +
                "June is dawning down on me\n" +
                "And all that I can find\n" +
                "A sickly romance in the air\n" +
                "Lovers stroll without a care in sight\n" +
                "Ooh, this can't be right\n\n" +

                "'Cause the sun's engaged to the sky\n" +
                "And my best friend's found a new guy\n" +
                "I'm only getting older\n" +
                "I've never had a shoulder to cry on\n" +
                "Someone to call mine\n" +
                "Everybody's falling in love and I'm falling behind\n\n" +

                "Touched the ocean, fell right in\n" +
                "Stepped outside and burned my skin\n" +
                "My life won't go my way\n" +
                "Bossa nova in my room\n" +
                "Hope that I'll find someone too to love\n" +
                "Because\n\n" +

                "The sun's engaged to the sky\n" +
                "And my best friend's found a new guy\n" +
                "I'm only getting older\n" +
                "I've never had a shoulder to cry on\n" +
                "Someone to call mine\n" +
                "Everybody's falling in love and I'm falling behind\n\n" +

                "Everybody's falling in love\n" +
                "Everybody's falling in love, oh\n" +
                "Everybody's falling in love but me\n" +
                "(One, two, three)"
        binding.txtFallingBehindLyrics.setText(lyrics)

    }
}