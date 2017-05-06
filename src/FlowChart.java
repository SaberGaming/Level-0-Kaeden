import javax.swing.JOptionPane;

public class FlowChart {

public static void main(String[] args) {
int happy=JOptionPane.showConfirmDialog(null, "Are you happy?");


int want=0;
if (happy==0) {
	JOptionPane.showMessageDialog(null, "Keep Doing Whatever You're Doing.");
	System.exit(0);
} else{
want = JOptionPane.showConfirmDialog(null,"Do You Want To Be Happy?");
}

if (want==1) {
	JOptionPane.showMessageDialog(null, "Keep Doing Whatever You're Doing.");
} else {
JOptionPane.showMessageDialog(null, "Change Something.");
}
















}
}
