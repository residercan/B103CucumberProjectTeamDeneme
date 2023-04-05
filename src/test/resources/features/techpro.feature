@techpro
Feature: Techproeducation Title Testi
  Scenario: TC_01_sayfanin_baslik_testi
    Given techpro sayfasina gidilir
    When sayfa basligi yazdirilir
    Then sayfa basliginda Bootcamp yazisi oldugu test edilir
    And sayfa kapatilir