# Lab4 - Almacenamiento con Ficheros #

## Descripción del problema ##
Vamos a leer y escribir en un archivo de texto. La escritura la haremos añadiendo al final del archivo, mientras que la lectura la haremos leyendo línea a línea, de manera similar a como se indica en el siguiente enlace: [AndroidYA](http://www.tutorialesprogramacionya.com/javaya/androidya/androidstudioya/detalleconcepto.php?codigo=14&inicio=0).

 - Crea un proyecto con una única actividad que mostrará un EditText cuyo texto será recogido cada vez que se pulse un Button que habrá debajo. Dicho texto será añadido a un archivo de texto llamado mytextfile.txt. Para añadir texto a un archivo primero lo abriremos con openFileOutput(FILENAME,Context.MODE_APPEND)) y después utilizaremos el método append(...) de OutputStreamWriter.
 - ¿Cuándo abrimos el archivo? Recordemos que la actividad puede pasar a inactiva en cualquier momento y que puede no volver a recuperarse. ¿Cuándo nos conviene cerrar el archivo?
 - Debajo del campo de texto y del botón, vamos a añadir un TextEdit que ocupe el resto de la pantalla. Lo haremos pulsable con el método setClickable(true) y cada vez que se haga click sobre él, leeremos el archivo línea a línea y lo mostraremos entero.
 - El archivo debe almacenarse en la tarjeta externa del dispositivo, de manera similar a como se indica en el siguiente enlace: [AndroidYA](http://www.tutorialesprogramacionya.com/javaya/androidya/androidstudioya/detalleconcepto.php?codigo=15&inicio=0).

**Fuente:** [14_AndroidYA](http://www.tutorialesprogramacionya.com/javaya/androidya/androidstudioya/detalleconcepto.php?codigo=14&inicio=0). **Fuente:** [15_AndroidYA](http://www.tutorialesprogramacionya.com/javaya/androidya/androidstudioya/detalleconcepto.php?codigo=15&inicio=0). **Solución de problema:** [2359176_StackOverFlow](http://stackoverflow.com/questions/2359176/android-edittext-onclicklistener).

## Capturas de la aplicación ##

Pantalla de inicio de nuestra aplicación. Tenemos un campo de texto en el que escribiremos lo que queramos añadir a nuestro Fichero mediante el botón que tiene justo debajo. En azul tenemos el campo en el que pulsándolo cargará los datos existentes en el Fichero de texto.

<img src="https://dl.dropboxusercontent.com/u/52992573/PGL/Lab4/Lab4_2_AlmacenamientoFichero_001.png" width="300">

Escribimos en el campo de texto.

<img src="https://dl.dropboxusercontent.com/u/52992573/PGL/Lab4/Lab4_2_AlmacenamientoFichero_002.png" width="300">

Toast que nos indica cuando los datos son añadidos al Fichero de nuestro dispositivo.

<img src="https://dl.dropboxusercontent.com/u/52992573/PGL/Lab4/Lab4_2_AlmacenamientoFichero_003.png" width="300">

Al pulsar el campo azul, cargamos los datos procedentes del Fichero.

<img src="https://dl.dropboxusercontent.com/u/52992573/PGL/Lab4/Lab4_2_AlmacenamientoFichero_004.png" width="300">

Podemos seguir cargando datos a medida que vamos añadiéndolos al Fichero.

<img src="https://dl.dropboxusercontent.com/u/52992573/PGL/Lab4/Lab4_2_AlmacenamientoFichero_005.png" width="300">

Nuestro Fichero de texto "mytextfile.txt" en la memoria externa de nuestro dispositivo.

<img src="https://dl.dropboxusercontent.com/u/52992573/PGL/Lab4/Lab4_2_AlmacenamientoFichero_006.png" width="400">

