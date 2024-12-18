//Chingwing Yeung
//Assignment11
//11/25/2022

package myJavaFXpkg;

import java.util.Scanner;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Border;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;


public class MyJavaFX extends Application {
	String result = "";
	@Override
	public void start(Stage primaryStage) throws Exception {
double sum = 0;
		
		// Create a scene and place a button in the scene.
		Pane pane = new Pane();  
		Button btClear = new Button("Clear");  /**Add button clear to numbers and signs shown on the label*/
		btClear.setLayoutX(20);
		btClear.setLayoutY(80);
		pane.getChildren().add(btClear);
			
		
		/**Add buttons for all the number in a calculator (0-9)*/
		Button one = new Button("1");
		one.setLayoutX(20);          
		one.setLayoutY(500);
		pane.getChildren().add(one);
		
		Button two = new Button("2");
		two.setLayoutX(60);      //move right
		two.setLayoutY(500);
		pane.getChildren().add(two);
		
		Button three = new Button("3");
		three.setLayoutX(100);   //move right
		three.setLayoutY(500);
		pane.getChildren().add(three);
		
		Button four = new Button("4");
		four.setLayoutX(20);     //same x as one
		four.setLayoutY(460);    //move higher
		pane.getChildren().add(four);
		
		Button five = new Button("5");
		five.setLayoutX(60);     //move right
		five.setLayoutY(460);
		pane.getChildren().add(five);
		
		Button six = new Button("6");
		six.setLayoutX(100);    //move right
		six.setLayoutY(460);
		pane.getChildren().add(six);
		
		Button seven = new Button("7");
		seven.setLayoutX(20);    //same x as one
		seven.setLayoutY(420);   //move higher
		pane.getChildren().add(seven);
		
		Button eight = new Button("8");
		eight.setLayoutX(60);    //move right
		eight.setLayoutY(420);
		pane.getChildren().add(eight);
		
		Button nine = new Button("9");
		nine.setLayoutX(100);    //move right
		nine.setLayoutY(420);   
		pane.getChildren().add(nine);
		
		Button zero = new Button("0");
		zero.setLayoutX(60);      //same x as two
		zero.setLayoutY(540);     //mover lower
		pane.getChildren().add(zero);
		
		/**Add extra functions buttons: ^, square root*/
		
		Button power = new Button("^");
		power.setLayoutX(60);      
		power.setLayoutY(380);     
		pane.getChildren().add(power);
		
		Button sqrtroot = new Button("sqrt");
		sqrtroot.setLayoutX(100);      
		sqrtroot.setLayoutY(380);     
		pane.getChildren().add(sqrtroot);
		
		
		/**Add buttons for addition, subtraction, multiplication and division*/
		Button addition = new Button("+");
		addition.setLayoutX(140);  
		addition.setLayoutY(500);    //same y as one
		pane.getChildren().add(addition);
		
		Button subtraction = new Button("-");
		subtraction.setLayoutX(140);  
		subtraction.setLayoutY(460);    //move higher
		pane.getChildren().add(subtraction);
		
		Button multiplication = new Button("*");
		multiplication.setLayoutX(140);  
		multiplication.setLayoutY(420);    //move higher
		pane.getChildren().add(multiplication);
		
		Button division = new Button("/");
		division.setLayoutX(140);  
		division.setLayoutY(380);    //move higher
		pane.getChildren().add(division);
		
		/**Add button for the equal sign(=) */
		Button equalsign = new Button("=");
		equalsign.setLayoutX(140);  
		equalsign.setLayoutY(540);    //same y as zero
		pane.getChildren().add(equalsign);
		
		Label myLabel = new Label("123456");
		myLabel.setFont(Font.font("Courier",FontWeight.BOLD,FontPosture.REGULAR,20));
		myLabel.setStyle("-fx-border-color: blue;");
		myLabel.setAlignment(Pos.BASELINE_RIGHT); // align text to the right side of the label.
		myLabel.setLayoutX(10);       // set the x location of the label
		myLabel.setLayoutY(10);       // set the y location of the label
		myLabel.setPrefSize(250, 20); // set the width and height of the label
		myLabel.setText("123456789"); // put some numbers into the label
		pane.getChildren().add(myLabel);
		myLabel.setText(Double.toString(sum));
		
		/**process events: button number 1, add String 1 to the String result, show it on the label*/
		one.setOnAction(e -> {
		myLabel.setText(addToString("1"));});
		
		/**process events: button number 2, add String 2 to the String result, show it on the label*/
		two.setOnAction(e -> {
		myLabel.setText(addToString("2"));});
		
		/**process events: button number 3, add String 3 to the String result, show it on the label*/
		three.setOnAction(e -> {
		myLabel.setText(addToString("3"));});
		
		/**process events: button number 4, add String 4 to the String result, show it on the label*/
		four.setOnAction(e -> {
		myLabel.setText(addToString("4"));});
		
		/**process events: button number 5, add String 5 to the String result, show it on the label*/
		five.setOnAction(e -> {
		myLabel.setText(addToString("5"));});
		
		/**process events: button number 6, add String 6 to the String result, show it on the label*/
		six.setOnAction(e -> {
		myLabel.setText(addToString("6"));});
		
		/**process events: button number 7, add String 7 to the String result, show it on the label*/
		seven.setOnAction(e -> {
		myLabel.setText(addToString("7"));});
		
		/**process events: button number 8, add String 8 to the String result, show it on the label*/
		eight.setOnAction(e -> {
		myLabel.setText(addToString("8"));});
		
		/**process events: button number 9, add String 9 to the String result, show it on the label*/
		nine.setOnAction(e -> {
		myLabel.setText(addToString("9"));});
		
		/**process events: button number 0, add String 0 to the String result, show it on the label*/
		zero.setOnAction(e -> {
		myLabel.setText(addToString("0"));});
		
		/**process events: button number +, add String " + " to the String result, show it on the label*/
		addition.setOnAction(e -> {
		myLabel.setText(addToString(" + "));});
		
		/**process events: button number -, add String " - " to the String result, show it on the label*/
		subtraction.setOnAction(e -> {
		myLabel.setText(addToString(" - "));});
		
		/**process events: button number *, add String " * " to the String result, show it on the label*/
		multiplication.setOnAction(e -> {
		myLabel.setText(addToString(" * "));});
		
		/**process events: button number /, add String " / " to the String result, show it on the label*/
		division.setOnAction(e -> {
		myLabel.setText(addToString(" / "));});
		
		/**process events: button number ^, add String " ^ " to the String result, show it on the label*/
		power.setOnAction(e -> {
		myLabel.setText(addToString(" ^ "));});
		
		/**process events: button number sqrt, add String " sqrt " to the String result, show it on the label*/
		sqrtroot.setOnAction(e -> {
		myLabel.setText(addToString(" sqrt 0"));});
		
		
		/**process events: button =, calculate the result*/
		equalsign.setOnAction(e -> {
		myLabel.setText(Integer.toString(calculate(result))); 
		result = Integer.toString(calculate(result));}); 
		//assign the return value from calculation to result to enable multiple steps calculation
		
		/**process events: btClear, to clear all strings in results and on labels*/
		btClear.setOnAction(e -> {
			myLabel.setText(null);
			result = "";
		});
		
		Scene scene = new Scene(pane,280,600);
		primaryStage.setTitle("MyJavaFX"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}
	
	private int calculate(String result2) {
		// String result divided by delimiter " " is read in Scanner class 
		Scanner input = new Scanner(result); //create a scanner for the String result
		
		/**refer to p.483 on book as well as p.485 on book
		 * how to make it calculate multiple steps calculation? solved, 
		 * checked equalsign.setOnAction part
		 * extra point: how to calculate different mathematics functions from ch4.2
		 * (make button handler making)?
		 * */
		int intValue = input.nextInt();
		String sign = input.next();
		int intValue2 = input.nextInt();
		
		
		
		switch (sign) {
		case "+": return intValue + intValue2; 		
		case "-": return intValue - intValue2; 
		case "*": return intValue * intValue2;
		case "/": return intValue / intValue2;
		case "^": return (int) Math.pow(intValue, intValue2);
		case "sqrt": return (int) Math.sqrt(intValue);
		default: return 0;
		
		}
		
	}

	private String addToString(String passedString) {
		// add the passedString to the String result
		result += passedString;
		return result;
	}

	public static void main(String[] args) {
		launch(args);
	}
}
