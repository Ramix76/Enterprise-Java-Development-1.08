# CASTELLANO

## Comparación de Eficiencia

### ¿Cuándo es más eficiente `IntArrayList`?

Usa `IntArrayList` cuando esperas un crecimiento moderado a lo largo del tiempo. Aumenta su tamaño en un 50%, lo que reduce el uso innecesario de memoria. Es ideal para entornos donde la memoria es limitada o debe optimizarse.

### ¿Cuándo es más eficiente `IntVector`?

Usa `IntVector` cuando esperas muchas adiciones rápidas o frecuentes de grandes cantidades de datos. Duplica su tamaño cada vez que se llena, lo que minimiza la cantidad de copias del array (reescalado), mejorando el rendimiento cuando se agregan muchos elementos rápidamente.

# ENGLISH

## Efficiency Comparison

### When is IntArrayList More Efficient?

Use `IntArrayList` when you expect modest growth over time. It increases size by 50%, reducing unused memory overhead. It's ideal for memory-sensitive environments.

### When is IntVector More Efficient?

Use `IntVector` when you expect rapid or frequent additions of large amounts of data. It doubles in size when needed, minimizing the number of array copies (resizes), which improves performance when adding many elements quickly.
