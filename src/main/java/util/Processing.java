package util;

public class Processing {

    static public String calcMonth(int monthNum) {
        switch (monthNum) {
            case 1: monthNum = 1;
                    return "January";
            case 2: monthNum = 2;
                    return "February";
            case 3: monthNum = 3;
                    return "March";
            case 4: monthNum = 4;
                    return "April";
            case 5: monthNum = 5;
                    return "May";
            case 6: monthNum = 6;
                    return "June";
            case 7: monthNum = 7;
                    return "July";
            case 8: monthNum = 8;
                    return "August";
            case 9: monthNum = 9;
                    return "September";
            case 10: monthNum = 10;
                    return "October";
            case 11: monthNum = 11;
                    return "November";
            case 12: monthNum = 12;
                    return "December";
            case 13: return "Invalid Input, numbers out of range";
        }
        return "";
    }
}
