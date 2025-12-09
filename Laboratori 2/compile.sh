#!/bin/bash
# Renombra archivos según la primera clase pública que contengan

for f in *.java; do
    # Extrae el nombre de la clase pública
    class_name=$(grep -m 1 '^public class ' "$f" | awk '{print $3}')
    # Quita el ";" final si lo hubiera
    class_name=${class_name//;/}

    if [ -n "$class_name" ]; then
        mv "$f" "$class_name.java"
    fi
done

# Compilar todos los .java en bin/
mkdir -p bin
echo "Compilando..."
javac *.java -d bin

if [ $? -eq 0 ]; then
    echo "Compilación completada."
else
    echo "Error durante la compilación."
fi







