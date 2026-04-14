import javax.swing.JOptionPane;

public class DoubleNumbers {
    public static void main(String[] args) {
        String strNum1 = JOptionPane.showInputDialog("Nhap so thu nhat:");
        String strNum2 = JOptionPane.showInputDialog("Nhap so thu hai:");

        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);

        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;

        double result;

        if(num2 != 0){
            double quotient = num1 / num2;
            result = sum + difference + product + quotient;
        } else {
            result = sum + difference + product;
        }

        JOptionPane.showMessageDialog(null, "Ket qua: " + result);
        System.exit(0);
    }
}