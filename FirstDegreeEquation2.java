import javax.swing.JOptionPane;

public class FirstDegreeEquation2 {
    public static void main(String[] args) {

        double a11 = Double.parseDouble(JOptionPane.showInputDialog("Nhap a11:"));
        double a12 = Double.parseDouble(JOptionPane.showInputDialog("Nhap a12:"));
        double b1  = Double.parseDouble(JOptionPane.showInputDialog("Nhap b1:"));

        double a21 = Double.parseDouble(JOptionPane.showInputDialog("Nhap a21:"));
        double a22 = Double.parseDouble(JOptionPane.showInputDialog("Nhap a22:"));
        double b2  = Double.parseDouble(JOptionPane.showInputDialog("Nhap b2:"));

        double D  = a11 * a22 - a21 * a12;
        double D1 = b1 * a22 - b2 * a12;
        double D2 = a11 * b2 - a21 * b1;

        String result;

        if (D != 0) {
            double x = D1 / D;
            double y = D2 / D;
            result = "He co nghiem duy nhat:\nx = " + x + "\ny = " + y;
        } else {
            if (D1 == 0 && D2 == 0) {
                result = "He co vo so nghiem";
            } else {
                result = "He vo nghiem";
            }
        }

        JOptionPane.showMessageDialog(null, result);
        System.exit(0);
    }
}