import javax.swing.JOptionPane;
public class FirstDegreeEquation1 {
    public static void main(String[] args) {
        String aStr = JOptionPane.showInputDialog("Nhap a:");
        String bStr = JOptionPane.showInputDialog("Nhap b:");

        double a = Double.parseDouble(aStr);
        double b = Double.parseDouble(bStr);

        double x = -b/a;

        JOptionPane.showInputDialog(null, "Ket qua la: " + x);

        System.exit(0);
    }
}
