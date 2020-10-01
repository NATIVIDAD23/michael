import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.event.KeyListener;
import javax.swing.table.DefaultTableModel;
public class Main extends JFrame implements ActionListener{ 
    static  JPanel p;
       Object[] row = new Object[8];
       DefaultTableModel table;
       JTable table1= new JTable();
       JScrollPane pane = new JScrollPane(table1);
       JLabel c1=new JLabel("N/A");
       JLabel c2=new JLabel("N/A");
       JLabel c3=new JLabel("N/A");
       JLabel c4=new JLabel("N/A");
       JLabel c5=new JLabel("N/A");
       JLabel c6=new JLabel();
     static  JLabel num1= new JLabel();
        JCheckBox d1,d2,d3,d4,d5;
        ButtonGroup h,g;
        JRadioButton swc,cwr,ramen,feggwr,sinwc;
       static JTextField pay1,change1,total1;
        JComboBox ic,how,fav;
        JButton Buy,Clear,Exit;
        String icecream[]={"Choose","Extra Small","Small","Medium","Large","Extra Large"};
        String num[]={"Choose","1","2","3","4","5","6","7","8","9"};
        String flavor[]={"Choose","Manggo","Ube","Cheeze","All"};
        public Main(){
           JFrame f= new JFrame("Michael");
           //Swing✓
           JLabel display = new JLabel("Michael's Restaurant");
           display.setFont(new Font(Font.SERIF,Font.ITALIC,60));
     Font font = new Font("Verdana",Font.BOLD,12);
             p= new JPanel();
             JLabel foodout,ic1,total,pay,change,drink;
            JToggleButton back = new JToggleButton("Dark Mode");
             total= new JLabel("Total");
             total1= new JTextField();
             pay = new JLabel("Insert Money");
             pay1=new JTextField();
             change=new JLabel("Change");
             change1=new JTextField();
             total1.setHorizontalAlignment(JTextField.CENTER);
             change1.setHorizontalAlignment(JTextField.CENTER);
             pay1.setHorizontalAlignment(JTextField.CENTER);
            
             drink= new JLabel("DRINKS");
             foodout = new JLabel("FOODS");
             swc = new JRadioButton("Spaghetti/chicken",false);
             cwr = new JRadioButton("Chicken/rice",false);
             ramen = new JRadioButton("Ramen");
             feggwr = new JRadioButton("FriedEgg/rice",false);
             sinwc = new JRadioButton("Sinangag/chicken",false);
             Object[] table2={"Food","Drink","Size","Order/s","Flavor","Total","Money","Change"};
            table=new DefaultTableModel();
             table.setColumnIdentifiers(table2);
             table1.setModel(table);
             ic1=new JLabel("ICE CREAM");
             ic=new JComboBox(icecream);
             fav= new JComboBox(flavor);
             how = new JComboBox(num);
             d1=new JCheckBox("Coke",false);
             d2=new JCheckBox("Sprite",false);
             d3=new JCheckBox("Royal",false);
             d4=new JCheckBox("Lemonade",false);
             d5=new JCheckBox("Special Buko",false);
             h =new ButtonGroup();
             h.add(d1); h.add(d2); h.add(d3); h.add(d4); h.add(d5);
        
             Buy = new JButton("Buy");
             Clear= new JButton("Clear all");
             Exit= new JButton("Exit");
             g= new ButtonGroup();
             g.add(swc);g.add(cwr);g.add(ramen);
             g.add(feggwr);g.add(sinwc);
             //Location
             swc.setBounds(10,170,170,30);
             cwr.setBounds(10,200,170,30);
             ramen.setBounds(10,230,170,30);
             feggwr.setBounds(10,260,170,30);
             sinwc.setBounds(10,290,170,30);
             foodout.setBounds(70,130,100,50);
             total.setBounds(80,325,100,30);
             total1.setBounds(10,350,170,30);
             pay.setBounds(300,325,100,30);
             pay1.setBounds(260,350,170,30);
             change.setBounds(555,325,100,30);
             change1.setBounds(500,350,170,30);
             drink.setBounds(320,130,100,50);
             d1.setBounds(260,170,170,30);
             d2.setBounds(260,200,170,30);
             d3.setBounds(260,230,170,30);
             d4.setBounds(260,260,170,30);
             d5.setBounds(260,290,170,30);
             ic1.setBounds(555,130,100,50);
             ic.setBounds(500,170,170,30);
             fav.setBounds(500,285,170,30);
             how.setBounds(500,230,170,30);
             Buy.setBounds(10,400,170,30);
             Clear.setBounds(230,400,100,30);
             Exit.setBounds(360,400,100,30);
             back.setBounds(500,400,170,30);
             display.setBounds(10,10,700,100);
             num1.setBounds(360,360,200,30);
             pane.setBounds(10, 435, 660,100);
             c6.setBounds(280,370,150,30);
             //SetFonts
             total1.setFont(font);
             pay1.setFont(font);
             change1.setFont(font);
             //SetColor
             table1.setBackground(Color.WHITE);
             table1.setForeground(Color.BLUE);
             Font fonts = new Font("",1,10);
             table1.setFont(fonts);
             table1.setRowHeight(15);
             display.setForeground(Color.BLUE);
             foodout.setForeground(Color.BLUE);
             drink.setForeground(Color.BLUE);
             ic1.setForeground(Color.BLUE);
             total.setForeground(Color.BLUE);
             pay.setForeground(Color.BLUE);
             change.setForeground(Color.BLUE);
             Buy.setBackground(Color.WHITE);
             Exit.setBackground(Color.WHITE);
             Clear.setBackground(Color.WHITE);
             back.setBackground(Color.WHITE);
             total1.setBackground(Color.WHITE);
             pay1.setBackground(Color.WHITE);
             change1.setBackground(Color.WHITE);
             total1.setForeground(Color.BLUE);
             pay1.setForeground(Color.BLUE);
             change.setForeground(Color.BLUE);
             Buy.setForeground(Color.BLUE);
             Clear.setForeground(Color.BLUE);
             Exit.setForeground(Color.BLUE);
             back.setForeground(Color.BLUE);
             c6.setForeground(Color.BLUE);
             //Action
             newClass c=new newClass();
             swc.addItemListener(c);
             cwr.addItemListener(c);
             ramen.addItemListener(c);
             feggwr.addItemListener(c);
             sinwc.addItemListener(c);
             d1.addItemListener(c);
             d2.addItemListener(c);
             d3.addItemListener(c);
             d4.addItemListener(c);
             d5.addItemListener(c);
             ic.addItemListener(c);
             how.addItemListener(c);
             fav.addItemListener(c);
             Buy.addActionListener(this);
             Exit.addActionListener(this);
             Clear.addActionListener(this);
  back.addActionListener(new ActionListener(){  
public void actionPerformed(ActionEvent e){  
        if(back.isSelected()){
               back.setText("Dark Mode/On");
               p.setBackground(Color.BLACK);
        }
        else{
               back.setText("Dark Mode/Off");
              back.setBackground(Color.WHITE);
               p.setBackground(Color.WHITE);
        }     
}  
}); 
pay1.addKeyListener(new KeyAdapter() {
 public void keyPressed(KeyEvent e) {
    String number=pay1.getText();
    int length=number.length();
      char a= e.getKeyChar();
       if(!(Character.isDigit(a)||(a==KeyEvent.VK_BACK_SPACE)||a==KeyEvent.VK_DELETE)){
         c6.setText("Leters is not allowed");
         }
        
         else{
          if(length>5){
          c6.setText("Money is a Lot");
          }
           else{
        
          c6.setText("");
      }
      c6.setText("");
         }
 }
});
           //adding to Panel/frame✓
             p.setBackground(Color.WHITE);
             p.add(display);
             p.add(c6);
             p.add(pane);
             p.add(num1);
             p.add(back);
             p.add(how);
             p.add(Buy);
             p.add(Clear);
             p.add(Exit);
             p.add(drink);
             p.add(ic);
             p.add(ic1);
             p.add(fav);
             p.add(drink);
             p.add(d1);
             p.add(d2);
             p.add(d3);
             p.add(d4);
             p.add(d5);
             p.add(total);
             p.add(total1);
             p.add(pay);
             p.add(pay1);
             p.add(change);
             p.add(change1);
             p.add(swc);
             p.add(cwr);
             p.add(ramen);
             p.add(feggwr);
             p.add(sinwc);
             f.add(p);
             p.add(foodout);
             p.setLayout(null);
             p.setBounds(5,5,688,538);
             f.setSize(700,550);
             f.setLayout(null);
             f.setVisible(true);
             total1.setEditable(false);
             change1.setEditable(false);
        }
        public class newClass implements ItemListener{
        public void itemStateChanged(ItemEvent event){
       double size=0;
       double sub=0;
       double b=0;
       if(swc.isSelected()){
        c1.setText("Spag/chicken");
        sub=160;
        }
        if(cwr.isSelected()){
        c1.setText("Chicken/rice");
            sub=150;
        }
        if(ramen.isSelected()){
         c1.setText("Ramen");
            sub=80;
        }
        if(feggwr.isSelected()){
        c1.setText("friedEgg/rice");
            sub=120;
        }
       if(sinwc.isSelected()){
        c1.setText("sinangag/rice");
            sub=170;
        }
       if(d1.isSelected()){
        c2.setText("Coke");
        b=50;
        }
       if(d2.isSelected()){
        c2.setText("Sprite");
         b=20;
        }
        if(d3.isSelected()){
        c2.setText("Royal");
         b=40;
        }
        if(d4.isSelected()){
        c2.setText("Lemonade");
         b=30;
        }
        if(d5.isSelected()){
        c2.setText("Special Buko");
         b=70;
        }
        if(ic.getSelectedItem()=="Extra Small"){
         c3.setText("Extra Small");   
               size=40;
        }
        if(ic.getSelectedItem()=="Small"){
             c3.setText("Small");  
                size=70;
        }
        if(ic.getSelectedItem()=="Medium"){
               c3.setText("Medium"); 
                size=80;
        }
        if(ic.getSelectedItem()=="Large"){
               c3.setText("Large");  
                size=100;
        }
        if(ic.getSelectedItem()=="Extra Large"){
              c3.setText("Extra Large"); 
                size=120;
        }
        int x=0;
        if(how.getSelectedItem()=="1"){
            c4.setText("1"); 
              x=1;   
        }
        if(how.getSelectedItem()=="2"){
              c4.setText("3"); 
                x=2;
        }
        if(how.getSelectedItem()=="3"){
            c4.setText("3"); 
              x=3;
        }
        if(how.getSelectedItem()=="4"){
           c4.setText("4"); 
             x=4;  
        }
        if(how.getSelectedItem()=="5"){
           c4.setText("5");    
              x=5;  
        }
        if(how.getSelectedItem()=="6"){
         c4.setText("6");  
             x=6; 
        }
        if(how.getSelectedItem()=="7"){
           c4.setText("7");  
             x=7;
        }
        if(how.getSelectedItem()=="8"){
           c4.setText("8"); 
             x=8; 
        }
        if(how.getSelectedItem()=="9"){
          c4.setText("9"); 
            x=9;
        }
        double a=0;
        if(fav.getSelectedItem()=="Manggo"){
          c5.setText("Manggo");      
                a=a+30;
        }
         if(fav.getSelectedItem()=="Ube"){
          c5.setText("Ube");      
                a=a+40;
        }
         if(fav.getSelectedItem()=="Cheeze"){
           c5.setText("Cheeze");  
               a=a+5;
        }  
         if(fav.getSelectedItem()=="All"){
           c5.setText("Mix"); 
              a=a+70; 
         }
        total1.setText(Double.toString(sub+b+size*x+a));
        }
        }
public void actionPerformed(ActionEvent ae){
        String action=ae.getActionCommand();
        if(action.equals("Clear all")){
        h.clearSelection();
        g.clearSelection();
        ic.setSelectedIndex(0);
        how.setSelectedIndex(0);
        fav. setSelectedIndex(0);
        total1.setText("");
        pay1.setText("");
        change1.setText("");
        }
       if(action.equals("Buy")){
        if(total1.getText().trim().isEmpty()&&pay1.getText().trim().isEmpty()){
      JOptionPane.showMessageDialog(p,  "Please insert Foods And Money",
    "THANK YOU",
    JOptionPane.WARNING_MESSAGE);
        }
      else if(pay1.getText().trim().isEmpty()){
       JOptionPane.showMessageDialog(p,  "PLEASE INSERT MONEY!",
    "THANK YOU",
    JOptionPane.WARNING_MESSAGE);
        }
       else if(total1.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(p,  "PLEASE SELECT FOODS;!",
    "THANK YOU",
    JOptionPane.WARNING_MESSAGE);
        }
         String x = pay1.getText();
        String y=total1.getText();
        double value2=Double.parseDouble(y);
        double value1=Double.parseDouble(x);
        double change2=value1-value2;
       
        if(value1<value2){
JOptionPane.showMessageDialog(p,  "Insufficient",
    "You insert money is Insufficient: "+value1,
    JOptionPane.WARNING_MESSAGE);
        }
      else{
        change1.setText(Double.toString(change2));
                
                row[0]= c1.getText();
                row[1]= c2.getText();
                row[2]= c3.getText();
                row[3]= c4.getText();
                row[4]= c5.getText();
                row[5] = total1.getText();
                row[6] = pay1.getText();
                row[7]= change1.getText();
                table.addRow(row);
JOptionPane.showMessageDialog(p,"Total......"+value2+"\nMoney...."+value1+"\nChange..."+change2,    "THANK YOU",   JOptionPane.INFORMATION_MESSAGE);
        h.clearSelection();
        g.clearSelection();
        ic.setSelectedIndex(0);
        how.setSelectedIndex(0);
        fav. setSelectedIndex(0);
        total1.setText("");
        pay1.setText("");
        change1.setText("");
      }
      }
      if(action.equals("Exit")){
      int n =JOptionPane.showConfirmDialog(p, "Are you sure?","Exit", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null);
    if(n==JOptionPane.YES_OPTION){
       System.exit(0);  
    }
       }
        }
public static void main(String args[]){
          new Main();
        } 
}