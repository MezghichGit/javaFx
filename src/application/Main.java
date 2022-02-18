package application;

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
import javafx.scene.text.Text;

public class Main extends Application {
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
		
		
		Label UsernameLabel = new Label("Username:");
		TextField UsernameTextField = new TextField();
		
		
        Label PasswordLabel = new Label("Password:"); 
        //TextField PasswordTextField  = new TextField();
        PasswordField PasswordTextField = new PasswordField();
        GridPane layout = new GridPane();
        
        layout.setPadding(new Insets(10, 10, 10, 10)); 
        layout.setVgap(5); 
        layout.setHgap(5); 
        
        layout.add(UsernameLabel, 0,0);
        layout.add(UsernameTextField, 1,0);
        
        layout.add(PasswordLabel, 0,1);
        layout.add(PasswordTextField, 1,1);
     
        Button btnValid = new Button("Valider");
        Button btnReset = new Button("Reset");
        
        layout.add(btnReset, 0,2);
        layout.add(btnValid, 1,2); 
        
       // action event : click sur btnValide
        EventHandler<ActionEvent> eventSubmit = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {
                
            	String username = UsernameTextField.getText();
                String password = PasswordTextField.getText();
                System.out.println("Votre username : "+ username+ " Votre password : "+password);
                
            }
        };
  
        // when btnValid is pressed
        btnValid.setOnAction(eventSubmit);
        
        
        
        /*****************/
        // action event : click sur btnReset
        EventHandler<ActionEvent> eventReset = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {
            	UsernameTextField.clear();  //clear() : vider le contenu de l'input
                PasswordTextField.clear();
            }
        };
  
        // when btnValid is pressed
        btnReset.setOnAction(eventReset);
        
        Scene scene = new Scene(layout, 300, 120);  
 
        primaryStage.setTitle("Formulaire de login");
        primaryStage.setScene(scene);   
        primaryStage.show();    
    }

	public static void main(String[] args) {
		launch(args);
	}
}
