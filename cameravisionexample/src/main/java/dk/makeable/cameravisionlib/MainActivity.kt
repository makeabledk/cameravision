package dk.makeable.cameravisionlib

import android.os.Bundle
import android.util.Log
import dk.makeable.cameravisionexample.CameraVisionActivity
import dk.makeable.cameravisionexample.GraphicOverlay
import dk.makeable.cameravisionexample.GraphicsPresenter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : CameraVisionActivity(), GraphicsPresenter {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupCameraVision(
                graphic_overlay,
                camera_preview,
                "To use this feature, we need camera permission.",
                "You can't use this feature without permission.",
                this
        )
    }

    override fun drawFrame(graphicOverlay: GraphicOverlay) {
        // Add some graphics to the overlay
        Log.d("Test", "draw frame")
    }
}
