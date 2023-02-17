# ProyectoBanco
Crear un programa que nos permita la gestión de las cuentas de clientes

Se ofertará un menú de altas, bajas, consultas y modificaciones
similar a

  ======= BANCO UNIVERSAL ========
  1. Alta de cuentas
  2. Consulta de una cuenta
  3. Modificar cuentas
  4. Anular cuentas
  5. Listado de cuentas
  0. Salir
  Selecciona una opción:
  
  
Una cuenta de cliente podría definirse a partir de la clase Ccuenta

✔️Atributos private:
  nombre String
  cuenta String
  saldo Double
  tipoDeInteres Double

Métodos public:
✔️Constructor con y sin parámetros
✔️Setters y getters para todos los atributos
  ✔️Se debe impedir tipoDeInteres menor que cero
  Se debe impedir que la cuenta y el nombre estén vacios
  ✔️Se debe impedir que el ingreso sea una cantidad negativa
    
✔️void reintegro (double cantidad) //restará cantidad al saldo
  ✔️Se debe impedir que el reintegro sea superior al saldo

En una primera versión para almacenar en memoria los clientes construiremos un array de Ccuenta
(En una segunda versión para almacenar en memoria los clientes construiremos una lista de Ccuenta)

Podría definirse la clase Cuentas similar a

  Atributos private:
 ✔️un array de Ccuenta
 ✔️total int

  Métodos public:

✔️Ccuenta buscarCuenta(void)
  'Pregunta cuenta, la localiza y la devuelve.
  'Puede ofrecer la opción de buscar por nombre o por número usando los métodos poscuentanombre y poscuenta
 
✔️Ccuenta poscuentanombre(String nombre )
  'Busca una cuenta por nombre de cliente.
  'Null si no la encuentra
 
✔️Ccuenta poscuenta(String numcta )
  'Devuelve una cuenta buscándola por número.
  'Null si no la encuentra

✔️int NuevaCuenta(void)
   'Añade una nueva cuenta a la lista.
   'Comprueba que el número de cuenta no esté duplicado
   'Devuelve la posición de la cuenta

✔️void ModificarCuenta(void)
   'Pregunta cuenta y la modifica

✔️void AnularCuenta(void)
   'Pregunta cuenta y la borra de la lista.
   'Comprueba que el saldo es igual a cero
 
✔️void ConsultarCuenta(void )
   'Pregunta cuenta y la muestra

✔️vercuenta( Ccuenta cta )
   'Muestra la cuenta pasada como parámetro

✔️Void VisualizarCuentas(void)
  'Muestra la lista de cuentas
 
 Se debe mantener la revisión y el control de los datos introducidos por el usuario evitando el mal funcionamiento o finalización del programa por errores de ejecución
 De momento, los datos introducidos por el usuario se perderán al finalizar la aplicación. En una versión posterior guardaremos estos datos en fichero
