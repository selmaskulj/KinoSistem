# Dorada projekta KinoSistem

U ovoj fazi projekta izvršene su sljedeće dorade:

- Povezana je aplikacija s MySQL bazom podataka korištenjem Spring Data JPA i Hibernate tehnologije.
- Kreiran je dodatan Repository klase karta koji je povezan s ostalima.
- Dodana je mogućnost prikaza, dodavanja i ažuriranja projekcija putem Thymeleaf forme.
- Implementiran je REST API za prikaz svih projekcija i prikaz projekcije prema ID-u u JSON formatu.
- Kreirana je klasa `DataInitializer` za unos početnih podataka u bazu te izbrisana dosadasnja in-memory baza u koju su se do sada privremeno cuvali podaci.
- Izmijenjen je `KinoController` tako da podatke preuzima iz baze umjesto iz klase `DemoData`.
- Uređen je izgled stranice za projekcije i dodana navigacija između stranica.

**Ispravljeni problemi:**
- Greške prilikom povezivanja aplikacije s MySQL bazom.
- Problem `Public Key Retrieval is not allowed`.
- Problem s Hibernate Dialect konfiguracijom.
- Problemi s vidljivošću teksta i formi na stranici projekcija.
- Problemi s dodavanjem i ažuriranjem projekcija.

Sve navedene funkcionalnosti su testirane i uspješno rade, od povezivanja i rada s bazom do same stranice, pokretanja, prikaza, dodavanja
i azuriranja projekcija, na portovima.

