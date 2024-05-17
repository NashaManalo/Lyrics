package com.example.lyricviewerapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.lyricviewerapp.databinding.ActivityEightLettersBinding

class EightLetters : AppCompatActivity() {
    private lateinit var binding:ActivityEightLettersBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEightLettersBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val lyrics = "You know me the best\n" +
                "You know my worst, see me hurt, but you don't judge\n" +
                "That right there is the scariest feeling\n" +
                "Opening and closing up again\n" +
                "I've been hurt, so I don't trust\n" +
                "Now here we are, staring at the ceiling\n\n" +

                "I've said those words before, but it was a lie\n" +
                "And you deserve to hear them a thousand times\n\n" +

                "If all it is is eight letters\n" +
                "Why is it so hard to say?\n" +
                "If all it is is eight letters\n" +
                "Why am I in my own way?\n" +
                "Why do I pull you close?\n" +
                "And then ask you for space\n" +
                "If all it is is eight letters\n" +
                "Why is it so hard to say?\n\n" +

                "Isn't it amazing how almost every line on our hands align?\n" +
                "When your hand's in mine\n" +
                "It's like I'm whole again, isn't that a sign?\n" +
                "I should speak my mind\n\n" +

                "I've said those words before, but it was a lie\n" +
                "And you deserve to hear them a thousand times\n\n"

        binding.txt8LettersLyrics.setText(lyrics)
    }
}