package SOLID;


interface InvoiceDao1{
	public void save(Invoice invoice);
}

class DatabaseInvoiceDao implements InvoiceDao1{
	public void save(Invoice invoice) {
		// SAVING INVOICE 
	}
}

class FileTrancfer implements InvoiceDao1{
	public void save(Invoice invoice) {
		// TRANSFER FILE PROCED
	}
}