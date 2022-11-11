package gg.minehut.HypeGen.generators;

public class GeneratorRunner {
	
	public void run(Generator gen) {
		gen.setRunning(true);
		
		double remaining = gen.getDelay();
		
		while (true) {
			if (gen.doesExist() && gen.isRunning()) {
				if (remaining <= 0) {
					remaining = remaining - 0.0001;
				} else {
					remaining = gen.getDelay();
					gen.getLocation().getWorld().dropItem(gen.getLocation(), gen.getItem());
				}	
			}
		}
	}
	
	public void stop(Generator gen) {
		gen.setRunning(false);
	}
	
}
