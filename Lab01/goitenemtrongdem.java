import javax.swing.JOptionPane;
public class goitenemtrongdem {
    public static void main(String[] args){
        String name = JOptionPane.showInputDialog("Nhập tên của bạn:");
        JOptionPane.showMessageDialog(null, "Xin chào " + name);
    }
}