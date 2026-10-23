package com.example.pertemuan3.model

data class Peminjaman(
    val idPeminjaman: String,
    val namaPeminjam: String,
    val buku: Buku,
    val status: StatusPeminjaman,
    val denda: Double? = null,      // Tipe nullable 1
    val catatan: String? = null     // Tipe nullable 2
)