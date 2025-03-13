# Proyecto: Registro de Gastos Personales en Kotlin

## Descripción del Proyecto

El **Registro de Gastos Personales** es una aplicación desarrollada en Kotlin con un enfoque de programación orientada a objetos. Su objetivo principal es ayudar a los usuarios a gestionar de manera eficiente sus finanzas personales. Permite registrar, clasificar y visualizar los gastos e ingresos, generando reportes mensuales que proporcionan un análisis detallado del comportamiento económico del usuario. Esta herramienta también facilita la toma de decisiones informadas sobre el control del gasto y el ahorro.

## Objetivos del Proyecto

El proyecto tiene como objetivo el diseño y desarrollo de un software funcional que gestione de manera eficiente los datos de gastos e ingresos personales. Se ha diseñado para ser modular y seguro, y con la capacidad de escalar a medida que aumenten los volúmenes de datos. Además, está preparado para futuras ampliaciones que incluirán el almacenamiento en la nube y la integración de tecnologías de seguridad avanzadas.

## Funcionalidades Principales

- **Registro de Gastos e Ingresos**: Los usuarios pueden ingresar manualmente sus gastos e ingresos, asignándoles categorías personalizables, fechas y montos. Esta función permite llevar un control detallado de las finanzas personales.
  
- **Categorías Personalizables**: Las categorías son modificables, lo que proporciona flexibilidad para adaptar el sistema a diversas situaciones. Por ejemplo, los usuarios pueden crear nuevas categorías o modificar las existentes según sus necesidades.

- **Generación de Reportes**: Se generan reportes mensuales con resúmenes detallados de los movimientos financieros, permitiendo visualizar los gastos por categorías y facilitando la comparación de los resultados a lo largo del tiempo.

- **Simulación de Almacenamiento en la Nube**: En esta versión inicial, los datos se almacenan en memoria, pero el sistema está diseñado para integrarse con bases de datos en la nube como Firebase o MongoDB en futuras versiones, lo que asegurará una solución escalable y segura.

- **Seguridad y Autenticación**: Aunque no se implementa por completo en esta versión, el sistema está diseñado para integrar en el futuro tecnologías como **Google OAuth** o **Firebase Authentication**, lo que garantizará el acceso controlado y la protección de los datos de los usuarios.

---

## Ciclo de Vida del Dato

### 1. **Generación de Datos**
Los datos se generan cuando el usuario registra un gasto o ingreso. Cada entrada incluye detalles como el monto, la categoría y la fecha. Estos datos se validan al momento de su creación, asegurando que los montos sean positivos y que las fechas sean válidas.

### 2. **Procesamiento de Datos**
El sistema procesa los datos ingresados para generar reportes mensuales. Los cálculos de totales y la asignación de categorías permiten analizar el comportamiento financiero del usuario. Por ejemplo, el software calcula el total de los gastos e ingresos de cada mes y los clasifica por categoría, mostrando en reportes visuales el comportamiento a lo largo del tiempo.

### 3. **Almacenamiento y Acceso**
Aunque el almacenamiento actualmente se simula en memoria (listas en el código), el diseño del sistema está preparado para integrarse con servicios de almacenamiento en la nube. Esto permitirá que, en futuras versiones, los datos estén disponibles de manera segura y escalable. Además, los datos pueden ser consultados en cualquier momento para generar reportes o realizar análisis.

### 4. **Eliminación de Datos**
El sistema permite a los usuarios eliminar registros cuando ya no son necesarios. Además, se integrará una futura funcionalidad que permita la eliminación "segura" de los datos, en línea con las mejores prácticas de privacidad y control de datos.

### 5. **Estrategia de Gestión de Datos (Integridad y Consistencia)**
La estructura del software, basada en programación orientada a objetos, asegura la consistencia e integridad de los datos. Por ejemplo, la clase `GastoIngreso` contiene validaciones que garantizan que los montos sean positivos y que las fechas sean correctas. Esto evita que los usuarios ingresen datos erróneos o inconsistentes.

---

## Almacenamiento en la Nube

### 1. **Uso de la Nube**
En esta versión, el almacenamiento se simula en memoria, lo que permite realizar pruebas antes de implementar una solución real. Para futuras versiones, el sistema se integrará con soluciones de almacenamiento en la nube, como **Firebase** o **MongoDB Atlas**, que ofrecen escalabilidad y seguridad avanzada.

### 2. **Alternativas Consideradas**
Se evaluaron diversas opciones de almacenamiento, entre ellas **Firebase** y **MongoDB Atlas**. Firebase se eligió por su integración nativa con aplicaciones móviles y su facilidad para implementar medidas de seguridad como autenticación y cifrado. MongoDB Atlas, por su parte, se considera una excelente opción para manejar grandes volúmenes de datos no estructurados. Ambas opciones proporcionan soluciones de escalabilidad y alta disponibilidad, lo que las convierte en las mejores alternativas.

---

## Seguridad y Regulación

### 1. **Seguridad Implementada**
Aunque esta versión no incluye medidas de seguridad avanzadas, se han planificado futuras integraciones con **Google OAuth** y **Firebase Authentication** para garantizar el acceso controlado de los usuarios. Estos sistemas de autenticación permitirán que solo los usuarios autorizados puedan acceder a su información personal.

En cuanto al cifrado, se implementarán técnicas de **cifrado de datos** tanto en tránsito (utilizando **TLS**) como en reposo (con **AES-256**), garantizando así la protección de los datos de los usuarios.

### 2. **Regulación Aplicada**
El sistema está diseñado para cumplir con normativas de protección de datos como el **GDPR**. Las futuras implementaciones de seguridad incluirán la posibilidad de gestionar el acceso a los datos y el consentimiento del usuario, para asegurar que los datos personales sean tratados de manera adecuada.

---

## Impacto en IT y OT

### 1. **Impacto en el Negocio**
Este software tiene un fuerte impacto en el entorno de **Tecnologías de la Información (IT)**, ya que facilita la gestión financiera personal mediante el uso de tecnologías de almacenamiento en la nube y procesamiento de datos. Además, podría beneficiarse de futuras integraciones con servicios bancarios y sistemas de pago automáticos, lo que lo haría aún más útil para pequeñas empresas y autónomos.

### 2. **Beneficios Operativos**
El software mejora la eficiencia operativa al proporcionar una plataforma centralizada para el registro y análisis de los gastos personales. Esto ahorra tiempo y reduce la posibilidad de errores manuales al gestionar las finanzas. Además, los reportes automáticos eliminan la necesidad de realizar cálculos manuales, proporcionando un análisis rápido y preciso de las finanzas personales.

---

## Mejoras en IT y OT

### 1. **Integración con IT y OT**
Aunque este proyecto se enfoca principalmente en IT, hay un gran potencial para integrar **dispositivos IoT** (Internet de las Cosas) en el futuro. Por ejemplo, el software podría integrarse con medidores inteligentes de energía o sistemas de pago automáticos, permitiendo que los gastos sean registrados automáticamente, lo que mejoraría la precisión de los reportes y el análisis en tiempo real.

### 2. **Automatización de Procesos**
En el futuro, se podrían automatizar procesos como la importación de datos desde sistemas de pago o bancos mediante **APIs**. Esto reduciría aún más la carga manual en el usuario y optimizaría la gestión de las finanzas, permitiendo que el sistema registre los gastos de manera automática y más precisa.

---

## Tecnologías Habilitadoras Digitales (THD)

### 1. **Relación con THD**
Este proyecto hace uso de varias **Tecnologías Habilitadoras Digitales (THD)**, tales como **Cloud Computing**, **Big Data** y **seguridad avanzada**. La simulación de la nube y el futuro uso de servicios en la nube permitirán que los datos sean accesibles desde cualquier dispositivo, proporcionando flexibilidad y escalabilidad. Además, el análisis de grandes volúmenes de datos permitirá generar patrones y recomendaciones personalizadas para mejorar la gestión financiera de los usuarios.

### 2. **Impacto de las THD**
Las tecnologías habilitadoras como **Cloud Computing** y **Big Data** mejorarán la funcionalidad del software, permitiendo la expansión a nuevos servicios como la automatización de la importación de datos financieros y la personalización de los reportes. Además, el uso de la nube garantizará que los datos estén siempre disponibles y respaldados, lo que mejorará la fiabilidad y seguridad de la aplicación.

---

## Conclusión

Este proyecto proporciona una solución funcional para el registro y análisis de gastos personales. Aunque la versión actual simula la nube y la autenticación, su diseño modular y orientado a objetos garantiza que pueda escalarse fácilmente. En futuras versiones, la integración con bases de datos en la nube, soluciones de seguridad avanzadas y la automatización de procesos mejorarán considerablemente la experiencia del usuario y proporcionarán un control más eficiente de las finanzas personales.

