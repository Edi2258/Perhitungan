package org.d3ifxxxx.perhitungan

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import org.d3ifxxxx.perhitungan.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mainViewModel = ViewModelProvider (this)[MainViewModel::class.java]

        binding.buttonHasil.setOnClickListener {
            val panjang = binding.panjangInp.text.toString()
            val lebar = binding.lebarInp.text.toString()

            when{
                panjang.isEmpty()-> binding.panjangInp.error = "masukan angka"
                lebar.isEmpty()-> binding.lebarInp.error = "masukan angka"
                else -> {
                    mainViewModel.hasilPerhitungan(panjang, lebar)
                    hasil()
                }
            }
        }



    }

    private fun hasil() {
        binding.hasilaja.text = mainViewModel.result.toString()
    }


}

