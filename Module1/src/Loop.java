
public class Loop {

	public static void main(String[] args) {
	// for loop show even numbers
for(int i=0; i<=15; i++) {
	if(i%2==0) {
		System.out.println(i);
	}
}

//while loop show even number
int i=0; 
while(i<=15) {
	if(i%2==0) {
		System.out.println(i);
		 i++;
	}
}

//switch
int j=10;

switch(j) {
case 1:
	System.out.println("rock");
	break;
case 6:
	System.out.println("Thre");
	break;
case 8:
	System.out.println("display me");
	break;
case 20:
	System.out.println("hello");
	break;
case 10:
	System.out.println("hi there");
	break;
	default: System.out.println("scan");
}


	}

}
