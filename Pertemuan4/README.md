# Tugas Checkpoint Pertemuan 4 - Aplikasi Peminjaman Buku Perpustakaan

## Deskripsi Tema
Aplikasi ini berfokus pada sistem manajemen peminjaman buku perpustakaan. Pada Pertemuan 4, sistem dikembangkan untuk mendukung penambahan data peminjaman buku baru secara interaktif melalui form input yang terintegrasi dengan penanganan kondisi UI State dan ViewModel.

## Deskripsi Tugas
* **Form Tambah Data:** Menyediakan layar input data peminjaman buku menggunakan komponen `KolomTeks` tanpa state yang dapat digunakan kembali.
* **Pengelolaan State & ViewModel:** Mengimplementasikan `FormPeminjamanUiState` dan `FormPeminjamanViewModel` menggunakan `StateFlow`, lengkap dengan validasi tombol simpan yang hanya aktif jika data wajib telah terisi.
* **Pembaruan Daftar Otomatis:** Menyimpan data baru ke dalam `FakePeminjamanDataSource` sehingga data yang baru ditambahkan langsung muncul pada layar daftar peminjaman.

## Tabel Pembagian Tugas

| Anggota | Berkas Utama | Tanggung Jawab Utama |
| :--- | :--- | :--- |
| **Nafisya Ghalia 124140100** | `FakePeminjamanDataSource.kt` | Mengubah list data ke `StateFlow` dan membuat fungsi penambahan data. |
| **Frichintia Niken G. N. 124140106** | `KolomTeks.kt` & `FormPeminjamanUiState.kt` | Membuat text field tanpa state dan struktur `UiState` beserta logika validasi. |
| **Olivia 124140034** | `FormPeminjamanViewModel.kt` & `LayarFormPeminjaman.kt` | Menyusun logika pengolah data pada ViewModel dan merakit antarmuka layar form. |
| **Fadilla Andia Putri 124140136** | `LayarDaftarPeminjaman.kt`, `App.kt`, & `README.md` | Mengintegrasikan tombol navigasi, memperbarui daftar data, serta menyusun dokumentasi proyek. |

## Tangkapan Layar Aplikasi

* **Layar Form Input Data**  
 <img width="261" height="304" alt="image" src="https://github.com/user-attachments/assets/bbbb04c2-61e2-4e97-a9f1-c3e8179fee35" />

* **Layar Daftar Setelah Data Ditambah**  
 <img width="251" height="305" alt="image" src="https://github.com/user-attachments/assets/4c8faba1-7c30-45ae-bbba-fbcf116d4fd1" />


