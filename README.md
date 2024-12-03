# **chipiParking**

**chipiParking** es un sistema de gestión para un parqueadero que permite registrar, gestionar y monitorear las placas de los vehículos, considerando tiempos de estadía, tarifas y otras funcionalidades relacionadas. Este proyecto sigue una arquitectura basada en microservicios, facilitando su escalabilidad y mantenibilidad.

---

## **Descripción General**

El sistema tiene como objetivo proporcionar una solución integral para gestionar las operaciones diarias de un parqueadero. Las principales funcionalidades incluyen:

- Registro de vehículos y sus placas.
- Gestión de tiempos de entrada y salida.
- Cálculo de tarifas con base en tiempos predefinidos.
- Administración de usuarios y roles.
- Integración con diferentes microservicios para una arquitectura modular.

Cada funcionalidad principal está separada en microservicios para asegurar un desarrollo limpio y organizado.

---

## **Microservicios Actuales**

- **Users Microservice**  
  Maneja la creación y gestión de usuarios:

    - Registro de nuevos usuarios.
    - Consulta de usuarios por ID o email.
    - Listado completo de usuarios.
- **Plates Microservice** _(En desarrollo)_  
  Gestionará las placas de los vehículos:

    - Registro y consulta de placas.
    - Validaciones relacionadas con las placas.
    - Integración con tiempos de estadía y tarifas.