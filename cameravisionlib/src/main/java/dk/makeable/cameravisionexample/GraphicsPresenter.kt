package dk.makeable.cameravisionexample

interface GraphicsPresenter {
    /**
     * This function will be invoke every time a frame needs to be drawn to the graphical overlay.
     */
    abstract fun drawFrame(graphicOverlay: GraphicOverlay)
}