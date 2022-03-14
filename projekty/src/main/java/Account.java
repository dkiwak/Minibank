import java.util.Scanner;

public class Account {

    private int accountNo;
    private String accountName;
    private String accountSurname;
    private long balance;

    Scanner scanner = new Scanner(System.in);

    public Account(int accountNo, String accountName, String accountSurname, long balance) {
        this.accountNo = accountNo;
        this.accountName = accountName;
        this.accountSurname = accountSurname;
        this.balance = balance;

        }
        public Account() {
        }


        public int getAccountNo() {
            return accountNo;
        }

        public void setAccountNo(int accountNo) {
            this.accountNo = accountNo;

        }

        public void openAccount(){
            System.out.println("podaj numer konta");
            accountNo= scanner.nextInt();
            System.out.println("podaj imię");
            accountName= scanner.next();
            System.out.println("podaj nazwisko");
            accountSurname= scanner.next();
            System.out.println("podaj balance");
            balance= scanner.nextInt();

        }

    }

