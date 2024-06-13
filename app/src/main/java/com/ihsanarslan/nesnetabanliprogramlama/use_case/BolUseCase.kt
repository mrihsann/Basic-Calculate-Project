package com.ihsanarslan.nesnetabanliprogramlama.use_case

import com.ihsanarslan.nesnetabanliprogramlama.repository_impl.HesapMakinasiImpl

class BolUseCase {
    private val hesapMakinasiImpl = HesapMakinasiImpl()

    operator fun invoke(sayi1: Double, sayi2: Double) : Double {
        return hesapMakinasiImpl.bol(sayi1, sayi2)
    }
}