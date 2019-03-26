package dk.makeable.cameravisionlib

import androidx.appcompat.app.AppCompatActivity

abstract class CameraVisionActivity : AppCompatActivity() {

    private var cameraVision: CameraVisionSetup? = null

    /**
     * When this function is called, all setup will be done regarding the camera and permissions, and the camera preview will begin
     * displaying what the camera sees. No further setup needed. The RecognitionProcessor instance will receive updates when it finds
     * any results, and in there is where you should add graphics to the GraphicOverlay.
     *
     * When the user denies the camera permission, this activity will automatically finish.
     */
    protected fun setupCameraVision(graphicOverlay: GraphicOverlay,
                                    cameraSourcePreview: CameraSourcePreview,
                                    cameraPermissionRationaleString: String,
                                    cameraPermissionDeniedString: String,
                                    presenter: GraphicsPresenter) {

        this.attachCameraVision(CameraVisionSetup(this,
                graphicOverlay,
                cameraSourcePreview,
                cameraPermissionRationaleString,
                cameraPermissionDeniedString,
                presenter
        ))
    }

    private fun attachCameraVision(visionSetup: CameraVisionSetup) {
        this.cameraVision = visionSetup
    }

}