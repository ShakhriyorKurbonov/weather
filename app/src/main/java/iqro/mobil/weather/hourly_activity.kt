package iqro.mobil.weather

import android.graphics.RenderEffect
import android.graphics.Shader
import android.os.Build
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import iqro.mobil.weather.databinding.ActivityHourlyBinding

class hourly_activity : AppCompatActivity() {
    private lateinit var binding:ActivityHourlyBinding
    @RequiresApi(Build.VERSION_CODES.S)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    binding=ActivityHourlyBinding.inflate(layoutInflater)
        setContentView(binding.root)



    }
}