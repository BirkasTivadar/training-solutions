package isahasa.htmlmarchaller.isa;

public class UnderlinedAndItalicAndBoldHtmlText extends ItalicAndBoldHtmlText {
    public UnderlinedAndItalicAndBoldHtmlText(String plainText) {
        super(plainText);
    }

    @Override
    public String getPlainText() {
        return "<u>" + super.getPlainText() + "</u>";
    }
}
