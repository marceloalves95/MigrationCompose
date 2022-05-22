package br.com.migrationcompose

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.extensions.viewBinding
import br.com.migrationcompose.databinding.ActivityShimmerBinding

class ActivityShimmer : AppCompatActivity() {

    private val binding by viewBinding(ActivityShimmerBinding::inflate)
    private val layoutContainer by lazy { ActivityShimmerLayoutContainer(binding) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        initView()
    }

    private fun initView(){
        layoutContainer.setupView()
    }
}