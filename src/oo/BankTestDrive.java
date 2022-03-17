package oo;

public class BankTestDrive {
    public static void main(String[] args) {
        
        //employee
        Employee employee = new Employee();
 
        employee.getEmName();
        employee.getSalary();

        //customer
        Customer customer = new Customer();
        customer.getCusInfo();


        //account
        Account account;
        account = new Account();
        account.show();
        account.depoist();
        account.show();
        account.withdraw();
        account.show();
    }
    
}
