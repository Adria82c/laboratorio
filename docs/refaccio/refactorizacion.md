## Concepto de refactorización (Refactoring -EN-, Refacció -Cat)
La refactorización es el proceso de mejorar la estructura interna del código sin cambiar su comportamiento externo. Esto incluye:
- Mejorar la legibilidad del código.
- Reducir la complejidad.
- Eliminar código duplicado.
- Mejorar la mantenibilidad.
- Optimizar el rendimiento sin alterar la funcionalidad.

## Refactorización de GestorEnergia

La clase `GestorEnergia` se puede refactorizar aplicando varias técnicas de refactorización:

- **Extracción de métodos**: Se pueden extraer métodos para calcular la producción de cada tipo de panel, reduciendo la duplicación de código.
- **Introducción de constantes**: Los valores como 250, 200, 150, 50, 30 y los porcentajes de pérdida de calor pueden definirse como constantes descriptivas.
- **Refactorización de condicionales**: Simplificar las estructuras `if-else` para mejorar la legibilidad.
- **Eliminación de código duplicado**: La lógica de cálculo de `rendimentFinal` se repite y puede unificarse en un método común.
- **Uso de enumeraciones**: Se puede utilizar una enumeración para los tipos de panel (`MONO`, `POLY`, `FILM`) en lugar de cadenas de texto, mejorando la seguridad y legibilidad del código.

