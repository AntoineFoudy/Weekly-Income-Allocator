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

        // Calculate how much money gets transfered to spending account using the fact
        // that I can only spend 100€ a week
        spendAmount = netIncome * .2;
        if (spendAmount + spendAmountATM >= 100) {
            spendAmount = 100 - spendAmountATM;
        }

        // Calculating how the rest of the money gets distrabuted
        // Puts everything to the nearest 2 decimal places
        investAmount = Math.floor((netIncome * .5) * 100) / 100;
        currentAccount = Math.floor((netIncome * .25) * 100) / 100;
        saveAmount = Math.floor((netIncome * .05) * 100) / 100;

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