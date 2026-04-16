package creational;

interface Document {
    void open();
}

class PdfDoc implements Document {
@Override
public void open() { System.out.println("Factory Method: Відкриття PDF документа."); }
}

abstract class Creator {
public abstract Document create();
}

class PdfCreator extends Creator {
@Override
 public Document create() { return new PdfDoc(); }
}
