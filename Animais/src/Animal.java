
public class Animal implements BichoEstimacao{
	
	public void temperamento(String tipo) {
        System.out.println("Este animal é: "+tipo);
	}

	@Override
	public void carinho() {
		System.out.println("implementado CARINHO");
		
	}

	@Override
	public void outroMetodo() {
		// TODO Auto-generated method stub
		
	}
}
