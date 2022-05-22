package br.com.migrationcompose

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.extensions.viewBinding
import br.com.migrationcompose.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by viewBinding(ActivityMainBinding::inflate)
    private val layoutContainer by lazy {
        MainActivityLayoutContainer(
            binding = binding,
            activity = this
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        initViews()
    }

    private fun initViews(){
        layoutContainer.setupView()
    }
}