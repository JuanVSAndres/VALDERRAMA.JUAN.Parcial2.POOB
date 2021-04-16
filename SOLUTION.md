


I. (20%) CONCEPTOS

1. ¿Cuáles son las acciones los tres momentos importantes de las excepciones? ¿Cuál es el objetivo de cada una? ¿Cómo se implementa en Java cada acción?.

Throw, Avisa al usuario que se esta cometiendo un error que no esta teniendo en cuenta,public void Algo() throws Exception
Propagar, controlar la excepcion,public void Algo() throws Exception
Atrapar, con el fin de dejar de arrojar la excepcion, try { Algo() } catch(Exception e) {}

¿Qué es sobre-escritura de métodos? ¿Por qué aplicarla? ¿Cómo impedir que se sobre-escriba un método?.

Una sobre-escritura de metodos es cuando otra clase reescribe un metodo existente con el fin de cambiar su comportamiento. Para impedirlo debes poner el metodo final. se utiliza por medio de @Overwrite y abajo el metodo.

I. (25%) DISEÑANDO

![(img/diagrama1.svg)]
