package com.example.pertemuan2.model

sealed class StatusPeminjaman(val keterangan: String) {
    object Diajukan : StatusPeminjaman("Pengajuan peminjaman sedang diproses")
    object Dipinjam : StatusPeminjaman("Buku berhasil dipinjam dan dibawa")
    object Dikembalikan : StatusPeminjaman("Buku telah dikembalikan ke perpustakaan")
}