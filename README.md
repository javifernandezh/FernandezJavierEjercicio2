# FernandezJavierEjercicio2
LaSalleKidsHappyMeal
Sistema de gestión de pedidos para menús infantiles por consola. Este proyecto permite a los usuarios configurar un menú personalizado (plato principal, complemento, postre y bebida) con una sorpresa aleatoria y cálculo automático de precios.

Descripción del Proyecto
La aplicación simula el proceso de compra de un Happy Meal en LaSalleKids. El flujo del programa guía al usuario a través de diferentes categorías, validando las entradas y generando un resumen final detallado con los costes desglosados.

Características principales:
-Selección Modular: Elección entre múltiples opciones de platos, complementos, postres y bebidas.
-Sistema de Sorpresa: Selección aleatoria de un regalo (Juguete, Libro o Chuches) al finalizar el pedido.
-Gestión de Precios: Cálculo total basado en las elecciones del usuario.
-Robustez: Control y validación de entrada de datos por consola.

Estructura del Proyecto
El código sigue los principios de Clean Code y está dividido en dos componentes principales:
-Modelo de Datos (Menu.java): Clase que encapsula la información del pedido, precios y lógica de cálculo.
-Controlador (Main.java): Gestiona la interacción con el usuario, la lectura de teclado y el flujo de la aplicación.

Ejemplo de Ejecución:
Seleccione su Plato Principal:
1. Hamburguesa (2.50€)
2. Chicken Burger (2.75€)
3. Nuggets (2.25€)
...
RESUMEN DE SU PEDIDO:
Plato principal: Hamburguesa 2.50€
Complemento: Patatas fritas 2.00€
Postre: Manzana 1.00€
Bebida: Agua 1.00€
Sorpresa: Libro
TOTAL: 6.50€
