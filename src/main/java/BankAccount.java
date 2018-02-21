import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class BankAccount {

    //Class and instance variables.

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */
    public enum BankAccountType {
        /**
         * A checking account.
         */
        CHECKINGS,
        /**
         * A savings account.
         */
        SAVINGS,
        /**
         * A student account.
         */
        STUDENT,
        /**
         * A workplace account.
         */
        WORKPLACE
    }

    /**
     * Account number.
     */
    private int accountNumber;
    /**
     * Bank account type.
     */
    private BankAccountType accountType;
    /**
     * Bank account balance.
     */
    private double accountBalance;
    /**
     * Bank account owner name.
     */
    private String ownerName;
    /**
     * Bank account interest rate.
     */
    private double interestRate;

    /**
     * Bank account interest earned.
     */
    private double interestEarned;

    //Constructors.

    /**
     * Constructor to create a new bank account.
     * @param name the name of the bank account holder.
     * @param accountCategory the category of the bank account.
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {

        this.ownerName = name;

        accountType = accountCategory;

    }

    //Getters.

    /**
     * get the account number.
     * @return account number.
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * get the account type.
     * @return account type.
     */
    public BankAccountType getAccountType() {
        return accountType;
    }

    /**
     * get the account balance.
     * @return account balance.
     */
    public double getAccountBalance() {
        return accountBalance;
    }

    /**
     * get the owner name.
     * @return the owner name.
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * get the interest rate.
     * @return interest rate.
     */
    public double getInterestRate() {
        return interestRate;
    }

    /**
     * get the interest earned.
     * @return the interest earned.
     */
    public double getInterestEarned() {
        return interestEarned;
    }

    //Setters.

    /**
     * Set the account number.
     * @param accountNumber the account number to set.
     */
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * Set the account type.
     * @param accountType the account type to set.
     */
    public void setAccountType(BankAccountType accountType) {
        this.accountType = accountType;
    }

    /**
     * Set the account balance.
     * @param accountBalance the account balance to set.
     */
    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    /**
     * Set the owner name.
     * @param ownerName The owner name to set.
     */
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    /**
     * Set the interest rate.
     * @param interestRate the interest rate to set.
     */
    public void setInterestRate(final double interestRate) {
        this.interestRate = interestRate;
    }

    /**
     * Set the interest earned.
     * @param interestEarned the interest earned to set.
     */
    public void setInterestEarned(double interestEarned) {
        this.interestEarned = interestEarned;
    }
}