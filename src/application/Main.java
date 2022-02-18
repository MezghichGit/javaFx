package application;

import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
//import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class Main extends Application {
	
	List <Etudiant> etudiants = new ArrayList<>();
	/*
	 * @Override public void start(Stage primaryStage) { try { String ch =
	 * "formation JavaFX"; StackPane root = new StackPane(); // gestionnaire des
	 * composant //Layout Text myMessage = new Text("Hello FX from ISIKA");
	 * root.getChildren().add(myMessage); Scene scene = new Scene(root,200,200);
	 * scene.getStylesheets().add(getClass().getResource("application.css").
	 * toExternalForm()); primaryStage.setScene(scene); primaryStage.show(); }
	 * catch(Exception e) { e.printStackTrace(); } }
	 */
/*
	@Override
	public void start(Stage primaryStage) throws Exception {
		try {
			Label label1 = new Label("Center");
			Label label2 = new Label("Top-most");
			Label label3 = new Label("Right");
			Label label4 = new Label("Bottom");
			Label label5 = new Label("Left");

			BorderPane layout = new BorderPane(label1, label2, label3, label4, label5);
			layout.setPadding(new Insets(10, 10, 10, 10));
			layout.setAlignment(label2, Pos.CENTER); 
			layout.setAlignment(label3, Pos.CENTER); 
			layout.setAlignment(label4, Pos.CENTER); 
			layout.setAlignment(label5, Pos.CENTER);
			Scene scene = new Scene(layout, 300, 300);

			primaryStage.setTitle("BorderPane Example");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}*/
	
	@Override    
    public void start(Stage primaryStage) throws Exception {
		
		
		Label UsernameLabel = new Label("Nom:");
		TextField UsernameTextField = new TextField();
		
		
        Label EmailLabel = new Label("Email:"); 
        TextField UserEmailTextField  = new TextField();
        
        
        Label VilleLabel = new Label("Ville:"); 
        TextField UserVilleTextField  = new TextField();
        
        //PasswordField PasswordTextField = new PasswordField();
        GridPane layout = new GridPane();
        VBox layout2 = new VBox();
        
        layout.setPadding(new Insets(10, 10, 10, 10)); 
        layout.setVgap(5); 
        layout.setHgap(5); 
        
        layout.add(UsernameLabel, 0,0);
        layout.add(UsernameTextField, 1,0);
        
        layout.add(EmailLabel, 0,1);
        layout.add(UserEmailTextField, 1,1);
     
        layout.add(VilleLabel, 0,2);
        layout.add(UserVilleTextField, 1,2);
        
        
        Button btnAjouter = new Button("Ajouter");
        
        Button btnFrameListEtudiants = new Button("Vers Liste Etudiants ");
        
        Button btnEtudiants = new Button("List des Etudiants");
        Button btnFrameAddEtudiant = new Button("Vers Add Etudiant");
        
        layout2.setMargin(btnFrameAddEtudiant,new Insets(10, 10, 10, 80));
        layout2.setMargin(btnEtudiants,new Insets(10, 10, 10, 80));
        
        layout.add(btnAjouter, 0,3);
        layout.add(btnFrameListEtudiants, 1,3); 
        
        //layout2.add(btnFrameAddEtudiant, 0, 0);
        layout2.getChildren().addAll(btnFrameAddEtudiant,btnEtudiants);
        
       // action event : click sur btnValide
        EventHandler<ActionEvent> eventSubmit = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {
                /*
            	String username = UsernameTextField.getText();
                String password = PasswordTextField.getText();
                System.out.println("Votre username : "+ username+ " Votre password : "+password);
                */
            	Etudiant etudiant = new Etudiant(UsernameTextField.getText(),UserEmailTextField.getText(),UserVilleTextField.getText());
            	//System.out.println(etudiant.toString());
            	etudiants.add(etudiant);
            	UsernameTextField.clear();
            	UserEmailTextField.clear();
            	UserVilleTextField.clear();
            }
        };
  
        // when btnValid is pressed
        btnAjouter.setOnAction(eventSubmit);
        
        
        
        /*****************/
        // action event : click sur btnReset
        
        EventHandler<ActionEvent> eventReset = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {
            	/*UsernameTextField.clear();  //clear() : vider le contenu de l'input
                PasswordTextField.clear();*/
            	
            	System.out.println(etudiants);
            }
        };
  
        // when btnValid is pressed
        //btnListEtudiants.setOnAction(eventReset);
        btnEtudiants.setOnAction(eventReset);
        Scene scene = new Scene(layout, 280, 150);  
        Scene scene2 = new Scene(layout2, 280, 150); 
        
        btnFrameListEtudiants.setOnAction(e->primaryStage.setScene(scene2));
        btnFrameAddEtudiant.setOnAction(e->primaryStage.setScene(scene));
        primaryStage.setTitle("Formulaire d'ajout d'un étudiant");
        primaryStage.setScene(scene);   
        primaryStage.show();    
    }

	public static void main(String[] args) {
		
		launch(args);
	}
}
