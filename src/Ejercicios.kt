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

fun reto6(){
    println("Reto 6: Compatibilidad de Intereses")
    val interesesP1 = setOf("Cine", "Musica", "Viajes", "Lecturas")
    val interesesP2 = setOf("Musica", "Downhill", "Viajes", "Motos")
    val comunes = interesesP1.intersect(interesesP2)
    val exclusivosP1 = interesesP1.subtract(interesesP2)

    println("Intereses en comun: $comunes")
    println("Intereses exclusivos: $exclusivosP1")
}

fun reto7() {
    println("Reto 7: Inventario de Despensa")

    val despensa = mutableMapOf("Cereal" to 5, "Frijol" to 2, "Queso" to 1, "Leche" to 3, "Arroz" to 7)
    fun consumir(producto: String, cantidad: Int) {
        val actual = despensa[producto] ?: 0
        if (actual > 0) {
            val nuevo = actual - cantidad
            if (nuevo <= 0) {
                despensa.remove(producto)
                println("El producto $producto esta agotado")
            } else {
                despensa[producto] = nuevo
            }
        }
    }
    println("Despensa inicial: $despensa")
    consumir("Leche", 2)
    consumir("Arroz", 5)
    println("Despensa final: $despensa")
}

fun reto8() {
    println("Reto 8: Calculo de promedio academico")
    val notas = listOf(4.5 to 0.6, 3.5 to 0.1, 4.5 to 0.1, 4.5 to 0.1)
    var notaFinal = 0.0
    for (par in notas) {
        notaFinal += par.first * par.second
    }
    println("Nota final: $notaFinal")
}

fun reto9() {
    println("Reto 9: Traductor de codigos de pais")
    val paises = mapOf("CO" to "Colombia", "UK" to "United Kindom", "USA" to "United States", "MX" to "Mexico")
    for((codigo, nombre) in paises) {
        println("El codigo $codigo pertenece a $nombre")
    }
}

fun reto10() {
    println("Reto 10: Rotacion de turnos")
    val empleados = listOf("Empleado1", "Empleado2", "Empleado3", "Empleado4", "Empleado5", "Empleado6", "Empleado7")
    val k = 2
    val rotada = mutableSetOf<String>()
    for (i in empleados.indices) {
        rotada.add(empleados[(i + k) % empleados.size])
    }
    println("Lista de empleados original: $empleados")
    println("Lista de empleados rotada: $rotada")
}