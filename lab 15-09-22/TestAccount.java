class Account
{  
      int acc_no;  
      String name;  
      float amount;  
 
      void insert(int a,String n,float amt)                                                                            //Method to initialize object  
    {  
        acc_no=a;  
        name=n;  
        amount=amt;  
    }  

        void deposit(float amt)                                                                                         //deposit method  
       {  
           amount=amount+amt;  
           System.out.println(amt+" deposited");  
       }  

        void withdraw(float amt)                                                                                      //withdraw method 
        {  
         if(amount<amt)
       {  
            System.out.println("Insufficient Balance");  
       }else

      {  
         amount=amount-amt;  
         System.out.println(amt+" withdrawn");  
        }  
    }  
 
        void checkBalance(){System.out.println("Balance is: "+amount);}                             //method to check the balance of the account  
  
        void display(){System.out.println(acc_no+" "+name+" "+amount);}                             //method to display the values of an object
    }  

       class TestAccount                                                                                            //Creating a test class to deposit and withdraw amount  
      {                                                                  
             public static void main(String[] args)
      {  
        Account a1=new Account();  
       a1.insert(832345,"Prathamesh",1000);  
       a1.display();  
       a1.checkBalance();  
       a1.deposit(40000);  
        a1.withdraw(15000);  
      a1.checkBalance();  
    }
}   