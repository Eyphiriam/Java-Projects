// calculator code references 
// netbeans
// https://www.youtube.com/watch?v=OgtEwQWYkvo&t=3104s
// https://www.youtube.com/watch?v=DmtGxIdXtsI
// https://www.youtube.com/watch?v=Ggy8IuIQEsA
// https://www.youtube.com/watch?v=F3kp96qrzC4&t=336s
// https://www.youtube.com/watch?v=4f9qfuUN5aE&t=321s
// https://www.youtube.com/watch?v=JWXOs3tzlpY&t=453s
// https://javatutoring.com/java-mod-program/
// https://www.java67.com/2014/11/modulo-or-remainder-operator-in-java.html
// https://stackoverflow.com/questions/51570839/how-get-percentage-result-in-java-swing-calculator
// https://kindsonthegenius.com/blog/how-to-build-a-simple-calculator-in-java-using-netbeans-step-by-step-with-screenshots/
// https://stackoverflow.com/questions/14675815/basic-calculator-in-java
// https://stackoverflow.com/questions/2568142/how-to-use-ln-in-java
// https://www.geeksforgeeks.org/java-math-log-method-example/

package Scientific_Calculate;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.event.KeyEvent;

/**
 *
 * @author Matt
 */
public class calc extends javax.swing.JFrame {

	private static final long serialVersionUID = 1L;
double firstnum;
double secondnum;
double result;
String operations;
private Object math;
    /**
     * Creates new form Scientific_Cal
     */
    public calc() {
        initComponents();
    }

      
    private void initComponents() {

        jtxtDisplay = new javax.swing.JTextField();
        jbtn7 = new javax.swing.JButton();
        jbtn8 = new javax.swing.JButton();
        jbtn9 = new javax.swing.JButton();
        jbtnMinus = new javax.swing.JButton();
        jbtn4 = new javax.swing.JButton();
        jbtn1 = new javax.swing.JButton();
        jbtn0 = new javax.swing.JButton();
        jbtnDecimal = new javax.swing.JButton();
        jbtn2 = new javax.swing.JButton();
        jbtn5 = new javax.swing.JButton();
        jbtnPlusminus = new javax.swing.JButton();
        jbtn3 = new javax.swing.JButton();
        jbtn6 = new javax.swing.JButton();
        jbtnEquals = new javax.swing.JButton();
        jbtnDiv = new javax.swing.JButton();
        jbtnMult = new javax.swing.JButton();
        jbtnBackspace = new javax.swing.JButton();
        jbtnClear = new javax.swing.JButton();
        jbtnSqrt = new javax.swing.JButton();
        jbtnPlus = new javax.swing.JButton();
        jbtnSin = new javax.swing.JButton();
        jbtnAsin = new javax.swing.JButton();
        jbtnLog = new javax.swing.JButton();
        jbtnPi = new javax.swing.JButton();
        jbtnCos = new javax.swing.JButton();
        jbtnAcos = new javax.swing.JButton();
        jbtnExp = new javax.swing.JButton();
        jbtnTan = new javax.swing.JButton();
        jbtnAtan = new javax.swing.JButton();
        jbtnSq = new javax.swing.JButton();
        jbtnSinh = new javax.swing.JButton();
        jbtnCosh = new javax.swing.JButton();
        jbtnCu = new javax.swing.JButton();
        jbtnMod = new javax.swing.JButton();
        jbtnln = new javax.swing.JButton();
        jbtnabs = new javax.swing.JButton();
        jbtnFrac = new javax.swing.JButton();
        jbtnTenr = new javax.swing.JButton();
        jbtnPer = new javax.swing.JButton();
        jbtnExit = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName(""); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jtxtDisplay.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jtxtDisplay.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtxtDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtDisplayActionPerformed(evt);
            }
        });
        jtxtDisplay.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtDisplayKeyTyped(evt);
            }
        });

        jbtn7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbtn7.setText("7");
        jbtn7.setName(""); // NOI18N
        jbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn7ActionPerformed(evt);
            }
        });

        jbtn8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbtn8.setText("8");
        jbtn8.setName(""); // NOI18N
        jbtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn8ActionPerformed(evt);
            }
        });

        jbtn9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbtn9.setText("9");
        jbtn9.setName(""); // NOI18N
        jbtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn9ActionPerformed(evt);
            }
        });

        jbtnMinus.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbtnMinus.setText("-");
        jbtnMinus.setName(""); // NOI18N
        jbtnMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMinusActionPerformed(evt);
            }
        });

        jbtn4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbtn4.setText("4");
        jbtn4.setName(""); // NOI18N
        jbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn4ActionPerformed(evt);
            }
        });

        jbtn1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbtn1.setText("1");
        jbtn1.setName(""); // NOI18N
        jbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn1ActionPerformed(evt);
            }
        });

        jbtn0.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbtn0.setText("0");
        jbtn0.setName(""); // NOI18N
        jbtn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn0ActionPerformed(evt);
            }
        });

        jbtnDecimal.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbtnDecimal.setText(".");
        jbtnDecimal.setName(""); // NOI18N
        jbtnDecimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDecimalActionPerformed(evt);
            }
        });

        jbtn2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbtn2.setText("2");
        jbtn2.setName(""); // NOI18N
        jbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn2ActionPerformed(evt);
            }
        });

        jbtn5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbtn5.setText("5");
        jbtn5.setName(""); // NOI18N
        jbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn5ActionPerformed(evt);
            }
        });

        jbtnPlusminus.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbtnPlusminus.setText("±");
        jbtnPlusminus.setName(""); // NOI18N
        jbtnPlusminus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPlusminusActionPerformed(evt);
            }
        });

        jbtn3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbtn3.setText("3");
        jbtn3.setName(""); // NOI18N
        jbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn3ActionPerformed(evt);
            }
        });

        jbtn6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbtn6.setText("6");
        jbtn6.setName(""); // NOI18N
        jbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn6ActionPerformed(evt);
            }
        });

        jbtnEquals.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbtnEquals.setText("=");
        jbtnEquals.setName(""); // NOI18N
        jbtnEquals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEqualsActionPerformed(evt);
            }
        });

        jbtnDiv.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbtnDiv.setText("/");
        jbtnDiv.setName(""); // NOI18N
        jbtnDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDivActionPerformed(evt);
            }
        });

        jbtnMult.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbtnMult.setText("*");
        jbtnMult.setName(""); // NOI18N
        jbtnMult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMultActionPerformed(evt);
            }
        });

        jbtnBackspace.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbtnBackspace.setText("←");
        jbtnBackspace.setName(""); // NOI18N
        jbtnBackspace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBackspaceActionPerformed(evt);
            }
        });

        jbtnClear.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbtnClear.setText("C");
        jbtnClear.setName(""); // NOI18N
        jbtnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnClearActionPerformed(evt);
            }
        });

        jbtnSqrt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbtnSqrt.setText("√");
        jbtnSqrt.setName(""); // NOI18N
        jbtnSqrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSqrtActionPerformed(evt);
            }
        });

        jbtnPlus.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbtnPlus.setText("+");
        jbtnPlus.setName(""); // NOI18N
        jbtnPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPlusActionPerformed(evt);
            }
        });

        jbtnSin.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbtnSin.setText("Sin");
        jbtnSin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSinActionPerformed(evt);
            }
        });

        jbtnAsin.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbtnAsin.setText("aSin");
        jbtnAsin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAsinActionPerformed(evt);
            }
        });

        jbtnLog.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbtnLog.setText("Log");
        jbtnLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLogActionPerformed(evt);
            }
        });

        jbtnPi.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbtnPi.setText("Π");
        jbtnPi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPiActionPerformed(evt);
            }
        });

        jbtnCos.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbtnCos.setText("Cos");

        jbtnAcos.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbtnAcos.setText("aCos");
        jbtnAcos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAcosActionPerformed(evt);
            }
        });

        jbtnExp.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbtnExp.setText("x^y");
        jbtnExp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExpActionPerformed(evt);
            }
        });

        jbtnTan.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbtnTan.setText("Tan");
        jbtnTan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTanActionPerformed(evt);
            }
        });

        jbtnAtan.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbtnAtan.setText("aTan");
        jbtnAtan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAtanActionPerformed(evt);
            }
        });

        jbtnSq.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbtnSq.setText("x^2");
        jbtnSq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSqActionPerformed(evt);
            }
        });

        jbtnSinh.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbtnSinh.setText("sinh");
        jbtnSinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSinhActionPerformed(evt);
            }
        });

        jbtnCosh.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbtnCosh.setText("cosh");
        jbtnCosh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCoshActionPerformed(evt);
            }
        });

        jbtnCu.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbtnCu.setText("x^3");
        jbtnCu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCuActionPerformed(evt);
            }
        });

        jbtnMod.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbtnMod.setText("Mod");
        jbtnMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnModActionPerformed(evt);
            }
        });

        jbtnln.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbtnln.setText("ln");
        jbtnln.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnlnActionPerformed(evt);
            }
        });

        jbtnabs.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbtnabs.setText("abs");
        jbtnabs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnabsActionPerformed(evt);
            }
        });

        jbtnFrac.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbtnFrac.setText("1/n");
        jbtnFrac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnFracActionPerformed(evt);
            }
        });

        jbtnTenr.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbtnTenr.setText("10^n");
        jbtnTenr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTenrActionPerformed(evt);
            }
        });

        jbtnPer.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbtnPer.setText("%");
        jbtnPer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPerActionPerformed(evt);
            }
        });

        jbtnExit.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbtnExit.setText("Exit");
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });

        jMenu1.setText("File");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setText("Standard");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem2.setText("Scientific");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(11, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jbtn0, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtnDecimal, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtnPlusminus, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtnEquals, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtnDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtnMult, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtnCu)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtnMod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jbtnSq)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtnSinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jbtnExp)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtnTan)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jbtnAtan)
                                .addComponent(jbtnCosh, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jbtnln, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtnTenr)
                            .addComponent(jbtnExit)
                            .addComponent(jbtnPer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jbtnMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jbtnPi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jbtnBackspace, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jbtnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jbtnSqrt, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jbtnPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jbtnLog)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jbtnSin)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jbtnAsin))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jbtnCos)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jbtnAcos)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jbtnabs)
                                .addComponent(jbtnFrac, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addComponent(jtxtDisplay)))
                .addGap(4, 4, 4))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jtxtDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnBackspace, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnSqrt, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnLog, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnSin, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnAsin, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnabs, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnPi, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnCos, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnAcos, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnFrac, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnMult, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnExp, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnTan, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnAtan, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnTenr, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnSq, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnSinh, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnCosh, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnPer, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbtnCu, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtnMod, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtnln, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbtnEquals, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtn0, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtnDecimal, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtnPlusminus, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jbtn7.getAccessibleContext().setAccessibleName("");
        jbtn7.getAccessibleContext().setAccessibleDescription("");
        jbtn8.getAccessibleContext().setAccessibleName("");
        jbtn8.getAccessibleContext().setAccessibleDescription("");
        jbtn9.getAccessibleContext().setAccessibleName("");
        jbtn9.getAccessibleContext().setAccessibleDescription("");
        jbtnMinus.getAccessibleContext().setAccessibleName("");
        jbtnMinus.getAccessibleContext().setAccessibleDescription("");
        jbtn4.getAccessibleContext().setAccessibleName("");
        jbtn4.getAccessibleContext().setAccessibleDescription("");
        jbtn1.getAccessibleContext().setAccessibleName("");
        jbtn1.getAccessibleContext().setAccessibleDescription("");
        jbtn0.getAccessibleContext().setAccessibleName("");
        jbtn0.getAccessibleContext().setAccessibleDescription("");
        jbtnDecimal.getAccessibleContext().setAccessibleName("");
        jbtnDecimal.getAccessibleContext().setAccessibleDescription("");
        jbtn2.getAccessibleContext().setAccessibleName("");
        jbtn2.getAccessibleContext().setAccessibleDescription("");
        jbtn5.getAccessibleContext().setAccessibleName("");
        jbtn5.getAccessibleContext().setAccessibleDescription("");
        jbtnPlusminus.getAccessibleContext().setAccessibleName("");
        jbtnPlusminus.getAccessibleContext().setAccessibleDescription("");
        jbtn3.getAccessibleContext().setAccessibleName("");
        jbtn3.getAccessibleContext().setAccessibleDescription("");
        jbtn6.getAccessibleContext().setAccessibleName("");
        jbtn6.getAccessibleContext().setAccessibleDescription("");
        jbtnEquals.getAccessibleContext().setAccessibleName("");
        jbtnEquals.getAccessibleContext().setAccessibleDescription("");
        jbtnDiv.getAccessibleContext().setAccessibleName("");
        jbtnDiv.getAccessibleContext().setAccessibleDescription("");
        jbtnMult.getAccessibleContext().setAccessibleName("");
        jbtnMult.getAccessibleContext().setAccessibleDescription("");

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>                        

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {                                           
       this.setResizable(true);
       this.setSize(450, 376);
       jtxtDisplay.setSize(438,49);
    }                                          

    private void jbtn9ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        String iNum = jtxtDisplay.getText() + jbtn9.getText();
      jtxtDisplay.setText(iNum);
    }                                     

    private void jbtnMinusActionPerformed(java.awt.event.ActionEvent evt) {                                          
        firstnum = Double.parseDouble(jtxtDisplay.getText());
        jtxtDisplay.setText(null);
        operations = ("-");                  
    }                                         

    private void jbtnPlusminusActionPerformed(java.awt.event.ActionEvent evt) {                                              
       double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
       ops = ops * (-1);
       jtxtDisplay.setText(String.valueOf(ops));
    }                                             

    private void jbtn3ActionPerformed(java.awt.event.ActionEvent evt) {                                      
       String iNum = jtxtDisplay.getText() + jbtn3.getText();
       jtxtDisplay.setText(iNum);
    }                                     

    private void jbtn6ActionPerformed(java.awt.event.ActionEvent evt) {                                      
       String iNum = jtxtDisplay.getText() + jbtn6.getText();
       jtxtDisplay.setText(iNum);
    }                                     
                                       

    private void jbtnDivActionPerformed(java.awt.event.ActionEvent evt) {                                        
        firstnum = Double.parseDouble(jtxtDisplay.getText());
        jtxtDisplay.setText(null);
        operations = ("/");
    }                                       

    private void jbtnMultActionPerformed(java.awt.event.ActionEvent evt) {                                         
         firstnum = Double.parseDouble(jtxtDisplay.getText());
        jtxtDisplay.setText(null);
        operations = ("*");
    }                                        

    private void jbtn7ActionPerformed(java.awt.event.ActionEvent evt) {                                      
      String iNum = jtxtDisplay.getText() + jbtn7.getText();
      jtxtDisplay.setText(iNum);
    }                                     

    private void formWindowActivated(java.awt.event.WindowEvent evt) {                                     
        this.setResizable(true);
        this.setSize(550, 500);
    }                                    

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        this.setResizable(true);
        this.setSize(550, 500);
    }                                          

    private void jbtn8ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        String iNum = jtxtDisplay.getText() + jbtn8.getText();
        jtxtDisplay.setText(iNum);
    }                                     

    private void jtxtDisplayActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jbtnBackspaceActionPerformed(java.awt.event.ActionEvent evt) {                                              
       String bsp = null;
       
       if(jtxtDisplay.getText().length() > 0){
           StringBuilder strB = new StringBuilder(jtxtDisplay.getText());
           strB.deleteCharAt(jtxtDisplay.getText().length() - 1);
           bsp = strB.toString();
           jtxtDisplay.setText(bsp);
       }
    }                                             

    private void jbtnClearActionPerformed(java.awt.event.ActionEvent evt) {                                          

      jtxtDisplay.setText("");
    }                                         

    private void jbtnSqrtActionPerformed(java.awt.event.ActionEvent evt) {                                         
        double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        ops = Math.sqrt(ops);
        jtxtDisplay.setText(String.valueOf(ops));
    }                                        

    private void jbtnPlusActionPerformed(java.awt.event.ActionEvent evt) {                                         
        firstnum = Double.parseDouble(jtxtDisplay.getText());
        jtxtDisplay.setText(null);
        operations = ("+");
    }                                        

    private void jbtnAsinActionPerformed(java.awt.event.ActionEvent evt) {                                         
       double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        ops = Math.asin(ops);
        jtxtDisplay.setText(String.valueOf(ops));
    }                                        

    private void jbtnAcosActionPerformed(java.awt.event.ActionEvent evt) {                                         
       double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        ops = Math.acos(ops);
        jtxtDisplay.setText(String.valueOf(ops));
    }                                        

                                   

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    private void jbtn4ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        String iNum = jtxtDisplay.getText() + jbtn4.getText();
        jtxtDisplay.setText(iNum);
    }                                     

    private void jbtn5ActionPerformed(java.awt.event.ActionEvent evt) {                                      
       String iNum = jtxtDisplay.getText() + jbtn5.getText();
       jtxtDisplay.setText(iNum);
    }                                     

    private void jbtn1ActionPerformed(java.awt.event.ActionEvent evt) {                                      
       String iNum = jtxtDisplay.getText() + jbtn1.getText();
       jtxtDisplay.setText(iNum);
    }                                     

    private void jbtn2ActionPerformed(java.awt.event.ActionEvent evt) {                                      
       String iNum = jtxtDisplay.getText() + jbtn2.getText();
       jtxtDisplay.setText(iNum);
    }                                     

    private void jbtn0ActionPerformed(java.awt.event.ActionEvent evt) {                                      
       String iNum = jtxtDisplay.getText() + jbtn0.getText();
       jtxtDisplay.setText(iNum);
    }                                     

    private void jbtnDecimalActionPerformed(java.awt.event.ActionEvent evt) {                                            
        if(!jtxtDisplay.getText().contains(".")){
            jtxtDisplay.setText(jtxtDisplay.getText() + jbtnDecimal.getText());
        }
    }                                           

    private void jbtnLogActionPerformed(java.awt.event.ActionEvent evt) {                                        
        double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        ops = Math.log(ops);
        jtxtDisplay.setText(String.valueOf(ops));
    }                                       

    private void jbtnSinActionPerformed(java.awt.event.ActionEvent evt) {                                        
       double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        ops = Math.sin(ops);
        jtxtDisplay.setText(String.valueOf(ops));
    }                                       

    private void jbtnAtanActionPerformed(java.awt.event.ActionEvent evt) {                                         
       double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        ops = Math.atan(ops);
        jtxtDisplay.setText(String.valueOf(ops));
    }                                        

    private void jbtnTanActionPerformed(java.awt.event.ActionEvent evt) {                                        
        double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        ops = Math.tan(ops);
        jtxtDisplay.setText(String.valueOf(ops));
    }                                       

    private void jbtnSinhActionPerformed(java.awt.event.ActionEvent evt) {                                         
        double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        ops = Math.sinh(ops);
        jtxtDisplay.setText(String.valueOf(ops));
    }                                        

    private void jbtnlnActionPerformed(java.awt.event.ActionEvent evt) {                                       
        double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        ops = Math.log10(ops);
        jtxtDisplay.setText(String.valueOf(ops));
    }                                      

    private void jbtnCoshActionPerformed(java.awt.event.ActionEvent evt) {                                         
       double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        ops = Math.cosh(ops);
        jtxtDisplay.setText(String.valueOf(ops));
    }                                        

    private void jbtnPiActionPerformed(java.awt.event.ActionEvent evt) {                                       
        double ops;
        ops = (3.14159265359);
        jtxtDisplay.setText(String.valueOf(ops));
    }                                      

    private void jbtnSqActionPerformed(java.awt.event.ActionEvent evt) {                                       
        double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        ops =(ops * ops);
        jtxtDisplay.setText(String.valueOf(ops));
    }                                      

    private void jbtnCuActionPerformed(java.awt.event.ActionEvent evt) {                                       
        double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        ops =(ops * ops * ops);
        jtxtDisplay.setText(String.valueOf(ops));
    }       
    
    private void jbtnExpActionPerformed(java.awt.event.ActionEvent evt) {                                        
        double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        ops = Math.pow(ops, ops);
        jtxtDisplay.setText(String.valueOf(ops));
    }    

    private void jtxtDisplayKeyTyped(java.awt.event.KeyEvent evt) {                                     
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))){
            getToolkit().beep();
            evt.consume();
        }
   
    }                                    

    private void jbtnabsActionPerformed(java.awt.event.ActionEvent evt) {                                        
        double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        ops = Math.abs(ops);
        jtxtDisplay.setText(String.valueOf(ops));
    }                                       

    private void jbtnModActionPerformed(java.awt.event.ActionEvent evt) {                                        
        double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        ops =(ops / 100);
        jtxtDisplay.setText(String.valueOf(ops));
    }                                       

    private void jbtnFracActionPerformed(java.awt.event.ActionEvent evt) {                                         
    	double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        ops =(1 / ops);
        jtxtDisplay.setText(String.valueOf(ops));
    }                                        

    private void jbtnTenrActionPerformed(java.awt.event.ActionEvent evt) {                                         
    	double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        ops =(ops * 10);
        jtxtDisplay.setText(String.valueOf(ops));
    }                                                                             

    private void jbtnPerActionPerformed(java.awt.event.ActionEvent evt) {                                        
        double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        ops =(ops / 100);
        jtxtDisplay.setText(String.valueOf(ops));
    }                                       

    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {                                         
      JFrame frame = new JFrame("EXIT");
      if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to EXIT", "EXIT", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
      {
          System.exit(0);
        }
    }     
    
    private void jbtnEqualsActionPerformed(java.awt.event.ActionEvent evt) {                                           
        String answer;
        secondnum = Double.parseDouble(jtxtDisplay.getText());
        if (operations == "+"){
            result = firstnum + secondnum;
            answer = String.format("%.2f", result);
            jtxtDisplay.setText(answer);
        }
        else if (operations == "-"){
            result = firstnum - secondnum;
            answer = String.format("%.2f", result);
            jtxtDisplay.setText(answer);
        }
            else if (operations == "*"){
            result = firstnum * secondnum;
            answer = String.format("%.2f", result);
            jtxtDisplay.setText(answer);
            }
        else if (operations == "/"){
            result = firstnum / secondnum;
            answer = String.format("%.2f", result);
            jtxtDisplay.setText(answer);
        }
        else if (operations == "%"){
            result = firstnum % secondnum;
            answer = String.format("%.2f", result);
            jtxtDisplay.setText(answer);
        }
        
     }   

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calc().setVisible(true);
            }
        });
    }

    // Variables declaration                     
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JButton jbtn0;
    private javax.swing.JButton jbtn1;
    private javax.swing.JButton jbtn2;
    private javax.swing.JButton jbtn3;
    private javax.swing.JButton jbtn4;
    private javax.swing.JButton jbtn5;
    private javax.swing.JButton jbtn6;
    private javax.swing.JButton jbtn7;
    private javax.swing.JButton jbtn8;
    private javax.swing.JButton jbtn9;
    private javax.swing.JButton jbtnAcos;
    private javax.swing.JButton jbtnAsin;
    private javax.swing.JButton jbtnAtan;
    private javax.swing.JButton jbtnBackspace;
    private javax.swing.JButton jbtnClear;
    private javax.swing.JButton jbtnCos;
    private javax.swing.JButton jbtnCosh;
    private javax.swing.JButton jbtnCu;
    private javax.swing.JButton jbtnDecimal;
    private javax.swing.JButton jbtnDiv;
    private javax.swing.JButton jbtnEquals;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JButton jbtnExp;
    private javax.swing.JButton jbtnFrac;
    private javax.swing.JButton jbtnLog;
    private javax.swing.JButton jbtnMinus;
    private javax.swing.JButton jbtnMod;
    private javax.swing.JButton jbtnMult;
    private javax.swing.JButton jbtnPer;
    private javax.swing.JButton jbtnPi;
    private javax.swing.JButton jbtnPlus;
    private javax.swing.JButton jbtnPlusminus;
    private javax.swing.JButton jbtnSin;
    private javax.swing.JButton jbtnSinh;
    private javax.swing.JButton jbtnSq;
    private javax.swing.JButton jbtnSqrt;
    private javax.swing.JButton jbtnTan;
    private javax.swing.JButton jbtnTenr;
    private javax.swing.JButton jbtnabs;
    private javax.swing.JButton jbtnln;
    private javax.swing.JTextField jtxtDisplay;
    // End of variables declaration                   

	public Object getMath() {
		return math;
	}


	public void setMath(Object math) {
		this.math = math;
	}
}
