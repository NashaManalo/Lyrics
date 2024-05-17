package com.example.lyricviewerapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.lyricviewerapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnEspresso.setOnClickListener(){
            val intent = Intent (this, Espresso::class.java)
            startActivity(intent)
        }

        binding.btnIGotYou.setOnClickListener(){
            val intent = Intent (this, IGotYou::class.java)
            startActivity(intent)
        }

        binding.btn8Letters.setOnClickListener(){
            val intent = Intent (this, EightLetters::class.java)
            startActivity(intent)
        }

        binding.btnLilyOfTheValley.setOnClickListener(){
            val intent = Intent (this, LilyOfTheValley::class.java)
            startActivity(intent)
        }

        binding.btnMananatili.setOnClickListener(){
            val intent = Intent (this, Mananatili::class.java)
            startActivity(intent)
        }

        binding.btnFallingBehind.setOnClickListener(){
            val intent = Intent (this, FallingBehind::class.java)
            startActivity(intent)
        }

        binding.btnYesterday.setOnClickListener(){
            val intent = Intent (this, Yesterday::class.java)
            startActivity(intent)
        }

        binding.btnHighHopes.setOnClickListener(){
            val intent = Intent (this, HighHopes::class.java)
            startActivity(intent)
        }
    }
}