# KinoSistem

1. Opis projekta

KinoSistem je jednostavna web aplikacija razvijena pomoću Java programskog jezika i Spring Boot okvira. Aplikacija prikazuje filmove i karte za kino, kao i detalje odabranog filma i karte koje mu pripadaju.

Podaci se čuvaju u memoriji aplikacije, bez korištenja baze podataka. Za prikaz podataka koristi se Thymeleaf.

2. Članovi tima
Aida Terzić
Selma Škulj

3. Korištene tehnologije

- Java
- Spring Boot
- Thymeleaf
- HTML
- CSS
- IntelliJ IDEA
- Git i GitHub

4. Modeli i njihova povezanost
Film

Model `Film` predstavlja film u kinu. Sadrži sljedeće atribute:

- `id` – jedinstveni identifikator filma
- `naziv` – naziv filma
- `zanr` – žanr filma
- `trajanje` – trajanje filma u minutama
- `godina` – godina izlaska filma

Karta

Model `Karta` predstavlja kartu za projekciju filma. Sadrži sljedeće atribute:

- `id` – jedinstveni identifikator karte
- `cijena` – cijena karte
- `red` – red u kojem se nalazi sjedište
- `sjediste` – broj sjedišta
- `film` – film za koji je karta izdata

Veza između modela

Između modela `Film` i `Karta` postoji veza jedan-prema-više (1:N). Jedan film može imati više karata, dok je svaka karta povezana s jednim filmom.

5. Logički tok kreiranja aplikacije

Aplikacija je razvijena kroz nekoliko koraka:

1. Kreiranje projekta: Kreiran je Spring Boot projekat u razvojnom okruženju IntelliJ IDEA.
2. Kreiranje modela: Napravljene su klase `Film` i `Karta` koje opisuju podatke aplikacije.
3. Priprema podataka: U klasi `DemoData` definisani su početni filmovi i karte. Podaci se čuvaju u memoriji, bez baze podataka.
4. Kreiranje kontrolera: Klasa `KinoController` obrađuje GET zahtjeve, dohvaća podatke iz klase `DemoData` i prosljeđuje ih odgovarajućim HTML stranicama.
5. Izrada prikaza: Napravljene su tri Thymeleaf stranice:
   - `listA.html` prikazuje listu filmova.
   - `listB.html` prikazuje listu karata.
   - `action.html` prikazuje detalje odabranog filma i karte povezane s njim.
6. Navigacija i interakcija: Korisnik može pregledati filmove i karte te odabrati film kako bi vidio njegove detalje.
7. Testiranje aplikacije: Aplikacija se pokreće lokalno i provjerava se prikaz podataka i ispravnost navigacije.
8. Postavljanje projekta: Izvorni kod projekta postavlja se na GitHub radi pohrane i dijeljenja.

6. Rute aplikacije

| Ruta | Opis |
|---|---|
| `/` | Preusmjerava korisnika na listu filmova |
| `/a` | Prikazuje sve filmove |
| `/b` | Prikazuje sve karte |
| `/a/action/{id}` | Prikazuje detalje odabranog filma i njegove karte |

7. Internet izvori i alati

Tokom izrade projekta korišteni su sljedeći alati i izvori:
- GitHub: https://github.com/
- IntelliJ IDEA: https://www.jetbrains.com/idea/
- Kao i projekat sa prethodnih vjezbi battlearena

8. Zaključak

KinoSistem demonstrira osnove razvoja web aplikacije pomoću Spring Boot okvira i Thymeleaf predložaka. Kroz povezane modele, kontroler, podatke u memoriji i tri prikaza omogućeno je pregledanje filmova, pregledanje karata i prikaz karata povezanih s odabranim filmom.
