/*
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */
package html;

public class HTMLPrinterApplication {
    public static void main(String[] args) {
        Paragraph p = new Paragraph("Some text");
        Span span = new Span("Some text");
        Anchor a = new Anchor("Click me");

        // 10 is the maximum number of elements we're allowed to print
        int number;
        number = 10;


        Element[] elements = {p, span, a};
        printElements(elements);
    }

    public static void printElements(Element[] elements) {
        for (Element element : elements) {
            System.out.println(element.toHTML());
        }
    }
}
