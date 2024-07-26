package com.example.fluppybird

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.Matrix
import android.graphics.Paint
import android.graphics.Rect

class Bird (context: Context){
    private var birdBitmap: Bitmap = BitmapFactory.decodeResource(context.resources, R.drawable.bird2)
    var x: Float = 100f
    var y: Float = 100f
    var velosity: Float = 0f

    fun draw(canvas: Canvas, paint: Paint){
        canvas.drawBitmap(birdBitmap, x, y, paint)
    }

    fun update(){
        y += velosity
        velosity +=1f
    }

    fun flap(){
        velosity = -20f
    }

    fun getRectangle(): Rect{
        return Rect(x.toInt(), y.toInt(), (x + birdBitmap.width).toInt(), (y + birdBitmap.height).toInt())
    }
}