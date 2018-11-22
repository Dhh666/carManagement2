package carManagement;

public class Test {
	
	public static void print(Car[] cars){
		for(Car car : cars){
			System.out.println("品牌：" + car.getBrand());
			System.out.println("型号：" + car.getType());
			System.out.println("车牌：" + car.getCarId());
			System.out.println("----------------------------");
		}
	}
	
	public static void main(String[] args) {
		ICarDao icd= new CarDaoImpl();
		
		Car c1 = new Car("宝马", "X1", "川A23333");
		Car c2 = new Car("宝马", "X2", "川A23334");
		Car c3 = new Car("奔驰", "G65", "川A23335");
		Car c4 = new Car("玛莎拉蒂", "LEVANTE", "川A23336");
		Car c5 = new Car("奔驰", "GLC", "川A23337");
		Car c6 = new Car("特斯拉", "MODEL X", "川A23338");
		Car c7 = new Car("本田", "XR-V", "川A23339");
		Car c8 = new Car("奔驰", "A200", "川A23330");
		Car c9 = new Car("宝马", "X3", "川A23311");
		Car c10 = new Car("玛莎拉蒂", "GHIBLI", "川A23322");
		
		icd.save(c1);
		icd.save(c2);
		icd.save(c3);
		icd.save(c4);
		icd.save(c5);
		icd.save(c6);
		icd.save(c7);
		icd.save(c8);
		icd.save(c9);
		icd.save(c10);
		print(icd.queryAll());
		
		System.out.println("---------delete---------");
		icd.delete("川A23337");
		print(icd.queryAll());
		
		System.out.println("------------queryById------------");
		Car car = icd.queryById("川A23336");
		if(null != car){
			System.out.println("品牌："+car.getBrand());
			System.out.println("类型："+car.getType());
			System.out.println("车牌："+car.getCarId());
			System.out.println("-------------------");
		}
		
		System.out.println("------------queryByBrand------------");
		Car[] car1 = icd.queryByBrand("宝马");
		print(car1);
		
		System.out.println("------------queryByType------------");
		Car[] car2 = icd.queryByType("X2");
		print(car2);
		
		System.out.println("有没有上传成功");
		System.out.println("第二次上传是否成功");
	}
}
