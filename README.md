# WebsitesStatusVerify

WebsitesStatusVerify, RestAssured ve Cucumber kullanarak web sitelerinin durum kodlarını doğrulayan bir projedir. Bu proje, belirli URL'lere GET isteği gönderir, yönlendirmeleri takip eder ve son yönlendirme sonrası durumu kontrol eder.

## Proje Yapısı

- **src/test/java**: Test senaryoları ve adım tanımları burada bulunur.
- **src/test/resources**: Cucumber özellik dosyaları burada bulunur.
- **pom.xml**: Proje bağımlılıkları ve yapılandırmalar burada tanımlanır.

## Bağımlılıklar

Bu proje aşağıdaki ana bağımlılıkları kullanır:

- Cucumber Java
- Cucumber JUnit
- RestAssured
- JUnit

Bağımlılıkların tam listesi ve sürümleri için `pom.xml` dosyasına bakabilirsiniz.

## Kurulum

1. Bu projeyi klonlayın:
   ```bash
   git clone https://github.com/yourusername/WebsitesStatusVerify.git
