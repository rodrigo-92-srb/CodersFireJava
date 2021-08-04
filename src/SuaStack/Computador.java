package SuaStack;

public class Computador implements Ambiente{

	private boolean temIDE;
	private boolean programando;
	private String IDE;

	public Computador(boolean temIDE, String ide) {
		this.temIDE = temIDE;
		this.programando = false;
		IDE = ide;
	}

	public boolean getTemIDE() {
		return temIDE;
	}

	public void setTemIDE(boolean temIDE) {
		this.temIDE = temIDE;
	}

	public boolean getProgramando() {
		return programando;
	}

	public void setProgramando(boolean programando) {
		this.programando = programando;
	}

	public String getIDE() {
		return IDE;
	}

	public void setIDE(String iDE) {
		IDE = iDE;
	}
	
	@Override
	public void instalarIDE() {
		this.setIDE(IDE);
	}

	@Override
	public void informarIDE() {
		this.getIDE();
	}

	@Override
	public void programar() {
		this.setProgramando(true);
	}

	@Override
	public void pararProgramar() {
		this.setProgramando(false);
	}
	
	
	
	
}
