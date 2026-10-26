package com.example.pertemuan3.repository

import com.example.pertemuan3.model.Peminjaman
import kotlinx.coroutines.flow.Flow

interface PeminjamanDataSource {
    fun getPeminjamanStatusFlow(): Flow<Peminjaman>
}