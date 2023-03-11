package com.line_comparision_program;

public class LineComparision {
    public  double calculatingLengthOfLine(int x1, int x2, int y1, int y2) {
        double length = Math.sqrt(Math.pow((x2 - x1), 2) + (Math.pow((y2 - y1), 2)));
        return length;
    }
    public void checkEqual(String len1,String len2){
        if(len1.equals(len2))
            System.out.println("Both Lines are EQUAL ");
        else
            System.out.println("Both Lines are not EQUAL");
    }
    public void compareTo(String len1,String len2) {
        int length=len1.compareTo(len2);
        //result of the comparision
        if(length<0) {
            System.out.println("len1 is lexicographically higher than len2");
        }else if(length==0) {
            System.out.println("len1 is lexicographically  equal to len2");
        }else if(length>0){
            System.out.println(" len1 is lexicographically less than len2");
        }
    }
    public static void main(String[] args) {
        LineComparision lineComparision = new LineComparision();
        double lineLength1 =lineComparision. calculatingLengthOfLine(3, 2, 6, 8);
        System.out.println("length of first line is :"+lineLength1);
        double lineLength2=lineComparision.calculatingLengthOfLine(5,5,5,5);
        System.out.println("length of second line is :"+lineLength2);
        String len1=Double.toString(lineLength1);
        String len2=Double.toString(lineLength2);
        lineComparision.checkEqual(len1,len2);
        lineComparision.compareTo(len1,len2);
    }

}
