           static class BankAccount {

            private int accountNumber;
            private String customerName;
            private double balance;

            public BankAccount(int accountNumber, String customerName, double balance) {
                this.accountNumber = accountNumber;
                this.customerName = customerName;
                this.balance = balance;
            }

            public double getBalance() {
                return balance;
            }

            public void setBalance(double balance) {
                this.balance = balance;
            }

            public void displayAccount() {
                System.out.println("Account Number: " + accountNumber);
                System.out.println("Customer Name: " + customerName);
                System.out.println("Balance: $" + balance);
            }
        }

        public static void main(String[] args) {

            BankAccount account =
                    new BankAccount(1001, "amiira", 500);

            account.displayAccount();

            account.setBalance(800);

            System.out.println("New Balance: $" + account.getBalance());
        }

