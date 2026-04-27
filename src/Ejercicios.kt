fun reto1() {
    println("Reto 1: Control de Gastos Diarios")
    val gastos = arrayOf(45.0, 12.5, 30.0, 50.0, 10.0, 5.0, 100.0, 25.0, 15.0, 40.0, 60.0, 5.0, 80.0, 20.0, 35.0)
    var total = 0.0
    var max = gastos[0]
    var min = gastos[0]

    for (gasto in gastos) {
        total += gasto
        if (gasto > max) max = gasto
        if (gasto < min) min = gasto
    }
    val promedio = total / gastos.size

    println("Total: $total, Promedio: $promedio, Máximo: $max, Mínimo: $min")
}

fun reto2() {
    println("Reto 2: Filtro de Empleados Senior")
    val empleados = listOf("Simon" to 20, "Juan" to 35, "Sofia" to 42, "Wilson" to 54, "Samuel" to 31)
    val seniorNames = empleados
        .filter { it.second > 30 }
        .map { it.first.uppercase() }

    println("Empleados Senior: $seniorNames")
}

fun reto3() {
    println("Reto 3: Limpieza de Contactos Duplicados")
    val contactos = listOf("300123", "311456", "300123", "320789", "311456", "350111", "300123")
    val unicos = contactos.toSet().sorted()

    println("Contactos únicos ordenados: $unicos")
}

fun reto4() {
    println("Reto 4: Analisis de Carrito de Compras")
    val carrito = listOf("Cereal", "Cafe", "Cereal", "Huevos", "Pan", "Leche", "Cafe")
    val conteo = mutableMapOf<String, Int>()
    for (producto in carrito) {
        conteo[producto] = conteo.getOrDefault(producto, 0) + 1
    }

    println("Conteo de productos: $conteo")
}

fun reto5() {
    println("Reto 5: Historial de Navegacion Reversible")
    val historial = arrayOf("sena.co", "youtube.com", "tiktok.com", "canva.com", "smartclass.com")
    val invertido = arrayOfNulls<String>(historial.size)
    for (i in historial.indices) {
        invertido[i] = historial[historial.size - 1 - i]
    }
    println("Original: ${historial.joinToString()}")
    println("Invertido: ${invertido.joinToString()}")
}