public class BookSales {
    private String salerName;
    private int numberOfSales;
    private String salerId;

    public BookSales(String salerName, int numberOfSales, String salerId) {
        this.salerName = salerName;
        this.numberOfSales = numberOfSales;
        this.salerId = salerId;
    }

    public void displaySalesInfo() {
        System.out.println("Saler Name: " + salerName);
        System.out.println("Number of Sales: " + numberOfSales);
        System.out.println("Saler ID: " + salerId);
    }

    public static void main(String[] args) {
        BookSales sales = new BookSales("Alice Johnson", 120, "SLR2025");
        sales.displaySalesInfo();
}
}