Feature: Booking appointment

  Scenario Outline: Memilih fasilitas kesehatan dan memesan tanggal janji temu
    Given pengguna wajib melakukan login terlebih dahulu.
    When pengguna memilih fasilitas "<facility>".
    And pengguna memilih tanggal janji pada "<date>".
    And pengguna klik Book Appointment jika sudah sesuai.
    Then pengguna akan mendapatkan verifikasi fasilitas "<facility>" dan tanggal "<date>" yang sudah dipilih.

    Examples:
      | facility                     | date       |
      | Seoul CURA Healthcare Center | 15/08/2025 |