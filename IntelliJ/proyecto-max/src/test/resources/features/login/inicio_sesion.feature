# author: Max Diaz
# date: 22/08/2023
# language: es

Característica: Inicio de Sesión
  Yo como Analista de Negocio necesito iniciar sesión en el sitio web
  con mis credenciales de acceso.

  @InicioSesionExitoso
  Escenario: Iniciar sesión exitosamente
    Dado que el usuario ingresa a la sección de inicio de sesión
    Cuando ingresa las credenciales correctas
    Entonces debería acceder a la sección de "Pagina Principal"