package com.example.lyricviewerapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.lyricviewerapp.databinding.ActivityMananatiliBinding

class Mananatili : AppCompatActivity() {
    private lateinit var binding: ActivityMananatiliBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMananatiliBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val lyrics = "Bawat sulok, kabisado, 'di nagbabago\n" +
                "Ngunit ba't nawawala pa rin ako? Oh\n" +
                "Tinulak lang ng tadhana, tila'y 'di sinasadya\n" +
                "Na ikaw ay makasalubong, oh-oh-oh\n" +
                "Hindi na nalito, oh-oh-oh\n\n" +

                "'Wag mo nang pigilan pa\n" +
                "Mga mata'y 'di nakatingin sa iba, kaya\n\n" +

                "Mananatili sa iyong tabi magdamag\n" +
                "Ating paligid, hindi na natin napapansin\n" +
                "Gabi ay atin, kasabay ng puso at tugtugan\n" +
                "Pag-indak ng ating katawan\n" +
                "Mananatili, hindi tiyak ang bukas natin\n" +
                "Ngunit itong gabi ay atin\n\n" +

                "Nabihag ng iyong tingin, liwanag sa dilim\n" +
                "Lahat ng ilaw ay nakatutok, oh-oh-oh\n" +
                "Sa 'yo lang tumibok, oh-oh-oh\n" +
                "Nang ganito ang puso ko, hindi na lalayo, oh-oh-oh, sa 'yo\n\n" +

                "Mananatili sa iyong tabi magdamag (mananatili, mananatili)\n" +
                "Ating paligid, hindi na natin napapansin (mananatili, mananatili)\n" +
                "Gabi ay atin, kasabay ng puso at tugtugan\n" +
                "Pag-indak ng ating katawan\n" +
                "Mananatili, hindi tiyak ang bukas natin\n" +
                "Ngunit itong gabi ay atin"
        binding.txtMananatiliLyrics.setText(lyrics)
    }
}