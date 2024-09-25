package Exam;

//Item 클래스
class Item2 {
	private String name;
	private double price;
	private int stockQuantity;
	
	public Item2(String name, double price, int stockQuantity) {
		this.name = name;
		this.price = price;
		this.stockQuantity = stockQuantity;
	}
	// 재고 감소 메소드
    public void reduceStock(int quantity) {
    	stockQuantity-=quantity;

    }

    // 재고 증가 메소드
    public void increaseStock(int quantity) {
    	stockQuantity+=quantity;

    }

    // 아이템의 정보 출력 메소드
    public void show() {
    	System.out.print(this.toString()); // 아이템의 toString 메서드 호출

    }

    @Override
    public String toString() {
    	return "name = " + name + ", price = " + price; 

    }

    // 접근자 메소드
    public String getName() { // 제품의 이름값을 가져옴
    	return name;

    }

    public double getPrice() { // 제품의 가격값을 가져옴
    	return price;

    }
	public int getStockQuantity() {
		return stockQuantity;
	}

}

	//Electronics 클래스 (Item 클래스를 상속)
class Electronics extends Item2 {
		private int warranty; // 제품 보증 기간
		
		public Electronics(String name, double price, int stockQuantity, int warranty) {
			super(name, price, stockQuantity);
			this.warranty = warranty;
		}
		
		public String toString() {
			return (super.toString() + ", " + "warranty = "+ warranty);
		}
		
		public void show() {
			System.out.println(this.toString());
		}


	}

	//Clothing 클래스 (Item 클래스를 상속)
class Clothing extends Item2 {
		private String size;
		private String color;
		
		public Clothing(String name, double price, int stockQuantity,String size, String color) {
			super(name,price,stockQuantity);
			this.size = size;
			this.color = color;
		}

		@Override
		public String toString() {
			return (super.toString() + ", size=" + size + ", color=" + color);
		}
		public void show() {
			System.out.println(this.toString());
		}
		

	}
	//Customer 추상 클래스 정의
abstract class Customer2 {
		private String cname;
		private String city;
		private int age;
		
		public Customer2(String cname, String city, int age) {
			this.cname = cname;
			this.city = city;
			this.age = age;
		}
		
		public String toString() {
			return "Customer:" + cname + ", City:" + city + ", age:" + age ;
		}
		
		public void show() {
			System.out.println(this.toString());
		}

		abstract double applyDiscount(double totalAmount);
	}

	//RegularCustomer 클래스: Customer 클래스를 상속받음
class RegularCustomer extends Customer2 {
		static final double REGULARDISCOUNT_RATE = 0.03;
		public RegularCustomer(String cname, String city, int age) {
			super(cname, city, age);
		}
		@Override
		double applyDiscount(double totalAmount) {
			return totalAmount * REGULARDISCOUNT_RATE;
		}
		

	}

	//PremiumCustomer 클래스: Customer 클래스를 상속받음
class PremiumCustomer extends Customer2 {
		static final double PREMIUMDISCOUNT_RATE = 0.1;
		public PremiumCustomer(String cname, String city, int age) {
			super(cname, city, age);
		}
		@Override
		double applyDiscount(double totalAmount) {
			return totalAmount * PREMIUMDISCOUNT_RATE;
		}


	}


	//Order 클래스
class Order2 {
		private Customer2 customer;
		private Item2[] items;
		private int[] quantities;
		private String[] orderDates;
		private int itemCount = 0;
		
		public Order2(Customer2 customer, int maxItems) {
			this.customer = customer;
			items = new Item2[maxItems];
			quantities = new int[maxItems];
			orderDates = new String[maxItems];
		}
		void addItem(Item2 item, int orderNumber, String Date) {
			items[itemCount] = item;
			item.reduceStock(orderNumber);
			quantities[itemCount] = orderNumber;
			orderDates[itemCount] = Date;
			itemCount++;
		}
		
	    // 총액 계산 메소드
	    public double calculateTotal() {
	    	double total = 0.0;
	    	for(int i = 0; i<itemCount;i++) {
	    		total += (items[i].getPrice() * quantities[i]);
	    	}
	    	return total;
	 
	    }
		double calculateDiscountedTotal() {
			return this.calculateTotal() - customer.applyDiscount(this.calculateTotal());
					
		}
		void printOrderSummary() {
			//고객정보
			System.out.print("Order Summary for ");
			customer.show();
			System.out.println("-".repeat(50));
			System.out.println("Item\t\t Quantity\t Price\t");
			System.out.println("-".repeat(50));
			//물품정보
			for(int i=0; i<itemCount; i++) {
				System.out.println(items[i].getName() + "\t\t " + quantities[i] + "\t\t " + items[i].getPrice());

			}
			System.out.println("-".repeat(50));
			//총액정보
			System.out.println("Total:\t" + this.calculateTotal());
			System.out.println("Discounted Total:  " + this.calculateDiscountedTotal() + "\n" ); 
		}
		
		
		
		

	}
public class 실습7_2클래스생성_과제 {
	public static void main(String[] args) {
			// 의류 및 전자제품 생성
			Electronics laptop = new Electronics("노트북", 1200.00, 10, 24);
			Electronics phone = new Electronics("휴대폰", 800.00, 30, 12);
			Clothing tshirt = new Clothing("티셔츠", 20.00, 50, "M", "Blue");
			Clothing jacket = new Clothing("자켓", 80.00, 20, "L", "Black");

			// 고객 생성
			PremiumCustomer premiumCustomer = new PremiumCustomer("홍길동", "부산", 30);
			RegularCustomer regularCustomer = new RegularCustomer("계백", "양산", 25);

			// 주문 생성
			Order2 order1 = new Order2(premiumCustomer, 4);
			order1.addItem(laptop, 1,"2024-09-15");
			order1.addItem(tshirt, 2,"2024-09-15");

			Order2 order2 = new Order2(regularCustomer, 4);
			order2.addItem(phone, 1,"2024-09-15");
			order2.addItem(jacket, 1,"2024-09-15");

			// 주문 요약 출력
			System.out.println("Premium Customer Order:");
			order1.printOrderSummary();

			System.out.println("Regular Customer Order:");
			order2.printOrderSummary();
		}
	}