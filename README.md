# Caso: Participantes en una maratón

## Descripcion general

Una organizacion deportiva realizará una maratón y necesita gestionar a sus participantes. Cada participante cuenta con un record personal, que representa el mejor tiempo que ha logrado en competencias anteriores. Antes de ingresar a la carrera principal, todos los inscritos deben rendir una prueba de clasificación.

En la prueba de clasificación, cada participante obtiene un tiempo. La organizacion define previamente un tiempo límite, y solo los participantes que logren un tiempo menor a ese limite podran avanzar a la prueba final.

## Desarrollo del caso

Una vez concluida la etapa de clasificación, se forma la lista de participantes habilitados para competir en la prueba final. Los participantes que no cumplan con el tiempo requerido quedan fuera de la competencia principal.

En la prueba final, los participantes clasificados compiten y registran un nuevo tiempo. Al terminar la competencia, se obtiene el resultado final ordenando a los participantes según el tiempo alcanzado en esta última prueba, desde el menor tiempo hasta el mayor.

## Reglas del negocio

1. Cada participante debe tener registrado su record personal antes de iniciar el proceso.
2. Todo participante debe rendir una prueba de clasificacion.
3. Solo clasifica a la prueba final quien obtenga un tiempo menor al limite establecido.
4. La lista final de resultados debe organizarse de acuerdo con los tiempos obtenidos en la prueba final.
5. Si un participante obtiene en la prueba final un tiempo mejor que su record personal, ese nuevo tiempo reemplaza al record anterior.

## Resultado esperado

El sistema debe permitir identificar que participantes clasificaron a la prueba final, mostrar el orden final de la competencia según los tiempos registrados y actualizar la marca personal de quienes hayan superado su record previo durante la carrera final.