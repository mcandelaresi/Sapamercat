# SAPAMERCAT - Aplicació Carret de la Compra (MVC)

## Descripció
Aquest projecte implementa la gestió d’un carret de la compra per a la multinacional fictícia **SAPAMERCAT**, utilitzant el patró **MVC (Model-View-Controller)**.  
Permet calcular els preus dels productes en temps real i generar tiquets de compra.  

Els productes disponibles són:
- **Alimentació**: té data de caducitat; el preu varia segons dies que falten per caducar.
- **Tèxtil**: té composició tèxtil; no poden haver-hi duplicats amb el mateix codi de barres.
- **Electrònica**: té dies de garantia; el preu varia segons dies de garantia.

## Arquitectura MVC

### Model
- Conté les classes que representen els **productes** (`Producte`, `Alimentacio`, `Textil`, `Electronica`) i la **gestió del carret de la compra** (`CarretCompra`).
- Implementa lògica de negoci: càlcul de preus, control de duplicats i ordenació.

### View
- Gestiona la **interacció amb l’usuari**: mostrar menús, llistar productes, mostrar carret i tiquets.
- La classe principal `Main` només crida mètodes de `View` i `Controller`.

### Controller
- Gestiona la **lògica d’aplicació**: afegir productes al carret, passar per caixa, ordenacions i cerques.
- Utilitza **Map** per emmagatzemar productes i unitats, i **streams/lambda expressions** per recorreguts i filtres.

## Funcionalitats

- Afegir productes al carret i limitar-lo a 100 productes.
- Mostrar el carret amb descripció i quantitat.
- Ordenar productes tèxtils per composició amb `Comparator`.
- Evitar duplicats de productes tèxtils amb el mateix codi de barres.
- Passar per caixa i generar tiquet amb preu unitari, subtotal i total.
- Calcular preus dinàmics:
  - Alimentació: `preu - preu*(1/(diesRestants+1)) + (preu * 0.1)`
  - Electrònica: `preu + preu*(diesGarantia/365)*0.1`
- Cercar producte pel codi de barres amb **streams** i **lambda expressions**.

## Estructura del projecte (MVC)
Sapamercat
├── model
│   ├── Producte.java
│   ├── Alimentacio.java
│   ├── Textil.java
│   ├── Electronica.java
│   └── CarretCompra.java
├── Vista
│   └── Vista.java
├── Controlador
│   └── Controlador.java
├── Main.java
├── TextilComparator.java
├── README.md
└── .gitignore

## Tecnologies i tècniques
- Java 17
- Collection Map (`HashMap`)
- Streams i Lambda Expressions
- Classes abstractes i herència
- Comparable i Comparator
- LocalDate per dates
- Patró MVC

## Instruccions d’ús
1. Compilar tot el projecte: `javac */*.java Main.java`
2. Executar la classe principal: `java Main`
3. Seguir el menú per introduir productes, veure el carret o passar per caixa.

## Git i commits
- Commit inicial: creació del model (`Producte` i subclasses).
- Commit: afegir `CarretCompra` i lògica Map.
- Commit: implementar `TextilComparator` i comparacions.
- Commit: crear `Vista` i `Controlador`.
- Commit final: integració MVC i menú principal.

## .gitignore
- Ignorar fitxers `.class`, configuracions d’IDE (`.idea/`) i directori `out/`.
