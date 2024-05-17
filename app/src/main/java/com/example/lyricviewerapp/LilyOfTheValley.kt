package com.example.lyricviewerapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.lyricviewerapp.databinding.ActivityLilyOfTheValleyBinding

class LilyOfTheValley : AppCompatActivity() {
    private lateinit var binding: ActivityLilyOfTheValleyBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLilyOfTheValleyBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val lyrics = "시간을 내 맘에 꼭 가득 안고 살아\n" +
                "지난 세월에 커져버린 그대가\n" +
                "나의 꽃이 되어 짙어져 버린 오늘이\n" +
                "그대에게 고마워\n" +
                "\n" +
                "My love is a flower in your hands\n" +
                "우리의 시간이야\n" +
                "I'll give you something\n" +
                "Unforgettable\n" +
                "영원한 마음이야\n" +
                "\n" +
                "그리운 시간들은 물끄러미\n" +
                "나를 바라보면서\n" +
                "새하얀 모습으로\n" +
                "내가 좋아하던 그때 우리는\n" +
                "여전히 그 자리에 있더라\n" +
                "\n" +
                "My love is a flower in your hands\n" +
                "우리의 시간이야\n" +
                "I'll give you something\n" +
                "Unforgettable\n" +
                "영원한 마음이야\n" +
                "My love is a flower in your hands\n" +
                "우리의 시간이야\n" +
                "I'll give you something\n" +
                "Unforgettable\n" +
                "영원한 마음이야"
        binding.txtLilyOfTheValleyLyrics.setText(lyrics)
    }
}