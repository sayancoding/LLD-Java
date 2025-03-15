package Creational.Singleton_Pattern;

public class Main {
    public static void main(String[] args) {
        DbConnection connection1 = DbConnection.getConnection();
        DbConnection connection2 = DbConnection.getConnection();
        DbConnection connection3 = DbConnection.getConnection();

        System.out.println(connection1.hashCode());
        System.out.println(connection2.hashCode());
        System.out.println(connection3.hashCode());
    }
}

/**
 * Output
 * 
 * New DB Connection is created..
 * Already Created DB Connection is returning..
 * Already Created DB Connection is returning..
 * 2055281021
 * 2055281021
 * 2055281021
 */


