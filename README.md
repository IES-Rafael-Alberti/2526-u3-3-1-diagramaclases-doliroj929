[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/HJqBG45V)
# Práctica 3.1: Diagrama de clases

Apoyate en los siguientes recursos para realizar la práctica:

Archivos en el repositorio:
Ej1_DiagramaClases_LibrosAutor.md
Ej2_DiagramaClases_CursosUniversitarios.md
....

Usa el ejercicio 5 como referencia para realizar los diagramas de clases del resto de ejercicios.

## Ejercicios.
Cada ejercicio en un archivo diferente, con nombre `EjX_DiagramaClases_NombreTema_sol.md`, donde X es el número de ejercicio y NombreTema es una breve descripción del tema del ejercicio.

## Entrega
1. Agregar en la carpeta `src` la solución de los ejercicios 
3. Mas abajo tienes un ejemplo de como entregar la práctica. Aplica lo que tenga sentido, ya que no es un programa.
4. Recuerda que debes subir el enlace al repositorio en la tarea correspondiente del aula virtual.



---

# Título de la Actividad

## Identificación de la Actividad
- **ID de la Actividad:** 3.1. Diagrama de clases
- **Módulo:** [Nombre del módulo]  `Entornos de desarrollo`
- **Unidad de Trabajo:** 3.1. Diagrama de clases
- **Fecha de Creación:** 9/12/2025
- **Fecha de Entrega:** 9/12/2025
- **Alumno(s):**
    - **Nombre y Apellidos:** Daniel Felipe Oliveros Rojas
    - **Correo electrónico:** doliroj929@g.educaand.es
    - **Iniciales del Alumno/Grupo:** DFOR

## Descripción de la Actividad

Este repositorio contiene la solución a una serie de ejercicios de **Modelado de Sistemas de Información** utilizando el **Diagrama de Clases UML**, y la posterior implementación de las estructuras de diseño en **Kotlin**.

La actividad se centró en interpretar especificaciones de negocio complejas (Biblioteca, E-Commerce, Universidad, Empresa) para aplicar y demostrar los siguientes conceptos y patrones avanzados de POO:


    
-   Definición precisa de **Cardinalidades** y **Restricciones de Negocio**.
    

----------

## Instrucciones de Compilación y Ejecución

1.  **Requisitos Previos:**
    
    -   **Lenguaje de programación y versión:** Kotlin .
        
    -   **Herramienta de Diagramación:** PlantUML  
        

## Desarrollo de la Actividad

### Enfoque de Diseño

El desarrollo abordó los requisitos mediante una metodología basada en la **identificación de entidades y relaciones**, priorizando la **coherencia estructural** sobre la implementación de la lógica interna. Se utilizaron las siguientes estrategias clave en el modelado:

1.  **Modelado de la Jerarquía:** Implementación de herencia explícita en UML para capturar la especialización de roles, simplificando el mantenimiento de atributos comunes.
    
2.  **Relaciones Complejas:** Uso de la **Clase de Asociación** en escenarios de Muchos-a-Muchos donde la relación posee atributos propios (e.g., `nota` en una `Matricula`).
    
3.  **Traducción a Kotlin:** El código refleja directamente el diseño UML, utilizando `private val` para la visibilidad privada, **Propiedades Calculadas** para los métodos derivados, y colecciones (`List`, `MutableList`) para las asociaciones con cardinalidad de muchos.
    

### Código Fuente

A continuación se incluyen enlaces representativos a las estructuras de código fuente y diagramas (se asume que la estructura de archivos existe):

-  
    

----------

## Conclusiones

La actividad demuestra la habilidad para pasar del análisis de requisitos narrativos al diseño formal **UML** (Clase de Asociación, Herencia, Reflexiva) y, finalmente, a una implementación **Kotlin** que respeta la arquitectura definida, asegurando la **trazabilidad** y el **cumplimiento de las reglas de negocio** desde el modelo hasta el código fuente.


#Notas Adicionales:#


El trabajo no esta totalmente terminado