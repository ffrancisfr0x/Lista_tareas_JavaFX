# Lista de tareas con JavaFX

Es una aplicación de escritorio sencilla para apuntar tareas donde escribes una, le das a Añadir y aparece en la lista.

Está hecha con Java, JavaFX y Maven, y la interfaz la he diseñado con Scene Builder.

## Cómo ejecutarla

Abrir el proyecto en IntelliJ y ejecutar la clase `HelloApplication`.

## Archivos principales

- `HelloApplication.java`: arranca la aplicación y carga la ventana.
- `hello-view.fxml`: el diseño de la ventana.
- `HelloController.java`: lo que pasa al añadir una tarea.

## Historias de usuario

- **HU-01:** la ventana tiene un título y un subtítulo para que se sepa qué aplicación es.
- **HU-02:** hay un campo de texto y un botón para añadir tareas.
- **HU-03:** las tareas se van mostrando en una lista. Si no hay ninguna, sale "Todavía no hay tareas".
- **HU-04:** al añadir una tarea, el campo se vacía y el foco vuelve a él, así que puedes escribir la siguiente directamente. También se puede añadir pulsando Enter.
- **HU-05:** si intentas añadir una tarea vacía o con solo espacios, no se añade y sale un aviso en rojo.
