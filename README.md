Market Otomasyon Programı
Bu proje, bir marketin günlük işlemlerini otomatize etmek için geliştirilmiş bir yazılım sistemidir. Frontend ve backend olmak üzere iki ana bileşene sahiptir. Frontend, kullanıcı arayüzünü sağlayan ve müşterilerin, ürünlerin, satışların, satılan ürünlerin ve stokların yönetimini kolaylaştıran bir web arayüzü sunar. Backend ise bu işlemleri veritabanı ile etkileşim içinde gerçekleştiren ve iş mantığını yöneten Java Spring Framework tabanlı bir uygulamadır.

Frontend
Frontend kısmı altı ana HTML dosyasından oluşur:

index.html: Anasayfa, genel özet ve yönlendirme sağlar.
customers.html: Müşteri bilgilerini görüntüler, ekleme, güncelleme, silme ve arama işlemlerini yapar.
products.html: Ürünlerin listesini görüntüler, ekleme, güncelleme, silme ve arama işlemlerini yapar.
sales.html: Satışları listeler, yeni satışlar ekler ve mevcut satışları günceller.
soldproducts.html: Satılan ürünleri görüntüler ve satılan ürünlerin detaylarını gösterir.
stock.html: Mevcut stok bilgisini görüntüler ve stok güncelleme işlemlerini yapar.
Backend
Backend kısmı, Java Spring Framework kullanılarak geliştirilmiştir ve MySQL veritabanıyla etkileşim halindedir. Beş ana tablo bulunmaktadır:

customers: Müşteri bilgilerini saklar.
products: Markette bulunan ürünlerin bilgilerini tutar.
sales: Yapılan satışları kaydeder.
soldproducts: Her bir satışta hangi ürünlerin satıldığını detaylandırır.
stock: Ürün stok bilgilerini saklar.
Backend, model sınıfları, controller'lar ve service sınıfları aracılığıyla bu tabloları yönetir ve iş mantığını gerçekleştirir.

Kullanım
Projenin kullanımı için öncelikle backend'in çalıştırılması gerekmektedir. Daha sonra frontend dosyaları bir web sunucusuna (örneğin Apache veya Nginx) veya yerel bir sunucuya yüklenerek kullanılabilir.

Gereksinimler
Java Development Kit (JDK)
Spring Framework
MySQL Database
Web tarayıcı
Kurulum
Projeyi klonlayın.
MySQL veritabanını oluşturun ve gerekli tabloları içe aktarın.
Backend'i çalıştırın.
Frontend dosyalarını bir web sunucusuna yükleyin veya yerel sunucuda çalıştırın
