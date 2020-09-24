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
