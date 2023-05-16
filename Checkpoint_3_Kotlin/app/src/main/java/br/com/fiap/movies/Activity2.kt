package br.com.fiap.movies

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.fiap.movies.databinding.Activity2Binding
import br.com.fiap.movies.databinding.ActivityMainBinding

class Activity2 : AppCompatActivity() {
    lateinit var binding: Activity2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = Activity2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        var value: String? = intent.getStringExtra("valor")
        binding.tvValue.text = "R$ $value,00?"
        setUpButton()
    }

    private fun setUpButton() {
        binding.btnContinueActivity2.setOnClickListener {
            val intent:Intent = Intent(this, Activity3::class.java)
            intent.putExtra("value", binding.tvValue.text.toString())
            intent.putExtra("pix", binding.inputTextValue.text.toString())
            startActivity(intent)
            finish()

        }
    }
}