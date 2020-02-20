# Bulanik-Mantik-ve-Yapay-Sinir-Aglari

Bu veri setinde alkol kullanımına bağlı kan değerlerine bakılarak karaciğer hastası olup olmama ihtimaline bakılıyor. Veri setinde toplam 345 adet örnek sayısı olup 7 adet öznitelik vardır. Bu veri setindeki ilk 5 öznitelik bekar erkeklerin belirtilen kan değerlerini gösteriyor. 6. öznitelik ise kişinin aldığı alkol değerinin ‘pint’ ile ifade edilen ölçü değerini gösteriyor. Daha sonra 7. öznitelik kişinin tüm bu değerlerine bakılarak karaciğer hastası olma ihtimali düşük ise ‘1’ sonucunu, yüksek ise ‘2’ sonucunu veriyor.

Özniteliklerin üyelik fonksiyonları belirlenirken öncelikle bu niteliklerin ne anlama geldiği araştırıldı. Kan değerlerinin normal aralıkları araştırılarak sınır değerleri belirlendi. fcl dosyasındaki kurallar yazılırken sınır değerlerine bakılarak kurallar yazıldı. Yani kan değerinde bir yükseklik varsa bu kişinin karaciğer olma ihtimali de yüksektir. 

1. öznitelik için normal değerler: 80-96, 
2. öznitelik için normal değerler: 20-130, 
3. öznitelik için normal değerler: 4-36, 
4. öznitelik için normal değerler: 8-33, 
5. öznitelik için normal değerler: 5-40, 
6. Öznitelik için normal değerler: 2.0-10.0

Çıktı olarak ya 1 ya da 2 verilerini elde edeceğimiz için durulama metodu olarak  COGS kullanıldı. Hata hesabı yaparken MAPE yolu ile hata oranı ekrana yazdırılmak hedeflendi. Fakat bu tam olarak gerçekleştirilemedi.
