package com.example.pertemuan3.repository

import com.example.pertemuan3.model.Buku
import com.example.pertemuan3.model.Peminjaman
import com.example.pertemuan3.model.StatusPeminjaman

object FakePeminjamanDataSource {
    // 6 Data Dummy
    val listPeminjaman = listOf(
        Peminjaman("P010", "Napisya", Buku("B001", "Bumi", "Tere Liye", "Gramedia"), StatusPeminjaman.Diajukan, catatan = "Persiapan ujian"),
        Peminjaman("P009", "Padilla", Buku("B002", "Laskar Pelangi", "Andrea Hirata", "Bentang"), StatusPeminjaman.Dipinjam),
        Peminjaman("P008", "Olip", Buku("B003", "Clean Code", "Robert C. Martin", "Prentice Hall"), StatusPeminjaman.Dikembalikan, denda = 0.0),
        Peminjaman("P007", "Kadapi", Buku("B004", "Atomic Habits", "James Clear", "Gramedia"), StatusPeminjaman.Dipinjam),
        Peminjaman("P006", "Prichintia", Buku("B005", "Janji", "Tere Liye", "Gramedia"), StatusPeminjaman.Diajukan),
        Peminjaman("P005", "Palen", Buku("B006", "Sapiens", "Yuval Noah Harari", "KPG"), StatusPeminjaman.Dikembalikan, denda = 5000.0, catatan = "Terlambat 1 hari"),
    )


    fun getTerbaru(): List<Peminjaman> {
        return listPeminjaman.sortedByDescending { it.idPeminjaman }
    }
}