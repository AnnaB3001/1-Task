import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame{
    private JButton buttonCalc;
    private JTextField textFieldSeconds;
    private JTextField textFieldMinutes;
    private JTextField textFieldHours;
    private JPanel panelGUI;
    private JTextArea textAreaResult;
    OutTime dt = new OutTime();
    public GUI(){
        setContentPane(panelGUI);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(1000,600);
        setVisible(true);
        textFieldSeconds.setText("0");
        textFieldMinutes.setText("0");
        textFieldHours.setText("0");

        buttonCalc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    dt.addSec(Integer.parseInt(textFieldSeconds.getText()));
                    dt.addMins(Integer.parseInt(textFieldMinutes.getText()));
                    dt.addHours(Integer.parseInt(textFieldHours.getText()));
                }catch (Exception e){
                    e.printStackTrace();
                }

                textAreaResult.append(dt.getValue() + "\n");
            }
        });
    }
}
