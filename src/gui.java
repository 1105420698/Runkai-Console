import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class gui {
    public static void main(String args[]) {

        //Creating the Frame
        JFrame frame = new JFrame("Runkai's Terminal Console");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        
        //Creating the MenuBar and adding components
        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("File");
        JMenu m2 = new JMenu("Help");
        mb.add(m1);
        mb.add(m2);
        JMenuItem m11 = new JMenuItem("Open");
        JMenuItem m22 = new JMenuItem("Save as");
        m1.add(m11);
        m1.add(m22);
        
        // Text Area at the Center
        JTextArea ta = new JTextArea();
        ta.setEditable(false);

        //Creating the panel at bottom and adding components
        JPanel panel = new JPanel(); // the panel is not visible in output
        JLabel label = new JLabel("Enter Command");
        JTextField tf = new JTextField(10); // accepts up to 10 characters
        JButton send = new JButton("Send");
        JButton reset = new JButton("Reset");
        ActionListener actionListener = new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
            	
            	Object sender = actionEvent.getSource();
            	
            	if (sender == reset) {
                	System.out.println("Reset");
                	ta.setText(null);
                	tf.setText(null);
            	} else if (sender == send) {
            		if (tf.getText() != null || tf.getText() != "") {
            	    	System.out.println("Send");
            			ta.append(tf.getText());
            			ta.append("\n");
            			tf.setText(null);
            		}
            	}
            }
        };
        
        reset.addActionListener(actionListener);
        send.addActionListener(actionListener);
        panel.add(label);
        panel.add(tf);
        panel.add(send);
        panel.add(reset);

        //Adding Components to the frame.
        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.getContentPane().add(BorderLayout.NORTH, mb);
        frame.getContentPane().add(BorderLayout.CENTER, ta);
        frame.setVisible(true);
    }
}