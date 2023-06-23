package sayul.proyectouno;

public class Productos {

private int id;
private String nombreProducto;
private int clave;
private double costo;
private double precio;
private int existencia;

public Productos(){
    
}

public void setId(int id){
    this.id = id;
}

public int getId(){
    return id;
}

public void setProducto(String producto){
    this.nombreProducto = producto;
}

public String setProducto(){
    return nombreProducto;
}

public void setClave(int clave){
    this.clave = clave;
}

public int getClave(){
    return clave;
}

public void  setCosto(double costo){
    this.costo = costo;
}

public double getCosto(){
    return costo;
}

public void setPrecio(double precio){
    this.precio = precio;
}

public double getPrecio(){
    return precio;
}

public void setExistencia(int existencia){
    this.existencia = existencia;
}

public int getExistencia(){
    return existencia;
}
}











