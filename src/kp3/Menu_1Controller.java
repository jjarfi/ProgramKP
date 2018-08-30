/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kp3;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.FadeTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author pacevil
 */
public class Menu_1Controller implements Initializable {

    @FXML
    private AnchorPane jendela;
    AnchorPane sistem;
    @FXML
    private Label txtdash;
    @FXML
    private Label txtsc;
    @FXML
    private Label txtsa;
    @FXML
    private Label txts;
    @FXML
    private Label txtu;
    @FXML
    private Label txtr;

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    @FXML
    private void pindahsistem(MouseEvent event) {
        setNode(sistem);
    }

    private void setNode(Node node) {
        jendela.getChildren().clear();
        jendela.getChildren().add(node);

        FadeTransition ft = new FadeTransition(Duration.millis(1500));
        ft.setNode(node);
        ft.setFromValue(0.1);
        ft.setToValue(1);
        ft.setCycleCount(1);
        ft.setAutoReverse(false);
        ft.play();
    }

    @FXML
    private void mosenter1(MouseEvent event) {
        txtdash.setTextFill(Color.web("08DDFF"));
        txtdash.setStyle("-fx-border-color: #08DDFF");
    }

    @FXML
    private void mosenter2(MouseEvent event) {
        txtsc.setTextFill(Color.web("08DDFF"));
        txtsc.setStyle("-fx-border-color: #08DDFF");
    }

    @FXML
    private void mosenter3(MouseEvent event) {
        txtsa.setTextFill(Color.web("08DDFF"));
        txtsa.setStyle("-fx-border-color: #08DDFF");
    }

    @FXML
    private void mosenter4(MouseEvent event) {
        txts.setTextFill(Color.web("08DDFF"));
        txts.setStyle("-fx-border-color: #08DDFF");
    }

    @FXML
    private void mosenter5(MouseEvent event) {
        txtu.setTextFill(Color.web("08DDFF"));
        txtu.setStyle("-fx-border-color: #08DDFF");
    }

    @FXML
    private void mosenter6(MouseEvent event) {
        txtr.setTextFill(Color.web("08DDFF"));
        txtr.setStyle("-fx-border-color: #08DDFF");
    }

    @FXML
    private void mosexit1(MouseEvent event) {
        txtdash.setTextFill(Color.web("FFFFFF"));
        txtdash.setStyle("-fx-border-color: #142430");
    }

    @FXML
    private void mosexit2(MouseEvent event) {
        txtsc.setTextFill(Color.web("FFFFFF"));
        txtsc.setStyle("-fx-border-color: #142430");
    }

    @FXML
    private void mosexit3(MouseEvent event) {
        txtsa.setTextFill(Color.web("FFFFFF"));
        txtsa.setStyle("-fx-border-color: #142430");
    }

    @FXML
    private void mosexit4(MouseEvent event) {
        txts.setTextFill(Color.web("FFFFFF"));
        txts.setStyle("-fx-border-color: #142430");
    }

    @FXML
    private void mosexit5(MouseEvent event) {
        txtu.setTextFill(Color.web("FFFFFF"));
        txtu.setStyle("-fx-border-color: #142430");
    }

    @FXML
    private void mosexit6(MouseEvent event) {
        txtr.setTextFill(Color.web("FFFFFF"));
        txtr.setStyle("-fx-border-color: #142430");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        try {
            sistem = FXMLLoader.load(getClass().getResource("/sistem/sistem.fxml"));
        } catch (IOException ex) {

        }
        setNode(sistem);
    }

}
