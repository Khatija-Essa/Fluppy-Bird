package com.example.fluppybird

import android.graphics.Canvas
import android.view.SurfaceHolder

class GameThread(private val surfaceHolder: SurfaceHolder, private val gameView: GameView) : Thread() {
    private var running: Boolean = false

    fun setRunning(isRunning: Boolean) {
        this.running = isRunning
    }

    override fun run() {

        while (running) {
            val canvas: Canvas? = surfaceHolder.lockCanvas()
            if(canvas!=null){
                synchronized(surfaceHolder){
                    gameView.update()
                    gameView.draw(canvas)
                }
                surfaceHolder.unlockCanvasAndPost(canvas)
            }
        }
    }
}
