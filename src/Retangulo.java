import java.lang.Math;
public class Retangulo extends Poligono{

	//atributos
	
	
	//construtores
	public Retangulo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Retangulo(int altura, int base) {
		super(altura, base);
		// TODO Auto-generated constructor stub
	}

	public Retangulo(Retangulo p) {
		super(p);
		// TODO Auto-generated constructor stub
	}

	
	//acessores	
	
	//metodos

	@Override
	public int area() {
		// TODO Auto-generated method stub
		return (this.getBase() * this.getAltura());
	}

	@Override
	public int perimetro() {
		// TODO Auto-generated method stub
		return (this.getBase() * 2) + (this.getAltura() * 2);
	}

	@Override
	public int lados() {
		// TODO Auto-generated method stub
		return 4;
	}

	@Override
	public int vertices() {
		// TODO Auto-generated method stub
		return 4;
	}


	//to string

	@Override
	public String toString() {
		return "Retangulo [area()=" + area() + ", perimetro()=" + perimetro() + ", lados()=" + lados() + ", vertices()="
				+ vertices() + "]";
	}
	
	
	
}
