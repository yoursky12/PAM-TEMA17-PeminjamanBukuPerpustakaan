package com.example.pertemuan3.ui

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.pertemuan3.repository.FakePeminjamanDataSource

@Composable
fun LayarDaftarPeminjaman() {
    val dataList = FakePeminjamanDataSource.getTerbaru()

    Scaffold(
        topBar = { TopAppBar(title = { Text("Daftar Peminjaman Buku") }) },
        floatingActionButton = {
            FloatingActionButton(onClick = { }) {
                Icon(Icons.Default.Add, contentDescription = "Tambah Peminjaman")
            }
        }
    ) { padding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .padding(horizontal = 16.dp, vertical = 8.dp)
        ) {
            items(dataList) { item ->
                KartuPeminjaman(item = item)
            }
        }
    }
}