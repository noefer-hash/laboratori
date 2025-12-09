#!/bin/bash

echo "🚀 Iniciando compilación del Laboratorio 2: Secuencias"
echo "===================================================="

errores=0
for i in {1..6}; do
    problema="Problema${i}"
    
    if [ ! -f "${problema}.java" ]; then
        echo "❌ $problema.java NO EXISTE - Crea el archivo"
        errores=$((errores + 1))
        continue
    fi
    
    echo "🔨 Compilando $problema.java..."
    if javac -verbose "$problema.java" 2>&1 | grep -q "error"; then
        echo "💥 ERROR DE COMPILACIÓN en $problema.java"
        echo "   Revisa la sintaxis y lógica del código."
        errores=$((errores + 1))
    else
        echo "✅ $problema.java compilado correctamente"
        echo "   💻 Ejecutando..."
        if [ -f "input${i}.txt" ]; then
            java "$problema" < "input${i}.txt"
        else
            java "$problema"
        fi
        echo "   --- Fin ejecución ---"
    fi
    echo ""
done

if [ $errores -eq 0 ]; then
    echo "🎉 ¡TODOS LOS PROBLEMAS COMPILAN Y EJECUTAN CORRECTAMENTE!"
    echo "   Listo para hacer commit y push al repositorio."
else
    echo "⚠  Hay $errores problemas pendientes. Revisa los errores arriba."
fi





