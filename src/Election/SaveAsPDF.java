/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Election;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.util.List;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author BlackDragon
 */
public class SaveAsPDF {

    private static final int PAGE_SIZE = 595;
    private static final int MARGIN = 36;
  

    private static final Font HEADING_FONT = new Font(Font.FontFamily.TIMES_ROMAN, 24, Font.BOLD);
    private static final Font BOLD_FONT = new Font(Font.FontFamily.TIMES_ROMAN, 16, Font.BOLD);
    private static final Font NORMAL_FONT = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.NORMAL);

    public void saveResult(String election) {
        Document document = new Document(PageSize.A4, MARGIN, MARGIN, MARGIN, MARGIN);
        try {
            File file = new File("");
            String projectPath = file.getAbsolutePath();
            PdfWriter.getInstance(document, new FileOutputStream(election + " result.pdf"));
            document.open();

//            Image background = Image.getInstance("back.png");
//            background.scaleToFit(PAGE_SIZE, PAGE_SIZE);
//            document.add(background);
            Paragraph heading = new Paragraph(election, HEADING_FONT);
            heading.setAlignment(Element.ALIGN_CENTER);
            document.add(heading);
            document.add(new Paragraph(" "));

            Paragraph result = new Paragraph("Election Result", BOLD_FONT);
            result.setAlignment(Element.ALIGN_CENTER);
            document.add(result);
            document.add(new Paragraph(" "));
            // for adding result in array
            List<Candidate> candidates = new ArrayList<>();
            try {
                String Quary = "SELECT `candidate_ID`, `Name`,`symbol_path`, `Vote`, `symbol_name` FROM `candidate` WHERE  election_name = '" + election + "' ORDER by vote DESC;";
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/votingsystem", "root", "");

                PreparedStatement pst = con.prepareStatement(Quary);
                ResultSet res = pst.executeQuery();
               
                if (res.next()) {
                    
                    Paragraph winner = new Paragraph("Congratulation to" , BOLD_FONT);
                    winner.setAlignment(Element.ALIGN_CENTER);
                    document.add(winner);
                    winner = new Paragraph(res.getString(2) , HEADING_FONT);
                    winner.setAlignment(Element.ALIGN_CENTER);
                    document.add(winner);
                    winner = new Paragraph("for wining the election with "+res.getString(4)+ " vote", BOLD_FONT);
                    winner.setAlignment(Element.ALIGN_CENTER);
                    document.add(winner);
                    document.add(new Paragraph(" "));

                    candidates.add(new Candidate(res.getInt(1),res.getString(2),res.getString(3),res.getInt(4),res.getString(5)));
                    while (res.next()) {
                      candidates.add(new Candidate(res.getInt(1),res.getString(2),res.getString(3),res.getInt(4),res.getString(5)));
                    }

                }

            } catch (Exception e) {
                System.out.println(e);
            }

      

            PdfPTable table = new PdfPTable(new float []{250f,200f,200f,150f});
//            table.setWidthPercentage(TABLE_WIDTH);
//            table.setWidths(new float[]{1, 1, 2,1});

            PdfPCell cell = new PdfPCell(new Phrase("Candidate ID", BOLD_FONT));
            cell.setBackgroundColor(BaseColor.LIGHT_GRAY);
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
            table.addCell(cell);
            
            cell = new PdfPCell(new Phrase("Name", BOLD_FONT));
            cell.setBackgroundColor(BaseColor.LIGHT_GRAY);
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
            table.addCell(cell);

            cell = new PdfPCell(new Phrase("Symbol", BOLD_FONT));
            cell.setBackgroundColor(BaseColor.LIGHT_GRAY);
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
            table.addCell(cell);

            cell = new PdfPCell(new Phrase("Vote", BOLD_FONT));
            cell.setBackgroundColor(BaseColor.LIGHT_GRAY);
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
            table.addCell(cell);

            for (Candidate candidate : candidates) {
                cell = new PdfPCell(new Phrase(String.valueOf(candidate.getID()), NORMAL_FONT));
                cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
                table.addCell(cell);
                
                cell = new PdfPCell(new Phrase(candidate.getName(), NORMAL_FONT));
                cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
                table.addCell(cell);
                
                cell = new PdfPCell(new Phrase(candidate.getSymbolName(), NORMAL_FONT));
                cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
                table.addCell(cell);
                

//                   ImageIcon icon = new ImageIcon(projectPath+Path);
//                   java.awt.Image image = icon.getImage().getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH);

//                Image symbol = Image.getInstance(projectPath+candidate.getSymbol());
//                symbol.scalePercent(10f);
//                cell = new PdfPCell(symbol, true);
//                cell.setHorizontalAlignment(Element.ALIGN_CENTER);
//                cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
//                table.addCell(cell);

                cell = new PdfPCell(new Phrase(String.valueOf(candidate.getVote()), NORMAL_FONT));
                cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
                table.addCell(cell);
            }

            document.add(table);
//            document.s
            document.close();
            JFrame f;  
            f=new JFrame();  
            JOptionPane.showMessageDialog(f,"Pdf has saved to :"+projectPath+"\\"+election + " result.pdf");  
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void saveVoter(String election) {
        Document document = new Document(PageSize.A4, MARGIN, MARGIN, MARGIN, MARGIN);
        try {
            File file = new File("");
            String projectPath = file.getAbsolutePath();
            PdfWriter.getInstance(document, new FileOutputStream(election + " voters.pdf"));
            document.open();

//            Image background = Image.getInstance("back.png");
//            background.scaleToFit(PAGE_SIZE, PAGE_SIZE);
//            document.add(background);
            Paragraph heading = new Paragraph(election, HEADING_FONT);
            heading.setAlignment(Element.ALIGN_CENTER);
            document.add(heading);
            document.add(new Paragraph(" "));

            Paragraph result = new Paragraph("Voter List", BOLD_FONT);
            result.setAlignment(Element.ALIGN_CENTER);
            document.add(result);
            document.add(new Paragraph(" "));
            // for adding result in array
            List<Voter> Voters = new ArrayList<>();
            try {
                 String Quary = "SELECT `name`, `nid`, `email`, `username` FROM `voterinfo` WHERE `election` = '"+election+"';";
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/votingsystem", "root", "");

                PreparedStatement pst = con.prepareStatement(Quary);
                ResultSet res = pst.executeQuery();
               
                while (res.next()) {
                      Voters.add(new Voter(res.getString(1),res.getString(2),res.getString(3),res.getString(4)));
                    }

            } catch (Exception e) {
                System.out.println(e);
            }

      

            PdfPTable table = new PdfPTable(new float []{250f,170f,220f,200f});
//            table.setWidthPercentage(TABLE_WIDTH);
//            table.setWidths(new float[]{1, 1, 2,1});

            PdfPCell cell = new PdfPCell(new Phrase("Name", BOLD_FONT));
            cell.setBackgroundColor(BaseColor.LIGHT_GRAY);
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
            table.addCell(cell);
            
            cell = new PdfPCell(new Phrase("NID no.", BOLD_FONT));
            cell.setBackgroundColor(BaseColor.LIGHT_GRAY);
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
            table.addCell(cell);

            cell = new PdfPCell(new Phrase("Email", BOLD_FONT));
            cell.setBackgroundColor(BaseColor.LIGHT_GRAY);
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
            table.addCell(cell);

            cell = new PdfPCell(new Phrase("Username", BOLD_FONT));
            cell.setBackgroundColor(BaseColor.LIGHT_GRAY);
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
            table.addCell(cell);
            
            

            for (Voter voter : Voters) {
                cell = new PdfPCell(new Phrase(voter.getName(), NORMAL_FONT));
                cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
                table.addCell(cell);
                
                cell = new PdfPCell(new Phrase(voter.getNID(), NORMAL_FONT));
                cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
                table.addCell(cell);
                
                cell = new PdfPCell(new Phrase(voter.getEmail(), NORMAL_FONT));
                cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
                table.addCell(cell);
                
                cell = new PdfPCell(new Phrase(voter.getUsername(), NORMAL_FONT));
                cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
                table.addCell(cell);
                
               
                
              
              
            }

            document.add(table);
//            document.s
            document.close();
            JFrame f;  
            f=new JFrame();  
            JOptionPane.showMessageDialog(f,"Pdf has saved to :"+projectPath+"\\"+election + " voters.pdf");  
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private static class Candidate {

        private String name;
        private String symbol;
        private String symbol_name;
        private int vote;
        private int ID;

        public Candidate(int id, String name, String symbol, int vote, String s_name) {
            this.name = name;
            this.symbol = symbol;
            this.vote = vote;
            this.ID = id;
            this.symbol_name = s_name;
        }

        public String getName() {
            return name;
        }

        public String getSymbol() {
            return symbol;
        }
        public String getSymbolName() {
            return symbol_name;
        }

        public int getVote() {
            return vote;
        }

        public int getID() {
            return ID;
        }
    }
    private static class Voter {

        private String name;
        private String NID;
        private String UserName;
        private String Email;
        private String Pass;
        

        public Voter(String N, String nid, String Email, String username ) {
            this.name = N;
            this.NID = nid;
            this.UserName = username;
            this.Email = Email;
            
        }

        public String getName() {
            return name;
        }

        public String getNID() {
            return NID;
        }
        public String getEmail() {
            return Email;
        }

        public String getUsername() {
            return UserName;
        }

       
    }
}
