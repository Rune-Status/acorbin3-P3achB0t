package com.p3achb0t.analyser.runestar

data class ClassHook(
    val `class`: String,
    val name: String,
    var `super`: String,
    var access: Int,
    val interfaces: List<String>,
    val fields: List<FieldHook>,
    val methods: List<MethodHook>,
    val constructors: List<ConstructorHook>
) {

    val constructorName get() = "_${`class`}_"

    val descriptor get() = "L$name;"
}

data class FieldHook(
    var field: String,
    val owner: String,
    val name: String,
    var access: Int,
    var descriptor: String,
    val decoder: Long?
) {
    val getterMethod get() = "get${field.capitalize()}"

    val setterMethod get() = "set${field.capitalize()}"

    val decoderNarrowed: Number?
        get() = when (decoder) {
            null -> null
            else -> {
                when (descriptor) {
                    "I" -> decoder.toInt()
                    "J" -> decoder
                    else -> error(this)
                }
            }
        }

    val encoderNarrowed: Number? get() = decoderNarrowed?.let { invert(it) }
}

data class MethodHook(
    val method: String,
    val owner: String,
    val name: String,
    val access: Int,
    val parameters: List<String>?,
    val descriptor: String,
    val finalArgument: Int?
)

data class ConstructorHook(
    val access: Int,
    val descriptor: String
)