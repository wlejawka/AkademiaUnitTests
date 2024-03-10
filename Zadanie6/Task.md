# Zadania na zajecia #20 (Unit Tests)
1. Jesteś habilitantem na uniwersytecie profesor poprosił Cię o napisanie funkcji oceniającej pracę studentów
Procentowa skala ocen za egzamin
Egzamin to test zakmnięty składający się z 10 pytań z czterema możliwymi odpowedziami A, B, C, D

Profesor przeprowadza egzaminy metodą szwedzką 
Student za poprawną odpowiedź dostaje 3 punkty
Z nie poprawną odpowiedź student traci 4 punkty
Za nie udzielenie odpowiedzi student traci 1 punkt

Poniżej 51%. – ocena niedostateczna (2,0)
- od 51 do 60 %. - ocena dostateczna (3,0),
- od 61 do 70 %. - ocena dostateczna plus (3,5),
- od 71 do 80 %. - ocena dobra (4,0),
- od 81 do 90 %. - ocena dobra plus (4,5),
- od 91 do 100 %. - ocena bardzo dobra (5,0).

Napisz funkcję która przyjmuję String symbolizujący odpowiedzi na każde pytanie rozdzielone znakiem ; "A;B;A;D;C;C;D"
Student może nie udzielić odpowiedzi na pytanie wtedy odpowiedź jest zastępowana znakiem _   "A;B;_:D;
Funkcja powinna zwracać informację o ocenie w formie stringa 
Profesor nie przepada za studentami dlatego dodatkowo w kluczu odpowiedzi wyznaczył odpowiedź B jako prawidłową
dla wszystkich 10 pytań
2. Napisz testy jednostkowe sprawdzające ww funkcję
* pamiętaj o pokryciu klas równoważności
* pamiętaj o pokryciu decyzji
