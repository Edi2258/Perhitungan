package org.d3ifxxxx.perhitungan

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel () {

    var result = 0

    fun hasilPerhitungan(panjang: String, lebar: String) {
        result = panjang.toInt() * lebar.toInt()

    }
}
