package br.com.migrationcompose

import android.app.Activity
import android.content.Intent
import br.com.extensions.clickWithDebounce
import br.com.migrationcompose.databinding.ActivityMainBinding

/**
 * @author RubioAlves
 * Created 21/05/2022 at 08:42
 */

class MainActivityLayoutContainer(
    private val binding: ActivityMainBinding,
    private val activity:Activity
) {
    fun setupView() = with(binding) {
        btShimmer.clickWithDebounce {
            val intent = Intent(activity, ActivityShimmer::class.java)
            activity.startActivity(intent)
        }
        btShimmerCompose.clickWithDebounce {
            val intent = Intent(activity, ActivityShimmerCompose::class.java)
            activity.startActivity(intent)
        }
    }
}