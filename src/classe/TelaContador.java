package classe;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JSlider;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaContador {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaContador window = new TelaContador();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaContador() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u00CDnicio");
		lblNewLabel.setBounds(25, 30, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Fim");
		lblNewLabel_1.setBounds(25, 57, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Passo");
		lblNewLabel_2.setBounds(25, 93, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JSlider sliInicio = new JSlider();
		
		sliInicio.setValue(0);
		sliInicio.setMaximum(5);
		sliInicio.setBounds(98, 18, 200, 26);
		frame.getContentPane().add(sliInicio);
		
		JSlider sliFim = new JSlider();
		
		sliFim.setValue(0);
		sliFim.setMaximum(6);
		sliFim.setBounds(98, 45, 200, 26);
		frame.getContentPane().add(sliFim);
		
		JSlider sliPasso = new JSlider();
		
		sliPasso.setValue(1);
		sliPasso.setMaximum(4);
		sliPasso.setMinimum(1);
		sliPasso.setBounds(98, 82, 200, 26);
		frame.getContentPane().add(sliPasso);
		
		JList lstCont = new JList();
		
		JButton btnCont = new JButton("Contar");
		btnCont.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int i=sliInicio.getValue();
				int f=sliFim.getValue();
				int p=sliPasso.getValue();
				DefaultListModel<Integer> lista=new DefaultListModel<Integer>();
				for(int c=i;c<=f;c+=p) {
					lista.addElement(c);
				}
			lstCont.setModel(lista);	
			}
			
		});
		btnCont.setBounds(143, 159, 89, 23);
		frame.getContentPane().add(btnCont);
		
		
		lstCont.setBounds(344, 181, 1, 1);
		frame.getContentPane().add(lstCont);
		
		JLabel lblInicio = new JLabel("0");
		lblInicio.setBounds(324, 18, 46, 14);
		frame.getContentPane().add(lblInicio);
		
		JLabel lblFim = new JLabel("6");
		lblFim.setBounds(324, 44, 46, 14);
		frame.getContentPane().add(lblFim);
		
		JLabel lblPasso = new JLabel("1");
		lblPasso.setBounds(324, 82, 46, 14);
		frame.getContentPane().add(lblPasso);
		sliInicio.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				int i=sliInicio.getValue();
				lblInicio.setText(Integer.toString(i));
			}
		});
		sliFim.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				int f=sliFim.getValue();
				lblFim.setText(Integer.toString(f));
			}
		});
		sliPasso.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				int p=sliPasso.getValue();
				lblPasso.setText(Integer.toString(p));
			}
		});
	}
}
