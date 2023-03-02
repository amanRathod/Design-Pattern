package amanrathod.pro.InnerAndNestedClass;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Account accountFrom = new Account(1);
        Account accountTo = new Account(2);

        accountFrom.sendMoneyToAccount(accountTo, 5556);
        accountFrom.withdrawMoney(1000);

        System.out.println(Arrays.toString(accountFrom.getTransactions()));
        System.out.println(Arrays.toString(accountTo.getTransactions()));
    }
}
