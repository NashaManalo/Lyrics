package com.example.lyricviewerapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.lyricviewerapp.databinding.ActivityYesterdayBinding

class Yesterday : AppCompatActivity() {
    private lateinit var binding: ActivityYesterdayBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityYesterdayBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val lyrics = "何度失ったって 取り返してみせるよ\n" +
                "雨上がり 虹がかかった空みたいな君の笑みを\n" +
                "例えばその代償に 誰かの表情を\n" +
                "曇らせてしまったっていい\n" +
                "悪者は僕だけでいい\n\n" +

                "本当はいつでも誰もと思いやり合っていたい\n" +
                "でもそんな悠長な理想論は ここでは捨てなくちゃな\n\n" +

                "遥か先で君へ 狙いを定めた恐怖を\n" +
                "どれだけ僕は払いきれるんだろう\n" +
                "半信半疑で世間体 気にしてばっかのイエスタデイ\n" +
                "ポケットの中で怯えたこの手は\n" +
                "まだ忘れられないまま\n\n" +

                "「何度傷ついたって 仕方ないよ」と言って\n" +
                "うつむいて君が溢した 儚くなまぬるい涙\n" +
                "ただの一粒だって 僕を不甲斐なさで\n" +
                "溺れさせて 理性を奪うには十分すぎた\n\n" +

                "街のクラクションも サイレンも\n" +
                "届きやしないほど\n\n" +

                "遥か先へ進め 身勝手すぎる恋だと\n" +
                "世界が後ろから指さしても\n" +
                "振り向かず進め 必死で君の元へ急ぐよ\n" +
                "道の途中で聞こえた SOS さえ 気づかないふりで"
        binding.txtYesterdayLyrics.setText(lyrics)
    }
}