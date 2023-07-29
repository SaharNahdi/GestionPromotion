/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package GUI;

import gestionpromotion.Entity.Promotion;
import gestionpromotion.Service.MyListener;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author mahdi
 */
public class AffichePromotionController implements Initializable {

    private Promotion p;
    private MyListener myListener;            
    @FXML
    private Label description;
    @FXML
    private Label dated;
    @FXML
    private Label datef;
    @FXML
    private Label pourcentage;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    public void setData(Promotion p,MyListener myListener){
        this.p = p;
         this.myListener=myListener;
        description.setText(p.getDescription());
        dated.setText(String.valueOf(p.getDated()));
        datef.setText(String.valueOf(p.getDatef()));
        pourcentage.setText(String.valueOf(p.getPourcentage()));     
    }
        

    @FXML
    private void selectedbp(MouseEvent event) {
         myListener.onClickListener(p);
    }
    
}
