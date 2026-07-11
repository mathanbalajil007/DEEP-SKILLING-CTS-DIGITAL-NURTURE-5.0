public class Test {
    public static void main(String[] args) {
           DocumentFactory d;
           d=new WordDocumentFactory();
           Document doc1=d.createDocument();
           doc1.open();

           d=new PdfFactory();
           Document doc2=d.createDocument();
           doc2.open();

           d=new ExcelFactory();
           Document doc3=d.createDocument();
           doc3.open();
    }
}
