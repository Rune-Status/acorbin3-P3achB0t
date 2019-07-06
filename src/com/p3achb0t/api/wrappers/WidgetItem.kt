package com.p3achb0t.api.wrappers

import com.p3achb0t.hook_interfaces.Widget
import java.awt.Point
import java.awt.Rectangle
import kotlin.random.Random
import kotlin.random.nextInt

class WidgetItem(
    var widget: Widget? = null,
    var area: Rectangle = widget?.let { Widget.getDrawableRect(it) } ?: Rectangle(),
    var id: Int = widget?.getItemId() ?: 0,
    var stackSize: Int = widget?.getItemStackSize() ?: 0,
    var index: Int = 0,
    var type: Type = Type.SHOP
) {
    enum class Type {
        SHOP, INVENTORY, BANK, EQUIPMENT, NULL
    }

    //    var itemComposite: ItemComposite get() = Main.clientData.getItem
    fun getBasePoint(): Point {
        return Point(area.x, area.y)
    }

    fun getClickPoint(): Point {
        val x = area.centerX + Random.nextInt(-(area.width / 4)..(area.width / 4))
        val y = area.centerY + Random.nextInt(-(area.height / 4)..(area.height / 4))
        return Point(x.toInt(), y.toInt())
    }

    suspend fun interact(action: String) {
        println("Interacting with: $id")
        Interact.interact(getClickPoint(), action)
    }
}