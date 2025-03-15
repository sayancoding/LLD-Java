package Creational.Singleton_Pattern;

class DbConnection {
    private static DbConnection connection;

    private DbConnection() {
    } // that blocked direct instance creation

    public static DbConnection getConnection() {
        if (connection == null) {
            connection = new DbConnection();
            System.out.println("New DB Connection is created..");
        } else {
            System.out.println("Already Created DB Connection is returning..");
        }

        return connection;
    }
}