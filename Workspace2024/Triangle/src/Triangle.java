//Dawson Clark	1/16/24	Chapter 1 Assignment 1

public class Triangle {

public static void main(String[] args) {

int rows = 7, line = 0;


for(int i = 1; i <= rows; ++i, line = 0) {

for(int space = 1; space <= (rows - i); ++space) {

System.out.print(" ");

}


while(line != (2 * i) - 1) {

System.out.print("T ");

++line;

}

System.out.println();

}

}

}
