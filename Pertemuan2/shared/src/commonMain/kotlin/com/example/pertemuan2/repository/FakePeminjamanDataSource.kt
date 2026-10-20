package repository

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import model.Peminjaman
import model.SampleBuku
import model.StatusPeminjaman

class FakePeminjamanDataSource : PeminjamanDataSource {
    override fun getPeminjamanStatusFlow(): Flow<Peminjaman> = flow {
        var peminjaman = Peminjaman(
            idPeminjaman = "P-2026-001",
            namaPeminjam = "Nafisya Ghalia",
            buku = SampleBuku.bukuNovel,
            status = StatusPeminjaman.Diajukan,
            catatan = "Dipinjam untuk dibaca"
        )

        // Buku Diajukan
        emit(peminjaman)
        delay(2000)

        // Buku Dipinjam
        peminjaman = peminjaman.copy(status = StatusPeminjaman.Dipinjam)
        emit(peminjaman)
        delay(2000)

        // Buku Dikembalikan (tanpa denda)
        peminjaman = peminjaman.copy(
            status = StatusPeminjaman.Dikembalikan,
            denda = 0.0
        )
        emit(peminjaman)
    }
}