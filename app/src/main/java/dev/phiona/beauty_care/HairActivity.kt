package dev.phiona.beauty_care

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dev.phiona.beauty_care.databinding.ActivityHairBinding
import dev.phiona.beauty_care.databinding.ActivityNailsBinding

class HairActivity : AppCompatActivity() {
    lateinit var binding:ActivityHairBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityHairBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnHair.setOnClickListener {
            val intent=Intent(this,HomeActivity::class.java)
            startActivity(intent)
        }
    }
}