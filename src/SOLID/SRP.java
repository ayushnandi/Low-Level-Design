package SOLID;


// FOR EACH TASK, WE ARE CREATING NEW CALSS


class Marker{
	String name;
	String color;
	int year;
	int price;
	public Marker(String name, String color, int year,int price) {
		this.name = name ;
		this.color = color;
		this.price = price;
		this.year = year;
	}
}


class Invoice{
	
	private Marker marker;
	private int quantity;
	
	public Invoice(Marker marker, int quantity) {
		this.marker =marker;
		this.quantity = quantity;
	}
	public int  calTotal() {
		return (marker.price*this.quantity);
	}
}


class InvoiceDAO{
	Invoice invoice;
	public InvoiceDAO(Invoice invoice){
		this.invoice = invoice;
	}
	public void saveToDB() {
		//SAVING TO DATABASE
	}
}

class InvoicePrinter{
	Invoice invoice;
	InvoiceDAO invoicedao;
	public InvoicePrinter(Invoice invoice ,InvoiceDAO invoicedao) {
		this.invoice = invoice;
		this.invoicedao = invoicedao;
	}
	public void printInvoice() {
		//PRINTING INVOICE
	}
}
