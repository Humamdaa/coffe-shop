
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author humam.daas
 */
public class NewJFrame extends javax.swing.JFrame {

    
    public NewJFrame() {
        initComponents();
        setIconImage(putIconToFrame().getImage());
    }

    private int countCof = 0;
    private int countCap = 0;
    private int countTea = 0;
    private int countBag = 0;
    private int countCro = 0;
    private int countToa = 0;
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        radCoffe = new javax.swing.JRadioButton();
        radCap = new javax.swing.JRadioButton();
        radTea = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        chkBag = new javax.swing.JCheckBox();
        chkCro = new javax.swing.JCheckBox();
        chkToa = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        QuanCof = new javax.swing.JTextField();
        QuanCap = new javax.swing.JTextField();
        QuanTea = new javax.swing.JTextField();
        QuanBag = new javax.swing.JTextField();
        QuanToa = new javax.swing.JTextField();
        QuanCro = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        plusCof = new javax.swing.JButton();
        minusCof = new javax.swing.JButton();
        plusCap = new javax.swing.JButton();
        minusCap = new javax.swing.JButton();
        minusTea = new javax.swing.JButton();
        plusTea = new javax.swing.JButton();
        plusBag = new javax.swing.JButton();
        plusToa = new javax.swing.JButton();
        plusCro = new javax.swing.JButton();
        minusBag = new javax.swing.JButton();
        minusToa = new javax.swing.JButton();
        minusCro = new javax.swing.JButton();
        totPrice = new javax.swing.JTextField();
        cal = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CoffeShop");
        setBackground(new java.awt.Color(177, 154, 154));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        jLabel1.setText("Coffe Shop");

        radCoffe.setText("coffe");
        radCoffe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radCoffeActionPerformed(evt);
            }
        });

        radCap.setText("cappuccino");
        radCap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radCapActionPerformed(evt);
            }
        });

        radTea.setText("Tea");
        radTea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radTeaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Courier New", 2, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("Drinks:");

        jLabel3.setFont(new java.awt.Font("Courier New", 2, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 51));
        jLabel3.setText("Foods:");

        chkBag.setText("Bagels");
        chkBag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkBagActionPerformed(evt);
            }
        });

        chkCro.setText("Croissant");
        chkCro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkCroActionPerformed(evt);
            }
        });

        chkToa.setText("Toast");
        chkToa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkToaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel4.setText("prices:");

        jLabel5.setBackground(new java.awt.Color(51, 51, 51));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 51));
        jLabel5.setText("1.00 $");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 51, 51));
        jLabel6.setText("1.50 $");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 51, 51));
        jLabel7.setText("1.25 $");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 51, 51));
        jLabel8.setText("2.25 $");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 51, 51));
        jLabel9.setText("2.0 $");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 51, 51));
        jLabel10.setText("2.0 $");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Quantity");

        QuanCof.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuanCofActionPerformed(evt);
            }
        });
        QuanCof.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                QuanCofKeyTyped(evt);
            }
        });

        QuanCap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuanCapActionPerformed(evt);
            }
        });
        QuanCap.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                QuanCapKeyTyped(evt);
            }
        });

        QuanTea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuanTeaActionPerformed(evt);
            }
        });
        QuanTea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                QuanTeaKeyTyped(evt);
            }
        });

        QuanBag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuanBagActionPerformed(evt);
            }
        });
        QuanBag.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                QuanBagKeyTyped(evt);
            }
        });

        QuanToa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuanToaActionPerformed(evt);
            }
        });
        QuanToa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                QuanToaKeyTyped(evt);
            }
        });

        QuanCro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuanCroActionPerformed(evt);
            }
        });
        QuanCro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                QuanCroKeyTyped(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Sitka Text", 3, 14)); // NOI18N
        jLabel12.setText("TOTAL PRICE:");

        plusCof.setForeground(new java.awt.Color(102, 153, 255));
        plusCof.setText("+");
        plusCof.setBorder(null);
        plusCof.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plusCofMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                plusCofMousePressed(evt);
            }
        });
        plusCof.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusCofActionPerformed(evt);
            }
        });

        minusCof.setText("-");
        minusCof.setBorder(null);
        minusCof.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusCofActionPerformed(evt);
            }
        });

        plusCap.setForeground(new java.awt.Color(102, 153, 255));
        plusCap.setText("+");
        plusCap.setBorder(null);
        plusCap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plusCapMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                plusCapMousePressed(evt);
            }
        });
        plusCap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusCapActionPerformed(evt);
            }
        });

        minusCap.setText("-");
        minusCap.setBorder(null);
        minusCap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusCapActionPerformed(evt);
            }
        });

        minusTea.setText("-");
        minusTea.setBorder(null);
        minusTea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusTeaActionPerformed(evt);
            }
        });

        plusTea.setForeground(new java.awt.Color(102, 153, 255));
        plusTea.setText("+");
        plusTea.setBorder(null);
        plusTea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plusTeaMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                plusTeaMousePressed(evt);
            }
        });
        plusTea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusTeaActionPerformed(evt);
            }
        });

        plusBag.setForeground(new java.awt.Color(102, 153, 255));
        plusBag.setText("+");
        plusBag.setBorder(null);
        plusBag.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plusBagMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                plusBagMousePressed(evt);
            }
        });
        plusBag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusBagActionPerformed(evt);
            }
        });

        plusToa.setForeground(new java.awt.Color(102, 153, 255));
        plusToa.setText("+");
        plusToa.setBorder(null);
        plusToa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plusToaMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                plusToaMousePressed(evt);
            }
        });
        plusToa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusToaActionPerformed(evt);
            }
        });

        plusCro.setForeground(new java.awt.Color(102, 153, 255));
        plusCro.setText("+");
        plusCro.setBorder(null);
        plusCro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plusCroMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                plusCroMousePressed(evt);
            }
        });
        plusCro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusCroActionPerformed(evt);
            }
        });

        minusBag.setText("-");
        minusBag.setBorder(null);
        minusBag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusBagActionPerformed(evt);
            }
        });

        minusToa.setText("-");
        minusToa.setBorder(null);
        minusToa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusToaActionPerformed(evt);
            }
        });

        minusCro.setText("-");
        minusCro.setBorder(null);
        minusCro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusCroActionPerformed(evt);
            }
        });

        totPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totPriceActionPerformed(evt);
            }
        });
        totPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                totPriceKeyTyped(evt);
            }
        });

        cal.setText("Cal");
        cal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calActionPerformed(evt);
            }
        });

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/COFFE (1) (1).png"))); // NOI18N

        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jSeparator1)
                                .addGap(49, 49, 49))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(chkBag)
                                            .addComponent(chkToa)
                                            .addComponent(chkCro))
                                        .addGap(78, 78, 78)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel10)
                                                .addGap(82, 82, 82)
                                                .addComponent(QuanCro))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(QuanBag, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel9)
                                                .addGap(82, 82, 82)
                                                .addComponent(QuanToa, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(plusBag, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(minusBag, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(plusToa, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(minusToa, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(plusCro, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(minusCro, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel1)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(radCoffe)
                                                    .addComponent(jLabel3)
                                                    .addComponent(radTea, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(radCap)
                                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(58, 58, 58)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel6)
                                                    .addComponent(jLabel7))
                                                .addGap(52, 52, 52)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(QuanCof)
                                                    .addComponent(QuanCap)
                                                    .addComponent(QuanTea))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(plusCof, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(minusCof, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(plusCap, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(plusTea, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(minusTea, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(minusCap, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 5, Short.MAX_VALUE)))
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(totPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cal, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                        .addGap(3, 3, 3)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radCoffe)
                            .addComponent(jLabel5)
                            .addComponent(QuanCof, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(plusCof, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(minusCof, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radCap)
                            .addComponent(jLabel6)
                            .addComponent(QuanCap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(plusCap, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(minusCap, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radTea)
                            .addComponent(jLabel7)
                            .addComponent(QuanTea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(minusTea, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(plusTea, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chkBag, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(QuanBag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(plusBag, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(minusBag, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chkToa)
                            .addComponent(jLabel9)
                            .addComponent(QuanToa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(plusToa, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(minusToa, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chkCro)
                            .addComponent(jLabel10)
                            .addComponent(QuanCro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(plusCro, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(minusCro, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(totPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cal, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private ImageIcon putIconToFrame(){
        ImageIcon logo = new ImageIcon("E:\\codejava\\CoffeShop\\coffee.png");
        return logo;
    }
    private void radCapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radCapActionPerformed
       if(radCap.isSelected()){
            radCoffe.setSelected(false);
            radTea.setSelected(false);
        }
    }//GEN-LAST:event_radCapActionPerformed

    private void radCoffeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radCoffeActionPerformed
        if(radCoffe.isSelected()){
            radCap.setSelected(false);
            radTea.setSelected(false);
        }
    }//GEN-LAST:event_radCoffeActionPerformed

    private void radTeaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radTeaActionPerformed
        if(radTea.isSelected()){
            radCap.setSelected(false);
            radCoffe.setSelected(false);
        }
    }//GEN-LAST:event_radTeaActionPerformed

    private void chkCroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkCroActionPerformed
       if(chkCro.isSelected()){
            chkToa.setSelected(false);
            chkBag.setSelected(false);
        }
    }//GEN-LAST:event_chkCroActionPerformed

    private void chkBagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkBagActionPerformed
        if(chkBag.isSelected()){
            chkToa.setSelected(false);
            chkCro.setSelected(false);
        }
    }//GEN-LAST:event_chkBagActionPerformed

    private void chkToaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkToaActionPerformed
        if(chkToa.isSelected()){
            chkBag.setSelected(false);
            chkCro.setSelected(false);
        }
    }//GEN-LAST:event_chkToaActionPerformed

    
    private void QuanTeaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuanTeaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QuanTeaActionPerformed

    private void QuanToaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuanToaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QuanToaActionPerformed

    private void QuanCroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuanCroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QuanCroActionPerformed

    private void QuanCofActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuanCofActionPerformed
       
    }//GEN-LAST:event_QuanCofActionPerformed

    
    
    private void QuanCofKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_QuanCofKeyTyped
        evt.consume();
    }//GEN-LAST:event_QuanCofKeyTyped

    private void minusCofActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusCofActionPerformed

        if(radCoffe.isSelected()){
            if(countCof  > 0){
                countCof--;
                String str = Integer.toString(countCof);
                QuanCof.setText(str);
            }
        }
    }//GEN-LAST:event_minusCofActionPerformed

    private void plusCofActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusCofActionPerformed
        if(radCoffe.isSelected()){
            if(countCof < 10){
                countCof++;
                String str = Integer.toString(countCof);
                QuanCof.setText(str);
            }
        }
    }//GEN-LAST:event_plusCofActionPerformed

    
    
    private void plusCofMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plusCofMouseClicked
       
    }//GEN-LAST:event_plusCofMouseClicked
 
    private void plusCofMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plusCofMousePressed
     
    }//GEN-LAST:event_plusCofMousePressed

    private void plusCapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plusCapMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_plusCapMouseClicked

    private void plusCapMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plusCapMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_plusCapMousePressed

    
    
    private void plusCapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusCapActionPerformed
        if(radCap.isSelected()){
            if(countCap < 10){
                countCap++;
                String str = Integer.toString(countCap);
                QuanCap.setText(str);
            }
        }
    }//GEN-LAST:event_plusCapActionPerformed

    private void minusCapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusCapActionPerformed
        if (radCap.isSelected()) {
            if (countCap > 0) {
                countCap--;
            
                String str = Integer.toString(countCap);
                QuanCap.setText(str);
            }
        }
    }//GEN-LAST:event_minusCapActionPerformed

    private void minusTeaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusTeaActionPerformed
        if(radTea.isSelected()){
            if(countTea > 0){
                countTea--;
                String str = Integer.toString(countTea);
                QuanTea.setText(str);
            }
        }
    }//GEN-LAST:event_minusTeaActionPerformed

    
    
    private void plusTeaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plusTeaMouseClicked
        
    }//GEN-LAST:event_plusTeaMouseClicked

    private void plusTeaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plusTeaMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_plusTeaMousePressed
 
    
    
    private void plusTeaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusTeaActionPerformed
         if(radTea.isSelected()){
            if(countTea < 10){
                countTea++;
                String str = Integer.toString(countTea);
                QuanTea.setText(str);
            }            
        }
    }//GEN-LAST:event_plusTeaActionPerformed

    private void QuanCapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuanCapActionPerformed
        
    }//GEN-LAST:event_QuanCapActionPerformed

    /************************consume typing in filed cap*/
    private void QuanCapKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_QuanCapKeyTyped
        evt.consume();
    }//GEN-LAST:event_QuanCapKeyTyped

    private void QuanBagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuanBagActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QuanBagActionPerformed

    private void QuanTeaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_QuanTeaKeyTyped
        evt.consume();
    }//GEN-LAST:event_QuanTeaKeyTyped

    private void QuanBagKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_QuanBagKeyTyped
        evt.consume();
    }//GEN-LAST:event_QuanBagKeyTyped

    private void QuanToaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_QuanToaKeyTyped
        evt.consume();
    }//GEN-LAST:event_QuanToaKeyTyped

    private void QuanCroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_QuanCroKeyTyped
        evt.consume();
    }//GEN-LAST:event_QuanCroKeyTyped

    
    
    private void plusBagMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plusBagMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_plusBagMouseClicked

    private void plusBagMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plusBagMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_plusBagMousePressed

    
    
    private void plusBagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusBagActionPerformed
        if(chkBag.isSelected()){
            
            if(countBag < 10){
                countBag++;
                String str = Integer.toString(countBag);
                QuanBag.setText(str);
            }
        }
    }//GEN-LAST:event_plusBagActionPerformed

    
    
    private void plusToaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plusToaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_plusToaMouseClicked

    private void plusToaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plusToaMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_plusToaMousePressed

    
    
    private void plusToaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusToaActionPerformed
        if(chkToa.isSelected()){    
            if(countToa < 10){
                countToa++;
                String str = Integer.toString(countToa);
                QuanToa.setText(str);
            }
        }
    }//GEN-LAST:event_plusToaActionPerformed

    
    private void plusCroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plusCroMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_plusCroMouseClicked

    private void plusCroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plusCroMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_plusCroMousePressed

    // ***********************************************************************************//
    
    private void plusCroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusCroActionPerformed
        if(chkCro.isSelected()){    
            
            if(countCro < 10){
                countCro++;
                String str = Integer.toString(countCro);
                QuanCro.setText(str);
            }
        }
    }//GEN-LAST:event_plusCroActionPerformed

    private void minusBagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusBagActionPerformed
        if(chkBag.isSelected()){    
            String str = Integer.toString(countBag);
            QuanBag.setText(str);
            if(countBag > 0){
                countBag--;
            }
        }
    }//GEN-LAST:event_minusBagActionPerformed

    private void minusToaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusToaActionPerformed
        if(chkToa.isSelected()){
            String str = Integer.toString(countToa);
            QuanToa.setText(str);
            if(countToa > 0){
                 countToa--;
             }
        }
    }//GEN-LAST:event_minusToaActionPerformed

    private void minusCroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusCroActionPerformed
        if(chkCro.isSelected()){
            
            if(countCro > 0){
                countCro--;
                String str = Integer.toString(countCro);
                QuanCro.setText(str);
            }
        }
    }//GEN-LAST:event_minusCroActionPerformed

    private void totPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_totPriceKeyTyped
        evt.consume();
    }//GEN-LAST:event_totPriceKeyTyped

    
    private void totPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totPriceActionPerformed
        
    }//GEN-LAST:event_totPriceActionPerformed

    
    
    private void calActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calActionPerformed
        double finPrice = 0;
        finPrice = (countCof * 1.00) + (countCap * 1.50) + (countTea * 1.25)
                 + (countBag * 2.25) + (countToa * 2.00) + (countCro * 2.00)  ;
        String str = Double.toString(finPrice);
        totPrice.setText(str + "$");
    }//GEN-LAST:event_calActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//        countCof = 0; countTea = 0; countCap = 0; 
//        countBag = 0; countCro = 0; countToa = 0;
        int finPrice = 0;
        QuanCof.setText("");
        QuanTea.setText("");
        QuanCap.setText("");
        QuanBag.setText("");
        QuanCro.setText("");
        QuanToa.setText("");
        totPrice.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField QuanBag;
    private javax.swing.JTextField QuanCap;
    private javax.swing.JTextField QuanCof;
    private javax.swing.JTextField QuanCro;
    private javax.swing.JTextField QuanTea;
    private javax.swing.JTextField QuanToa;
    private javax.swing.JButton cal;
    private javax.swing.JCheckBox chkBag;
    private javax.swing.JCheckBox chkCro;
    private javax.swing.JCheckBox chkToa;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton minusBag;
    private javax.swing.JButton minusCap;
    private javax.swing.JButton minusCof;
    private javax.swing.JButton minusCro;
    private javax.swing.JButton minusTea;
    private javax.swing.JButton minusToa;
    private javax.swing.JButton plusBag;
    private javax.swing.JButton plusCap;
    private javax.swing.JButton plusCof;
    private javax.swing.JButton plusCro;
    private javax.swing.JButton plusTea;
    private javax.swing.JButton plusToa;
    private javax.swing.JRadioButton radCap;
    private javax.swing.JRadioButton radCoffe;
    private javax.swing.JRadioButton radTea;
    private javax.swing.JTextField totPrice;
    // End of variables declaration//GEN-END:variables
}
