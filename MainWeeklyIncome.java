import javax.swing.JOptionPane;

public class MainWeeklyIncome {

    public static void main(String[] args) {
        WeeklyIncome weeklyincome = new WeeklyIncome();

        double invest = weeklyincome.getInvestAmount();
        double current = weeklyincome.getCurrentAccount();
        double save = weeklyincome.getSaveAmount();
        double spend = weeklyincome.getSpendAmount();

        JOptionPane.showMessageDialog(null, "The following transactions are listed bellow\n" +
                "Your spending money is " + spend + "\n" +
                "Your investing money is " + invest + "\n" +
                "The money staying in your current account is " + current + "\n" +
                "Your saving money is " + save + "\n");
    }
}