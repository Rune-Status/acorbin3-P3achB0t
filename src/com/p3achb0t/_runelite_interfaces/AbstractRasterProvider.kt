package com.p3achb0t._runelite_interfaces

interface AbstractRasterProvider {
    fun getHeight(): Int
    fun getPixels(): Array<Int>
    fun getWidth(): Int
}