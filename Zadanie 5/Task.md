# Zadania na zajecia #20 (Unit Tests)

1. Napisz metode obliczającą rabat dla klienta w sklepie detalicznym
Metoda będzie przyjmować dwa parametry:
wartość zakupów wartość int
informacja o tym czy klienta posiada kartę klienta w formie boolean
jeśli klient nie posiada kartę powinien dostać informację zwrotną "Karta" w postaci string
Jeśli klient posiada kartę powinien dostać informację zwrotną "Rabat wynosi X%" w postaci string
• wartość zakupów jest mniejsza lub równa 100 zł, to rabat wynosi 5%
• wartość zakupów z przedziału 101 do 200 zł -> rabat 10%
• wartość zakupów z przedziału 201 do 300 zł -> rabat 15%
• wartość zakupów z przedziału 301 do 400 zł -> rabat 20%
• wartość zakupów powyżej 400 zł -> rabat 25%
2. Napisz testy jednostkowe używająć adnotacji ParametrizedTest przy użyciu annotacji CSVSource
