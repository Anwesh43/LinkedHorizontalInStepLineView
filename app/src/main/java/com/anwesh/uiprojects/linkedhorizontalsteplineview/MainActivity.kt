package com.anwesh.uiprojects.linkedhorizontalsteplineview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anwesh.uiprojects.horizontalsteplineview.HorizontalStepLineView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        HorizontalStepLineView.create(this)
    }
}
