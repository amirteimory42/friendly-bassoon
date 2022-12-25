import javax.swing.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();

        int count=0;
        int x = rand.nextInt(10);
        boolean flag =true;
        while (flag){
            String entekhab = JOptionPane.showInputDialog(null, "1)run game \n 2)Exit");
            switch (entekhab){
                case "1":
                    String p = JOptionPane.showInputDialog(null, "enter 1 ta 10");
                    Integer.parseInt(p);

                    count++;
                    if (count==3){
                        JOptionPane.showMessageDialog(null,"you lose");
                        flag = false;
                        break;
                    }
                    if(Integer.parseInt(p) == x){
                        JOptionPane.showMessageDialog(null,"youuuuu woooonnnnnnnn");
                        flag =false;
                    } else if (Integer.parseInt(p) > x) {
                        JOptionPane.showMessageDialog(null,">");
                    } else if (Integer.parseInt(p) < x) {
                        JOptionPane.showMessageDialog(null,"<");
                    }
                    break;
                case "2":
                    JOptionPane.showMessageDialog(null,"good bay my love@@");
                    flag =false;
                    break;
            }
        }


    }
}