package com.capgemini.paymentapp.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import com.capgemini.paymentapp.bean.PaymentApp;
import com.capgemini.paymentapp.exception.InvalidInputExp;
import com.capgemini.paymentapp.service.PaymentAppService;
import com.capgemini.paymentapp.service.PaymentAppValidate;

public class Customer 
{
	public static void main(String args[]) 
	{
		int choice = 1;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		PaymentAppService service = new PaymentAppService();
		PaymentAppValidate validate = new PaymentAppValidate();
		System.out.println("\t\t  ----------------------------------");
		System.out.println("\t\t\tPAYMENT BANK APPLICATION");
		System.out.println("\t\t  ----------------------------------");
	do
		{ System.out.println("_________________________________________");
		  System.out.println("1. CREATE ACCOUNT\t2. LOG IN ");
		  System.out.println("_________________________________________");
			try {
				System.out.println("Enter your choice");
				  choice = Integer.parseInt(br.readLine());
			      switch (choice) 
			      {
				   case 1:PaymentApp pa = new PaymentApp();
					   boolean b = false;

					System.out.println("Enter your name:");
					String customerName = br.readLine();

					System.out.println("Enter your age:");
					int age = Integer.parseInt(br.readLine());

					System.out.println("Enter your Phone Number:");
					String phoneNumber = br.readLine();

					System.out.println("Enter your address:");
					String address = br.readLine();

					System.out.println("Enter your Gender:");
					String gender = br.readLine();

					System.out.println("Enter your balance:");
					double balance = Double.parseDouble(br.readLine());
					System.out.println("Enter your User ID :");
					String user_ID = br.readLine();
					System.out.println("Enter your password:");
					String password = br.readLine();

					LocalDate aod = LocalDate.now();
					long accountNumber = (long) (Math.random() * 1000000000);
					pa.setCustomerName(customerName);
					pa.setAge(age);
					pa.setAddress(address);
					pa.setPhoneNumber(phoneNumber);
					pa.setAod(aod);
					pa.setAccountNumber(accountNumber);
					pa.setGender(gender);
					pa.setUser_ID(user_ID);
					pa.setPassword(password);
					pa.setBalance(balance);

					
					boolean b1 = validate.validatePhoneNo(phoneNumber);
					boolean b2 = validate.validateCustomerName(customerName);
					if (b1 && b2)
					  {
						b = service.createAccount(pa);
					  } 
					else
					{
						System.out.println(
								"Sorry!!! the input is invalid(phone number is incorrect or name shold not be null");
					}

					if (b)
					{
						System.out
								.println("Account Created successfully  and your account number is::'" + accountNumber);
					} else 
					{
						try 
						{
							throw new InvalidInputExp();
						} catch (InvalidInputExp e)
						{
							System.out.println("Account Creation is failed!!!!!!!!!");
						}
					}
					break;
					
				case 2:int choice1 = 1;
					
					boolean valid = false;
					System.out.println("Enter your UserId");
					String user_ID1 = br.readLine();
					System.out.println("Enter your Password");
					String password1 = br.readLine();
					valid = service.logIn(user_ID1, password1);
					if (valid) 
					{
						do
						{
						
                            System.out.println("\n\n");
							System.out.println("Select any option:");
							System.out.println("_____________________________________________________________");
							System.out.println("|1. SHOW BALANCE                              2.DEPOSIT      |");
							System.out.println("|3. WITHDRAW                                  4.FUND TRANSFER|");
							System.out.println("|5. PRINT TRANSCATION                         6.EXIT         |");
							System.out.println("|____________________________________________________________|");
							System.out.println("Enter your choice");
							choice1 = Integer.parseInt(br.readLine());

							switch (choice1) 
							{
							case 1:
								System.out.println("Account balance:");
								double d = service.showBalance();
								System.out.println(d);
								break;

						     case 2:
								double amt;
								System.out.println("Enter Your amount:");
								amt = Double.parseDouble(br.readLine());
								boolean b5 = service.deposite(amt);
								if (b5) {
									System.out.println("Amount deposited");
								} else
								{
									System.out.println("Transaction is failed!!!!");
								}
								break;
							case 3:
								double amt1;
								System.out.println("Enter Your amount:");
								amt1 = Double.parseDouble(br.readLine());
								boolean d1 = service.withdraw(amt1);
								if (d1) {
									System.out.println("Amount withdraw");
								} else
									System.out.println("Transaction is failed!!!!");
								break;

							case 4:
								long acc_num4;
								double amt2;

								System.out.println("Enetr Receiver Account Number");
								acc_num4 = Long.parseLong(br.readLine());
								System.out.println("Enter Your amount:");
								amt2 = Double.parseDouble(br.readLine());
								boolean b6 = service.fundTransfer(acc_num4, amt2);
								if (b6) {
									System.out.println("Your amount is transferred successfully!!!");
								} else
									System.out.println("Transaction is failed!!!!");
								break;

							case 5:Map<String,Double> transaction1 = new HashMap<String, Double>();
                               transaction1= service.printTranscation();
                               System.out.println(transaction1);
                               
								break;
							case 6:
								System.out.println("Thank You!!!!!!!!!!!");
								break;
							}
						}while(choice1!=6);
						}
					
					 else
					 {
						System.out.println("Invalid choice!!!!!");
					 }
					break;
					
				default: System.out.println("thank you");
					break;
			      }
					System.out.println(
							"---------------------------------------------------------------------------------\n");
				}

	catch (NumberFormatException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();

			}
		}while(choice!=3);

	}

}
