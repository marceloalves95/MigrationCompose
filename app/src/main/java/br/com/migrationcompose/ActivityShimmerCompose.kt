package br.com.migrationcompose

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.extensions.viewBinding
import br.com.migrationcompose.databinding.ActivityShimmerComposeBinding

class ActivityShimmerCompose : AppCompatActivity() {

    private val binding by viewBinding(ActivityShimmerComposeBinding::inflate)
    private val layoutContainer by lazy { ActivityShimmerComposeLayoutContainer(binding) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        initView()
    }

    private fun initView(){
        layoutContainer.setupView()
    }
}