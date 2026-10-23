package com.example.pertemuan3.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pertemuan3.model.Peminjaman
import com.example.pertemuan3.model.StatusPeminjaman

@Composable
fun LabelStatus(status: StatusPeminjaman) {
    val (bgColor, textColor) = when (status) {
        is StatusPeminjaman.Diajukan -> Color(0xFFFFF3CD) to Color(0xFF856404)
        is StatusPeminjaman.Dipinjam -> Color(0xFFCCE5FF) to Color(0xFF004085)
        is StatusPeminjaman.Dikembalikan -> Color(0xFFD4EDDA) to Color(0xFF155724)
    }

    Box(
        modifier = Modifier
            .background(bgColor, shape = RoundedCornerShape(12.dp))
            .padding(horizontal = 8.dp, vertical = 4.dp)
    ) {
        Text(
            text = status::class.simpleName ?: "",
            color = textColor,
            fontSize = 12.sp
        )
    }
}

@Composable
fun KartuPeminjaman(item: Peminjaman) {
    Card(
        modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp),
        elevation = 3.dp,
        shape = RoundedCornerShape(8.dp)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = item.idPeminjaman, style = MaterialTheme.typography.subtitle2)
                LabelStatus(status = item.status)
            }
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = item.buku.judul, style = MaterialTheme.typography.h6)
            Text(text = "Peminjam: ${item.namaPeminjam}", style = MaterialTheme.typography.body2)
        }
    }
}