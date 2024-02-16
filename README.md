### Brug af fragments
Et HTML fragment er en HTML kodeblok, der kan genbruges på tværs af HTML sider. 
Et fragment kaldes på en HTML side via Thymeleaf:

```
<div th:replace="fragments/header :: header">...</div>
```

Den første del af udtrykket `fragments/header` refererer til HTML filen `header.html`, hvor fragmentet er defineret. Udtrykket efter :: er en fragment selektor:. Fragmentet i `header.html` hedder også header, så derfor skal det skrives eftre dobbelt kolon:

```
<div th:fragment="header">
    <nav>
        ...
   </nav>
</div>
```

Du kan se i HTML filerne hvordan de konkret bruges, se f.eks. `start.html`. 

### Brug af nav 
HTML Tag `<nav>` definerer et sæt af navigationslinks 
og er i applikationen lavet som et fragment, der definerer en menu, som kan vises i toppen af alle websider.

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
      
