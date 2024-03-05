# Listador de Directorios y Archivos

Este programa en Java permite listar los archivos y directorios contenidos en un directorio específico. Además, tiene la capacidad de listar de forma recursiva los subdirectorios y sus contenidos.

## Características

- Listado de archivos y directorios en un directorio
- Listado recursivo de subdirectorios y sus contenidos
- Manejo de nombres de archivos/directorios con espacios
- Compatibilidad multiplataforma
- Validación de entrada
- Manejo de directorios vacíos
- Manejo de excepciones
- Salida formateada para mejor legibilidad

## Uso

El programa se ejecuta desde la línea de comandos y requiere proporcionar la ruta del directorio como argumento. Opcionalmente, se puede agregar el argumento `-r` para realizar un listado recursivo.

java -jar listador.jar <ruta_del_directorio> [-r]

- `<ruta_del_directorio>`: Ruta del directorio a listar.
- `-r`: Argumento opcional para listar recursivamente los subdirectorios.

## Implementación

El programa está implementado en Java y utiliza la clase `File` para interactuar con el sistema de archivos. La lógica principal está contenida en dos métodos:

1. `main`: Valida la entrada, verifica si la ruta proporcionada apunta a un directorio existente y llama al método `informacion` para listar los contenidos.

2. `informacion`: Realiza el listado recursivo de archivos y directorios. Si se proporciona el argumento `-r`, se llamará recursivamente para listar los subdirectorios.

Se han implementado varias mejoras, como el manejo de directorios vacíos, la compatibilidad con nombres de archivos/directorios que contienen espacios, la salida formateada para mejor legibilidad y el manejo de excepciones.

## Contribuciones

Si deseas contribuir a este proyecto, puedes enviar un pull request con tus mejoras o correcciones. Asegúrate de seguir las mejores prácticas de programación y de proporcionar una descripción detallada de tus cambios.

## Licencia

Este proyecto está licenciado bajo la Apache2
