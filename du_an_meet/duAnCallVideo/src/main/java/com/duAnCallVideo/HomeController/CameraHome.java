package com.duAnCallVideo.HomeController;

import javafx.scene.Camera;
import javafx.scene.PerspectiveCamera;
import javafx.scene.transform.Transform;

public class CameraHome {
	
	private Transform cameraPosition;
	private Transform cameraXRotation;
	private Transform cameraYRotation;

	private Camera setupCamera() {
		PerspectiveCamera camera = new PerspectiveCamera();
		camera.getTransforms().addAll(this.cameraXRotation, this.cameraYRotation, this.cameraPosition);
		return camera;
	}
	

}
