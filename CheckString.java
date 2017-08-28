/*
    Class to check whether a string can be parsed 
    to another type of variable. First created this
    class to help with a university assignment, then
    decided to keep it for further use as it has
    made my life easier. Feel free to take this and
    add whatever to it.
*/



import java.text.ParseException;
import java.text.SimpleDateFormat;



 abstract class CheckString {
    
    private SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");   // gives the format of a date
    
    
    
    static boolean isByte(String s) {
        try {
            Byte.parseByte(s);  // parses given string to a byte
            return true;    // if the string can parse to a byte, returns true
            
        } catch(NumberFormatException e) {
            return false;   // if the string cannot be a byte, returns false
            
        }
    }
    
    
    static boolean isShort(String s) {
        try {
            Short.parseShort(s);    // parse given string to a short
            return true;    // if the string can parse to a short, returns true
            
        } catch(NumberFormatException e) {
            return false;   // if the string cannot be a short, returns false
            
        }
    }
    
    
    static boolean isInt(String s) {
        try {
            Integer.parseInt(s);    // parse given string to an integer
            return true;    // if the string can parse to an integer, returns true
            
        } catch(NumberFormatException e) {
            return false;   // if the string cannot be an integer, returns false
            
        }
    }
    
    
    static boolean isLong(String s) {
        try {
            Long.parseLong(s);  // parse given string to a long
            return true;    // if the string can parse to a long, returns true
            
        } catch(NumberFormatException e) {
            return false;   // if the string cannot be a long, returns false
            
        }
    }
    
    
    static boolean isFloat(String s) {
        try {
            Float.parseFloat(s);    // parse given string to a float
            return true;    // if the string can parse to a float, returns false
            
        } catch(NumberFormatException e) {
            return false;   // if the string cannot be a float, returns false
            
        }
    }
    
    
    static boolean isDouble(String s) {
        try {
            Double.parseDouble(s);  // parse given string to a double
            return true;    // if the string can parse to a double, returns true
            
        } catch(NumberFormatException e) {
            return false;   // if the string cannot be a double, returns false
            
        }
    }
    
    
    static boolean isBool(String s) {
        try {
            Boolean.parseBoolean(s);    // parse given string to a boolean
            return true;    // if the string can parse to a boolean, returns true
            
        } catch(Exception e) {
            return false;   // if string cannot be a boolean, returns false
            
        }
    }
    
    
    static boolean isDate(String s) {
        dateFormat.parse(s);    // parses the given string to a date using the format specified above
        return true;    // if the string matches the specified format, returns true
        
    } catch(ParseException e) {
        return false;   // if the string does not match the specified format, returns false
        
    }
    
}   // end CheckString
