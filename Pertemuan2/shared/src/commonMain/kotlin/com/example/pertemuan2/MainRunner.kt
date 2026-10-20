package com.example.pertemuan2
import com.example.pertemuan2.model.StatusPeminjaman

import kotlinx.coroutines.flow.collect
import repository.FakePeminjamanDataSource

suspend fun mainRunner() {
    val dataSource = FakePeminjamanDataSource()

    println("=== SIMULASI PEMINJAMAN BUKU ===")

    dataSource.getPeminjamanStatusFlow().collect { peminjaman ->
        println("ID Peminjaman : ${peminjaman.idPeminjaman}")
        println("Nama Peminjam : ${peminjaman.namaPeminjam}")
        val statusText = when (peminjaman.status) {
            is StatusPeminjaman.Diajukan -> "Diajukan"
            is StatusPeminjaman.Dipinjam -> "Dipinjam"
            is StatusPeminjaman.Dikembalikan -> "Dikembalikan"
        }

        println("Status        : $statusText")
        println("Denda         : ${peminjaman.denda ?: 0.0}")
        println("-----------------------------")
    }
}