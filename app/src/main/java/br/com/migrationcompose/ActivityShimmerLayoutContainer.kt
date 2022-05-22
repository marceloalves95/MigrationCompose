package br.com.migrationcompose

import br.com.migrationcompose.databinding.ActivityShimmerBinding

/**
 * @author RubioAlves
 * Created 21/05/2022 at 09:09
 */
class ActivityShimmerLayoutContainer(
    private val binding: ActivityShimmerBinding
) {
    fun setupView() = with(binding){
        shimmerViewContainer.startShimmerAnimation()
    }
}