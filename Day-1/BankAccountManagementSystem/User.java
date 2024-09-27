package BankAccountManagementSystem;
class User {
  // Private fields for user details
  private String name;
  private int age;
  private String phoneNumber;
  private String email;
  private String address;
  private String bankAccount;
  private String bankName;
  private double balance;

  // Constructor to initialize user details
  public User(String name, int age, String phoneNumber, String email, String address, String bankAccount, String bankName, double balance) {
      this.name = name;
      this.age = age;
      this.phoneNumber = phoneNumber;
      this.email = email;
      this.address = address;
      this.bankAccount = bankAccount;
      this.bankName = bankName;
      this.balance = balance;
  }

  // Getter methods to access user information
  public String getName() {
      return name;
  }

  public int getAge() {
      return age;
  }

  public String getPhoneNumber() {
      return phoneNumber;
  }

  public String getEmail() {
      return email;
  }

  public String getAddress() {
      return address;
  }

  public String getBankAccount() {
      return bankAccount;
  }

  public String getBankName() {
      return bankName;
  }

  public double getBalance() {
      return balance;
  }

  // Method to update balance by adding or deducting amount
  public void updateBalance(double amount) {
      balance += amount;
  }

  // Method to display user details
  public void displayUserDetails() {
      System.out.println("Name: " + name);
      System.out.println("Age: " + age);
      System.out.println("Phone Number: " + phoneNumber);
      System.out.println("Email: " + email);
      System.out.println("Address: " + address);
      System.out.println("Bank Account: " + bankAccount);
      System.out.println("Bank Name: " + bankName);
      System.out.println("Current Balance: $" + balance);
      System.out.println("---------------------------");
  }
}
