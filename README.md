# Demo Nisum Registro Usuarios

### Features
- Aplicación demo Nisum java 8 + spring boot;
- Servicios rest;
- Los servicios requieren autenticación Bearer Token;

### Instalación
- Ejecutar Application.java ubicado en com.nisum.springboot;
- La base de datos H2 se generará automáticamente;
- El usuario inicial se encuentra configurado en data.sql el cual puede ser modificable; para la demostración tenemos:
Usuario: "Luis Monge"
Password: "Universitario.1924"

### Pruebas
##### Autenticación
- Para obtener un token ingresar a http://localhost:8080/authenticate
- Probar con el usuario/clave inicial. Request:
{
"username":"Luis Monge",
"password":"Universitario.1924"
}
- De ser correcto la aplicación devolverá un "token"

##### Registro
- Para obtener un token ingresar a http://localhost:8080/create
- Utilizar token en el header.
- Se contemplan todas las validaciones requeridas
- Registra usuarios con el request:
{
"name": "aa sdas dasd asd",
"email": "juan@dominio.cl",
"password": "123456789",
"phones": [
{
"number": "1234567",
"citycode": "1",
"contrycode": "57"
}
]
}
- De ser correcto la aplicación devolverá un "token"

##### Listado
- Para obtener un token ingresar a http://localhost:8080/users
- Utilizar token en el header.
- Se muestra la lista de usuarios creados hasta el momento

### Documentación
- Diagrama solución: solucion.pptx;
- Integrado con Swagger;
- http://localhost:8080/swagger-ui.html;

### H2
- Consola habilitada;
- http://localhost:8080/h2-console/