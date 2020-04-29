import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * PlayerGUI
 */
public class PlayerGUI extends JFrame{

    public PlayerGUI(final Player player){
        super("First Pokemon");
        final Container container = getContentPane();
        container.setLayout(new BorderLayout());
        final JPanel status = new JPanel();
        status.setLayout(new BoxLayout(status,BoxLayout.Y_AXIS));
        final JLabel playerLabel =new JLabel("Name : " + player.getName());
        final JLabel playerLV = new JLabel("Level : " + player.getlvl() + "  EXP : " + player.getexp());
        final JLabel playerHP = new JLabel("HP : " + player.gethp() + " / " + player.getmaxHp());
        final JLabel playerMp = new JLabel("MP : " + player.getMp() + " / " + player.getMaxMp());
        status.add(playerLabel);
        status.add(playerLV);
        status.add(playerHP);
        status.add(playerMp);
        final JPanel northJPanel = new JPanel();
        northJPanel.setLayout(new GridLayout(1,2));
        northJPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        final ImageIcon iconlogo =new ImageIcon("Logo.png");
        final JLabel logo = new JLabel(iconlogo);
        northJPanel.add(logo);
        northJPanel.add(status);
        container.add(northJPanel, BorderLayout.NORTH);
        final ImageIcon iconcha = new ImageIcon(player.getPic());
        final JLabel chaPic = new JLabel(iconcha);
        container.add(chaPic, BorderLayout.CENTER);
        final JButton goFight = new JButton("Go Fight");
        final JButton bag = new JButton("Bag");
        final JButton changePoke =new JButton("Change Pokemon");
        final JButton pokestus =new JButton("Pokemon Status");
        final JPanel select = new JPanel();
        select.setLayout(new FlowLayout());
        select.add(goFight);
        select.add(bag);
        select.add(changePoke);
        select.add(pokestus);
        container.add(select,BorderLayout.SOUTH);
        
        goFight.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                new MonsterSelect(player);
                dispose();
            }
        });
        
        bag.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                new BagGUI(player,1);
                dispose();
            }
        });

    
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}