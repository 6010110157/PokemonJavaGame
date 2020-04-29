import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



/**
 * MonsterSelect
 */
public class MonsterSelect extends JFrame{

    public MonsterSelect(Player player){
        super("NoNameGame_SelectMonster");
        Container container = getContentPane();
        container.setLayout(new GridLayout(2,3));
        JPanel mon1 = new JPanel();
        JPanel mon2 = new JPanel();
        JPanel mon3 = new JPanel();
        JPanel mon4 = new JPanel();
        mon1.setLayout(new GridLayout(2,1));
        mon2.setLayout(new GridLayout(2,1));
        mon3.setLayout(new GridLayout(2,1));
        mon4.setLayout(new GridLayout(2,1));
        container.add(mon1);
        container.add(mon2);
        container.add(mon3);
        container.add(mon4);
        mon1.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        mon2.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        mon3.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        mon4.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        ImageIcon icon1 =new ImageIcon("Bulbasaur.png");
        ImageIcon icon2 =new ImageIcon("Hoothoot.png");
        ImageIcon icon3 =new ImageIcon("Shellos.png");
        ImageIcon icon4 =new ImageIcon("Torchic.png");
        JLabel label1 =new JLabel(icon1);
        JLabel label2 =new JLabel(icon2);
        JLabel label3 =new JLabel(icon3);
        JLabel label4 =new JLabel(icon4);
        mon1.add(label1);
        mon2.add(label2);
        mon3.add(label3);
        mon4.add(label4);
        JButton button1 =new JButton("Bulbasaur Lv.1");
        JButton button2 =new JButton("Hoothoot Lv.5");
        JButton button3 =new JButton("Shellos LV.10");
        JButton button4 =new JButton("Torchic lv.15");
        JPanel set1 =new JPanel();
        JPanel set2 =new JPanel();
        JPanel set3 =new JPanel();
        JPanel set4 =new JPanel();
        set1.add(button1);
        set2.add(button2);
        set3.add(button3);
        set4.add(button4);
        mon1.add(set1);
        mon2.add(set2);
        mon3.add(set3);
        mon4.add(set4);
        
        button1.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                new BattleArena(player, new Bulbasaur());
                dispose();
            }
        });
        button2.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                new BattleArena(player, new Hoothoot());
                dispose();
            }
        });
        button3.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                new BattleArena(player, new Shellos());
                dispose();
            }
        });
        button4.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                new BattleArena(player, new Torchic());
                dispose();
            }
        });
        pack();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}