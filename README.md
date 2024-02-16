### Brug af fragments
Et HTML fragment er en blok HTML kode, man kan genbruge på flere HTML sider. 
Det kaldes på en HTML side via Thymeleaf (se f.eks. eksempel i `start.html`):

```
<div th:replace="fragments/header :: header">...</div>
```
Den første del af udtrykket `fragments/header` refererer til HTML filen `header.html`. Udtrykket efter :: er en fragment selektor:. Fragment hedder i eksemplet også header:

```
<div th:fragment="header">
    <nav>
        ...
   </nav>
</div>
```

### Brug af nav 
HTML Tag `<nav>` definerer et sæt af navigationslinks 
og er i applikationen lavet som et fragment, 
der definerer en menu i toppen af alle websider.

```
<div th:fragment="header">
    <nav>
        <div class="container">
            <a href="/" id="logo">KEA</a>
            <a href="/news">Nyheder</a>
            <a href="/courses">Kurser</a>
            ...
        </div>
    </nav>
</div>
```
### Brug af Favicon
En favicon er et icon associeret med et bestemt website, og vises typisk i adressebaren i browseren og ved siden af sitenavn i bogmærker.
<br>
Placér den i `images` mappen under `resources`: `favicon.ico`

Der refereres til favicon således:
```
  <link rel=”icon” href="favicon.ico">
```
Vær opmærksom på at der kan være behov for at refreshe browser for at få vist den rigtige favicon. Det gøres med `Ctrl F5` 

### Brug af e-mail link
Man kan lave et e-mail link med en standardmodtager i HTML på følgende måde:

```
<a href="mailto:dig@dinmail.dk">Send os en email</a>
```
      