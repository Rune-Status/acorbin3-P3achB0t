package com.p3achb0t._runestar_interfaces

interface WorldMap {
    fun getCacheLoader(): WorldMapArchiveLoader
    fun getCurrentMapArea0(): WorldMapArea
    fun getElementsDisabled(): Boolean
    fun getEnabledCategories(): Any
    fun getEnabledElements(): Any
    fun getFlashingElements(): Any
    fun getFont(): Font
    fun getFonts(): Any
    fun getIconIterator(): Any
    fun getMainMapArea(): WorldMapArea
    fun getMapAreas(): Any
    fun getMapSceneSprites(): Array<IndexedSprite>
    fun getMouseCoord(): Coord
    fun getPerpetualFlash0(): Boolean
    fun getSprite(): Sprite
    fun getWorldMapManager(): WorldMapManager
    fun getZoom(): Float
    fun getZoomTarget(): Float
    fun get__b(): WorldMapArea
    fun get__az(): Boolean
    fun get__aa(): Int
    fun get__ab(): Int
    fun get__af(): Int
    fun get__ai(): Int
    fun get__am(): Int
    fun get__an(): Int
    fun get__ao(): Int
    fun get__ap(): Int
    fun get__aq(): Int
    fun get__ar(): Int
    fun get__as(): Int
    fun get__au(): Int
    fun get__av(): Int
    fun get__ax(): Int
    fun get__ba(): Int
    fun get__bf(): Int
    fun get__bh(): Int
    fun get__bq(): Int
    fun get__br(): Int
    fun get__c(): Int
    fun get__j(): Int
    fun get__o(): Int
    fun get__y(): Int
    fun get__q(): AbstractArchive
    fun get__t(): AbstractArchive
    fun get__z(): AbstractArchive
    fun get__ag(): Any
    fun get__ah(): Any
    fun get__bu(): Any
    fun get__bd(): Any
    fun get__ak(): Long
    fun get__bo(): IntArray
    fun get__bg(): Boolean
}
