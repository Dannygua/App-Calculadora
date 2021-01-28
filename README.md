# App-Calculadora

## Calculos

Existen en total 12 operaciones funcionales, las cuales utilizaran las librerías matemáticas para poder realizar las operaciones correspondientes, en este caso existen 12 funciones las cuales son
-Suma
-Resta
-Multiplicacion
-Division
-Raiz
-Potencia
-Cos
-Sen
-Tan
-CosH
-SenH
-TanH


## Operaciones2

Este método albergará el switch de cambio de todas las operaciones, ya que dependiente de la opción escogida en el List de la aplicación, se ejecutará una función u otra, mostrando en el textView el resultado de la operación resultante

## OnItemSelected

En este método se realiza la inicialización del adaptador, el cual calcula la posición del arreglo implementado en el archivo String.xml, y lo muestra al usuario mediante el elemento List, que funciona como un seleccionador de operaciones a realizarse, es el método mas importante y que posee la mayoría de las funciones de cambio de la aplicación, ya que en este método se determinara si se muestran los 2 inputs o solo uno dependiente de la operación escogida

## Archivo String

El archivo String contendrá la lista d operaciones que se llamaran con el método OnItemSelected 
