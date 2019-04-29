package wyslkl.cn.springbean;

import org.springframework.stereotype.Component;

@Component
public class SgtPeppers implements CompactDisc{
    
	private String title="Sgt Pepper's Lonely Hearts Club Band";
	private String artist="The Beatles";
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Playing"+title+"by"+artist);
		
	}

}
