package robo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.nio.file.*;
import java.awt.EventQueue;

import javax.net.ssl.HostnameVerifier;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Panel;

import javax.swing.JRadioButtonMenuItem;

import java.awt.CardLayout;

import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JMenuItem;
import javax.swing.AbstractAction;
import javax.swing.Action;

import org.eclipse.osgi.internal.loader.FragmentLoader;
import org.eclipse.ui.internal.handlers.WizardHandler.Import;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.Dataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.ui.RefineryUtilities;
import org.jfree.util.Rotation;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import com.ibm.icu.impl.USerializedSet;
import com.ibm.icu.math.BigDecimal;
import com.ibm.icu.text.DecimalFormat;

import java.awt.Choice;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.jar.JarException;
import java.awt.FlowLayout;

public class Robo_advisor extends JFrame {
	
	DecimalFormat df = new DecimalFormat("#.##");
	private JPanel contentPane;
	private JTextField txtHowManyYears;
	private JTextField txtAreYouMale;
	private JTextField txtEnterYourAge;
	private JTextField ageBox;
	private JTextField txtYearsUntil;
	private JTextField txtWhatIsThe;
	private JTextField txtUser;
	private JTextField txtName;
	private JTextField txtEmailAdress;
	private JTextField txtConfirmEmail;
	private JTextField newNameField;
	private JTextField emailField;
	private JTextField emailFieldTwo;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();
	private final ButtonGroup buttonGroup_3 = new ButtonGroup();
	private JTextField txtUser_1;
	private JTextField theUser;
	private JTextField txtAmountOfMoney;
	private JTextField moneyBox;
	private JTextField textField_1;
	private JTextField txtCostPerTrade;
	private JTextField tradeCost;
	private JTextField addMoneyOne;
	private JTextField addMoneyTwo;
	private JTextField addMoneyThree;
	private JTextField addMoneyFive;
	private JTextField addMoneyFour;
	private JTextField fundOne;
	private JTextField fundTwo;
	private JTextField fundThree;
	private JTextField fundFour;
	private JTextField fundFive;
	private JTextField txtTransactionCosts;
	private JTextField transactionCost;
	private JTextField txtUser_2;
	private JTextField userMoney;
	private JTextField totalMoneyOne;
	private JTextField totalMoneyTwo;
	private JTextField totalMoneyThree;
	private JTextField totalMoneyFour;
	private JTextField totalMoneyFive;
	private JTextField netWorth;
	private JTextField txtNetWorth;
	private JTextField indexOne;
	private JTextField indexTwo;
	private JTextField indexThree;
	private JTextField indexFour;
	private JTextField indexFive;
	private JTextField txtPrice;
	private JTextField txtPrice_1;
	private JTextField txtPrice_2;
	private JTextField txtPrice_3;
	private JTextField txtPrice_4;
	private JTextField textChangeOne;
	private JTextField textChangeTwo;
	private JTextField textChangeThree;
	private JTextField textChangeFour;
	private JTextField textChangeFive;
	private JTextField leftOver;
	private JTextField leftMoney;
	private JTextField sharesOne;
	private JTextField sharesTwo;
	private JTextField sharesThree;
	private JTextField sharesFour;
	private JTextField sharesFive;
	private JTextField shareNum;
	private JTextField shareNum2;
	private JTextField shareNum3;
	private JTextField shareNum4;
	private JTextField shareNum5;
	private JTextField txtCash;
	private JTextField textCash;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Robo_advisor frame = new Robo_advisor();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws Exception 
	 */
	public Robo_advisor() throws Exception, EOFException {
		
		
		ArrayList<JTextField> theShares = new ArrayList<JTextField>();
	
		String urlFoundation = "http://www.google.com/finance/info?q=NSE:";
		String values = GetRequest.sendGet(urlFoundation+"VNQ");
		System.out.println(values);
		
		float to = Decode.getPrice(urlFoundation+"VNQ");
		float top = Decode.getChange(urlFoundation+"VNQ");
		System.out.println(to);
		System.out.println(top);
		//if  doesn't exist, create the file and add a users array with nothing in it
		
		File file = new File("people.ser");
		file.createNewFile();
		Person p = new Person();
		
		
		ArrayList<Person> users = Save.loadPeople();
		if (users.size()==0) {
			users.add(p);
		}
		
	 		
		//try this stuff
		
	    
	    
	    
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		setBounds(100, 100, 600, 430);
		JPanel home = new JPanel();
		contentPane.add(home, "name_158080467540752");
		HashMap<String, Person> people = new HashMap<String,Person>();
		for (int i = 0; i < users.size(); i++) {
			people.put(users.get(i).getName(), users.get(i));
		}
		home.setLayout(null);
		
		Choice choice = new Choice();
		choice.setBounds(359, 11, 82, 20);
		home.add(choice);
		for (int i = 0; i < users.size(); i++) {
			if (users.get(i).getName()!=null) {
				choice.add(users.get(i).getName());
			}
			
		}
		
		txtUser = new JTextField();
		txtUser.setBounds(273, 12, 68, 20);
		txtUser.setText("User:");
		home.add(txtUser);
		txtUser.setColumns(10);
		
		
	
		
		JPanel Quiz = new JPanel();
		contentPane.add(Quiz, "name_158082530184876");
		Quiz.setLayout(null);
		
		txtHowManyYears = new JTextField();
		txtHowManyYears.setEditable(false);
		txtHowManyYears.setText("how many years before retirement?:");
		txtHowManyYears.setBounds(10, 60, 143, 20);
		Quiz.add(txtHowManyYears);
		txtHowManyYears.setColumns(10);
		
		JRadioButton answerZero = new JRadioButton("less than 5 years or retired");
		buttonGroup.add(answerZero);
		answerZero.setBounds(266, 7, 165, 23);
		Quiz.add(answerZero);
		JButton btnNewUser = new JButton("New User");
		btnNewUser.setBounds(20, 11, 89, 23);
		
		
		JButton quizButton = new JButton("Take the Quiz!!");
		quizButton.setBounds(416, 328, 120, 23);
		quizButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.removeAll();
				contentPane.add(Quiz);
				setBounds(0,0,504,1000);
				Quiz.setVisible(true);
				theUser.setText(choice.getSelectedItem());
			}
		});
		home.add(quizButton);
		home.add(btnNewUser);
		
		
		JRadioButton answerOne = new JRadioButton("less than 10 years");
		buttonGroup.add(answerOne);
		answerOne.setBounds(266, 33, 149, 23);
		Quiz.add(answerOne);
		
		JRadioButton answerTwo = new JRadioButton("less than 20 years");
		buttonGroup.add(answerTwo);
		answerTwo.setBounds(266, 59, 143, 23);
		Quiz.add(answerTwo);
		
		JRadioButton answerFour = new JRadioButton("less than 30 years");
		buttonGroup.add(answerFour);
		answerFour.setBounds(266, 85, 126, 23);
		Quiz.add(answerFour);
		
		JRadioButton answerFive = new JRadioButton("40 years or more");
		buttonGroup.add(answerFive);
		answerFive.setBounds(266, 111, 126, 23);
		Quiz.add(answerFive);
		
		txtAreYouMale = new JTextField();
		txtAreYouMale.setEditable(false);
		txtAreYouMale.setText("are you male or female?:");
		txtAreYouMale.setColumns(10);
		txtAreYouMale.setBounds(10, 200, 143, 20);
		Quiz.add(txtAreYouMale);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		buttonGroup_1.add(rdbtnFemale);
		rdbtnFemale.setBounds(266, 211, 126, 23);
		Quiz.add(rdbtnFemale);
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		buttonGroup_1.add(rdbtnMale);
		rdbtnMale.setBounds(266, 185, 126, 23);
		Quiz.add(rdbtnMale);
		
		txtEnterYourAge = new JTextField();
		txtEnterYourAge.setEditable(false);
		txtEnterYourAge.setText("enter your age:");
		txtEnterYourAge.setColumns(10);
		txtEnterYourAge.setBounds(10, 340, 143, 20);
		Quiz.add(txtEnterYourAge);
		
		ageBox = new JTextField();
		ageBox.setColumns(10);
		ageBox.setBounds(266, 340, 70, 20);
		Quiz.add(ageBox);
		
		txtYearsUntil = new JTextField();
		txtYearsUntil.setText("years before 50% of savings is withdrawn?:");
		txtYearsUntil.setEditable(false);
		txtYearsUntil.setColumns(10);
		txtYearsUntil.setBounds(10, 480, 250, 20);
		Quiz.add(txtYearsUntil);
		
		JRadioButton underFive = new JRadioButton("less than 5 years");
		buttonGroup_2.add(underFive);
		underFive.setBounds(266, 415, 126, 23);
		Quiz.add(underFive);
		
		JRadioButton underTen = new JRadioButton("less than 10 years");
		buttonGroup_2.add(underTen);
		underTen.setBounds(266, 441, 126, 23);
		Quiz.add(underTen);
		
		JRadioButton underFifteen = new JRadioButton("less than 15 years");
		buttonGroup_2.add(underFifteen);
		underFifteen.setBounds(266, 467, 126, 23);
		Quiz.add(underFifteen);
		
		JPanel tryThis = new JPanel();
		tryThis.setBounds(0, 46, 294, 271);
		home.add(tryThis);
		tryThis.setLayout(null);
		
		JRadioButton underTwenty = new JRadioButton("less than 20 years");
		buttonGroup_2.add(underTwenty);
		underTwenty.setBounds(266, 493, 126, 23);
		Quiz.add(underTwenty);
		
		JRadioButton underTwentyFive = new JRadioButton("more than 25 years");
		buttonGroup_2.add(underTwentyFive);
		underTwentyFive.setBounds(266, 519, 126, 23);
		Quiz.add(underTwentyFive);
		
		txtWhatIsThe = new JTextField();
		txtWhatIsThe.setText("your maximum acceptable one year loss?:");
		txtWhatIsThe.setEditable(false);
		txtWhatIsThe.setColumns(10);
		txtWhatIsThe.setBounds(10, 637, 250, 20);
		Quiz.add(txtWhatIsThe);
		
		JRadioButton under10 = new JRadioButton("less than 10%");
		buttonGroup_3.add(under10);
		under10.setBounds(266, 584, 126, 23);
		Quiz.add(under10);
		
		JRadioButton under20 = new JRadioButton("from 10-20%");
		buttonGroup_3.add(under20);
		under20.setBounds(266, 610, 126, 23);
		Quiz.add(under20);
		
		JRadioButton under30 = new JRadioButton("from 20-30%");
		buttonGroup_3.add(under30);
		under30.setBounds(266, 636, 126, 23);
		Quiz.add(under30);
		
		JRadioButton under40 = new JRadioButton("from 30-40%");
		buttonGroup_3.add(under40);
		under40.setBounds(266, 662, 126, 23);
		Quiz.add(under40);
		Panel newUser = new Panel();
		contentPane.add(newUser, "name_53808634272377");
		newUser.setLayout(null);
		
		JRadioButton over50 = new JRadioButton("more than 50%");
		buttonGroup_3.add(over50);
		over50.setBounds(266, 688, 126, 23);
		Quiz.add(over50);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ArrayList<JTextField> mainFunds = new ArrayList<JTextField>();
				mainFunds.addAll(Arrays.asList(indexOne,indexTwo,indexThree,indexFour,indexFive));
				System.out.println(people.get(theUser.getText()).getName());
				contentPane.remove(Quiz);
				contentPane.add(home);
				setBounds(100, 100, 600, 430);
				home.setVisible(true);
				
				System.out.println(people.get(theUser.getText()).getName());
				people.get(theUser.getText()).setRiskProfile(0);
				//first choice
				
				if (answerOne.isSelected()) {
					people.get(theUser.getText()).setRiskProfile(people.get(theUser.getText()).getRiskProfile()+1);
				}
				else if (answerTwo.isSelected()) {
					people.get(theUser.getText()).setRiskProfile(people.get(theUser.getText()).getRiskProfile()+2);
				}
				else if (answerZero.isSelected()) {
					people.get(theUser.getText()).setRiskProfile(people.get(theUser.getText()).getRiskProfile()+3);
				}
				else if (answerFour.isSelected()) {
					people.get(theUser.getText()).setRiskProfile(people.get(theUser.getText()).getRiskProfile()+4);
				}
				else if (answerFive.isSelected()) {
					people.get(theUser.getText()).setRiskProfile(people.get(theUser.getText()).getRiskProfile()+5);
				}
				
				
				//second choice
				if (rdbtnFemale.isSelected()) {
					people.get(theUser.getText()).setRiskProfile(people.get(theUser.getText()).getRiskProfile()+1);
				}
				else if (rdbtnMale.isSelected()) {
					people.get(theUser.getText()).setRiskProfile(people.get(theUser.getText()).getRiskProfile()+3);
				}
				//third choice
				Integer age;
				age = Integer.parseInt(ageBox.getText());
				
				if (age<30){
					people.get(theUser.getText()).setRiskProfile(people.get(theUser.getText()).getRiskProfile()+6);
				}
				else if (age<40) {
					people.get(theUser.getText()).setRiskProfile(people.get(theUser.getText()).getRiskProfile()+4);
				}
				else if (age<50) {
					people.get(theUser.getText()).setRiskProfile(people.get(theUser.getText()).getRiskProfile()+3);
				}
				else if (age<60) {
					people.get(theUser.getText()).setRiskProfile(people.get(theUser.getText()).getRiskProfile()+2);
				}
				else if (age>70) {
					people.get(theUser.getText()).setRiskProfile(people.get(theUser.getText()).getRiskProfile()+1);
				}
				
				//fourth choice
				if (underFive.isSelected()) {
					people.get(theUser.getText()).setRiskProfile(people.get(theUser.getText()).getRiskProfile()+1);
				}
				else if (underTen.isSelected()) {
					people.get(theUser.getText()).setRiskProfile(people.get(theUser.getText()).getRiskProfile()+2);
				}
				else if (underFifteen.isSelected()) {
					people.get(theUser.getText()).setRiskProfile(people.get(theUser.getText()).getRiskProfile()+3);
				}
				else if (underTwenty.isSelected()) {
					people.get(theUser.getText()).setRiskProfile(people.get(theUser.getText()).getRiskProfile()+4);
				}
				else if (underTwentyFive.isSelected()) {
					people.get(theUser.getText()).setRiskProfile(people.get(theUser.getText()).getRiskProfile()+6);
				}
				//five choice
				if (under10.isSelected()) {
					people.get(theUser.getText()).setRiskProfile(people.get(theUser.getText()).getRiskProfile()+1);
				}
				else if (under20.isSelected()) {
					people.get(theUser.getText()).setRiskProfile(people.get(theUser.getText()).getRiskProfile()+2);
				}
				else if (under30.isSelected()) {
					people.get(theUser.getText()).setRiskProfile(people.get(theUser.getText()).getRiskProfile()+3);
				}
				else if (under40.isSelected()) {
					people.get(theUser.getText()).setRiskProfile(people.get(theUser.getText()).getRiskProfile()+4);
				}
				else if (over50.isSelected()) {
					people.get(theUser.getText()).setRiskProfile(people.get(theUser.getText()).getRiskProfile()+6);
				}
				
				System.out.println(people.get(theUser.getText()).getRiskProfile());
				
				System.out.println(people.get(theUser.getText()).getRiskProfile());
				riskProfiles riskTolerance = new riskProfiles(people.get(theUser.getText()).getRiskProfile());
				people.get(theUser.getText()).setRiskLevel(riskTolerance);
				
				for (int i = 0; i < mainFunds.size(); i++) {
					mainFunds.get(i).setText(people.get(theUser.getText()).getRiskLevel().getFunds().get(i));
				}
				HashMap<String, Integer> savedShares = new HashMap<String, Integer>();
				for (int j = 0; j < mainFunds.size(); j++) {
					savedShares.put(people.get(theUser.getText()).getRiskLevel().getFunds().get(j),Integer.valueOf(0));
				}
				people.get(theUser.getText()).setShares(savedShares);
				System.out.println(people.get(theUser.getText()).getShares());
				
			}
		});
		btnNewUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				newUser.setVisible(true);
				contentPane.removeAll();
				contentPane.add(newUser);
				Save.savePeople(users);
			}
		});
		btnSubmit.setBounds(398, 636, 80, 23);
		Quiz.add(btnSubmit);
		
		
		
		txtUser_1 = new JTextField();
		txtUser_1.setEditable(false);
		txtUser_1.setText("User:");
		txtUser_1.setBounds(10, 8, 86, 20);
		Quiz.add(txtUser_1);
		txtUser_1.setColumns(10);
		
		theUser = new JTextField();
		theUser.setEditable(false);
		theUser.setBounds(106, 8, 86, 20);
		Quiz.add(theUser);
		theUser.setColumns(10);
		
		
		
		txtName = new JTextField();
		txtName.setEditable(false);
		txtName.setText("Name:");
		txtName.setColumns(10);
		txtName.setBounds(10, 40, 86, 20);
		newUser.add(txtName);
		
		txtEmailAdress = new JTextField();
		txtEmailAdress.setEditable(false);
		txtEmailAdress.setText("Email Address:");
		txtEmailAdress.setColumns(10);
		txtEmailAdress.setBounds(10, 71, 86, 20);
		newUser.add(txtEmailAdress);
		
		txtConfirmEmail = new JTextField();
		txtConfirmEmail.setEditable(false);
		txtConfirmEmail.setText("Confirm Email:");
		txtConfirmEmail.setColumns(10);
		txtConfirmEmail.setBounds(10, 102, 86, 20);
		newUser.add(txtConfirmEmail);
		
		newNameField = new JTextField();
		newNameField.setBounds(182, 40, 218, 20);
		newUser.add(newNameField);
		newNameField.setColumns(10);
		
		emailField = new JTextField();
		emailField.setColumns(10);
		emailField.setBounds(182, 71, 218, 20);
		newUser.add(emailField);
		
		emailFieldTwo = new JTextField();
		emailFieldTwo.setColumns(10);
		emailFieldTwo.setBounds(182, 102, 218, 20);
		newUser.add(emailFieldTwo);
		
		JButton btnSubmit_1 = new JButton("Submit");
		btnSubmit_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<JTextField> allHomeFields = new ArrayList<JTextField>();
				allHomeFields.addAll(Arrays.asList(netWorth, indexOne, indexTwo, indexThree, indexFour, indexFive, textChangeOne,textChangeTwo,textChangeThree,textChangeFour,textChangeFive,shareNum,shareNum2,shareNum3,shareNum4,shareNum5,txtPrice,txtPrice_1,txtPrice_2,txtPrice_3,txtPrice_4,totalMoneyOne,totalMoneyTwo,totalMoneyThree,totalMoneyFour,totalMoneyFive));
				
				Person user = new Person();
				user.setName(newNameField.getText());
				user.setEmail(emailField.getText());
				users.add(user);
				choice.add(user.getName());
				choice.select(user.getName());
				people.put(user.getName(),user);
				
				for (int i = 0; i < allHomeFields.size(); i++) {
					allHomeFields.get(i).setText("0");
				}
				contentPane.removeAll();
				tryThis.setVisible(false);
				
				contentPane.add(home);
				home.setVisible(true);
				
				
			}
		});
		btnSubmit_1.setBounds(311, 150, 89, 23);
		newUser.add(btnSubmit_1);
		JPanel addMoney = new JPanel();
		contentPane.add(addMoney, "name_252857308063430");
		addMoney.setLayout(null);
		
		txtAmountOfMoney = new JTextField();
		txtAmountOfMoney.setEditable(false);
		txtAmountOfMoney.setText("Money to add:");
		txtAmountOfMoney.setBounds(25, 72, 78, 20);
		addMoney.add(txtAmountOfMoney);
		txtAmountOfMoney.setColumns(10);
		
		moneyBox = new JTextField();
		moneyBox.setText("0");
		moneyBox.setBounds(25, 102, 47, 20);
		addMoney.add(moneyBox);
		moneyBox.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setText("$");
		textField_1.setBounds(82, 103, 21, 20);
		addMoney.add(textField_1);
		textField_1.setColumns(10);
		
		txtCostPerTrade = new JTextField();
		txtCostPerTrade.setEditable(false);
		txtCostPerTrade.setText("Cost per trade:");
		txtCostPerTrade.setBounds(25, 195, 86, 20);
		addMoney.add(txtCostPerTrade);
		txtCostPerTrade.setColumns(10);
		
		tradeCost = new JTextField();
		tradeCost.setText("0");
		tradeCost.setBounds(121, 195, 15, 20);
		addMoney.add(tradeCost);
		tradeCost.setColumns(10);
		
		addMoneyOne = new JTextField();
		addMoneyOne.setBounds(169, 72, 78, 20);
		addMoney.add(addMoneyOne);
		addMoneyOne.setColumns(10);
		
		addMoneyTwo = new JTextField();
		addMoneyTwo.setColumns(10);
		addMoneyTwo.setBounds(169, 102, 78, 20);
		addMoney.add(addMoneyTwo);
		
		addMoneyThree = new JTextField();
		addMoneyThree.setColumns(10);
		addMoneyThree.setBounds(169, 133, 78, 20);
		addMoney.add(addMoneyThree);
		
		addMoneyFive = new JTextField();
		addMoneyFive.setColumns(10);
		addMoneyFive.setBounds(169, 195, 78, 20);
		addMoney.add(addMoneyFive);
		
		addMoneyFour = new JTextField();
		addMoneyFour.setColumns(10);
		addMoneyFour.setBounds(169, 164, 78, 20);
		addMoney.add(addMoneyFour);
		
		JButton btnSubmit_2 = new JButton("Submit");
		btnSubmit_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float sharePrice;
				transactionCost.setText(String.valueOf(Double.parseDouble(tradeCost.getText())*5));
				double costs = Double.parseDouble(transactionCost.getText());
				Integer moneyLeft;
				ArrayList<JTextField> shareNumbers = new ArrayList<JTextField>();
				shareNumbers.addAll(Arrays.asList(sharesOne,sharesTwo,sharesThree,sharesFour,sharesFive));
				ArrayList<Float> prices = new ArrayList<Float>();
				ArrayList<JTextField> moneyBoxes = new ArrayList<JTextField>();
				moneyBoxes.addAll(Arrays.asList(addMoneyOne, addMoneyTwo,addMoneyThree,addMoneyFour,addMoneyFive));
				ArrayList<JTextField> fundNameFields = new ArrayList<JTextField>();
				ArrayList<String> symbols = new ArrayList<String>();
				fundNameFields.addAll(Arrays.asList(fundOne, fundTwo,fundThree,fundFour,fundFive));
				HashMap<String, Double> fundRatios = new HashMap<String, Double>();
				fundRatios = people.get(userMoney.getText()).getRiskLevel().getFundRatio();
				symbols = people.get(userMoney.getText()).getRiskLevel().getFunds();
				String urlFoundation = "http://www.google.com/finance/info?q=NSE:";
				String values;
				try {
					for (int i = 0; i < symbols.size(); i++) {
						values = GetRequest.sendGet(urlFoundation+symbols.get(i));
						sharePrice = Decode.getPrice(urlFoundation+symbols.get(i));
						prices.add(sharePrice);
					}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}				
				DecimalFormat df = new DecimalFormat("#.####");
				
				df.setMinimumIntegerDigits(2);
				for (int i = 0; i < moneyBoxes.size(); i++) {
					System.out.println(Double.parseDouble(moneyBox.getText()));
					System.out.println(fundRatios.get(fundOne.getText()));
					moneyBoxes.get(i).setText(String.valueOf(((Double.parseDouble(moneyBox.getText())-costs)*fundRatios.get(fundNameFields.get(i).getText()))));
					moneyBoxes.get(i).setText(String.valueOf((moneyBoxes.get(i).getText())));
					Double in = Double.parseDouble(moneyBoxes.get(i).getText());
					Double out = in/prices.get(i);
					Integer finalShares = out.intValue();
					System.out.println(in);
					System.out.println(out);
					shareNumbers.get(i).setText(String.valueOf(finalShares));
					moneyBoxes.get(i).setText(String.valueOf(df.format(finalShares.doubleValue()*prices.get(i))));
				}	
				Double tempTotal = 0.0;
				for (int j = 0; j < moneyBoxes.size(); j++) {
					tempTotal += Double.parseDouble(moneyBoxes.get(j).getText());
				}
				
			
				
				
			
				System.out.println(tempTotal);
				leftMoney.setText(String.valueOf(df.format((Double.parseDouble((moneyBox.getText()))-costs)-tempTotal)));
				people.get(userMoney.getText()).setNetWorth(people.get(userMoney.getText()).getNetWorth()+Double.parseDouble(leftMoney.getText()));
				people.get(userMoney.getText()).setCash(people.get(userMoney.getText()).getCash()+Double.parseDouble(leftMoney.getText()));
				Save.savePeople(users);
			}
		});
		btnSubmit_2.setBounds(25, 148, 89, 23);
		addMoney.add(btnSubmit_2);
		
		fundOne = new JTextField();
		fundOne.setBounds(257, 72, 47, 20);
		addMoney.add(fundOne);
		fundOne.setColumns(10);
		
		fundTwo = new JTextField();
		fundTwo.setColumns(10);
		fundTwo.setBounds(257, 102, 47, 20);
		addMoney.add(fundTwo);
		
		fundThree = new JTextField();
		fundThree.setColumns(10);
		fundThree.setBounds(257, 133, 47, 20);
		addMoney.add(fundThree);
		
		fundFour = new JTextField();
		fundFour.setColumns(10);
		fundFour.setBounds(257, 164, 47, 20);
		addMoney.add(fundFour);
		
		fundFive = new JTextField();
		fundFive.setColumns(10);
		fundFive.setBounds(257, 195, 47, 20);
		addMoney.add(fundFive);
		
		JButton btnReturn = new JButton("Save and return");
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<JTextField> allMoney = new ArrayList<JTextField>();
				ArrayList<JTextField> shareAll = new ArrayList<JTextField>();
				ArrayList<JTextField> fundNames = new ArrayList<JTextField>();
				shareAll.addAll(Arrays.asList(shareNum,shareNum2,shareNum3,shareNum4,shareNum5));
				fundNames.addAll(Arrays.asList(fundOne,fundTwo,fundThree,fundFour,fundFive));
				HashMap<String, Integer> shareMap = new HashMap<String,Integer>();
				Double moneyTotal = 0.0;
				allMoney.addAll(Arrays.asList(totalMoneyOne,totalMoneyTwo,totalMoneyThree,totalMoneyFour,totalMoneyFive));
				ArrayList<JTextField> moneyBoxesTwo = new ArrayList<JTextField>();
				moneyBoxesTwo.addAll(Arrays.asList(addMoneyOne, addMoneyTwo,addMoneyThree,addMoneyFour,addMoneyFive));
				contentPane.add(home);
				home.setVisible(true);
				addMoney.setVisible(false);
				setBounds(100, 100, 600, 430);
				/*for (int i = 0; i < allMoney.size(); i++) {
					allMoney.get(i).setText(String.valueOf(Double.parseDouble(allMoney.get(i).getText())+Double.parseDouble(moneyBoxesTwo.get(i).getText())));
				}*/
				
				shareNum.setText(String.valueOf(Math.round(Double.parseDouble(shareNum.getText())+Integer.parseInt(sharesOne.getText()))));
				shareNum2.setText(String.valueOf(Math.round(Double.parseDouble(shareNum2.getText())+Integer.parseInt(sharesTwo.getText()))));
				shareNum3.setText(String.valueOf(Math.round(Double.parseDouble(shareNum3.getText())+Integer.parseInt(sharesThree.getText()))));
				shareNum4.setText(String.valueOf(Math.round(Double.parseDouble(shareNum4.getText())+Integer.parseInt(sharesFour.getText()))));
				shareNum5.setText(String.valueOf(Math.round(Double.parseDouble(shareNum5.getText())+Integer.parseInt(sharesFive.getText()))));
				float tempInt;
				Float tempIntTwo;
				ArrayList<String> symbols = people.get(userMoney.getText()).getRiskLevel().getFunds();
				ArrayList<Float> prices = new ArrayList<Float>();
				String urlFoundation = "http://www.google.com/finance/info?q=NSE:";
				String values;
				try {
					for (int i = 0; i < symbols.size(); i++) {
						values = GetRequest.sendGet(urlFoundation+symbols.get(i));
						float sharePrice = Decode.getPrice(urlFoundation+symbols.get(i));
						prices.add(sharePrice);
					}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}		
				ArrayList<JTextField> alloftheShares = new ArrayList<JTextField>();
				alloftheShares.addAll(Arrays.asList(shareNum,shareNum2,shareNum3,shareNum4,shareNum5));
				
				for (int i = 0; i < shareAll.size(); i++) {
					System.out.println(alloftheShares.get(i).getText());
					shareMap.put(fundNames.get(i).getText(), Integer.parseInt(alloftheShares.get(i).getText()));
				}
				
				for (int i = 0; i < shareAll.size(); i++) {
					tempInt = Float.parseFloat(shareAll.get(i).getText());
					tempIntTwo = prices.get(i);
					float tempintThree = tempIntTwo*tempInt;
					allMoney.get(i).setText(String.valueOf(tempintThree));
				}
				for (int j = 0;j < allMoney.size(); j++) {
					moneyTotal += Double.parseDouble(allMoney.get(j).getText());
					
				}
				netWorth.setText(String.valueOf(Double.parseDouble(netWorth.getText())+moneyTotal+Double.parseDouble(leftMoney.getText())));
				people.get(choice.getSelectedItem()).setNetWorth(Double.parseDouble(netWorth.getText()));
				people.get(choice.getSelectedItem()).setShares(shareMap);
				Save.savePeople(users);
				choice.select(people.get(choice.getSelectedItem()).getName());
				
				if (people.get(choice.getSelectedItem()).getName()!=null) {
					
					
					double stockValue = 0;
					ArrayList<String> symbols1 = people.get(choice.getSelectedItem()).getRiskLevel().getFunds();
					ArrayList<Float> prices1 = new ArrayList<Float>();
					ArrayList<Float> priceQuote = new ArrayList<Float>();
					ArrayList<JTextField> alloftheShares1 = new ArrayList<JTextField>();
					ArrayList<JTextField> etfPrice = new ArrayList<JTextField>();
					ArrayList<JTextField> priceChange = new ArrayList<JTextField>();
					ArrayList<JTextField> theMoneyBoxes = new ArrayList<JTextField>();
					theMoneyBoxes.addAll(Arrays.asList(totalMoneyOne,totalMoneyTwo,totalMoneyThree,totalMoneyFour,totalMoneyFive));
					etfPrice.addAll(Arrays.asList(txtPrice,txtPrice_1,txtPrice_2,txtPrice_3,txtPrice_4));
					alloftheShares1.addAll(Arrays.asList(shareNum,shareNum2,shareNum3,shareNum4,shareNum5));
					priceChange.addAll(Arrays.asList(textChangeOne,textChangeTwo,textChangeThree,textChangeFour,textChangeFive));
					try {
						for (int i = 0; i < symbols1.size(); i++) {
							values = GetRequest.sendGet(urlFoundation+symbols1.get(i));
							float sharePrice = Decode.getPrice(urlFoundation+symbols1.get(i));
							float shareChange = Decode.getChange(urlFoundation+symbols1.get(i));
							prices1.add(sharePrice);
							priceQuote.add(shareChange);
						}
						for (int i = 0; i < etfPrice.size(); i++) {
							etfPrice.get(i).setText(prices1.get(i).toString());
							priceChange.get(i).setText(priceQuote.get(i).toString());
							theMoneyBoxes.get(i).setText(String.valueOf(Float.parseFloat(etfPrice.get(i).getText())*Integer.parseInt(alloftheShares1.get(i).getText())));
							stockValue += Double.parseDouble(theMoneyBoxes.get(i).getText());
						}
						System.out.println(stockValue+people.get(choice.getSelectedItem()).getNetWorth());
						if (people.get(choice.getSelectedItem()).getCash()==null) {
							people.get(choice.getSelectedItem()).setCash(0.0);
						}
						netWorth.setText(String.valueOf(stockValue+people.get(choice.getSelectedItem()).getCash()));
					} catch (Exception e1) {
						
						e1.printStackTrace();
					}			
					ArrayList<JTextField> fundNamesTwo = new ArrayList<JTextField>();
					ArrayList<JTextField> theMoneyBoxesThree = new ArrayList<JTextField>();
					fundNamesTwo.addAll(Arrays.asList(indexOne,indexTwo,indexThree,indexFour,indexFive));
					theMoneyBoxesThree.addAll(Arrays.asList(totalMoneyOne,totalMoneyTwo,totalMoneyThree,totalMoneyFour,totalMoneyFive));
					
					
					tryThis.removeAll();
					tryThis.setVisible(false);
					DefaultPieDataset dataset = new DefaultPieDataset( );
					for (int i = 0; i < theMoneyBoxes.size(); i++) {
						dataset.setValue(fundNamesTwo.get(i).getText(), new Double(Double.parseDouble(theMoneyBoxes.get(i).getText())));
					}
					
				    JFreeChart chart = ChartFactory.createPieChart3D(      
				            "Asset Distribution",   
				            dataset,            
				            true,             
				            true, 
				            false);
				    
				    PiePlot3D plot = (PiePlot3D) chart.getPlot();
				    plot.setStartAngle(290);
				    plot.setDirection(Rotation.CLOCKWISE);
				    plot.setForegroundAlpha(0.5f);
				    plot.setNoDataMessage("No data to display");
					ChartPanel pie = new ChartPanel(chart);
					pie.setBounds(0, 0, 293, 272);
					tryThis.add(pie);
					tryThis.setVisible(true);
					
					}
			}
		});
		btnReturn.setBounds(339, 194, 111, 23);
		addMoney.add(btnReturn);
		
		txtTransactionCosts = new JTextField();
		txtTransactionCosts.setEditable(false);
		txtTransactionCosts.setText("Transaction costs:");
		txtTransactionCosts.setBounds(339, 72, 111, 20);
		addMoney.add(txtTransactionCosts);
		txtTransactionCosts.setColumns(10);
		
		transactionCost = new JTextField();
		transactionCost.setEditable(false);
		transactionCost.setBounds(339, 102, 47, 20);
		addMoney.add(transactionCost);
		transactionCost.setColumns(10);
		
		txtUser_2 = new JTextField();
		txtUser_2.setEditable(false);
		txtUser_2.setText("user:");
		txtUser_2.setBounds(121, 23, 86, 20);
		addMoney.add(txtUser_2);
		txtUser_2.setColumns(10);
		
		userMoney = new JTextField();
		userMoney.setEditable(false);
		userMoney.setBounds(236, 23, 86, 20);
		addMoney.add(userMoney);
		userMoney.setColumns(10);
		
		leftOver = new JTextField();
		leftOver.setText("Remaining Money:");
		leftOver.setEditable(false);
		leftOver.setColumns(10);
		leftOver.setBounds(339, 133, 111, 20);
		addMoney.add(leftOver);
		
		leftMoney = new JTextField();
		leftMoney.setEditable(false);
		leftMoney.setColumns(10);
		leftMoney.setBounds(339, 164, 47, 20);
		addMoney.add(leftMoney);
		
		sharesOne = new JTextField();
		sharesOne.setBounds(314, 72, 15, 20);
		addMoney.add(sharesOne);
		sharesOne.setColumns(10);
		
		sharesTwo = new JTextField();
		sharesTwo.setColumns(10);
		sharesTwo.setBounds(314, 102, 15, 20);
		addMoney.add(sharesTwo);
		
		sharesThree = new JTextField();
		sharesThree.setColumns(10);
		sharesThree.setBounds(314, 133, 15, 20);
		addMoney.add(sharesThree);
		
		sharesFour = new JTextField();
		sharesFour.setColumns(10);
		sharesFour.setBounds(314, 164, 15, 20);
		addMoney.add(sharesFour);
		
		sharesFive = new JTextField();
		sharesFive.setColumns(10);
		sharesFive.setBounds(314, 195, 15, 20);
		addMoney.add(sharesFive);
		JButton btnAddMoney = new JButton("Add Money");
		btnAddMoney.setBounds(20, 328, 89, 23);
		btnAddMoney.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ArrayList<JTextField> fundNameFields = new ArrayList<JTextField>();
				ArrayList<String> fundNames = new ArrayList<String>();
				fundNameFields.addAll(Arrays.asList(fundOne, fundTwo,fundThree,fundFour,fundFive));
				try {
					contentPane.removeAll();
					contentPane.add(addMoney);
					addMoney.setVisible(true);
					setBounds(100,300,500,300);
					userMoney.setText(choice.getSelectedItem());
					fundNames = people.get(userMoney.getText()).getRiskLevel().getFunds();
					for (int i = 0; i < fundNameFields.size(); i++) {
						fundNameFields.get(i).setText(fundNames.get(i));
					}
						moneyBox.setText("0");
						addMoneyOne.setText("0");
						addMoneyTwo.setText("0");
						addMoneyThree.setText("0");
						addMoneyFour.setText("0");
						addMoneyFive.setText("0");
						leftMoney.setText("0");
						sharesOne.setText("0");
						sharesTwo.setText("0");
						sharesThree.setText("0");
						sharesFour.setText("0");
						sharesFive.setText("0");
						textCash.setText("0");
				} catch (Exception exception) {
					exception.printStackTrace();
					contentPane.removeAll();
					contentPane.add(Quiz);
					setBounds(0,0,504,1000);
					Quiz.setVisible(true);
					theUser.setText(choice.getSelectedItem());
				}
				//riskProfiles risk = new riskProfiles(10);
				//risk.getFunds();
			}
		});
		home.add(btnAddMoney);
		
		totalMoneyOne = new JTextField();
		totalMoneyOne.setBounds(349, 72, 51, 20);
		totalMoneyOne.setText("0");
		home.add(totalMoneyOne);
		totalMoneyOne.setColumns(10);
		
		totalMoneyTwo = new JTextField();
		totalMoneyTwo.setBounds(349, 103, 51, 20);
		totalMoneyTwo.setText("0");
		totalMoneyTwo.setColumns(10);
		home.add(totalMoneyTwo);
		
		totalMoneyThree = new JTextField();
		totalMoneyThree.setBounds(349, 134, 51, 20);
		totalMoneyThree.setText("0");
		totalMoneyThree.setColumns(10);
		home.add(totalMoneyThree);
		
		totalMoneyFour = new JTextField();
		totalMoneyFour.setBounds(349, 165, 51, 20);
		totalMoneyFour.setText("0");
		totalMoneyFour.setColumns(10);
		home.add(totalMoneyFour);
		
		totalMoneyFive = new JTextField();
		totalMoneyFive.setBounds(349, 196, 51, 20);
		totalMoneyFive.setText("0");
		totalMoneyFive.setColumns(10);
		home.add(totalMoneyFive);
		
		netWorth = new JTextField();
		netWorth.setBounds(450, 249, 86, 20);
		netWorth.setText("0");
		netWorth.setColumns(10);
		home.add(netWorth);
		
		txtNetWorth = new JTextField();
		txtNetWorth.setBounds(355, 249, 86, 20);
		txtNetWorth.setEditable(false);
		txtNetWorth.setText("Net Worth:");
		home.add(txtNetWorth);
		txtNetWorth.setColumns(10);
		
		indexOne = new JTextField();
		indexOne.setBounds(410, 72, 33, 20);
		indexOne.setText("fund");
		home.add(indexOne);
		indexOne.setColumns(10);
		
		indexTwo = new JTextField();
		indexTwo.setBounds(410, 103, 33, 20);
		indexTwo.setText("fund");
		indexTwo.setColumns(10);
		home.add(indexTwo);
		
		indexThree = new JTextField();
		indexThree.setBounds(410, 134, 33, 20);
		indexThree.setText("fund");
		indexThree.setColumns(10);
		home.add(indexThree);
		
		indexFour = new JTextField();
		indexFour.setBounds(410, 165, 33, 20);
		indexFour.setText("fund");
		indexFour.setColumns(10);
		home.add(indexFour);
		
		indexFive = new JTextField();
		indexFive.setBounds(410, 196, 33, 20);
		indexFive.setText("fund");
		indexFive.setColumns(10);
		home.add(indexFive);
		
		txtPrice = new JTextField();
		txtPrice.setBounds(450, 72, 41, 20);
		txtPrice.setText("price");
		txtPrice.setColumns(10);
		home.add(txtPrice);
		
		txtPrice_1 = new JTextField();
		txtPrice_1.setBounds(450, 103, 41, 20);
		txtPrice_1.setText("price");
		txtPrice_1.setColumns(10);
		home.add(txtPrice_1);
		
		txtPrice_2 = new JTextField();
		txtPrice_2.setBounds(450, 134, 41, 20);
		txtPrice_2.setText("price");
		txtPrice_2.setColumns(10);
		home.add(txtPrice_2);
		
		txtPrice_3 = new JTextField();
		txtPrice_3.setBounds(450, 165, 41, 20);
		txtPrice_3.setText("price");
		txtPrice_3.setColumns(10);
		home.add(txtPrice_3);
		
		txtPrice_4 = new JTextField();
		txtPrice_4.setBounds(450, 196, 41, 20);
		txtPrice_4.setText("price");
		txtPrice_4.setColumns(10);
		home.add(txtPrice_4);
		
		textChangeOne = new JTextField();
		textChangeOne.setBounds(495, 72, 41, 20);
		textChangeOne.setText("change");
		textChangeOne.setColumns(10);
		home.add(textChangeOne);
		
		textChangeTwo = new JTextField();
		textChangeTwo.setBounds(495, 103, 41, 20);
		textChangeTwo.setText("change");
		textChangeTwo.setColumns(10);
		home.add(textChangeTwo);
		
		textChangeThree = new JTextField();
		textChangeThree.setBounds(495, 134, 41, 20);
		textChangeThree.setText("change");
		textChangeThree.setColumns(10);
		home.add(textChangeThree);
		
		textChangeFour = new JTextField();
		textChangeFour.setBounds(495, 165, 41, 20);
		textChangeFour.setText("change");
		textChangeFour.setColumns(10);
		home.add(textChangeFour);
		
		textChangeFive = new JTextField();
		textChangeFive.setBounds(495, 196, 41, 20);
		textChangeFive.setText("change");
		textChangeFive.setColumns(10);
		home.add(textChangeFive);
		
		shareNum = new JTextField();
		shareNum.setText("0");
		shareNum.setBounds(304, 72, 35, 20);
		home.add(shareNum);
		shareNum.setColumns(10);
		
		shareNum2 = new JTextField();
		shareNum2.setText("0");
		shareNum2.setBounds(304, 103, 35, 20);
		shareNum2.setColumns(10);
		home.add(shareNum2);
		
		shareNum3 = new JTextField();
		shareNum3.setText("0");
		shareNum3.setColumns(10);
		shareNum3.setBounds(304, 134, 35, 20);
		home.add(shareNum3);
		
		shareNum4 = new JTextField();
		shareNum4.setText("0");
		shareNum4.setColumns(10);
		shareNum4.setBounds(304, 165, 35, 20);
		home.add(shareNum4);
		
		shareNum5 = new JTextField();
		shareNum5.setText("0");
		shareNum5.setColumns(10);
		shareNum5.setBounds(304, 196, 35, 20);
		home.add(shareNum5);
		
		ArrayList<String> theseFunds = new ArrayList<String>();
		if (people.get(choice.getSelectedItem()).getName()!=null) {
			theseFunds = people.get(choice.getSelectedItem()).getRiskLevel().getFunds();
		}
		
		theShares.addAll(Arrays.asList(indexOne,indexTwo,indexThree,indexFour,indexFive));
		HashMap<String, Integer> fundsPrices = new HashMap<String,Integer>();
		ArrayList<Integer> theSharesNumber = new ArrayList<Integer>();
		ArrayList<JTextField> theSharesNumbers = new ArrayList<JTextField>();
		theSharesNumbers.addAll(Arrays.asList(shareNum,shareNum2,shareNum3,shareNum4,shareNum5));
		
		txtCash = new JTextField();
		txtCash.setEditable(false);
		txtCash.setText("Cash: ");
		txtCash.setBounds(355, 280, 86, 20);
		home.add(txtCash);
		txtCash.setColumns(10);
		
		textCash = new JTextField();
		textCash.setText("0");
		textCash.setColumns(10);
		textCash.setBounds(450, 280, 86, 20);
		home.add(textCash);
		
		
		
		
	
		fundsPrices =  people.get(choice.getSelectedItem()).getShares();
		System.out.println(fundsPrices);
		
	for (int i = 0; i < theseFunds.size(); i++) {
		theShares.get(i).setText(theseFunds.get(i));
	}
	for (int i = 0; i < theSharesNumbers.size(); i++) {
		Integer temp = fundsPrices.get(theShares.get(i).getText());
		System.out.println(temp);
		if (people.get(choice.getSelectedItem()).getName()!=null) {
			theSharesNumbers.get(i).setText(temp.toString());
		}
	}
	
	
	
	if (people.get(choice.getSelectedItem()).getName()!=null) {
		
		
		double stockValue = 0;
		ArrayList<String> symbols = people.get(choice.getSelectedItem()).getRiskLevel().getFunds();
		ArrayList<Float> prices = new ArrayList<Float>();
		ArrayList<Float> priceQuote = new ArrayList<Float>();
		ArrayList<JTextField> alloftheShares = new ArrayList<JTextField>();
		ArrayList<JTextField> etfPrice = new ArrayList<JTextField>();
		ArrayList<JTextField> priceChange = new ArrayList<JTextField>();
		ArrayList<JTextField> fundNamesTwo = new ArrayList<JTextField>();
		ArrayList<JTextField> theMoneyBoxes = new ArrayList<JTextField>();
		fundNamesTwo.addAll(Arrays.asList(indexOne,indexTwo,indexThree,indexFour,indexFive));
		theMoneyBoxes.addAll(Arrays.asList(totalMoneyOne,totalMoneyTwo,totalMoneyThree,totalMoneyFour,totalMoneyFive));
		etfPrice.addAll(Arrays.asList(txtPrice,txtPrice_1,txtPrice_2,txtPrice_3,txtPrice_4));
		alloftheShares.addAll(Arrays.asList(shareNum,shareNum2,shareNum3,shareNum4,shareNum5));
		priceChange.addAll(Arrays.asList(textChangeOne,textChangeTwo,textChangeThree,textChangeFour,textChangeFive));
		try {
			for (int i = 0; i < symbols.size(); i++) {
				values = GetRequest.sendGet(urlFoundation+symbols.get(i));
				float sharePrice = Decode.getPrice(urlFoundation+symbols.get(i));
				float shareChange = Decode.getChange(urlFoundation+symbols.get(i));
				prices.add(sharePrice);
				priceQuote.add(shareChange);
			}
			for (int i = 0; i < etfPrice.size(); i++) {
				etfPrice.get(i).setText(prices.get(i).toString());
				priceChange.get(i).setText(priceQuote.get(i).toString());
				theMoneyBoxes.get(i).setText(String.valueOf(Float.parseFloat(etfPrice.get(i).getText())*Integer.parseInt(alloftheShares.get(i).getText())));
				stockValue += Double.parseDouble(theMoneyBoxes.get(i).getText());
			}
			System.out.println(stockValue+people.get(choice.getSelectedItem()).getNetWorth());
			if (people.get(choice.getSelectedItem()).getCash()==null) {
				people.get(choice.getSelectedItem()).setCash(0.0);
			}
			netWorth.setText(String.valueOf(stockValue+people.get(choice.getSelectedItem()).getCash()));
			textCash.setText(String.valueOf(people.get(choice.getSelectedItem()).getCash()));
		} catch (Exception e1) {
			
			e1.printStackTrace();
		}		

		
		DefaultPieDataset dataset = new DefaultPieDataset( );
		for (int i = 0; i < etfPrice.size(); i++) {
			
			dataset.setValue(fundNamesTwo.get(i).getText(), new Double(Double.parseDouble(theMoneyBoxes.get(i).getText())));
		}
		System.out.println(dataset);
	    JFreeChart chart = ChartFactory.createPieChart3D(      
	            "Asset Distribution",   
	            dataset,            
	            true,             
	            true, 
	            false);
	   
	    PiePlot3D plot = (PiePlot3D) chart.getPlot();
	    plot.setStartAngle(290);
	    plot.setDirection(Rotation.CLOCKWISE);
	    plot.setForegroundAlpha(0.5f);
	    plot.setNoDataMessage("No data to display");
		ChartPanel pie = new ChartPanel(chart);
		tryThis.add(pie);
		pie.setBounds(0, 0, 293, 272);
		
		
		}
	
	
	
	
	
	
	
	class ItemChangeListener implements ItemListener{
		
	    @Override
	    public void itemStateChanged(ItemEvent event) {
	       if (event.getStateChange() == ItemEvent.SELECTED) {
	 
	          Object item = event.getItem();
	          System.out.println(item.toString());
	          ArrayList<String> theseFunds = new ArrayList<String>();
	  		if (people.get(choice.getSelectedItem()).getName()!=null&&people.get(choice.getSelectedItem()).getRiskLevel()!=null) {
	  			theseFunds = people.get(choice.getSelectedItem()).getRiskLevel().getFunds();
	  		}
	  	
	  		theShares.addAll(Arrays.asList(indexOne,indexTwo,indexThree,indexFour,indexFive));
	  		HashMap<String, Integer> fundsPrices = new HashMap<String,Integer>();
	  		ArrayList<Integer> theSharesNumber = new ArrayList<Integer>();
	  		ArrayList<JTextField> theSharesNumbers = new ArrayList<JTextField>();
	  		theSharesNumbers.addAll(Arrays.asList(shareNum,shareNum2,shareNum3,shareNum4,shareNum5));
	  		fundsPrices =  people.get(choice.getSelectedItem()).getShares();
	  		System.out.println(fundsPrices);
	  	for (int i = 0; i < theseFunds.size(); i++) {
	  		theShares.get(i).setText(theseFunds.get(i));
	  	}
	  	for (int i = 0; i < theSharesNumbers.size(); i++) {
	  		Integer temp = fundsPrices.get(theShares.get(i).getText());
	  		System.out.println(temp);
	  		if (people.get(choice.getSelectedItem()).getName()!=null&&people.get(choice.getSelectedItem()).getRiskLevel()!=null) {
	  			theSharesNumbers.get(i).setText(temp.toString());
	  		}
	  		
	  		
	  	}
	  	
	  	
	  	//put the prices
	  	if (people.get(choice.getSelectedItem()).getName()!=null&&people.get(choice.getSelectedItem()).getRiskLevel()!=null) {
			
	  		
	  		double stockValue = 0;
	  		ArrayList<String> symbols = people.get(choice.getSelectedItem()).getRiskLevel().getFunds();
	  		ArrayList<Float> prices = new ArrayList<Float>();
	  		ArrayList<Float> priceQuote = new ArrayList<Float>();
	  		ArrayList<JTextField> alloftheShares = new ArrayList<JTextField>();
	  		ArrayList<JTextField> etfPrice = new ArrayList<JTextField>();
	  		ArrayList<JTextField> priceChange = new ArrayList<JTextField>();
	  		ArrayList<JTextField> theMoneyBoxes = new ArrayList<JTextField>();
	  		theMoneyBoxes.addAll(Arrays.asList(totalMoneyOne,totalMoneyTwo,totalMoneyThree,totalMoneyFour,totalMoneyFive));
	  		etfPrice.addAll(Arrays.asList(txtPrice,txtPrice_1,txtPrice_2,txtPrice_3,txtPrice_4));
	  		alloftheShares.addAll(Arrays.asList(shareNum,shareNum2,shareNum3,shareNum4,shareNum5));
	  		priceChange.addAll(Arrays.asList(textChangeOne,textChangeTwo,textChangeThree,textChangeFour,textChangeFive));
	  		ArrayList<JTextField> allHomeFields = new ArrayList<JTextField>();
	  		
	  		ArrayList<JTextField> homeFields = new ArrayList<JTextField>();
			homeFields.addAll(Arrays.asList(textCash, netWorth, textChangeOne,textChangeTwo,textChangeThree,textChangeFour,textChangeFive,shareNum,shareNum2,shareNum3,shareNum4,shareNum5,txtPrice,txtPrice_1,txtPrice_2,txtPrice_3,txtPrice_4,totalMoneyOne,totalMoneyTwo,totalMoneyThree,totalMoneyFour,totalMoneyFive));
			for (int j = 0; j < homeFields.size(); j++) {
				homeFields.get(j).setText(df.format(Double.parseDouble(homeFields.get(j).getText())));
			}
	  		
	  		try {
	  			for (int i = 0; i < symbols.size(); i++) {
	  				String values = GetRequest.sendGet(urlFoundation+symbols.get(i));
	  				float sharePrice = Decode.getPrice(urlFoundation+symbols.get(i));
	  				float shareChange = Decode.getChange(urlFoundation+symbols.get(i));
	  				prices.add(sharePrice);
	  				priceQuote.add(shareChange);
	  			}
	  			for (int i = 0; i < etfPrice.size(); i++) {
	  				etfPrice.get(i).setText(prices.get(i).toString());
	  				priceChange.get(i).setText(priceQuote.get(i).toString());
	  				theMoneyBoxes.get(i).setText(String.valueOf(Float.parseFloat(etfPrice.get(i).getText())*Integer.parseInt(alloftheShares.get(i).getText())));
	  				stockValue += Double.parseDouble(theMoneyBoxes.get(i).getText());
	  			}
	  			System.out.println(stockValue+people.get(choice.getSelectedItem()).getNetWorth());
	  			if (people.get(choice.getSelectedItem()).getCash()==null) {
	  				people.get(choice.getSelectedItem()).setCash(0.0);
	  			}
	  			netWorth.setText(String.valueOf(stockValue+people.get(choice.getSelectedItem()).getCash()));
	  		} catch (Exception e1) {
	  			
	  			e1.printStackTrace();
	  		}			
	  		
	  		
	  		df.format(Double.parseDouble(netWorth.getText()));
	  		
	  		
	  		
	  		
	  		
	  		
	  		
	  		
	  		
	  		
	  		ArrayList<JTextField> fundNamesTwo = new ArrayList<JTextField>();
			ArrayList<JTextField> theMoneyBoxesTwo = new ArrayList<JTextField>();
			fundNamesTwo.addAll(Arrays.asList(indexOne,indexTwo,indexThree,indexFour,indexFive));
			theMoneyBoxesTwo.addAll(Arrays.asList(totalMoneyOne,totalMoneyTwo,totalMoneyThree,totalMoneyFour,totalMoneyFive));
			
			tryThis.removeAll();
			tryThis.setVisible(false);
			DefaultPieDataset dataset = new DefaultPieDataset( );
			for (int i = 0; i < theMoneyBoxes.size(); i++) {
				dataset.setValue(fundNamesTwo.get(i).getText(), new Double(Double.parseDouble(theMoneyBoxesTwo.get(i).getText())));
			}
			
		    JFreeChart chart = ChartFactory.createPieChart3D(      
		            "Asset Distribution",   
		            dataset,            
		            true,             
		            true, 
		            false);
		    
		    PiePlot3D plot = (PiePlot3D) chart.getPlot();
		    plot.setStartAngle(290);
		    plot.setDirection(Rotation.CLOCKWISE);
		    plot.setForegroundAlpha(0.5f);
		    plot.setNoDataMessage("No data to display");
			ChartPanel pie = new ChartPanel(chart);
			pie.setBounds(0, 0, 293, 272);
			tryThis.add(pie);
			tryThis.setVisible(true);
			
			contentPane.removeAll();
			contentPane.add(home);
			home.setVisible(true);
	  		
	  		for (int i = 0; i < priceChange.size(); i++) {
				if (Double.parseDouble(priceChange.get(i).getText())<0) {
					priceChange.get(i).setForeground(Color.RED);
				}
				else {
					priceChange.get(i).setForeground(Color.GREEN);
				}
				
			}
	  		
	  		
	  		
	  		
	  		}
	  		ArrayList<JTextField> homeFields = new ArrayList<JTextField>();
	  		homeFields.addAll(Arrays.asList(textCash, netWorth, indexOne, indexTwo, indexThree, indexFour, indexFive, textChangeOne,textChangeTwo,textChangeThree,textChangeFour,textChangeFive,shareNum,shareNum2,shareNum3,shareNum4,shareNum5,txtPrice,txtPrice_1,txtPrice_2,txtPrice_3,txtPrice_4,totalMoneyOne,totalMoneyTwo,totalMoneyThree,totalMoneyFour,totalMoneyFive));
	  		if (people.get(choice.getSelectedItem()).getName()==null||people.get(choice.getSelectedItem()).getRiskLevel()==null) {
				for (int i = 0; i < homeFields.size(); i++) {
					homeFields.get(i).setText("0");
				}
			}
	       }
	       
	      
	   
	    }     
	    
	}
	//get the prices of those securities and display the value
	if (people.get(choice.getSelectedItem()).getName()!=null&&people.get(choice.getSelectedItem()).getRiskLevel()!=null) {
	ArrayList<JTextField> redGreen = new ArrayList<JTextField>();
	
		redGreen.addAll(Arrays.asList(textChangeOne,textChangeTwo,textChangeThree,textChangeFour,textChangeFive));
		ArrayList<JTextField> homeFields = new ArrayList<JTextField>();
		homeFields.addAll(Arrays.asList(textCash, netWorth, textChangeOne,textChangeTwo,textChangeThree,textChangeFour,textChangeFive,shareNum,shareNum2,shareNum3,shareNum4,shareNum5,txtPrice,txtPrice_1,txtPrice_2,txtPrice_3,txtPrice_4,totalMoneyOne,totalMoneyTwo,totalMoneyThree,totalMoneyFour,totalMoneyFive));
		for (int j = 0; j < homeFields.size(); j++) {
			homeFields.get(j).setText(df.format(Double.parseDouble(homeFields.get(j).getText())));
		}
		for (int i = 0; i < redGreen.size(); i++) {
		if (Double.parseDouble(redGreen.get(i).getText())<0) {
			redGreen.get(i).setForeground(Color.RED);
		}
		else {
			redGreen.get(i).setForeground(Color.GREEN);
		}
	
		
	}
	
      
	}
	choice.addItemListener(new ItemChangeListener());
	
	
	

	}
	//end
	
	
	
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
