package isahasa.htmlmarchaller.isa;

public class ItalicAndBoldHtmlText extends ItalicHtmlText{
    public ItalicAndBoldHtmlText(String plainText) {
        super(plainText);
    }

    @Override
    public String getPlainText() {
        return "<b>" + super.getPlainText() + "</b>";
    }
}
