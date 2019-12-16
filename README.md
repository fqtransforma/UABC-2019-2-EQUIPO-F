# Little Cleaner 

Videojuego con temática educativa acerca de clasificar residuos.
El objetivo del juego es recoger los residuos que el personaje se encuentra en el suelo, el residuo se recoge automaticamente y en la barra de estado color negro de la parte inferior izquierda aparecera el nombre de la categoria del residuo que es. Posteriormente se debe llevar al contenedor con el color correspondiente al tipo de residuo. 

Azul: Plastico y papel
Verde: Vidrio
Naranja: Plastico
Negro: Aluminio
Café: Organico

Al iniciar el juego estaran tres opciones con lo siguiente: 

Start: Empezar el juego. 
Scores: Ver tabla de los 10 jugadores que han obtenido la mayor puntuación.
Exit: Para cerrar el juego 

Ademas se puede encontrar una pequeña ayuda si se preciona la tecla 'esc' donde se mencionará que es lo que se coloca en los distintos 
contenedires de basura en caso de que se olvide. 

En total hay 4 mundos dividios en 4 submundos cada uno. Al iniciar un mundo el jugador debe recoger la basura de cada submundo para pasar al siguiente, asi sucesivamente. Un mundo contiene 4 submundos, si el jugador los supera pasara al siguiente mundo con otros 4 submundos hasta llegar al final. 

Una vez que el jugador es vencido se registra la puntuacion y si su puntuacion es mas alta que los primeros 10 jugadores, se registra. 
Cabe destacar que cada objeto tiene un reloj interno que hace que el valor de su puntuación baje conforme pasa el tiempo. 

El jugador puede darse un pequeño impulso por un corto tiempo

El código del juego esta dividio en 3 capas de la siguiente manera 

src/ 
data/ (Aqui es donde se encuentran todas las imagenes, sonidos y texturas del juego, no hay ninguna clase en este paquete)
logic/ (Aqui es donde se encuentra la logica del juego)
  /entity (Son todas las clases que llevan la logica de los objetos en pantalla)
    entity.java (Esta clase es utilizada para guardar informacion de la posicion de los objetos en pantalla)
    DynamicEntity.java (esta clase controla la informacion de los objetos que se mueven en pantalla ademas es la clase padre de ellos)
    Player.java (es la clase que controla al jugador y tiene su informacion)
    StaticEntity.java (esta clase controla la informacion de los objetos estaticos en pantalla que se pueden recoger)
    
  /graphicsTools (contiene las clases de manipulacion de imagenes y es donde se cargan las imagenes)
    Animation.java (clase para crear animaciones)
    Assets.java (clase donde se encuentran TODOS los recuros graficos)
    ImageLoader.java (clase para cargar imagenes)
    SpriteSheet.java (clase para cargar hojas de sprites
    
  /inputDevices (contiene las clases de como controlar el teclado)
    KeyManager.java (clase que controla el teclado)
   
  /launcher (contiene las clases del juego, asi como su renderizador, controlador de estados y clase control del juego)
    Game.java (contiene el nucleo del juego, es la clase para actualizar variables del juego y renderizar)
    Handler.java (Clase para que otros objetos puedan controlar el flujo del juego)
    Launcher.java (clase que contene el metodo main para arrancar el juego)
  
  /residues (contiene las clases de los residuos que se pintan en pantalla)
  /tiles (contiene las clases que se usan para pintar el mapa)
  /utils (contiene la clase para cargar el mapa)
  
ui/
  /display (contiene las clases para crear la pantalla con nombre y cierta resolucion de pantalla)
    Display.java (clase para crear la pantalla principal)
    
  /menus (contiene las clases para navegar en el menu principal)
  
  /states (contiene las clases de los distintos estados del juego)
    GameOverState.java (clase para mostrar el fin del juego)
    GameState.java (clase para mostrar el juego actual)
    HelpState.java (clase para mostrar ayuda en el juego)
    LeaderBoardsState.java (clase para mostrar los mejores 10 jugadores)
    MenuState.java (clase para mostrar el menú principal)
    State.java (clase para colocar el estado actual del juego)
    
  /worlds (contiene las clases para llevar la logica de los mundos, asi como su cambio y donde se pueden colocar mas mundos)
  
  
TODAS LAS IMAGENES Y AUDIOS FUERON OBTENIDOS DE opengameart.org que es un sitio web de recursos de licencia de código abierto

Autores de este juego: 
Omar A. 
Nereo L. 


    
