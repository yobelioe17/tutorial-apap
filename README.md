# Tutorial APAP
## Authors

* **Yobelio Ekaharja Putra** - *1806147211* - *B*

## Tutorial 1
### Github
1. Apa itu Issue Tracker? Apa saja masalah yang dapat diselesaikan dengan Issue Tracker?
Issue Tracker merupakan sebuah fitur yang berfungsi untuk mengelola masalah dalam konten yang sedang dijalankan. Masalah yang dapat diselesaikan antara lain adalah error dan bug dalam proses pengembangan.
(sumber: https://www.insidesherpa.com/virtual-internships/ntTvo6ru6Tq3A2JPq?show-onboard=1)

2. Apa perbedaan dari git merge dan git merge --squash?
- git merge: akan menyimpan semua history commit dari branch, dan memindahkannya ke cabang master.
- git merge --squash: Akan mengelompokkan commit di branch menjadi satu commit kemudian menambahkannya di depan cabbang master.
(sumber: https://stackoverflow.com/questions/2427238/in-git-what-is-the-difference-between-merge-squash-and-rebase)

3. Apa keunggulan menggunakan Version Control System seperti Git dalam pengembangan suatu aplikasi?
Terdapat berbagai macam keunggulan dari Git, yakni:
- Mendukung dalam proyek skala besar seperti Kernel Linux
- Penyimpanannya gratis
- Bisa diakses menggunakan command line tanpa perlu client-server
- Design repository yang mudah untuk dipahami pengguna
- Mendukung dalam pengembangan proyek non-linear
(Sumber: https://idcloudhost.com/mengenal-apa-itu-git-serta-manfaat-dan-fiturnya-untuk-developer/; https://www.codepolitan.com/10-version-control-system-yang-harus-kamu-kenal)

### Spring
1. Apa itu library & dependency?
Dependensi adalah sebuah terminologi yang digunakan untuk mengistilahkan bahwa sebuah program bergantung pada program lainnya. Sedangkan library adalah sebuah koleksi dari dari berbagai macam resource yang bisa digunakan oleh program komputer. Biasanya resource ini bisa berupa documentation, templates, atau konfigurasi lainnya.
(Sumber: https://www.gnu.org/software/libtool/manual/html_node/Inter_002dlibrary-dependencies.html#:~:text=By%20definition%2C%20every%20shared%20library,library%20depends%20on%20other%20libraries.; https://askubuntu.com/questions/361741/what-are-dependencies#:~:text=Dependency%20is%20a%20broad%20software,Program%20X%20uses%20Library%20Y)

2. Mengapa kita menggunakan Maven? Apakah ada alternatif dari Maven?
Ada banyak keunggulan Maven daripada para kompetitornya, beberapa diantaranya adalah:
- Maven memiliki struktur project sendiri, sehingga proyek yang sedang dikerjakan dapat dibuka di berbagai IDE
- Mengelola dependency cenderung lebih mudah
- File proyek terorganisir dengan baik

Maven adalah sebuah Project Management Software, dan alternatif yang bisa digunakan selain Maven adalah:
- Jira
- AceProyek
- Buildertrend
dan masih banyak lagi
(Sumber: https://www.geeksforgeeks.org/introduction-apache-maven-build-automation-tool-java-projects/#:~:text=Maven%20is%20a%20powerful%20project,the%20build%20process%20like%20ANT.&text=maven%20make%20the%20day%2Dto,of%20any%20Java%2Dbased%20project.; https://project-management.com/top-10-project-management-software/; https://medium.com/@acep.abdurohman90/mengenal-maven-sebagai-java-build-tools-5ba752f75812)

3. Selain untuk pengembangan web , apa saja yang bisa dikembangkan dengan Spring framework ?
Selain pengembangan web, Spring framework dapat digunakan untuk mengembangkan aplikasi dan juga database. Framework ini memiliki banyak sekali keunggulan dan memang cocok untuk mengembangkan suatu proyek.
(Sumber: spring_https://www.tutorialspoint.com/spring/spring_overview.htm#:~:text=Spring%20is%20the%20most%20popular,an%20open%20source%20Java%20platform.overview)

4. Apa perbedaan dari @RequestParam dan @PathVariable? Kapan sebaiknya menggunakan @RequestParam atau @PathVariable?
Dalam Spring Framework, bila berhubungan dengan path segment akan berurusan dengan @PathVarriable, sedangkan bila berurusan dengan http query parameter akan berurusan dengan @RequestParam. @PathVariable itu sifatnya location-dependent, sedangkan @RequestParam diteruskan sebagai pasangan key dan value.
- @RequestParam sebaiknya dipakai bila kita ingin membaca values dari Request Parameters dari sebuah pemanggilan URI
- @PathVariable sebaiknya dipakai bila kita ingin membaca value dari sebuah path yang menjadi bagian dari URI
(Sumber: http://www.nullpointer.at/2017/11/22/requestparam-queryparam-pathvariable-pathparam/; https://docs.spring.io/spring/docs/current/javadoc-api/org/springframework/web/bind/annotation/PathVariable.html; https://docs.spring.io/spring/docs/current/javadoc-api/org/springframework/web/bind/annotation/RequestParam.html)


## Tutorial 2
1. Cobalah untuk menambahkan sebuah resep dengan mengakses link berikut: http://localhost:8080/resep/add?noResep=1&namaDokter=Papa%20APAP&namaPasien=Quanta%20Fasilkomcatatan=Semangat Apa yang terjadi? Jelaskan mengapa hal tersebut dapat terjadi

Yang terjadi adalah error. Error ini terjadi sebab kita belum mendefinisikan file template yang dituju. Sehingga ketika method tersebut sampai ke return "add-resep", dia akan merefer sesuatu yang tidak ada. Sebab add-resep.html masih belum dibuat sebelumnya. Sehingga untuk mengatasi error ini diperlukan membuat add-resep.html pada folder resources>templates

2. Menurut kamu anotasi @Autowired pada class Controller tersebut merupakan implementasi dari konsep apa? Dan jelaskan secara singkat cara kerja @Autowired tersebut dalam konteks service dan controller yang telah kamu buat

@Autowired disini menerapkan konsep Dependency Injection sebagaimana sudah dipelajari pada pekan yang lalu. Dengan menggunakan anotasi ini, dapat membantu kita untuk melakukan otomatisasi dalam dependency injection. Di dalam class resepController, syntax 'private ResepService resepService' yang dipasangkan dengan @Autowired, memungkinkan kita untuk mengakses setiap properties, setters, getters, dan constructors yang ada pada class resepService.
(Sumber: https://www.baeldung.com/spring-autowire)

3. Cobalah untuk menambahkan sebuah resep dengan mengakses link berikut: http://localhost:8080/resep/add?noResep=1&namaDokter=Papa%20APAP&namaPasien=Quanta%20Fasilkom Apa yang terjadi? Jelaskan mengapa hal tersebut dapat terjadi.

Ketika mengakses 'http://localhost:8080/resep/add?noResep=1&namaDokter=Papa%20APAP&namaPasien=Quanta%20F
asilkom' terjadi error. Error ini terjadi sebab ada argumen yang tidak terisi, yakni catatan. Pada class resepController, terdapat @RequestParam dengan value = "catatan" dan kondisinya adalah true. Hal ini menandakan bahwa "catatan" tidak boleh kosong. Dalam pemanggilan link diatas, hanya berhenti pada value = "namaPasien". Sehingga ketika sistem mencoba mencari isi dari value "catatan" menjadi tidak ditemukan.

4. Jika Papa APAP ingin melihat resep untuk pasien yang bernama Quanta, link apa yang harus diakses?

Berdasarkan instruksi yang sudah diberikan pada soal, saya tidak mengimplementasikan sebuah method yang bisa mencari resep berdasarkan namaPasien. Implementasinya sama saja dengan mencari resep dengan noResep, hanya saja ada sedikit perubahan pada parameternya.
Oleh sebab itu, saya akan mencoba membantu papa pada soal ini melalui alternatif cara lain. Pertama, papa bisa mengunjungi http://localhost:8080/resep/viewall untuk melihat semua data resep yang ada. Setelah mengetahui nomor resep dari pasien yang papa cari, papa dapat menuju ke link ini http://localhost:8080/resep/view/no-resep/{noResep}. Bagian {noResep} diisi sesuai dengan data yang sudah dilihat papa tadi. Bila noResep nya 1 maka link menjadi http://localhost:8080/resep/view/no-resep/1 , bila noResep nya 2 maka link menjadi http://localhost:8080/resep/view/no-resep/2 , dan seterusnya.

5. Tambahkan 1 contoh resep lainnya sesukamu. Lalu cobalah untuk mengakses http://localhost:8080/resep/viewall , apa yang akan ditampilkan? Sertakan juga bukti screenshotmu.

Saya menambahkan sebuah resep dengan link berikut:
http://localhost:8080/resep/add?noResep=2&namaDokter=dr%20Yobelio&namaPasien=PAPA%20baik&catatan=Cepat%20sembuh%20dong%20pa!
kemudian ketika saya mengakses http://localhost:8080/resep/viewall akan muncul semua resep yang sudah tersimpan. Resep itu berarti ada 1 resep dari contoh soal, dan 1 resep buatan saya sendiri. Berikut adalah hasil screenshot dari hasil pengaksesan viewall yang akan saya sertakan dalam bentuk link drive: https://drive.google.com/file/d/1-_NUXm7IDzJnaGJaoZclvwnvI1nQYLHr/view?usp=sharing

