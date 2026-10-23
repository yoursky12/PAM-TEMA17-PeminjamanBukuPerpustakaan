package com.example.pertemuan3.repository

import com.example.pertemuan3.model.Buku
import com.example.pertemuan3.model.Peminjaman
import com.example.pertemuan3.model.StatusPeminjaman

object FakePeminjamanDataSource {
    // 10 Data Dummy
    val listPeminjaman = listOf(
        Peminjaman("P010", "Ahmad", Buku("B001", "Bumi", "Tere Liye", "Gramedia"), StatusPeminjaman.Diajukan, catatan = "Persiapan ujian"),
        Peminjaman("P009", "Budi", Buku("B002", "Laskar Pelangi", "Andrea Hirata", "Bentang"), StatusPeminjaman.Dipinjam),
        Peminjaman("P008", "Citra", Buku("B003", "Clean Code", "Robert C. Martin", "Prentice Hall"), StatusPeminjaman.Dikembalikan, denda = 0.0),
        Peminjaman("P007", "Deni", Buku("B004", "Atomic Habits", "James Clear", "Gramedia"), StatusPeminjaman.Dipinjam),
        Peminjaman("P006", "Eka", Buku("B005", "Janji", "Tere Liye", "Gramedia"), StatusPeminjaman.Diajukan),
        Peminjaman("P005", "Fajar", Buku("B006", "Sapiens", "Yuval Noah Harari", "KPG"), StatusPeminjaman.Dikembalikan, denda = 5000.0, catatan = "Terlambat 1 hari"),
        Peminjaman("P004", "Gita", Buku("B007", "Struktur Data", "Jane Smith", "Tekno Press"), StatusPeminjaman.Dipinjam),
        Peminjaman("P003", "Hadi", Buku("B008", "Kotlin Multiplatform", "John Doe", "Informatika"), StatusPeminjaman.Dikembalikan, denda = 0.0),
        Peminjaman("P002", "Indah", Buku("B009", "Hujan", "Tere Liye", "Gramedia"), StatusPeminjaman.Diajukan),
        Peminjaman("P001", "Joko", Buku("B010", "Filosofi Teras", "Henry Manampiring", "Kompas"), StatusPeminjaman.Dipinjam)
    )


    fun getTerbaru(): List<Peminjaman> {
        return listPeminjaman.sortedByDescending { it.idPeminjaman }
    }
}