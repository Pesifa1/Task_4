package com.cgvsu;

import com.cgvsu.math.affine_transformations.affine;
import com.cgvsu.math.vector.Vector3;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.Objects;

public class Simple3DViewer extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        AnchorPane viewport = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("fxml/gui.fxml")));
        Scene scene = new Scene(viewport, 1000, 600);
        viewport.prefWidthProperty().bind(scene.widthProperty());
        viewport.prefHeightProperty().bind(scene.heightProperty());
        stage.setTitle("Simple3DViewer");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
    /*
    <TitledPane animated="false" layoutX="1.0" layoutY="26.0" prefHeight="737.0" prefWidth="227.0" text="Model Transform">
        <content>
            <AnchorPane minHeight="0.0" minWidth="0.0" prefHeight="598.0" prefWidth="226.0">
                <children>
                    <Label layoutX="16.0" layoutY="12.0" prefHeight="20.0" prefWidth="174.0" text="Scale: Масштабирование" />
                    <Label layoutX="16.0" layoutY="44.0" prefHeight="20.0" prefWidth="93.0" text="X:" />
                    <Label layoutX="16.0" layoutY="88.0" prefHeight="20.0" prefWidth="93.0" text="Y:" />
                    <Label layoutX="16.0" layoutY="132.0" prefHeight="20.0" prefWidth="93.0" text="Z:" />
                    <TextField layoutX="57.0" layoutY="44.0" prefHeight="26.0" prefWidth="149.0" />
                    <TextField layoutX="57.0" layoutY="88.0" prefHeight="26.0" prefWidth="149.0" />
                    <TextField layoutX="57.0" layoutY="132.0" prefHeight="26.0" prefWidth="149.0" />

                    <Label layoutX="16.0" layoutY="240.0" prefHeight="20.0" prefWidth="183.0" text="Rotation: Поворот" />
                    <Label layoutX="16.0" layoutY="284.0" prefHeight="20.0" prefWidth="93.0" text="X:" />
                    <Label layoutX="16.0" layoutY="328.0" prefHeight="20.0" prefWidth="93.0" text="Y:" />
                    <Label layoutX="16.0" layoutY="372.0" prefHeight="20.0" prefWidth="93.0" text="Z:" />
                    <TextField layoutX="57.0" layoutY="284.0" prefHeight="26.0" prefWidth="149.0" />
                    <TextField layoutX="57.0" layoutY="328.0" prefHeight="26.0" prefWidth="149.0" />
                    <TextField layoutX="57.0" layoutY="372.0" prefHeight="26.0" prefWidth="149.0" />

                    <Label layoutX="16.0" layoutY="480.0" prefHeight="20.0" prefWidth="166.0" text="Translation: Смещение" />
                    <Label layoutX="16.0" layoutY="524.0" prefHeight="20.0" prefWidth="34.0" text="X:" />
                    <Label layoutX="16.0" layoutY="568.0" prefHeight="20.0" prefWidth="93.0" text="Y:" />
                    <Label layoutX="16.0" layoutY="612.0" prefHeight="20.0" prefWidth="93.0" text="Z:" />
                    <TextField fx:id="a" layoutX="57.0" layoutY="524.0" prefHeight="26.0" prefWidth="149.0" />
                    <TextField fx:id="b" layoutX="57.0" layoutY="568.0" prefHeight="26.0" prefWidth="149.0" />
                    <TextField fx:id="sumaandb" layoutX="57.0" layoutY="612.0" prefHeight="26.0" prefWidth="149.0" />

                    <Button layoutX="12.0" layoutY="186.0" mnemonicParsing="false" text="Scale" />
                    <Button layoutX="12.0" layoutY="426.0" mnemonicParsing="false" text="Rotation" />
                    <Button fx:id="suma" layoutX="12.0" layoutY="666.0"  text="Translation" />

                </children>
            </AnchorPane>
        </content>
   </TitledPane>

    */







/*
        suma.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                double asum = Double.parseDouble(a.getText());
                double bsum = Double.parseDouble(b.getText());
                double sum = asum + bsum;
                String s = String.valueOf(sum);
                sumaandb.setText(" " + s);

                int asum = Integer.parseInt(a.getText());
                int bsum = Integer.parseInt(b.getText());
                int sum = asum + bsum;
                c.getText(" " + sum);

            }
        });*/


    /*
    <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter-api</artifactId>
            <version>${junit.version}</version>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter-engine</artifactId>
            <version>${junit.version}</version>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.13.2</version>
            <scope>compile</scope>
        </dependency>




        <orderEntry type="library" scope="TEST" name="Maven: org.junit.jupiter:junit-jupiter-api:5.8.1" level="project" />
    <orderEntry type="library" scope="TEST" name="Maven: org.opentest4j:opentest4j:1.2.0" level="project" />
    <orderEntry type="library" scope="TEST" name="Maven: org.junit.platform:junit-platform-commons:1.8.1" level="project" />
    <orderEntry type="library" scope="TEST" name="Maven: org.apiguardian:apiguardian-api:1.1.2" level="project" />
    <orderEntry type="library" scope="TEST" name="Maven: org.junit.jupiter:junit-jupiter-engine:5.8.1" level="project" />
    <orderEntry type="library" scope="TEST" name="Maven: org.junit.platform:junit-platform-engine:1.8.1" level="project" />
    */

}