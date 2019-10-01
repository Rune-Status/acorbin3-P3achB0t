package com.p3achb0t.scripts

import com.naturalmouse.api.MouseMotionFactory
import com.naturalmouse.custom.RuneScapeFactoryTemplates
import com.p3achb0t._runestar_interfaces.Client
import com.p3achb0t.api.AbstractScript
import com.p3achb0t.api.Calculations
import com.p3achb0t.api.ScriptManifest
import java.awt.Color
import java.awt.Graphics
@ScriptManifest("Test","TestScript","Unoplex")
class GoblinKiller : AbstractScript() {
    var state = 0

    //var playerss = ctx.getPlayers() GIVES an error
    override suspend fun loop() {

        Thread.sleep(500)

    }

    override suspend fun start() {
        state = ctx.client.getGameState() // this works
    }

    override suspend fun stop() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun draw(g: Graphics) {

        g.drawString("$state", 300, 300)
        val playerss = ctx.client.getPlayers()
        /*val f  = npcs.findNpcs(sortByDist = true)
        if (f.size > 0) {
            val npc = f[0].npc
            if (npc != null) {
                g.drawString("SpotAnimation ${npc.getSpotAnimation()}, HitmarkCount ${npc.getHitmarkCount()}, mvf ${npc.getMovementFrame()} , mvS ${npc.getMovementSequence()}, gets ${npc.getSequence()} , mvf ${npc.getSpotAnimationFrame()}, mvf ${npc.getTargetIndex()}" +
                        ", mvf ${npc.getOverheadText()}",50,50)
                g.drawString("${npc.getType().getIsInteractable()}, ${npc.getType().getReadyanim()}, ${npc.getType().getName()},",50, 70)}
        }*/
        var y = 50
        playerss.forEach {
            if (it != null) {

                g.drawString("${it.getUsername()}, ${it.getActions()}",50, y)
                y+=15
            }
        }
/*
        f.forEach {
            if (it != null) {
                val npc = it.npc
                val namePoint =
                        Calculations.worldToScreen(
                                npc.getX(),
                                npc.getY(),
                                npc.getHeight(),ctx)
                if (namePoint.x != -1 && namePoint.y != -1 && Calculations.isOnscreen(ctx,namePoint )) {

                    if (it.isInCombat() ) {
                        g.color = Color.RED
                        g.drawString("${npc.getType().getName()}, ${npc.getType().getId()}",namePoint.x, namePoint.y)
                    } else {
                        g.color = Color.GREEN
                        g.drawString("${npc.getType().getName()}, ${npc.getType().getId()}",namePoint.x, namePoint.y)
                    }
                }
            }
        }

 */
    }
}