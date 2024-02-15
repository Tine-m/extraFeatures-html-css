### Brug af fragments
"HTML fragments are chunks of HTML code that contain common elements or features that you want to reuse"
Se eksempel på hvordan de bruges til at lave navigationslinks i HTML filerne:
```
<div th:replace="fragments/header :: header">...</div>
```
### nav 
Tag <nav> definerer et sæt af nivagationslinks og er brugt til at lave en menu i toppen af siderne.

### Favicon
"An icon associated with a particular website, typically displayed in the address bar of a browser accessing the site or next to the site name in a user's list of bookmarks."
<br>
Placér den i "images" mappe under "resources": favicon.ico

```
  <link rel=”icon” href="favicon.ico">
```
