
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class Main extends JFrame implements ActionListener {

    private JTextField numField;
    private JLabel resultLabel;
 
// paarqitja grafike
    public Main() {
        setTitle("Hapesira Maksimale");
        setSize(500, 100);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        numField = new JTextField(10);
        add(numField);

        JButton calcButton = new JButton("Kalkuloni hapesiren");
        calcButton.addActionListener(this);
        add(calcButton);

        resultLabel = new JLabel("Siperfaqja: ");
        add(resultLabel);
   
   
    }

    public void actionPerformed(ActionEvent e) {
        
// shtypim hapesiren te cilen e mbushim me shtylla
        String numString = numField.getText();
        int num = Integer.parseInt(numString);
        Random rand = new Random();
        int[] numbers = new int[num];
// hapesira merr shtylla me gjatesi te rendomte jo me te madhe se 10
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(10);
        }

        BruteForce s1= new BruteForce();
        twoPointer s2= new twoPointer();
        
        int result1 = s1.maxArea(numbers);
        int result2 = s2.maxArea(numbers);

// poshte paraqiten shtyllat dhe gjatesia e tyre
        for(int i=0;i<numbers.length;i++){
        System.out.println("Shtylla me indeks "+i+" ka gjatesine "+numbers[i]+" njesi");
    }
//Shtypet hapesira maksimale me rezultate nga dy metodat
     resultLabel.setText("<html>BruteForce: " + result1+"\n"+"<br>TwoPointer:"+result2+"</html>");
    }

    public static void main(String[] args) {
        Main frame = new Main();
        frame.setVisible(true);

    }
}
