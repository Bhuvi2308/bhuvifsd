package thirdtask;

public class Product {

	 private String productId;
	    private double productPrice;
	    private int productQuantity;

	    // Parameterized constructor
	    public Product(String productId, double productPrice, int productQuantity) {
	        this.productId = productId;
	        this.productPrice = productPrice;
	        this.productQuantity = productQuantity;
	    }

	    // Getters
	    public String getProductId() {
	        return productId;
	    }

	    public double getProductPrice() {
	        return productPrice;
	    }

	    public int getProductQuantity() {
	        return productQuantity;
	    }
	}
