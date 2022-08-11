package dev.phiona.beauty_care

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dev.phiona.beauty_care.databinding.ActivityNailsBinding

class NailsActivity : AppCompatActivity() {
    lateinit var binding: ActivityNailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityNailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnNails.setOnClickListener {
            val intent=Intent(this,HairActivity::class.java)
            startActivity(intent)
        }
    }
}