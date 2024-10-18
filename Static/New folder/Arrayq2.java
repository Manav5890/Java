class Arrayq2 {
    public static void main(String[] args) {
        double[] d = {2.222, 552.25, 788.49, 9.369};

        for (int i = 0; i < d.length; i++) {
            System.out.println(d[i]);
        }


        for (int i = d.length - 1; i >= 0; i--) {
            System.out.println(d[i]);
        }
	
	float [] f={23.4f,53.2f,64.3f,5.4f,79.2f};
	for (int i=0;i<d.length;i++){
		System.out.println(f[i]);
	}

	for (int i=d.length-1;i>=0;i--){
		System.out.println(f[i]);
	}

	//while loop for double
	int i=0;
	while (i<d.length){
		System.out.println(d[i]);
		i++;
	}
	//while loop for float
	int j=0;
	while(j<f.length){
		System.out.println(f[j]);
		j++;
	}
	//  each loop double
	for(double k:d){
		System.out.println(k);
	}
	//  each loop float
	for(float m:f){
		System.out.println(m);
	}
	// do-while loop double
	int a=0;
	do{
		System.out.println(d[a]);
		a++;
	} while(a<d.length);
	
	// do-while loop float
	int b=0;
	do{
		System.out.println(f[b]);
		b++;
	} while(b<f.length);
	
	
    }
}