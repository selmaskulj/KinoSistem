Naziv aplikacije: Kino Sistem
Clanovi tima:
1. Aida Terzić
2. Selma Škulj

U aplikaciju su ugrađeni novi moddeli koji prate domensku logiku kino sistema.
npr model fIlm predstavlja entitet filma sa osnovnim atributma zatim model projekcija predstavlja entitet kino projekcije sa njenim atributima a između ova dva modela 
ostvarena je vise na prema jedan relacija.
To znaci da je jedna projekcija vezana za tacno jedan film, dok jedan film moze imati vise razlicitih termina projekcije.
Aplikacija koristi dva tipa kontrolera za rad sa novim modelom obicni MVC kontroler-KinoController i Rest controller-ProjekcijaRestController.

Povezivanje sa MySql bazom podataka definisanp je u konfiguracijskom fajlu application.properties
      
