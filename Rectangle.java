/* Crie uma classe Rectangle  com atributos length e width, cada um dos
 * quais assume o padrão de 1. Forneça métodos que calculem o perímetro
 * e área do retângulo. A classe tem métodos set e get para comprimento
 * (length)  e a  largura  (width).  Os métodos set devem  verificar se
 * length e width são, cada um, números de ponto flutuante  maiores que 
 * 0.0 e menores que 20.0.
 *
 * @author Edson F.
 */
public class Rectangle {

	private double length;
	private double  width;

	public void setLength(double length) {
		this.length = length > 0.0 && length < 20.0 ? length : 1.0;
	}

	public double getLength() {
		return length;
	}

	public void setWidth(double width) {
		this.width = width > 0.0 && width < 20.0 ? width : 1.0;
	}

	public double getWidth() {
		return width;
	}

	public double calculaPerimetro() {
		return (2 * length) + (2 * width);
	}

	public double calculaArea() {
		return length * width;
	}

	public static void main(String[] args) {
		Rectangle _rectangle = new Rectangle();
		_rectangle.setLength(10.0);
		_rectangle.setWidth(4.5);

		System.out.println("Perimetro: " + _rectangle.calculaPerimetro());
		System.out.println("Area: " + _rectangle.calculaArea());
	}
}