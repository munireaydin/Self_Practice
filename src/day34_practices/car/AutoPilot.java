package day34_practices.car;

public interface AutoPilot extends AutoPark {
     boolean hasAutoPilot = true;

     void selfDrive();

}
/*
Create a child interface of AutoPark named AutoPilot
						hint: interface can inherit from another interface by using extend keyword
				Variables:
					hasAutoPilot

				Abstract method:
					selfDrive();
 */