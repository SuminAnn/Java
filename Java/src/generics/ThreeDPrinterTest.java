package generics;

public class ThreeDPrinterTest {

	public static void main(String[] args) {
		ThreeDPrinter<Powder> printerPowder = new ThreeDPrinter<Powder>();
		printerPowder.setMaterial(new Powder());
		Powder powder =  printerPowder.getMaterial();
		System.out.println(powder);
		printerPowder.printing();
		
		ThreeDPrinter<Plastic> printerPlastic = new ThreeDPrinter<Plastic>();
		printerPlastic.setMaterial(new Plastic());
		Plastic plastic =  printerPlastic.getMaterial();
		System.out.println(plastic);
		printerPlastic.printing();
		
//		ThreeDPrinter<Water> printerWater = new ThreeDPrinter(); // 상위 클래스 상속을 통해서 제한을 할 수 있다
//		printerWater.setMaterial(new Water());
//		Water water =  printerWater.getMaterial();
//		System.out.println(printerWater);
	}
}
