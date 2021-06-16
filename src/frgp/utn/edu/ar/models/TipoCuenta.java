package frgp.utn.edu.ar.models;

public class TipoCuenta {
	

	private int IdTipoCuenta;
	private String TipoCuenta;
	private String Codigo;
	
	public String getCodigo() {
		return Codigo;
	}

	public void setCodigo(String codigo) {
		this.Codigo = codigo;
	}

	private Boolean Activo;
	
	public TipoCuenta()
	{
		
	}

	public int getIdTipoCuenta() {
		return IdTipoCuenta;
	}

	public void setIdTipoCuenta(int idTipoCuenta) {
		IdTipoCuenta = idTipoCuenta;
	}

	public String getTipoCuenta() {
		return TipoCuenta;
	}

	public void setTipoCuenta(String tipoCuenta) {
		TipoCuenta = tipoCuenta;
	}

	public Boolean getActivo() {
		return Activo;
	}

	public void setActivo(Boolean activo) {
		Activo = activo;
	}


}
