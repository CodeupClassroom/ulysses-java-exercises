/*
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */
package html;

public class Span extends Element {
    public Span(String text) {
        super(text, "span");
    }
    public boolean isBlockLevel() {
        return isBlockLevel;
    }
}
