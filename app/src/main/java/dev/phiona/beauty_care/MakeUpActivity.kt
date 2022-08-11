package dev.phiona.beauty_care

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dev.phiona.beauty_care.databinding.ActivityMakeUpBinding

class MakeUpActivity : AppCompatActivity() {
    lateinit var binding: ActivityMakeUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMakeUpBinding.inflate(layoutInflater)
        setContentView(binding.root)

      binding.btnMakeup.setOnClickListener {
          val intent=Intent(this,NailsActivity::class.java)
          startActivity(intent)
      }
    }
}