 class Main {

	public static void main(String[] args) {
		Circle d = new Circle (5) ;
		System.out.println(d.getArea()) ;
		System.out.println(d.getPerimeter()) ;
		Circle a = new Circle (6) ;
		System.out.println(d.check(a)) ;

	}

}
