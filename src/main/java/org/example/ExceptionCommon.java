package org.example;

public class ExceptionCommon {
    public static void main(String[] args) {
        try {
        System.out.println(9/0);
    } catch (NullPointerException e) {
        System.out.println(e.getMessage());
        System.out.println(e.getStackTrace());
    } catch (ArithmeticException e) {
        System.out.println(e.getMessage());
        System.out.println(e.getStackTrace());
    } catch (Exception e) {
        System.out.println(e.getMessage());
        System.out.println(e.getStackTrace());
    } finally {
        System.out.println("finally");
    }

        try {
            System.out.println(9/0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        pause();
        delimetr(5,0);
    }

    public static void pause() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static int delimetr (int i, int b){
        int res = 0;
        try {
            res = i/b;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return res;
    }

}
