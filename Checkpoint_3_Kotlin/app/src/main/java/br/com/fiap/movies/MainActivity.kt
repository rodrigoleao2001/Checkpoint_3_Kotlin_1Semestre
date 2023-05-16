package br.com.fiap.movies

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.fiap.movies.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setUpButton()
    }

    private fun setUpButton() {
        binding.btnContinue.setOnClickListener {
            getValue()
        }

    }

    private fun getValue() {
        val intent:Intent = Intent(this, Activity2::class.java)
        intent.putExtra("valor", binding.inputTextValue.text.toString())
        startActivity(intent)


    }
}