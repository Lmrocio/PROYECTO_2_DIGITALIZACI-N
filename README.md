# Proyecto 2: Un software para la transformación digital

> Descripción del Proyecto: Aplicación de Registro de Gastos Personales.
> 
> Objetivo del Proyecto: El objetivo de este proyecto es desarrollar una aplicación móvil o de escritorio que permita a los usuarios registrar,
> clasificar y visualizar sus gastos e ingresos personales de manera fácil y eficiente. La aplicación proporcionará un control de las finanzas personales,
> permitiendo a los usuarios llevar un registro detallado de sus movimientos financieros, identificar patrones de gasto y generar reportes mensuales de su situación económica.

<hr>

## Funcionalidades Principales:

- Registro de Gastos e Ingresos: Los usuarios podrán ingresar de manera manual sus gastos e ingresos, categorizándolos en diferentes tipos
  (por ejemplo, alimentos, transporte, ocio, etc.). También podrán asignar una fecha y un valor monetario a cada registro.

- Categorías Personalizables: La aplicación permitirá a los usuarios personalizar las categorías de sus gastos e ingresos, brindando flexibilidad
  para adaptarse a diferentes necesidades financieras.

- Visualización de Datos: La aplicación proporcionará una visualización clara de los gastos e ingresos en forma de gráficos o tablas, permitiendo a
  los usuarios ver su balance general y cómo se distribuyen sus gastos a lo largo del tiempo.

- Reportes Mensuales: Los usuarios podrán generar reportes mensuales que muestren un resumen de sus gastos e ingresos, así como un análisis de los
  gastos por categoría, facilitando el entendimiento de sus finanzas y ayudándoles a tomar decisiones informadas.

- Almacenamiento en la Nube: Todos los datos ingresados por el usuario (gastos, ingresos, categorías, etc.) se almacenarán de manera segura en la nube,
  lo que permitirá a los usuarios acceder a su información desde cualquier dispositivo, garantizando la sincronización y disponibilidad de los datos.

- Seguridad y Autenticación: La aplicación contará con una capa de seguridad mediante autenticación de usuarios. Los usuarios deberán registrarse e
  iniciar sesión con su cuenta (por ejemplo, utilizando su cuenta de Google o correo electrónico), para garantizar que sus datos estén protegidos.

<hr>

## Tecnologías Utilizadas:

- Frontend: El diseño y la interfaz de usuario se construirán utilizando HTML, CSS y JavaScript. Para la parte móvil, se podría utilizar React Native o
 Flutter para crear una aplicación que funcione en dispositivos Android e iOS.

- Backend: Para la gestión de datos, se utilizará un sistema de base de datos en la nube como Firebase o MongoDB Atlas, lo que permitirá un almacenamiento
seguro, en tiempo real, de los gastos e ingresos de los usuarios.

- Autenticación: La aplicación implementará autenticación básica mediante Firebase Authentication o mediante el uso de OAuth con cuentas de Google
para garantizar la seguridad de los datos personales.

<hr>


## Ciclo de Vida del Dato:

- Generación de Datos: Los usuarios generan los datos al registrar sus gastos e ingresos. Cada entrada incluirá información como la cantidad, la
categoría, la fecha y cualquier otra anotación relevante.

- Procesamiento de Datos: Los datos serán procesados para generar reportes y estadísticas. Los registros serán categorizados, y
se realizarán cálculos para determinar el total de ingresos y gastos, además de las proporciones de cada categoría.

- Almacenamiento y Acceso: Los datos se almacenarán de manera segura en la nube utilizando servicios como Firebase o MongoDB,
permitiendo su acceso desde cualquier dispositivo.

- Eliminación de Datos: Los usuarios tendrán la opción de eliminar o modificar registros antiguos a medida que sus necesidades cambien
o cuando los datos ya no sean necesarios.

- Almacenamiento en la Nube: La aplicación almacenará todos los datos de los usuarios de manera segura en la nube, permitiendo acceder a
ellos desde diferentes dispositivos. El uso de la nube también asegura la disponibilidad de los datos en todo momento y la posibilidad de realizar copias
de seguridad automáticas. Se evaluarán opciones como Firebase y MongoDB Atlas para el almacenamiento de datos, tomando en cuenta la seguridad, la escalabilidad y la facilidad de integración con la aplicación.

<hr>

## Seguridad y Regulación: 

Para asegurar la protección de los datos personales de los usuarios, la aplicación implementará las siguientes medidas de seguridad:

- Cifrado de Datos: Los datos sensibles, como los registros financieros, se cifrarán durante la transmisión y en el almacenamiento.
  
- Autenticación de Usuario: Los usuarios deberán registrarse e iniciar sesión en la aplicación mediante una autenticación segura (por ejemplo, Google OAuth) para acceder a sus datos personales.

- Acceso Controlado: El acceso a la aplicación estará restringido a usuarios autenticados para evitar el acceso no autorizado a la información financiera.

Además, se considerará la aplicación de regulaciones de protección de datos, como el Reglamento General de Protección de Datos (GDPR), si se incluye en el futuro el manejo de información sensible.

<hr>

## Impacto en IT y OT: 

Este proyecto tiene un enfoque principalmente en IT (Tecnologías de la Información), ya que se basa en la gestión y procesamiento de datos personales a través de aplicaciones y servicios en la nube. 
Sin embargo, la aplicación puede beneficiarse de la integración con dispositivos IoT, como medidores inteligentes de consumo energético o dispositivos de pago, que pueden registrar automáticamente 
los gastos de los usuarios.

<hr>

## Implicación de las Tecnologías Habilitadoras Digitales (THD): 

Este proyecto hace uso de varias tecnologías habilitadoras digitales, como:

- Cloud Computing: Para almacenar los datos de forma segura en la nube y permitir el acceso desde cualquier dispositivo.

- Big Data: Para analizar patrones de gastos e ingresos y generar reportes personalizados para los usuarios.

- Seguridad: Aplicación de técnicas de cifrado y autenticación para proteger los datos sensibles de los usuarios.

- Beneficios Operativos: La implementación de esta aplicación facilitará a los usuarios el control sobre sus finanzas personales, ayudándoles a
gestionar mejor sus gastos e ingresos, ahorrar dinero y tomar decisiones más informadas. Además, les permitirá mantener un registro organizado y
accesible desde cualquier lugar.
