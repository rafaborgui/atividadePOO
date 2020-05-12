
public class Cachorro extends Animal implements BichoEstimacao{
	public String instinto() {
      return "late auau";
    }
	public void carinho() {
		System.out.println("Pode passar a mão");
	}
	@Override
	public void outroMetodo() {
		System.out.println("Outro métodod interface");
	}
	
}
