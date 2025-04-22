# ✈️ Escenario: Vuelos 

## 🧾 Consigna: Sistema de reservas de vuelos 

- Implementar un sistema en Java que permita gestionar reservas de vuelos. 

- El sistema debe permitir la creación de vuelos, la reserva de pasajes y el manejo de listas de espera en caso de vuelos completos. 

## 🧩 Requisitos: 

-  ✅ Utilizar un **conjunto** para almacenar los vuelos disponibles. Cada vuelo debe tener origen, destino, fecha, hora y cantidad de asientos. 

-  ✅ Utilizar un **diccionario** para almacenar las reservas. La clave será el número de reserva, y el valor debe incluir los datos del pasajero (nombre, apellido, pasaporte) y del   vuelo reservado. 

-  ✅ Utilizar una **cola** de espera para los vuelos que no tengan asientos disponibles. 

-  ✅ Cuando se cancela una reserva, el sistema debe liberar un asiento y permitir que el primer pasajero en la cola de espera lo ocupe. 

-  ✅ Incluir la posibilidad de consultar vuelos disponibles y ver el estado de reservas y colas de espera. 

> 💡 Proyecto realizado por:
> Lopez Lopez, Bautista;
> Ozafran, Ian;
> Camargo, Matias;
> Raimondo, Bautista;
> Rivela, Lazaro
