% Hechos preestablecidos
% :- dynamic prueba/1.

calificacion(andres, taller, 3).
calificacion(andres, taller, 4).
calificacion(andres, taller, 5).
calificacion(andres, parcial, 3).
calificacion(andres, parcial, 4).
calificacion(andres, asistencia, 4).
calificacion(miguel, taller, 3.5).
calificacion(miguel, taller, 4.2).
calificacion(miguel, taller, 3.8).
calificacion(miguel, parcial, 3.9).
calificacion(miguel, parcial, 4.5).
calificacion(miguel, asistencia, 4.8).
calificacion(sergio, taller, 2.5).
calificacion(sergio, taller, 3.2).
calificacion(sergio, taller, 3.8).
calificacion(sergio, parcial, 3.9).
calificacion(sergio, parcial, 4.1).
calificacion(sergio, asistencia, 3.8).
calificacion(carlos, taller, 3.6).
calificacion(carlos, taller, 4.2).
calificacion(carlos, taller, 3.7).
calificacion(carlos, parcial, 4.9).
calificacion(carlos, parcial, 4.3).
calificacion(carlos, asistencia, 4.2).

% Arma una lista de notas segun Y,X donde
% Y es el nombre del estudiante y
% X la materia
notas(Y,X,L):-findall(Z,calificacion(Y,X,Z),L).


% Realiza la suma de los elementos de una lista
suma([],0).
suma([X|Y],R):- suma(Y, R1), R is R1 + X.


% Determina el promedio de los talleres
promedioTalleres(X1,Y1) :- notas(X1,taller,L1), suma(L1,S), Y1 is S/3.

% Determina el promedio de los parciales
promedioParciales(X2,Y2) :- notas(X2,parcial,L2), suma(L2,S), Y2 is S/2.

% Determina la nota total
notaTotal(X3,Y3) :- promedioParciales(X3,R2), promedioTalleres(X3,R3), calificacion(X3,asistencia,R4), Y3 is (R2*0.5)+(R3*0.3)+ (R4*0.2).







