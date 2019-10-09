# TUGAS 3 ASISTENSI PBO - Jumat, 4 Oktober 2019

NAMA: Admiral Nelson S. A. Litik

NRP: 06111840000086

## Deskripsi Soal
Buat class **LinearEquation** untuk sistem persamaan linear 2x2:
* ax+by=e
* cx+dy=f
* x = (ed-bf)/(ad-bc)
* y = (af-ec)/(ad-bc)

Ketentuan class-nya:
* Menggunakan modifier **private** untuk a, b, c, d, e, f.
* Konstruktor kosong dan konstruktor dengan argumen a, b, c, d, e, f.
* method **setter** dan **getter** untuk a, b, c, d, e, f.
* Sebuah method **cekSolusi** untuk mengecek apakah persamaan yang diinputkan memiliki solusi atau tidak. Tidak memiliki solusi jika ad-bc=0

Buat juga **Diagram UML** dan **main class** untuk mengimplementasikan semua method di class **LinearEquation** yang kalian buat.

## Contoh
Contoh 1:
![](/img/1.png)

Penjelasan:
* a=4,b=-5,c=7,d=7,e=10,f=12
* x=  (10*7-(-5)*12)/(4*7-(-5)*7)=130/63=2,06
* y=  (4*12-10*7)/(4*7-(-5)*7)= -22/63≈-0,35

Contoh 2:
![](/img/2.png)
Penjelasan:
ad-bc=2*3-3*2=0
Karena penyebut nya 0, maka tidak memiliki solusi.

## Soal
Input 	: 12 5 13 0 12 7

Output	: x = 0.5384615384615384, y = 1.1076923076923078


Input 	: -18 9 10,5 11 0 0

Output	: x = -0.0, y = 0.0


### 1 extra mile
soal opsional, tapi selesaikan semua soal di atas terlebih dahulu

![](/img/3.png)

## Screenshot hasil
<img width="799" alt="Asis4_PersLinear1" src="https://user-images.githubusercontent.com/49511318/66452457-b8e65500-ea8a-11e9-996b-d544b4a4cc37.PNG">
<img width="546" alt="Asis4_PersLinear2" src="https://user-images.githubusercontent.com/49511318/66452461-bc79dc00-ea8a-11e9-95d6-bbffb00ac63b.PNG">

## Upload
upload seluruh folder project java-nya ke repository ini
