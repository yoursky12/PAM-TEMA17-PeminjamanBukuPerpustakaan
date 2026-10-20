package com.example.pertemuan2.model

data class Buku(
    val idBuku: String,
    val judul: String,
    val pengarang: String,
    val penerbit: String
)

object SampleBuku {
    val bukuKotlin = Buku("B001", "Pemrograman Kotlin Multiplatform", "John Doe", "Informatika")
    val bukuAlgoritma = Buku("B002", "Struktur Data & Algoritma", "Jane Smith", "Tekno Press")
}