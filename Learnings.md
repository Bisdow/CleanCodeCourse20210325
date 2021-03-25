# Learnings

## Goals of programming
Korrektheit
 - Fachliche Anforderungen erfüllen
 - Technische Anforderungen (Nicht-Funktionale Anforderungen)
 - Fehlerfrei
 - Behandeln von unerwarteten Fehlern
 
 Veränderbarkeit  
 - Verständlichkeit des Codes
 - Leicht wartbar / erweiterbar
 - Schwierig den Code kaputt zu machen

Produktivität
 - Performance 
 - Entwicklungseffienz

## Goals focused by "Clean Code"
Fokus auf Veränderbarkeit

## Wann ist etwas "Verständlich"
Verständlichkeit basiert immer auf den bisherigen Erfahrungen.
Und ist damit von Person zu Person unterschiedlich.

Beachten das Menschen Informationen besser in "Chunks" verstanden werden.
Im Schnitt kann ein Mensch ca. 7 Chunks auf einmal gut überblicken.

## Strategies to reach the "Clean Code" goals
 - Verständliche / sprechende Variablennamen / Methoden / Klassen / Packete / ...
 - Ordner-/Packetstruktur maximal 7 auf einer Ebene, "Zoom-In" Erlebnis des Kontexts erzeugen
 - Formatierung -> Blöcke, wiederkehrende einheitliche Formatierung
 - Kommentare -> immer erst prüfen ob der CODE Verständlicher werden kann und nur im Notfall einen Kommentar dazu
 - Egal welchen Stil man gewählt hat, bleibt konsistent
 - Variablen / Methoden typisieren
 - Struktur Higher Level Functions => Funktion die Funkionen aufruf/managed, aber keinen/kaum eigenen Code -> Code in verschiedene Abstraktionsebenen unterteilen - Single Responsibility Principle
 - DRY - Do not repeat yourself
 - Globale Variablen wenn möglich vermeiden => Variablen sollten den kleinstmöglichen Scope haben
 - Pure Functions (Funktionen die NUR von dein Eingabeparametern abhängig sind und NUR einen Wert zurückliefern und sonst nichts ändern), nicht abhängig von globalen Variablen
 - Accessability Modifer (Public/Private/...) so restriktiv wie möglich und möglichst explizit (kein Default)
 - YAGNI - You aint gonna need it -> Nicht auf "Verdacht" implementieren, nur wenn echter Bedarf da ist
 - IF-Statements in eigene Methoden auslagern und dadurch mit einem sprechenden Namen versehen
 - Methodenaufrufe mit Parametern hinter extra Methoden verstecken (und darin mit fixem Parameter aufrufen) (mapToBinary(input) => maptoBase(input,2))
 - Fixwerte als Konstanten ablegen (Magic Values benennen)