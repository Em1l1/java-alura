public interface Autenticable {


  // interface
//  public default void setClave(String clave) {
//    this.clave = clave;
//  }


  public void setClave(String clave);
//  {
//    this.clave = clave;
//  }

  public boolean iniciarSesion(String clave);
//  {
//    return clave == "AluraCursosOnLine";
//  }

//  @Override
//  public double getBonificacion() {
//    return 0;
//  }
}
