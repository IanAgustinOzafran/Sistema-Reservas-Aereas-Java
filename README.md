# ✈️ Escenario: Vuelos 

## 🧾 Consigna: Sistema de reservas de vuelos 

### Implementar un sistema en Java que permita gestionar reservas de vuelos. 

El sistema debe permitir:
   - Creación de vuelos.
   - Reserva de pasajes.
   - Manejo de listas de espera en caso de vuelos completos. 

## 🧩 Requisitos: 

-  ✅ Utilizar un **conjunto** para almacenar los vuelos disponibles. Cada vuelo debe tener **origen, destino, fecha, hora y cantidad de asientos**. 

-  ✅ Utilizar un **diccionario** para almacenar las reservas. La **clave será el número de reserva, y el valor debe incluir los datos del pasajero (nombre, apellido, pasaporte) y del   vuelo reservado.**

-  ✅ Utilizar una **cola** de espera para los vuelos que no tengan asientos disponibles. 

-  ✅ Cuando se **cancela una reserva**, el sistema debe liberar un asiento y permitir que el primer pasajero en la cola de espera lo ocupe. 

-  ✅ Incluir la posibilidad de **consultar vuelos disponibles** y ver el **estado de reservas y colas de espera**.
 
## 🛠️ Tecnologías y Estructuras de Datos Utilizadas

Para cumplir con los requisitos del proyecto, aplicamos los principios de la Programación Orientada a Objetos (POO) y optimizamos el manejo de datos utilizando el **Java Collections Framework**:

* **Sets (Conjuntos):** Implementados para garantizar la unicidad de los vuelos disponibles, evitando duplicados mediante la sobrescritura de `equals()` y `hashCode()`.
* **HashMaps (Diccionarios):** Utilizados para almacenar las reservas, permitiendo un acceso rápido de complejidad $O(1)$ a través del número de reserva.
* **PriorityQueues (Colas de Prioridad):** Empleadas para gestionar las listas de espera, lo que permite ordenar de forma automatizada y asíncrona a los pasajeros según criterios de prioridad cuando se libera un asiento.

## 🚀 Cómo Ejecutar el Proyecto

1. Clona este repositorio: 
   `git clone https://github.com/IanAgustinOzafran/Sistema-Reservas-Aereas-Java.git`
2. Abre el proyecto en tu IDE favorito (IntelliJ, Eclipse, NetBeans).
3. Ejecuta la clase principal (`Main.java`) para iniciar el sistema de gestión.

> 💡 Proyecto realizado por:
> Lopez Lopez, Bautista;
> Ozafran, Ian;
> Camargo, Matias;
> Raimondo, Bautista;
> Rivela, Lazaro
