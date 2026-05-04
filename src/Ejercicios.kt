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
    val paises = mapOf("CO" to "Colombia", "UK" to "United Kingdom", "USA" to "United States", "MX" to "Mexico")
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

fun reto11() {
    println("Reto 11: Organizador de Maleta")
    val objetos = listOf("Pantalones" to 3, "Zapatos" to 2, "Laptop" to 1, "Camisas" to 4, "Cepillos" to 1)
    val porPeso = mutableMapOf<Int, MutableList<String>>()

    for (obj in objetos) {
        porPeso.getOrPut(obj.second) { mutableListOf() }.add(obj.first)
    }

    println("Objetos por peso: $porPeso")
}

fun reto12() {
    println("Reto 12: Verificador de Ruta Reversible")
    val ruta = listOf(1 to 1, 2 to 2, 4 to 4, 2 to 2, 5 to 5)
    var esEspejo = true
    for (i in 0 until ruta.size / 2) {
        if (ruta[i] != ruta[ruta.size - 1 - i]) {
            esEspejo = false
            break
        }
    }

    println("¿La ruta es espejo?: $esEspejo")
}

fun reto13() {
    println("Reto 13: Reparto de Pedidos por Camion")
    val paquetes = (1..50).toList().map { "Paquete #$it" }
    val lotes = paquetes.chunked(10)

    lotes.forEachIndexed { index, lote ->
        println("Camión ${index + 1}: ${lote.size} paquetes")
    }
}

fun reto14() {
    println("Reto 14: Identificador de Ticket Unico")
    val tickets = listOf("ERR-01", "ERR-02", "ERR-01", "ERR-03", "ERR-02", "ERR-04")
    val conteo = tickets.groupingBy { it }.eachCount()
    val unico = tickets.firstOrNull { conteo[it] == 1 }

    println("Primer ticket único: $unico")
}

fun reto15() {
    println("Reto 15: Calculadora de IVA Selectiva")
    val productos = mapOf("Pan" to 20000.0, "Carne" to 60000.0, "Frijoles" to 8000.0, "Queso" to 15000.0)
    val conIVA = productos.mapValues { (_, precio) ->
        if (precio > 50000) precio * 1.19 else precio
    }

    println("Precios con IVA: $conIVA")
}

fun reto16() {
    println("Reto 16: Mantenimiento de Sensores")
    val sensores = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    sensores.removeAll { it % 3 == 0 }

    println("Sensores funcionales: $sensores")
}

fun reto17() {
    println("Reto 17: Mapa de Almacen")
    val almacen = arrayOf(
        arrayOf(1, 3, 2, 4),
        arrayOf(14, 6, 5, 1),
        arrayOf(7, 8, 2, 9),
        arrayOf(2, 10, 4, 5)
    )
    var principal = 0
    var secundaria = 0
    val n = almacen.size
    for (i in 0 until n) {
        principal += almacen[i][i]
        secundaria += almacen[i][n - 1 - i]
    }

    println("Suma Principal: $principal, Suma Secundaria: $secundaria")
}

fun reto18() {
    println("Reto 18: Fusion de Recetas")
    val chef1 = mapOf("Mantequilla" to 150.0, "Levadura" to 20.0, "Leche" to 300.0)
    val chef2 = mapOf("Mantequilla" to 50.0, "Huevo" to 4.0, "Leche" to 100.0)

    val compras = (chef1.keys + chef2.keys).associateWith {
        (chef1[it] ?: 0.0) + (chef2[it] ?: 0.0)
    }

    println("Lista de compras: $compras")
}

fun reto19() {
    println("Reto 19: Ranking de Apps por Calificacion")
    val apps = mutableListOf("Technoo" to 4.7, "GameMaster" to 3.5, "QuickGames" to 4.1, "CloudRun" to 4.8)
    for (i in 0 until apps.size - 1) {
        for (j in 0 until apps.size - 1 - i) {
            if (apps[j].second < apps[j + 1].second) {
                val temp = apps[j]
                apps[j] = apps[j + 1]
                apps[j + 1] = temp
            }
        }
    }

    println("Top Apps: $apps")
}

fun reto20() {
    println("Reto 20: Union Agendas")
    val agenda1 = listOf("Simon", "John", "Samuel")
    val agenda2 = listOf("Juan", "Matias", "Wilson")

    val fusion = mutableListOf<String>()
    var i = 0
    var j = 0

    while (i < agenda1.size && j < agenda2.size) {
        if (agenda1[i] < agenda2[j]) {
            fusion.add(agenda1[i++])
        } else {
            fusion.add(agenda2[j++])
        }
    }
    while (i < agenda1.size) fusion.add(agenda1[i++])
    while (j < agenda2.size) fusion.add(agenda2[j++])

    println("Agenda Fusionada: $fusion")
}

fun reto21() {
    println("Reto 21: Pisos Primos")
    val n = 80
    val esPrimo = BooleanArray(n + 1) { true }
    esPrimo[0] = false
    esPrimo[1] = false
    for (p in 2..Math.sqrt(n.toDouble()).toInt()) {
        if (esPrimo[p]) {
            for (i in p * p..n step p) esPrimo[i] = false
        }
    }
    val pisosPrimos = (1..n).filter { esPrimo[it] }

    println("Pisos con mantenimiento: $pisosPrimos")
}

fun reto22() {
    println("Reto 22: Pila de Platos")
    val pila = mutableListOf<String>()
    fun push(plato: String) = pila.add(plato)
    fun pop(): String? = if (pila.isNotEmpty()) pila.removeAt(pila.size - 1) else null

    push("Plato Hondo")
    push("Plato Postre")
    push("Bandeja")
    println("Lavando: ${pop()}")
    println("Pila restante: $pila")
}

fun reto23() {
    println("Reto 23: Seguimiento Dieta")
    val calorias = listOf(1987.0, 2007.0, 2300.0, 2950.0, 1050.0)
    val diferencias = mutableListOf<Double>()
    var sumaAnterior = 0.0

    for (i in calorias.indices) {
        if (i == 0) {
            diferencias.add(0.0)
        } else {
            val promedioAnterior = sumaAnterior / i
            diferencias.add(calorias[i] - promedioAnterior)
        }
        sumaAnterior += calorias[i]
    }

    println("Diferencias vs Promedio Anterior: $diferencias")
}

fun reto24() {
    println("Reto 24: Contenedores Balanceados")
    val manifiesto = "((()())((())()))"
    var balance = 0
    var esValido = true
    for (char in manifiesto) {
        if (char == '(') balance++
        else if (char == ')') balance--
        if (balance < 0) {
            esValido = false
            break
        }
    }
    if (balance != 0) esValido = false

    println("Manifiesto: $manifiesto - ¿Válido?: $esValido")
}

fun reto25() {
    println("Reto 25: Rendimiento Maraton")
    val tiempos = mutableListOf(120.0, 130.0, 140.0, 110.0, 150.0)
    tiempos.sort()
    tiempos.removeAt(0)
    tiempos.removeAt(tiempos.size - 1)
    val promedioReal = tiempos.average()

    println("Promedio sin outliers: $promedioReal")
}

fun reto26() {
    println("Reto 26: Compresión Logs")
    val logs = listOf("ACTIVE", "ACTIVE", "ACTIVE", "INACTIVE", "ACTIVE", "INACTIVE", "INACTIVE")
    val comprimido = mutableListOf<Pair<String, Int>>()
    if (logs.isNotEmpty()) {
        var actual = logs[0]
        var cuenta = 0
        for (log in logs) {
            if (log == actual) {
                cuenta++
            } else {
                comprimido.add(actual to cuenta)
                actual = log
                cuenta = 1
            }
        }
        comprimido.add(actual to cuenta)
    }
    println("Resumen: $comprimido")
}

fun reto27() {
    val ventas = mapOf("Roberto" to 11000.0, "Elena" to 16000.0, "Marcos" to 7530.0, "Lucía" to 18000.0)
    val promedio = ventas.values.average()
    val premiados = ventas.filter { it.value > promedio }.keys

    println("Reto 27: Premios Vendedores")
    println("Promedio: $promedio, Premiados: $premiados")
}

fun reto28() {
    println("Reto 28: Parking")
    val tarifas = (1..10).associateWith { it * 2500.0 }
    val horas = 8
    val costo = tarifas[horas] ?: (horas * 2500.0)

    println("Costo por $horas horas: $costo")
}

fun reto29() {
    println("Reto 29: Parejas de Carga")
    val maletas = listOf(12, 18, 22, 8, 28)
    val target = 40
    var pareja: Pair<Int, Int>? = null
    val vistos = mutableSetOf<Int>()

    for (peso in maletas) {
        val complemento = target - peso
        if (vistos.contains(complemento)) {
            pareja = complemento to peso
            break
        }
        vistos.add(peso)
    }

    println("Para target $target, pareja encontrada: $pareja")
}

fun reto30() {
    println("Reto 30: Layout Transpuesto")
    val layout = arrayOf(
        arrayOf("N1", "N2"),
        arrayOf("S1", "S2"),
        arrayOf("E1", "E2")
    )
    val filas = layout.size
    val cols = layout[0].size
    val transpuesto = Array(cols) { Array(filas) { "" } }

    for (i in 0 until filas) {
        for (j in 0 until cols) {
            transpuesto[j][i] = layout[i][j]
        }
    }

    for (fila in transpuesto) {
        println(fila.joinToString(" | "))
    }
}