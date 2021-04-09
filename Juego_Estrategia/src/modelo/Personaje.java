package modelo;

public abstract class Personaje
{
	private String nombre;
	protected int vitalidad;
	private Posicion posicion;

	
	
	
	public Personaje(String nombre, int vitalidad, Posicion posicion)
	{
		this.nombre = nombre;
		this.vitalidad = vitalidad;
		this.posicion = posicion;
	}

	public String getNombre()
	{
		return nombre;
	}

	public int getVitalidad()
	{
		return vitalidad;
	}

	public Posicion getPosicion()
	{
		return posicion;
	}

	@Override
	public String toString()
	{
		return "[nombre=" + nombre + ", vitalidad=" + vitalidad + ", posicion=" + posicion + "]";
	}

	public void mueve(double x, double y)
	{
		this.posicion.mueve(x, y);
	}

	public double distancia(Personaje otro)
	{
		return this.posicion.distancia(otro.posicion);
	}
	
	//El metodo ataca devuelve un String par informar 
	//sobre su xito o fracaso, esto NO ES CORRECTO pero
	// por ahora lo vamos a dejar pasar
	// Este ejemplo lo retomaremos en la clase de Excepciones
	public abstract String ataca(Personaje adversario);
	
	public abstract void recibeDano(int cantidad);
	

}
