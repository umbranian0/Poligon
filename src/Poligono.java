
public abstract class Poligono {

	//atributos
	private int altura;
	private int base;

	
	//construtores
	public Poligono() {
		
	}
	public Poligono(int altura, int base) {
		super();
		
		//if(altura > 0 && base > 0) {
		this.altura = altura;
		this.base = base;	
		//}
		
	}
	public Poligono(Poligono p) {
		this(p.getAltura(),p.getBase());
	}

	//acessores
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		if(altura > 0 )
		this.altura = altura;
	}
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		if(base > 0)
		this.base = base;
	}

	
	//comportamentos
	public abstract int area () ;
	public abstract int perimetro();
	public abstract int lados();
	public abstract int vertices();

	public int diagonais() {
		// TODO Auto-generated method stub
		return ( (lados() * lados() - 3) 
				/ 2  );
	}
	
	//equals
	public boolean equals(Poligono p) {
		return (this.area() == p.area() &&
				this.perimetro() == p.perimetro()&&
				this.lados() == p.lados() &&
				this.vertices() == p.vertices()&&
				this.diagonais() == p.diagonais()) ? true : false;
	}
	
	
		//to string
	@Override
	public String toString() {
		return "Poligono [altura=" + altura + ", base=" + base + "]";
	}
}
