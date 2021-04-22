package practica_2;

import javax.swing.JOptionPane;

public class AppCustomer {
    public static void main(String[] args) {

        int numberOfCutomers = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa la cantidad de customers"));
        Customer[] customers = new Customer[numberOfCutomers];

        for (int i = 0; i < customers.length; i++) {
            int customerId = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el id del customer"));
            String customerName = JOptionPane.showInputDialog(null, "Ingresa el nombre del " + (i + 1) + " cliente");
            int customerDiscount = Integer
                    .parseInt(JOptionPane.showInputDialog(null, "Ingresa el descuento de customer"));

            Customer newCustomer = new Customer(customerId, customerName, customerDiscount);

            customers[i] = newCustomer;
        }
        String allCustomers = "\n\n";
        for (int i = 0; i < customers.length; i++) {
            allCustomers += "ID del cliente: " + customers[i].getId() + "\nNombre del cliente: "
                    + customers[i].getName() + "\nDescuento del cliente: " + customers[i].getDiscount() + "%" + "\n\n";
        }

        String customersMoreThan20 = "";

        for (int i = 0; i < customers.length; i++) {
            if (customers[i].getDiscount() > 20) {
                customersMoreThan20 += "\nNombre del cliente: " + customers[i].getName();
            }
        }

        JOptionPane.showMessageDialog(null, allCustomers);
        JOptionPane.showMessageDialog(null, customersMoreThan20, "Clientes con descuento mayor a 20%",
                numberOfCutomers);

    }
}
