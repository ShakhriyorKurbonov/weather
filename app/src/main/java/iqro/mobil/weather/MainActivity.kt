package iqro.mobil.weather

import android.content.Intent
import android.os.Bundle
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import iqro.mobil.weather.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
       binding.imageView2.startAnimation(AnimationUtils.loadAnimation(this,R.anim.transelate_1000))
        binding.imageView5.startAnimation(AnimationUtils.loadAnimation(this,R.anim.transelate_250))
        binding.imageView7.startAnimation(AnimationUtils.loadAnimation(this,R.anim.transelate_500))
        binding.imageView9.startAnimation(AnimationUtils.loadAnimation(this,R.anim.transelate_x_left_750))
        binding.imageView6.startAnimation(AnimationUtils.loadAnimation(this,R.anim.transelate_x_right_750))
        binding.imageView8.startAnimation(AnimationUtils.loadAnimation(this,R.anim.scale_alpha_750))
        binding.imageView16.startAnimation(AnimationUtils.loadAnimation(this,R.anim.transelate_scale_alpha_x_left_200))
        binding.imageView15.startAnimation(AnimationUtils.loadAnimation(this,R.anim.transelate_scale_alpha_x_left_300))
        binding.imageView14.startAnimation(AnimationUtils.loadAnimation(this,R.anim.transelate_scale_alpha_x_left_400))
        binding.imageView13.startAnimation(AnimationUtils.loadAnimation(this,R.anim.transelate_scale_alpha_x_left_500))
        binding.imageView12.startAnimation(AnimationUtils.loadAnimation(this,R.anim.transelate_scale_alpha_x_left_600))
        binding.imageView11.startAnimation(AnimationUtils.loadAnimation(this,R.anim.transelate_scale_alpha_x_left_700))
        binding.imageView.startAnimation(AnimationUtils.loadAnimation(this,R.anim.scale_alpha))
        binding.textView.startAnimation(AnimationUtils.loadAnimation(this,R.anim.scale_alpha))
        binding.textView2.startAnimation(AnimationUtils.loadAnimation(this,R.anim.scale_alpha))
        binding.imageView10.startAnimation(AnimationUtils.loadAnimation(this,R.anim.scale_alpha))
        binding.imageView3.startAnimation(AnimationUtils.loadAnimation(this,R.anim.transelate_500))
        binding.imageView4.startAnimation(AnimationUtils.loadAnimation(this,R.anim.scale_alpha_750))
        binding.imageView20.startAnimation(AnimationUtils.loadAnimation(this,R.anim.transelate_scale_alpha_x_left_200))
        binding.imageView19.startAnimation(AnimationUtils.loadAnimation(this,R.anim.transelate_scale_alpha_x_left_300))
        binding.imageView21.startAnimation(AnimationUtils.loadAnimation(this,R.anim.transelate_scale_alpha_x_left_500))
        binding.imageView22.startAnimation(AnimationUtils.loadAnimation(this,R.anim.transelate_scale_alpha_x_left_600))
        binding.imageView23.startAnimation(AnimationUtils.loadAnimation(this,R.anim.transelate_scale_alpha_x_left_700))
        binding.textView3.startAnimation(AnimationUtils.loadAnimation(this,R.anim.scale_alpha_500))
        binding.textView4.startAnimation(AnimationUtils.loadAnimation(this,R.anim.scale_alpha_750))


        binding.textView4.setOnClickListener {
            Intent(this,hourly_activity::class.java).apply {
                startActivity(this)
            }

        }

    }
}