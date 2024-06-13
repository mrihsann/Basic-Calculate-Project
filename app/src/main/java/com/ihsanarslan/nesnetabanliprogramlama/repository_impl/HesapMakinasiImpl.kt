package com.ihsanarslan.nesnetabanliprogramlama.repository_impl

import com.ihsanarslan.nesnetabanliprogramlama.repository.IHesapMakinasi

class HesapMakinasiImpl : IHesapMakinasi{
    override fun topla(sayi1: Int, sayi2: Int): Int {
        val sonuc = sayi1+sayi2
        return sonuc
    }

    override fun cikar(sayi1: Int, sayi2: Int): Int {
        val sonuc = sayi1-sayi2
        return sonuc
    }

    override fun carp(sayi1: Int, sayi2: Int): Int {
        val sonuc = sayi1*sayi2
        return sonuc
    }

    override fun bol(sayi1: Double, sayi2: Double): Double {
        val sonuc = sayi1/sayi2
        return sonuc
    }
}