# RaumshiffeLight
Lernsituation Raumschiffe


A3.3: Loeser KlassendiagrammOOD StarTrek ⭐⭐

Modellieren Sie die Beziehung zwischen der Klasse Raumschiff und der Klasse Ladung. Ein Raumschiff kann keine oder mehrere Ladungen transportieren. Eine Ladung wird genau von einem Raumschiff transportiert. Ein Raumschiff kennt seine Ladungen, aber die Ladung weiss nicht, in welchen Raumschiff sie transportiert wird.

![Aufgabe 4 Loeser_KlassendiagrammOOD_StarTrek](https://user-images.githubusercontent.com/68115186/232491685-897d7674-916d-4558-914d-e53033635e2c.png)



A4.2: Implementierung der Methoden ⭐⭐⭐

LS02-5-02 Arbeitsauftrag: Implementierung der Klassen Raumschiff und Ladung

Implementieren Sie die im OOD Klassendiagramm modellierten Methoden in Quellcode.
Achten Sie auf die allgemeingültigen Formatierungen des Quellcodes in Java, insbesondere einheitliche Zeilenabstände, geschweifte Klammern und die korrekte Einrückung des Quellcodes.

Klasse Raumschiff
Die nachfolgenden Beschreibungen gelten für die bereits modellierten Methoden:
- Der Zustand des Raumschiffes ausgegeben (10 Punkte):
  - Alle Zustände (Attributwerte) des Raumschiffes auf der Konsole mit entsprechenden Namen ausgeben.

- Ladungsverzeichnis ausgeben (10 Punkte)
  - Alle Ladungen eines Raumschiffes auf der Konsole mit Ladungsbezeichnung und Menge ausgeben.

- Photonentorpedos abschießen (5 Punkte)
  - Gibt es keine Torpedos, so wird als Nachricht an Alle -=*Click*=- ausgegeben.
    Ansonsten wird die Torpedoanzahl um eins reduziert und die Nachricht an Alle Photonentorpedo abgeschossen gesendet. Außerdem wird die Methode Treffer aufgerufen.

- Phaserkanone abschießen (5 Punkte)
  - Ist die Energieversorgung kleiner als 50%, so wird als Nachricht an Alle -=*Click*=- ausgegeben.
  - Ansonsten wird die Energieversorgung um 50% reduziert und die Nachricht an Alle “Phaserkanone abgeschossen” gesendet. Außerdem wird die Methode Treffer aufgerufen.

- Treffer vermerken (5 Punkte)
  - Die Nachricht [Schiffsname] wurde getroffen! wird in der Konsole ausgegeben. [Schiffsname] durch den Namen des Schiffes ersetzen.

- Nachrichten an Alle (5 Punkte)
  - Die Nachricht wird in der Konsole ausgegeben.
  - Die Nachricht wird dem broadcastKommunikator hinzugefügt (für Fortgeschrittene und Experten).

- Logbuch Einträge zurückgeben (5 Punkte)
  - Gibt den broadcastKommunikator zurück.

- Treffer vermerken (10 Punkte)
  - Die Schilde des getroffenen Raumschiffs werden um 50% geschwächt.
  Sollte anschließend die Schilde vollständig zerstört worden sein, so wird der Zustand der Hülle und der Energieversorgung jeweils um 50% abgebaut.
  Sollte danach der Zustand der Hülle auf 0% absinken, so sind die Lebenserhaltungssysteme vollständig zerstört und es wird eine Nachricht an Alle ausgegeben, dass die Lebenserhaltungssysteme vernichtet worden sind.
 
- Ladung “Photonentorpedos” einsetzen (5 Punkte)
  - Gibt es keine Ladung Photonentorpedo auf dem Schiff, wird als Nachricht Keine Photonentorpedos gefunden! in der Konsole ausgegeben und die Nachricht an alle -=*Click*=- ausgegeben.
  Ist die Anzahl der einzusetzenden Photonentorpedos größer als die Menge der tatsächlich Vorhandenen, so werden alle vorhandenen Photonentorpedos eingesetzt.
  Ansonsten wird die Ladungsmenge Photonentorpedo über die Setter Methode vermindert und die Anzahl der Photonentorpedo im Raumschiff erhöht.
  Konnten Photonentorpedos eingesetzt werden, so wird die Meldung [X] Photonentorpedo(s) eingesetzt auf der Konsole ausgegeben. [X] durch die Anzahl ersetzen.

- Ladungsverzeichnis aufräumen (5 Punkte)
  - Wenn die Menge einer Ladung 0 ist, dann wird das Objekt Ladung aus der Liste entfernt.

- Reparatur-Androiden einsetzen (5 Punkte)
  - Die Methode entscheidet anhand der übergebenen Parameter, welche Schiffsstrukturen repariert werden sollen.
  Es wird eine Zufallszahl zwischen 0 - 100 erzeugt, welche für die Berechnung der Reparatur benötigt wird.
  Ist die übergebene Anzahl von Androiden größer als die vorhandene Anzahl von Androiden im Raumschiff, dann wird die vorhandene Anzahl von Androiden eingesetzt.
  Prozentuale Berechnung der reparierten Schiffsstrukturen = (zufallszahl * anzahlDerEingesetztenAndroiden)/(anzahlDerAufTrueGesetztenSchiffstrukturen) 
  Das Ergebnis wird den auf true gesetzten Schiffsstrukturen hinzugefügt.


Klasse Ladung
- Eindeutige Kennung eines Objekts in Form eines Strings zurückliefern (5 Punkte)
- Überschreiben Sie die Methode toString(). Der Rückgabewert sollte dann den Namen der Klasse und alle Zustände des Objekts zurückliefern.

- Merken: 
  - Alle Klassen erben in Java letztlich die in java.lang.Object implementierten Methoden. Die Klasse Java.lang.Object stellt eine Methode namens toString() zur Verfügung, die beim Aufruf eine String-Repräsentation des aktuellen Objekts zurückliefert. D.h.:
    - Alle Java-Objekte verfügen über die toString()-Methode, da sie von Object vererbt wird.
    - toString() liefert eine eindeutige Kennung eines Objekts in Form eines Strings zurück.
    - Für eine nachvollziehbare und selbst erklärende Kennung sollten wir toString() in unseren Klassen überschreiben.

- Hinweis: System.out.println() muss die toString()-Methode nicht explizit aufrufen: Die Nennung der Objektvariablen genügt (es wird dann automatisch toString() aufgerufen).

@Override
Beim Überschreiben von toString() stellen Sie die Annotation @Override der Methodensignatur voran. Diese Anmerkung ist freiwillig, gehört aber zum guten Stil und bietet zwei Vorteile:
  - Besserer Lesbarkeit des Codes.
  - Der Compiler prüft, ob tatsächlich eine Methode aus einer Oberklasse überschrieben wird. Ist die Methodensignatur nicht identisch mit einer Methode aus einer Superklasse (d.h. es würde eine neue Methode hinzugefügt oder eine Methode überladen), erhalten wir praktischerweise eine Compiler-Meldung (etwa: Method does not override method from its superclass).
  


Endzustand für Experten ⭐⭐⭐ 

![Aufgabe 5 Endzustand Experten](https://user-images.githubusercontent.com/68115186/232490919-fd83465e-bd63-45ea-ba67-f060ede7615a.png)



LS02-5-02.1 Arbeitsauftrag: Quellcode verwenden und überprüfen

Ihre Methoden sollen nun Verwendung finden. Führen Sie in der Mainmethode die folgenden Methoden aus und überprüfen Sie die Werte am Ende der Ausführung mithilfe des 2. Objektdiagramms.
Auszuführende Methoden in der Main:
- Die Klingonen schießen mit dem Photonentorpedo einmal auf die Romulaner.
- Die Romulaner schießen mit der Phaserkanone zurück.
- Die Vulkanier senden eine Nachricht an Alle “Gewalt ist nicht logisch”.
- Die Klingonen rufen den Zustand Ihres Raumschiffes ab und geben Ihr Ladungsverzeichnis aus
- Die Vulkanier sind sehr sicherheitsbewusst und setzen alle Androiden zur Aufwertung ihres Schiffes ein.
- Die Vulkanier verladen Ihre Ladung “Photonentorpedos” in die Torpedoröhren Ihres Raumschiffes und räumen das Ladungsverzeichnis auf. 
- Die Klingonen schießen mit zwei weiteren Photonentorpedo auf die Romulaner.
- Die Klingonen, die Romulaner und die Vulkanier rufen jeweils den Zustand Ihres Raumschiffes ab und geben Ihr Ladungsverzeichnis aus.
- Geben Sie den broadcastKommunikator aus. 
