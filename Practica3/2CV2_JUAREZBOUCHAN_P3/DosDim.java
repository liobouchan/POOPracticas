public class DosDim {

public static void main(String args[]) {

int dosD[][] = new int[4][];

dosD[0] = new int[1];

dosD[1] = new int[2];

dosD[2] = new int[3];

dosD[3] = new int[4];

 

int i, j, k = 0;

 

for(i=0; i<4; i++)

for(j=0; j<i+1; j++) {

dosD[i][j] = k;

k++;

}

 

for(i=0; i<4; i++) {

for(j=0; j<i+1; j++)

System.out.print(dosD[i][j] + " ");

System.out.println();

}

}

}