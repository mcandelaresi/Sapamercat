# 🛒 SAPAMERCAT | DAW 🏪

## 🚀 Sobre el projecte
**SAPAMERCAT** és una aplicació desenvolupada en **Java** per gestionar un **carret de la compra en temps real**, seguint el patró **MVC**.

## 📌 Característiques principals
✅ **Gestió de productes**: Alimentació, Tèxtil i Electrònica.  
✅ **Càlcul automàtic del preu** segons el tipus de producte.  
✅ **Límit de 100 productes** al carret.  
✅ **Menú interactiu** per gestionar el magatzem, afegir productes i passar per caixa.  
✅ **Ús d'interfícies** per organitzar millor la funcionalitat.  

## 📁 Estructura del projecte
```plaintext
sapamercat/
├── controlador/
│   ├── Controlador.java # Classe controlador
├── model/producte/
│   ├── Producte.java    # Classe abstracta
│   ├── Alimentacio.java # Producte d'alimentació
│   ├── Textil.java      # Producte tèxtil
│   ├── Electronica.java # Producte electrònic
│   ├── Model.java       # Gestió de productes
├── vista/
│   ├── Vista.java       # Menús i visualització
├── Main.java            # Main
```

## 🛠️ Tecnologies utilitzades
🔹 **Java** (POO i excepcions personalitzades).  
🔹 **Collections API** (HashMap, ArrayList).  
🔹 **MVC** per separar lògica i interfície.  

## 🎮 Funcionament
🔹 **Gestió del magatzem**: Productes ordenats per data de caducitat.  
🔹 **Afegir productes**: Alimentació, Tèxtil o Electrònica.  
🔹 **Passar per caixa**: Calcula el total i controla el límit de productes.  
🔹 **Mostrar carret de la compra**: Veure productes afegits.  


## 📢 Contacte
📌 Desenvolupat com a part del curs de **Desenvolupament d'Aplicacions Web (DAW)**.  
📧 Per dubtes o millores, pots contactar-me!  


