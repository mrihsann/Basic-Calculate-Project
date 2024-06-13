package com.ihsanarslan.nesnetabanliprogramlama.use_case

import com.ihsanarslan.nesnetabanliprogramlama.repository_impl.HesapMakinasiImpl

class ToplaUseCase {
    private val hesapMakinasiImpl = HesapMakinasiImpl()
    operator fun invoke(sayi1: Int, sayi2: Int): Int {
        return hesapMakinasiImpl.topla(sayi1, sayi2)
    }
}