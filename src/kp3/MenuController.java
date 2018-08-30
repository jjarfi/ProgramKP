/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kp3;

import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author pacevil
 */
public class MenuController implements Initializable {

    private double initX;
    private double initY;

    @FXML
    private Pane pan, paan;
    @FXML
    private AnchorPane root;
    @FXML
    private Button btnclose;

    @FXML
    private Button btnsembunyi;

    @FXML
    private void drag(MouseEvent event) {
        Stage stage = (Stage) pan.getScene().getWindow();
        stage.setX(event.getScreenX() - initX);
        stage.setY(event.getScreenY() - initY);
    }

    @FXML
    private void pres(MouseEvent event) {
        Stage stage = (Stage) pan.getScene().getWindow();
        initX = event.getScreenX() - stage.getX();
        initY = event.getScreenY() - stage.getY();
    }

    @FXML
    private void drag1(MouseEvent event) {
        Stage stage = (Stage) paan.getScene().getWindow();
        stage.setX(event.getScreenX() - initX);
        stage.setY(event.getScreenY() - initY);
    }

    @FXML
    private void pres1(MouseEvent event) {
        Stage stage = (Stage) paan.getScene().getWindow();
        initX = event.getScreenX() - stage.getX();
        initY = event.getScreenY() - stage.getY();
    }
    @FXML
    private void drag2(MouseEvent event) {
        Stage stage = (Stage) root.getScene().getWindow();
        stage.setX(event.getScreenX() - initX);
        stage.setY(event.getScreenY() - initY);
    }

    @FXML
    private void pres2(MouseEvent event) {
        Stage stage = (Stage) root.getScene().getWindow();
        initX = event.getScreenX() - stage.getX();
        initY = event.getScreenY() - stage.getY();
    }

    @FXML
    private void tutup(ActionEvent event) {
        Stage stage = (Stage) root.getScene().getWindow();
        stage.close();

    }

    @FXML
    private void sembunyi(ActionEvent event) {
        Stage stage = (Stage) root.getScene().getWindow();
        stage.setIconified(true);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

}
