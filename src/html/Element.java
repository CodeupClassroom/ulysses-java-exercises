/*
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */
package html;

public class Element {
    private String tag;
    private String text;
    protected boolean isBlockLevel;
    private String[] attributes;

    public Element(String text, String tag) {
        this.text = text;
        this.tag = tag;
    }

    public String toHTML() {
        return "<" + tag + ">" + text + "</" + tag + ">";
    }
}
