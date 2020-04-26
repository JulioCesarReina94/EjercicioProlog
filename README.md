#Universidad Distrital Francisco José de Caldas

#### Integrantes: 

- Julio Cesar Reina      20201099045
- Cristian Gonzales      20201099032
- Andres Lozano          20201099038

#### Docente:

Alejandro Paolo Daza

#### Asignatura: 

Informatica I


#### 1. PROLOG

Es un lenguaje declarativo para programación lógica de propósito general , se basa en la representación de relaciones mediantes reglas y hechos . La principal diferencia con el imperativo es que buscamos describir el problema. Prolog es un diminutivo de PROgrammation en LOGique

![FIGURA 1](imagenes/prolog.jpg)

<img align="left" width="100" height="100" src="![FIGURA 1](imagenes/prolog.jpg)">

La sintaxis del lenguaje consiste en lo siguiente:
- Declarar hechos sobre objetos y sus relaciones
- Hacer preguntas sobre objetos y sus relaciones
- Definir reglas sobre objetos y sus relaciones

#### 1.1 Hechos

Los hechos no tienen que reflejar el mundo real necesariamente, pero será única y exclusivamente lo que PROLOG tomará como verdadero. Un conjunto de hechos (también llamados cláusulas), junto con un conjunto de reglas, forman lo que se llama una base de datos PROLOG.

ejemplos:

- le_gusta_a(juan,maria).
- valioso(oro).
- tiene(juan,libro).
- da(juan,libro,maria).

#### 1.2 Preguntas

PROLOG busca automáticamente en la base de datos si existe un hecho que se puede unificar (es decir, tiene el mismo nombre de predicado, el mismo número de argumentos y cada uno de los argumentos tiene el mismo nombre, uno a uno) con el hecho que aparece en la pregunta. 

- ?- le_gusta_a(juan,maria).

#### 1.3 Las Reglas

Existe en PROLOG la posibilidad de definir la relación “abuelo(X,Y)” o la relación “tio(X,Y)” como reglas, además de poderlo hacer como hechos o como conjunción de objetivos.

- abuelo(X,Y):- progenitor(X,Z), progenitor(Z,Y).
- tio(X,Y):- progenitor(Z,Y), progenitor(V,Z), progenitor(V,X).

##### 1.4 Ventajas de PROLOG

- El codigo tiende a ser mucho mas corto, luego es facil de modificar.
- Facilidad de Programar.
- Con PROLOG se pueden estructurar sistemas expertos que emulan la habilidad de un humano para la toma de decisiones.

##### 1.5 Desventajas de PROLOG

- Curva de Aprendizaje larga.
- Se deben establecer muy bien los hechos o la representación del conocimiento, por que pueden haber soluciones erroneas.
- Forma de pensar es diferente como los programadores estan acostumbrados.



#### 2. EJERCICIO DE APLICACION (NOTAS)

Para esta actividad se eligio realizar la actividad correspondiente a las notas de un curso, donde se establecio un archivo PROLOG con los datos de los estudiantes y sus calificaciones, correspondientes a 3 talleres, 2 parciales y 1 calificacion por asistencia. 

Las Calificaciones se asignarion de la Siguiente manera.

- 50% Parciales
- 30% Talleres
- 20% Asistencia

#### Integracion de Prolog con Java....

Al Realizar la Consulta por codigo de estudiante el Sistema retorna la nota definitiva de la asignatura, calculada previamente en la logica de PROLOG.


#### 3. Referencias Web

- https://swish.swi-prolog.org/p/Tutorial%20de%20prolog.swinb
- https://github.com/apdaza/universidad-ejercicios/tree/master/prolog
- http://ferestrepoca.github.io/paradigmas-de-programacion/proglogica/tutoriales/prolog-gh-pages/Prolog.pdf
