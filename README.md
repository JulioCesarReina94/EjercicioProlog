#Universidad Distrital Francisco José de Caldas

#### Integrantes: 

- Julio Cesar Reina      20201099045
- Cristian Gonzales      20201099032
- Andres Lozano          20201099038

#### Docente:

Alejandro Paolo Daza

#### Asignatura: 

Informatica I


#### ¿Que es Prolog?

Prolog es un lenguaje de programación declarativo, lo que significa que es un lenguaje basado en la declaración de condiciones, proposiciones, afirmaciones. En el caso de prolog se hace la declaración de hechos y reglas.

La sintaxis del lenguaje consiste en lo siguiente:
- Declarar hechos sobre objetos y sus relaciones
- Hacer preguntas sobre objetos y sus relaciones
- Definir reglas sobre objetos y sus relaciones

#### Hechos

Los hechos no tienen que reflejar el mundo real necesariamente, pero será única y exclusivamente lo que PROLOG tomará como verdadero. Un conjunto de hechos (también llamados cláusulas), junto con un conjunto de reglas, forman lo que se llama una base de datos PROLOG.

ejemplos:

- le_gusta_a(juan,maria).
- valioso(oro).
- tiene(juan,libro).
- da(juan,libro,maria).

#### Preguntas

PROLOG busca automáticamente en la base de datos si existe un hecho que se puede unificar (es decir, tiene el mismo nombre de predicado, el mismo número de argumentos y cada uno de los argumentos tiene el mismo nombre, uno a uno) con el hecho que aparece en la pregunta. 

- ?- le_gusta_a(juan,maria).

#### Las Reglas

Existe en PROLOG la posibilidad de definir la relación “abuelo(X,Y)” o la relación “tio(X,Y)” como reglas, además de poderlo hacer como hechos o como conjunción de objetivos.

- abuelo(X,Y):- progenitor(X,Z), progenitor(Z,Y).
- tio(X,Y):- progenitor(Z,Y), progenitor(V,Z), progenitor(V,X).

Ventajas de PROLOG

- El codigo tiende a ser mucho mas corto, luego es facil de modificar.
- Facilidad de Programar.

Desventajas de PROLOG

- Curva de Aprendizaje larga.
- Se deben establecer muy bien los hechos o la representación del conocimiento, por que pueden haber soluciones erroneas.

- Forma de pensar es diferente como los programadores estan acostumbrados.



Ejercicio de Aplicacion:



