### Criterio 6a) Objetivos estratégicos:
- **¿Qué objetivos estratégicos específicos de la empresa aborda tu software?**

El software desarrollado aborda como objetivo estratégico principal la digitalización de la gestión financiera personal, permitiendo el control de ingresos y gastos de forma automatizada. Esto se traduce en una mejor toma de decisiones financieras, optimización de recursos y reducción del trabajo manual, lo cual está alineado con una estrategia empresarial centrada en la eficiencia y modernización operativa.

- **¿Cómo se alinea el software con la estrategia general de digitalización?**

Este software se alinea completamente con la estrategia de digitalización, ya que automatiza procesos anteriormente manuales como el registro de gastos, la categorización y la generación de informes. Facilita la migración a un entorno digital accesible, eficiente y escalable, sentando bases sólidas para futuras integraciones o mejoras, como almacenamiento en la nube o conexión con sistemas bancarios.

---

### Criterio 6b) Áreas de negocio y comunicaciones:
- **¿Qué áreas de la empresa (producción, negocio, comunicaciones) se ven más beneficiadas con tu software?**

Las áreas más beneficiadas son la de negocio y gestión administrativa. El software ofrece una visión clara y estructurada del flujo económico, facilitando la planificación financiera, la previsión de gastos y el control presupuestario, lo que impacta positivamente en la toma de decisiones de negocio.

- **¿Qué impacto operativo esperas en las operaciones diarias?**

Se espera una reducción significativa de errores humanos en el registro de datos, un ahorro de tiempo en la elaboración de reportes financieros y una mayor capacidad de respuesta ante desviaciones presupuestarias. Además, al ser fácil de usar, mejora la autonomía del usuario en su gestión económica diaria.

---

### Criterio 6c) Áreas susceptibles de digitalización:
- **¿Qué áreas de la empresa son más susceptibles de ser digitalizadas con tu software?**

Principalmente la gestión económica y la contabilidad interna. Estas áreas suelen estar afectadas por procesos manuales, dispersos o poco sistematizados, y son altamente susceptibles de mejora mediante digitalización.

- **¿Cómo mejorará la digitalización las operaciones en esas áreas?**

La digitalización permitirá centralizar los datos financieros, mejorar su trazabilidad, y facilitar la generación de informes automáticos. Esto no solo incrementa la productividad, sino que también reduce los errores y mejora la transparencia de la información económica.

---

### Criterio 6d) Encaje de áreas digitalizadas (AD):
- **¿Cómo interactúan las áreas digitalizadas con las no digitalizadas?**

Las áreas digitalizadas, como la de gestión económica, pueden interactuar con otras no digitalizadas (como aquellas que aún usan papel u hojas de cálculo) mediante exportaciones simples o reportes impresos. Sin embargo, esta interacción puede ser limitada en cuanto a eficiencia.

- **¿Qué soluciones o mejoras propondrías para integrar estas áreas?**

Propondría implementar una fase de transición que permita integrar los datos de las áreas no digitalizadas a través de formularios digitales, escaneos OCR o incluso hojas de carga CSV. A largo plazo, sería ideal migrar completamente todas las áreas a un entorno digital común.

---

### Criterio 6e) Necesidades presentes y futuras:
- **¿Qué necesidades actuales de la empresa resuelve tu software?**

Resuelve la necesidad de registrar y categorizar gastos e ingresos, generar informes claros, y disponer de un histórico financiero accesible. Además, aporta organización y control en una tarea cotidiana fundamental: la gestión del dinero.

---

### Criterio 6f) Relación con tecnologías:
- **¿Qué tecnologías habilitadoras has empleado y cómo impactan en las áreas de la empresa?**

Se ha empleado Kotlin como lenguaje principal por su eficiencia, claridad y orientación a objetos. Además, se ha usado Dokka para generar documentación técnica automatizada, lo que impacta positivamente en la mantenibilidad del software y facilita su expansión futura.

- **¿Qué beneficios específicos aporta la implantación de estas tecnologías?**

Mayor productividad en el desarrollo, claridad del código, reducción de errores, facilidad para escalar el sistema, y mejor comprensión del proyecto por parte de terceros gracias a la documentación generada automáticamente.

---

### Criterio 6g) Brechas de seguridad:
- **¿Qué posibles brechas de seguridad podrían surgir al implementar tu software?**

Podrían surgir brechas relacionadas con la entrada de datos no validada (inyección de datos), accesos no controlados a los registros financieros o pérdida de información si no se gestiona correctamente la persistencia.

- **¿Qué medidas concretas propondrías para mitigarlas?**

Implementar validaciones estrictas en los formularios, cifrado de datos sensibles, autenticación de usuarios y, en caso de almacenar en la nube, sistemas de backup y recuperación periódica. También sería útil implementar logs de acceso y cambios.

---

### Criterio 6h) Tratamiento de datos y análisis:
- **¿Cómo se gestionan los datos en tu software y qué metodologías utilizas?**

Los datos se gestionan mediante estructuras de datos en memoria (listas), con control de entrada mediante validaciones. Se sigue una metodología orientada a objetos, donde cada entidad (como `GastoIngreso`) representa un elemento real del sistema.

- **¿Qué haces para garantizar la calidad y consistencia de los datos?**

Se aplica validación en tiempo de ejecución (por ejemplo, que el monto sea positivo), uso de tipos seguros (como enums para categorías), y control de excepciones para evitar la corrupción de datos. Además, el sistema está preparado para añadir persistencia en el futuro sin comprometer la integridad de los datos.

