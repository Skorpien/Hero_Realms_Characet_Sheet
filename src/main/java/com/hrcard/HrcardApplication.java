package com.hrcard;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.io.IOException;

@SpringBootApplication
public class HrcardApplication extends Application {
    private ConfigurableApplicationContext applicationContext;
    private FXMLLoader loader;

    public static void main(String[] args) {
        launch(args);
    }

	@Override
	public void init() {
		applicationContext = SpringApplication.run(HrcardApplication.class);
		loader = new FXMLLoader();
		loader.setControllerFactory(applicationContext::getBean);
	}

	@Override
    public void start(Stage primaryStage) throws IOException {
		loader.setLocation(getClass().getResource("/fxml/sample.fxml"));
		Parent rootNode = loader.load();

		primaryStage.setTitle("Hero Realms Card");
		Scene scene = new Scene(rootNode, 800, 600);
		primaryStage.setScene(scene);
		primaryStage.show();
    }

	@Override
	public void stop() {
    	applicationContext.stop();
	}
}
