public class pdf3 {

	public static void main(String[] args) {

	String modelo[]={"bora","jetta","golf", "passat", "beetle"};
	
	int a�o[];
	a�o=new int[5];
	a�o[0]=2007;
	a�o[1]=2009;
	a�o[2]=2011;
	a�o[3]=2013;
	a�o[4]=2015;
	
	String comprador[];
	comprador=new String[5];
	comprador[0]="Fransisco Gerte";
	comprador[1]="Alma Madero";
	comprador[2]="Aquiles Castro";
	comprador[3]="Elsa capuntas";
	comprador[4]="Elvio Lao";
	
	int num_serie;
	int malos_num=0;
	
	for (num_serie=0; num_serie < modelo.length;num_serie++){
	
		if (modelo[num_serie] != "bora")  {
			malos_num=num_serie;
	
		if ( a�o[malos_num]>=2009){
System.out.println("El modelo "+modelo[num_serie]+" a�o "+a�o[malos_num] +" con n�mero de serie " + num_serie+ " est� en mal estado, es necesario llamar al cliente "+comprador[malos_num]);
		}
		
		}
	
	}
	}
}
