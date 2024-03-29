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

## Tutorial 3
1. Pada class ResepDb , terdapat method findByNoResep , apakah kegunaan dari method tersebut?

Method findByNoResep pada ResepDb memiliki tipe Optional. Maksudnya adalah belum tentu juga method tersebut diimplementasikan. Method tersebut berfungsi untuk membantu kita dalam mengakses data di database berdasarkan NoResep. Mengapa harus nomor resep? Sebab itu merupakan primary key yang menjadi value unik dalam database resep. Sehingga menjadi preferensi yang baik ketika ingin mengambil data dari sana.

2. Pada class ResepController , jelaskan perbedaan method addResepFormPage dan addResepSubmit ?

method addResepFormPage memiliki method get dimana fungsi method ini adalah mendapatkan input yang akan diberikan user. Dalam konteks ini, ketika terjadi penambahan resep, maka seorang user akan masuk kedalam tampilan form-add-resep.html untuk mengisi field field yang tersedia. Dari form ini juga didapati data yang hendak dimasukkan ke database. Sedangkan method addResepSubmit merupakan method post yang berfungsi untuk mengirimkan hasil input yang sudah diberikan. Ketika user berhasil mengisi data pada form, akan dialihkan ke halaman add-resep.html yang memberikan informasi bahwa pengisian sukses, dan sistem akan memasukkan datanya kedalam database.

3. Jelaskan kegunaan dari JPA Repository !

JPA merupakan akronim dari Java Persistence API. JPA ini membantu user dalam mengakses database menggunakan Java. Bilamana yang saya ketahui mengakses database menggunakan syntax MySQL atau PostgreSQL, sekarang saya jadi tambah tau kalau database bisa dimanipulasi juga dengan JPA. Dengan menggunakan JPA, membantu pengguna untuk dapat terfokus pada tabel-tabel yang sudah didefinisikan pada database. 
(Sumber: https://daengweb.id/serial-spring-boot-crud-dengan-spring-data-jpa)

4. Sebutkan dan jelaskan di bagian kode mana sebuah relasi antara ResepModel dan ObatModel dibuat?

Relasi antara ResepModel dengan ObatModel dibuat melalui kode ini:
@OneToMany(mappedBy = "resepModel", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<ObatModel> listObat;
Sebagaimana dijelaskan pula pada soal, koneksi antara ResepModel dengan ObatModel adalah one-to-many. Jadi satu resep bisa memiliki banyak obat. Relasinya juga merupakan parsial, sehingga bisa jadi suatu resep tidak memiliki obat sama sekali.

Sedangkan relasi antara ObatModel dengan ResepModel dibuat melalui kode ini:
@ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "resep_id", referencedColumnName = "no_resep", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private ResepModel resepModel;
Pada soal juga sudah dijelaskan gambaran relasi kedua objek ini. Koneksi antara ObatModel dengan ResepModel adalah many-to-one. Sehingga suatu obat hanya dapat terpetakan pada satu resep saja. Selain itu relasinya merupakan total, sehingga pasti suatu obat akan terhubung kepada sebuah resep.

5. Jelaskan kegunaan FetchType.LAZY, CascadeType.ALL , dan FetchType.EAGER !

FetchType.LAZY digunakan ketika kita ingin melakukan query dan hanya membutuhkan suatu data saja secara spesifik. KIta tidak perlu data relasinya. Bila kita menginginkan data yang lain, maka kita harus melakukan query ulang.
FetchType.EAGER digunakan ketika kita ingin melakukan query terhadap suatu data dan sekaligus mendapatkan semua relasi atau informasi yang terkait dengan data tersebut. Sehingga sekali panggil maka semua data bisa didapatkan
CascadeType.All digunakan ketika dalam suatu relasi entitas, kita menginginkan semua persistence seperti persist, refresh, merge dan remove yang terjadi di parent juga diturunkan kepada childnya.

(Sumber: https://stackoverflow.com/questions/13027214/what-is-the-meaning-of-the-cascadetype-all-for-a-manytoone-jpa-association; https://qastack.id/programming/2990799/difference-between-fetchtype-lazy-and-eager-in-java-persistence-api; https://qastack.id/programming/13027214/what-is-the-meaning-of-the-cascadetype-all-for-a-manytoone-jpa-association)

## Tutorial 4
1. Jelaskan perbedaan th:include dan th:replace!

th:include berfungsi untuk menginisiasi proses insert suatu fragment sebagai body dari suatu tag, namun exclude fragment tag nya. Sedangkan th:replace berfungsi untuk mengganti suatu tag secara spesifik dengan fragmen, dan include fragment tag nya
(sumber: https://anshulgnit.blogspot.com/2018/05/difference-between-thymeleaf-attribute-replace-insert-and-include.html; https://www.thymeleaf.org/doc/tutorials/3.0/usingthymeleaf.html#flexible-layouts-beyond-mere-fragment-insertion)

2. Jelaskan apa fungsi dari th:object!

th:object berguna untuk menspesifikasikan suatu objek yang nantinya akan terkaitkan dengan hasil operasi yang ada. Dengan kata lain, th:object ini mampu merujuk suatu objek secara langsung. 
(sumber: https://www.udig.com/spring-thymeleaf-basics-stack-overflow/; https://www.baeldung.com/thymeleaf-in-spring-mvc#:~:text=The%20th%3Aaction%20is%20used,matching%20property%20of%20the%20object.)

3. Jelaskan perbedaan dari * dan $ pada saat penggunaan th:object! Kapan harus dipakai?

Dalam penggunaan thymeleaf, notasi $ mengindikasikan pemanggilan variable expressions. Ini merupakan sebuah standard expression. Sedangkan notasi * mengindikasikan selection variable expression. Dalam konteks umum, penggunaan kedua notasi ini hampir mirip. Namun ketika dikombinasikan dengan th:object akan menunjukkan perbedaan. Sebagai contoh saya akan memilih object form. Ekspresi *{field} akan sama interpretasinya dengan ${form.field}
(sumber: https://stackoverflow.com/questions/57511424/difference-between-and)

4. Bagaimana kamu menyelesaikan latihan nomor 3?

Dalam upaya mengerjakan soal latihan nomor 3, saya mencoba untuk menambahkan elemen baru pada navbar yang ada di fragment. Kemudian saya mencoba menambahkan sebuah penanda berupa ${} di dalamnya, serta memanggil penanda itu juga pada html yang ada. Setelah itu, saya mengimplementasikan fragment tersebut ke masing-masing html yang saya miliki, agar nantinya dapat muncul tulisan di pojok kanan atas navbar sesuai yang diinginkan.

## Tutorial 5
1. Apa itu Postman? Apa kegunaannya?
Postman merupakan sebuah aplikasi yang biasanya digunakan untuk para programmer yang hendak bermain-main dengan API. Aplikasi ini sangat membantu untuk menguji API yang telah dibuat. Postman berfungsi sebagai GUI API Caller. Bahkan tak hanya itu, Postman juga menyadiakan fitur lain yaitu Sharing Collection API for Documentation, Testing API, Realtime Collaboration Team, Monitoring API, dan masih banyak lagi
(sumber: https://antares.id/id/postman.html#:~:text=Postman%20adalah%20sebuah%20aplikasi%20yang,API%20yang%20telah%20mereka%20buat; https://medium.com/skyshidigital/documentation-testing-api-dengan-postman-part-1-5d33e430dca7)

2. Jelaskan fungsi dari anotasi @JsonIgnoreProperties dan @JsonProperty.
@JsonIgnore digunakan untuk mengabaikan setiap logical properti yang mungkin digunakan pada saat serialization dan deserialization. @JsonIgnore bisa berisikan parameter berupa boolean untuk mengaktifkan maupun mematikannya.
Sedangkan @JsonIgnoreProperties digunakan untuk mengabaikan logical properti secara spesifik (tidak semuanya) pada saat JSON serialization dan deserialization.
(sumber: https://www.concretepage.com/jackson-api/jackson-jsonignore-jsonignoreproperties-and-jsonignoretype)

3. Apa kegunaan atribut WebClient?
WebClient berfungsi untuk menyederhanakan tugas-tugas umum seperti Create, Read, Update, dan Delete. Dalam tutorial yang sudah dilakukkan, webclient akan menjadikan alamat dari Mock Server yang sudah terbentuk pada Postman sebagai baseUrl nya. Sehingga nantinya alamat yang akan diakses akan memiliki alamat dasar dari baseUrl yang sudah di definisikan pada class Setting
(Sumber: https://wirasetiawan29.wordpress.com/2015/04/16/webclient-vs-httpclient/; https://qastack.id/programming/4988286/what-difference-is-there-between-webclient-and-httpwebrequest-classes-in-net)

4. Apa itu ResponseEntity dan BindingResult? Apa kegunaannya?
ResponseEntity adalah ekstensi dari HttpEntity. ResponseEntity digunakan untuk menambahkan sebuah HttpStatus pada kode status. Sedangkan BindingResult merupakan sebuah interface umum yang merepresentasikan hasil dari binding. BindingResult bisa digunakan sebagai Validator dan menambahkan binding-spesific analysis serta model building.
(sumber: https://docs.spring.io/spring-framework/docs/current/javadoc-api/index.html?org/springframework/validation/BindingResult.html; https://docs.spring.io/spring-framework/docs/current/javadoc-api/index.html?org/springframework/http/ResponseEntity.html)

## Tutorial 6
1. Jelaskan secara singkat perbedaan Otentikasi dan Otorisasi ! Di bagian mana (dalam kode yang telah anda buat) konsep tersebut diimplementasi?
Authentication merupakan sebuah proses dimana sistem memastikan kalau pengguna yang berusaha masuk merupakan user yang sesuai.
Contoh implementasinya pada saat login. Dilakukan authentication untuk memastikan apakah username dan passwordnya sesuai atau tidak.
Authorization merupakan suatu hak yang mengatur batasan-batasan user dalam mengakses suatu fitur.
Contoh implementasinya pada saat mengerjakan latihan 1(diatur pada WebSecurityConfig), yang mengatur bahwa hak untuk menambahkan user hanya bisa dilakukan oleh ADMIN 
(sumber: https://www.coursehero.com/file/p3r7hfb7/2-Apa-perbedaan-antara-Autorisasi-dan-Autentikasi-Jelaskan-menggunakan-contoh-a/; globhy.com/read-blog/33_perbedaan-antara-otentikasi-authentication-dan-otorisasi-authorization.html)

2. Apa itu BCryptPasswordEncoder ? Jelaskan secara singkat cara kerjanya!
BCryptPasswordEncoder merupakan sebuah tool pada Spring yang berfungsi untuk membantu melakukan enkripsi pada password. Tools ini dapat membantu dalam pembuatan user yang memiliki password, agar password lebih aman. Cara kerjanya cukup sederhana, yakni dengan membuat objek baru dengan class BCryptPasswordEncoder. Kemudian lakukan encrypt pada password yang diinginkan dengan menjalankan method encrypt yang sudah build in pada class ini
(sumber: https://docs.spring.io/spring-security/site/docs/current/api/org/springframework/security/crypto/bcrypt/BCryptPasswordEncoder.html)

3. Jelaskan secara singkat apa itu UUID beserta penggunaannya!
UUID(Universally Unique Identifier) memungkinkan sistem untuk secara unik mengidentifikasi informasi tanpa koordinasi pusat signifikan. Pada dasarnya, UUID ini terdiri dari karakter yang dibuat secara acak sehingga dapat dipastikan unik untuk setiap data yang akan disajikan. Informasi diberi label dengan UUIDs karena itu dapat kemudian digabungkan menjadi satu database tanpa perlu menyelesaikan identifier (ID) konflik. Salah satu penggunaan luas dari standar ini adalah dalam pengidentifikasi Microsoft secara global unik (GUID). Kegunaan penting lainnya termasuk ext2/ext3 UUIDs filesystem, LUKS partisi terenkripsi, GNOME, KDE, dan Mac OS X, yang semuanya menggunakan implementasi yang berasal dari perpustakaan uuid ditemukan dalam paket e2fsprogs.
(sumber: https://desyarisandinasution.wordpress.com/2012/07/13/all-about-universal-unique-identifier-uuid/)

4. Apa kegunaan class UserDetailsServiceImpl.java ? Mengapa harus ada class tersebut padahal kita sudah memiliki class UserRoleServiceImpl.java ?
UserDetailsServiceImpl.java diperlukan agar dapat melakukan authentication pada user. Proses authentication ini dapat terakomodasikan akibat implemets class UserDetailsService yang berasal dari paket Security yang ada di Spring boot. Melalui class ini, program dapat menyesuaikan role dan apa saja yang bisa dilakukan dengan role tersebut sesuai dengan data yang ada pada database. Hal ini tidak dapat dilakukan oleh UserRoleServiceImpl.java sebab class ini hanya digunakan untuk proses mapping terhadap alamat yang akan diakses.

## Tutorial 7
1. Jelaskan apa yang Anda lakukan di latihan dalam satu paragraf per-soal. Berikan screenshot sebagai ilustrasi dari apa yang Anda jelaskan.
- Pada latihan 1, saya membuat sebuah kondisional (if-else) pada index.js yang ada di component Item. If else ini saya letakkan pada tag input yang mengatur checkbox. Disini saya mendefinisikan kalau kondisi checkboxnya ter checked, berarti dia sudah dipilih dan harus ditampilkan di favItems. Maka dari itu, imput checkboxnya muncul. Nah kalau kondisi checkboxnya tidak ter checked, berarti itu ada di listMovies yang belum dipilih. Sehingga tag tersebut tidak perlu muncul.

![alt text](https://github.com/yobelioe17/tutorial-apap/blob/feat/tutorial-7-frontend/asset/apap1.png?raw=true)

- Pada latihan 2, saya mencoba untuk membuat kondisi (if-else) pada App.js. Pertama-tama saya pastikan bahwa panjang favList itu tidak kosong, sehingga buttonnya bisa muncul. Kalau panjangnya kosong, berarti buton tidak akan muncul. Kemudian setelah buttonnya muncul, saat di klik akan merujuk pada function yang sudah saya definisikan bernama handleRemoveAll, yang berperan untuk mengahpus seluruh elemen di list favItems. Idenya adalah dengan melakukan splice dari elemen ke 0 hingga sebanyak panjang elemen pada favItems. Sehingga seluruh elemen di favItems akan displice.

![alt text](https://github.com/yobelioe17/tutorial-apap/blob/feat/tutorial-7-frontend/asset/apap2.png?raw=true)

-Pada latihan 3, saya memodifikasi sedikit perintah pada function handleItemClick. Saya membuat sebuah function baru yang bernama handleRemoveFavList, yang isinya mirip dengan handleItemClick sebelumnya. Sedangkan pada function handleItemClick, saya menghapus baris "else newItems.splice(targetInd, 1);". Dengan terhapusnya baris tersebut, maka ketika item yang diklik mentriger function handleItemClick, dia hanya akan melakukan penambahan tanpa melakukan splice. Function handleItemClick saya implementasikan di listMovies, sedangkan function handleRemoveFavList saya implementasikan pada list favItems. Oleh sebab itu, pada favItems kalau diklik lagi, maka dia akan terhapus (ter-splice)

![alt text](https://github.com/yobelioe17/tutorial-apap/blob/feat/tutorial-7-frontend/asset/apap3.png?raw=true)

- Pada latihan 4, saya melihat referensi pada w3school untuk membuat button toogle dengan animasinya. Sumber ada di https://www.w3schools.com/howto/howto_css_switch.asp . Kemudian, saya meletakkan script css nya pada App.css. Untuk implementasinya, saya letakkan di bawah tulisan this is a class-based application agar posisinya pas di tengah. Ketika tombol itu ditekan, akan mentrigger pemanggilan function bernama showToggle. Function ini akan berfungsi sebagai setter untuk mengatur nilai dari variabel show pada state, bernilai sebaliknya. Kalau nilainya true, maka akan memunculkan section yang sebelah kanan. Tapi kalau nilainya false, dia akan mereturn null sehingga yang ada hanya halaman yang berisi listMovies saja.

![alt text](https://github.com/yobelioe17/tutorial-apap/blob/feat/tutorial-7-frontend/asset/apap4.png?raw=true)

- Pada latihan 5, saya membuat sebuah component baru bernama EmptyState dengan isi yang bisa dilihat pada folder tersebut. Intinya pada component tersebut berisi index.js yang akan memunculkan kalimat "Belum ada item yang dipilih" dan "Klik salah satu item di List Movies". Setelah itu beralih ke App.js. Pada App.js, saya melakukan kondisional (if-else) di tag List. Jadi ketika ternyata panjang dari listItems itu 0, berarti tidak ada isinya. Sehingga akan mereturn nilai dari tag EmptyState. Akan tetapi bila panjangnya tidak 0, maka akan memunculkan tampilan dari List yang berisi item dari film yang ada di listItems. Selain itu juga akan menampilkan button "hapus semua" yang ada pada latihan 2. Dengan demikian maka fungsinya dapat berjalan dengan baik

![alt text](https://github.com/yobelioe17/tutorial-apap/blob/feat/tutorial-7-frontend/asset/apap5.png?raw=true)

2. Menurut pemahaman kamu selama pengerjaan tutorial ini, apa perbedaan antara state dan props ?
Menurut saya state merupakan suatu variabel yang sebelumnya akan didefinisikan terlebih dahulu pada sebuah class. Props merupakan variabel yang berasal dari luar kelas, atau bisa juga dia berasal dari class Parent yang ada.
(sumber: https://www.dumetschool.com/blog/Mengenal-State-Dan-Props-Pada-React#:~:text=State%20adalah%20sebuah%20properti%20atau,luar%20class%20atau%20class%20parent.)

3. Apa keuntungan menggunakan component (e.g. List, Item) di React? Berikan contohnya!
Keuntungan menggunakan component:
- Lebih ringkas. Contoh : pada App.js kita tidak perlu menuliskan baris kode yang panjang. Cukup melakukan import dan memanggil componentnya saja maka baris kode itu akan secara otomatis masuk ke App.js
- Mudah mendeteksi error. Contoh : bila saat melakukan run ada error, akan bisa terdeteksi darimana sumber error tersebut. Kalau sumbernya dari component, maka dapat dengan cepat diatasi. Seandainya semua kode ada di App.js, maka error detection dan debuggingnya menjadi lebih ribet dan melibatkan banyak elemen.
- Merupakan best practice. Contoh : Agar tercipta kondisi clean code, menggunakan component adalah solusi yang baik serta efektif.
- Dapat menggabungkan antar component. Contoh : Ketika ada lebih dari 1 komponen yang ingin dimasukkan secara bertumpuk, bisa dilakukan dengan memasukkan tag dalam tag dalam tag dan seterusnya. Bila semua code dimasukkan kedalam App.js saja, malah membuat code terlihat sulit dibaca.

4. Menurut kamu, apa saja kelebihan menggunakan React dalam pengembangan web?
Menurut saya keuntungannya:
- Menjadi lebih profesional
- Tampilan website lebih baik
- Pengorganisasian website lebih terstruktur
- Apabila ada error bisa dilacak di bagian mana
- Memiliki berbagai fitur mempermudah pengaturan elemen dan komponen website

5. Menurut kamu, apa saja kekurangan menggunakan React dalam pengembangan web?
Menurut saya kekurangannya:
- Lebih sulit
- Membutuhkan pemahaman lebih terkait javascript extension
- Tidak ramah bagi orang yang belum terbiasa coding
- Kemungkinan error pada teknis saat membuat environtment react


## Tutorial 8
1. Ceritakan langkah - langkah yang kalian lakukan untuk solve LATIHAN no.1, dan mengapa kalian melakukan langkah - langkah tersebut?
Dalam menyelesaikan soal nomor satu, saya perlu memahami bahwa permasalahan ini muncul ketika masuk kedalam handleSubmitAddResep. Pada function tersebut, selama page belum direfresh maka nilainya akan tetap sama dengan nilainya yang sebelumnya. Sehingga saya berpikiran untuk mencoba mengatur ulang nilai state menggunakan setState menjadi string kosong. Alhasil ketika tombol submit ditekan, maka di akhir fungsi handleSubmitAddResep akan mengatur ulang nilainya menjadi string kosong tanpa perlu direfresh terlebih dahulu.

2. Jelaskan fungsi dari async dan await !
Berdasarkan apa yang saya amati, async merupakan definisi dari method yang bisa dijalankan secara tidak langsung (asynchronous) sesuai dengan namanya. Hal ini mengakibatkan method lainnya yang bisa jadi berhubungan juga dapat dijalankan secara berkesinambungan. Sedangkan await merupakan suatu method yang berada dalam method async yang menunggu atau mengirim input menuju API.

3. Masukkan jawaban dari Screenshot yang diperintahkan di halaman 8 pada Component Lifecycle pada pertanyaan ini.

![alt text](https://github.com/yobelioe17/tutorial-apap/blob/feat/tutorial-8-frontend/frontend-haidokter/src/assets/nomor3.jpg?raw=true)

4. Jelaskan fungsi dari componentDidMount, shouldComponentUpdate, componentDidUpdate, componentWillReceiveProps, componentWillUnmount.
componenDidMount berfungsi untuk menghandle tindakan apa saja yang dilakukan ketika output sudah mulai dirender
shouldComponentUpdate berfungsi sebagai indikator yang menentukan apakah nantinya perubahan akan dimunculkan atau tidak (diperlihatkan atau tidak)
componentDidUpdate berfungsi untuk menghandle tindakan apa saja yang akan dilakukan apabila suatu component dilaukan update
componentWillReceiveProps berfungsi untuk menghandle tindakan yang terjadi apabila ada perubahan pada props sebelum rendering terjadi
componentWillUnmount berfungsi untuk menghandle tindakan apa saja sebelum component akan di unmount.
Fungsi tersebut sangat berguna dalam penggunaan Hook di React.js. Hooks merupakan fungsi yang dapat membantu untuk “mengaitkan” state serta berbagai macam fitur-fitur lifecycle React dari function component. Dengan adanya Hooks, mampu memungkinkan coding menggunakan React tanpa adanya kelas.
(sumber: https://id.reactjs.org/docs/hooks-overview.html#:~:text=Hooks%20merupakan%20fungsi%20yang%20memungkinkan,lifecycle%20React%20dari%20function%20component.&text=React%20menyediakan%20beberapa%20Hooks%20bawaan,behavior%20antara%20komponen%20yang%20berbeda)
