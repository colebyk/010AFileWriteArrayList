import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class OutWriteArrayList {

	public static void main(String[] args) {
		
		File fileName = new File("/home/compsci/eclipse-workspace/textFiles/MyFriends.txt");
		ArrayList aList = new ArrayList();
		String friends = " ";
		
		while (!friends.isEmpty()) {
			friends = JOptionPane.showInputDialog("Name a friend please");
			if (!friends.isEmpty()) {
				aList.add(friends);
			}
		}
		
		try {
			FileWriter fw = new FileWriter(fileName);
			Writer output = new BufferedWriter(fw);
			int sz = aList.size();
			for (int i = 0; i < sz; i++) {
				output.write(aList.get(i).toString() + "\n");
			}
			output.close();
		}
		catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Cannot create that file");
			
		}
	}
}
