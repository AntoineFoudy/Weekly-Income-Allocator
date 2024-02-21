import javax.swing.JOptionPane;

public class WeeklyIncome {
    private double netIncome;
    private double spendAmountATM;
    private double investAmount;
    private double currentAccount;
    private double spendAmount;
    private double saveAmount;

    public WeeklyIncome() {
        String netIncomeString = JOptionPane.showInputDialog(null, "What is your net income?");
        String spendAmountATMString = JOptionPane.showInputDialog(null,
                "How much money is in your spending account currently?");

        this.netIncome = Double.parseDouble(netIncomeString);
        this.spendAmountATM = Double.parseDouble(spendAmountATMString);

        // Calculating how the rest of the money gets distrabuted
        investAmount = netIncome * .5;
        currentAccount = netIncome * .25;
        saveAmount = netIncome * .05;

        // Calculate how much money gets transfered to spending account using the fact
        // That I can only spend 100€ a week
        // It also adds the remainder to 2 diffrent accounts
        spendAmount = netIncome * .2;
        if (spendAmount + spendAmountATM >= 100) {
            double getTo100SpendAmount = 100 - spendAmountATM;
            double remainder = spendAmount - getTo100SpendAmount;
            spendAmount = getTo100SpendAmount;
            remainder = remainder * .5;
            investAmount = investAmount + remainder;
            currentAccount = currentAccount + remainder;
        }

        // Puts everything to the nearest 2 decimal places
        investAmount = Math.floor(investAmount * 100) / 100;
        currentAccount = Math.floor(currentAccount * 100) / 100;
        saveAmount = Math.floor(saveAmount * 100) / 100;

    }

    public double getInvestAmount() {
        return investAmount;
    }

    public double getCurrentAccount() {
        return currentAccount;
    }

    public double getSaveAmount() {
        return saveAmount;
    }

    public double getSpendAmount() {
        return spendAmount;
    }

}