
package Extras;

import javax.swing.JOptionPane;

/**
 *
 * @author LAB-1
 */
public class DataValidation {

    public float String2Float(String value) {
        float result = 0;
        try {
            result = Integer.parseInt(value);

        } catch (NumberFormatException err) {
            JOptionPane.showMessageDialog(null, "error");
            return 0;
        }
        return result;
    }

    public double String2Double(String value) {
        double result = 0;
        try {
            result = Integer.parseInt(value);

        } catch (NumberFormatException err) {
            JOptionPane.showMessageDialog(null, "error");
            return 0;
        }
        return result;
    }

    public int String2Int(String value) {
        int result = 0;
        try {
            result = Integer.parseInt(value);

        } catch (NumberFormatException err) {
            JOptionPane.showMessageDialog(null, "error");
            return 0;
        }
        return result;
    }
}
