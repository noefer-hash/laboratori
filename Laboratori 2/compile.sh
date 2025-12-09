#!/bin/bash
# Renombrar archivos según la primera clase pública que contengan

for f in *.java; do
    class_name=$(grep -m 1 '^public class ' "$f" | awk '{print $3}')
    if [ -n "$class_name" ]; then
        mv "$f" "$class_name.java"
    fi
done

# Compilar todos los .java en bin/
mkdir -p bin
javac *.java -d bin






