package com.example.pertemuan2.repository

import com.example.pertemuan2.model.Peminjaman
import kotlinx.coroutines.flow.Flow

interface PeminjamanDataSource {
    fun getPeminjamanStatusFlow(): Flow<Peminjaman>
}