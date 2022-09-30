import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("1. Print the Pyramid");
        System.out.println("2. Print the Reverse Pyramid");
        System.out.println("3. Print the Right Triangle");
        System.out.println("4. Print the left Triangle");
        System.out.println("5. Print the Right Downward Triangle");
        System.out.println("6. Print the Left Downward Triangle");
        System.out.println("7. Print the Double hill");
        System.out.println("8. Print the Butterfly");
        System.out.println("9. Print the Diamond");
        System.out.println("10. Print the Sand glass");
        System.out.println("11. Print the Left Pascal's Triangle");
        System.out.println("12. Print the Right Pascal's Triangle");
        System.out.println("13. Print the Square");

        System.out.print("Which Pattern are u want to print :- ");
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        Main obj=new Main();

        switch (num){
            case 1:{
                obj.pyramid();
                break;
            }
            case 2:{
                obj.reversePyramid();
                break;
            }
            case 3:{
                obj.rightTriangle();
                break;
            }
            case 4:{
                obj.leftTriangle();
                break;
            }
            case 5:{
                obj.rightDownwardTriangle();
                break;
            }
            case 6:{
                obj.leftDownwardTriangle();
                break;
            }
            case 7:{
                obj.doubleHill();
                break;
            }
            case 8:{
                obj.butterfly();
                break;
            }
            case 9:{
                obj.diamond();
                break;
            }
            case 10:{
                obj.sandGlass();
                break;
            }
            case 11:{
                obj.leftPascalTriangle();
                break;
            }
            case 12:{
                obj.rightPascalTriangle();
                break;
            }
            case 13:{
                obj.square();
                break;
            }
            default:{
                System.out.println("you choose the value which are outside from these list");
            }
        }
    }

    Scanner takeinput=new Scanner(System.in);

    public void pyramid(){
        System.out.println("1. Pyramid");
        System.out.print("Write a number of row to print: ");
        int row = takeinput.nextInt();
        int i, j;

        for (i=0; i<=row; i++ ){
            for (j=row; j>i ;j--){
                System.out.print("   ");
            }
            for (int c=0; c<=i;c++ ){
                System.out.print(" * ");
            }
            for (int c=1; c<=i;c++ ){
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }


    public void reversePyramid(){
        System.out.println("2. Reverse Pyramid");
        System.out.print("Write a number of row to print: ");
        int row = takeinput.nextInt();
        int i, j;

        for (i=0; i<=row; i++ ){
            for (j=0; j<i ;j++){
                System.out.print("   ");
            }
            for (int c=row; c>=i;c-- ){
                System.out.print(" * ");
            }
            for(j=row; j>i; j--)
            {
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }


    public void rightTriangle(){
        System.out.println("3. Right Triangle");
        System.out.print("Write a number of row to print: ");
        int row = takeinput.nextInt();
        int i, j;

        for(i=0; i<row; i++)
        {
            for(j=0; j<=i; j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public void leftTriangle(){
        System.out.println("4. Left Triangle");
        System.out.print("Write a number of row to print: ");
        int row = takeinput.nextInt();
        int i, j;
//        int rows=5;

        for (i=0; i<=row; i++ ){
            for (j=row; j>i ;j--){
                System.out.print("   ");
            }
            for (int c=0; c<=i;c++ ){
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }

    public void rightDownwardTriangle(){
        System.out.println("5. Right Downward Triangle");
        System.out.print("Write a number of row to print: ");
        int row = takeinput.nextInt();
        int i, j;

        for(i=0; i<=row; i++)
        {
            for(j=row; j>=i; j--)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public void leftDownwardTriangle(){
        System.out.println("6. Left Downward Triangle");
        System.out.print("Write a number of row to print: ");
        int row = takeinput.nextInt();
        int i, j;

        for (i=0; i<=row; i++ ){
            for (j=0; j<i ;j++){
                System.out.print("   ");
            }
            for (int c=row; c>=i;c-- ){
                System.out.print(" * ");
            }

            System.out.println("");
        }
    }

    public void doubleHill(){
        System.out.println("7. Double Hill");
        System.out.print("Write a number of row to print: ");
        int row = takeinput.nextInt();
        int i, j;

        for (i=0; i<=row; i++ ){
            for (j=row; j>i ;j--){
                System.out.print("   ");
            }
            for (int c=0; c<=i;c++ ){
                System.out.print("   ");
            }
            for (int c=0; c<=i;c++ ){
                System.out.print(" * ");
            }
            for (j=row; j>i ;j--){
                System.out.print("   ");
            }
            for (j=row; j>i ;j--){
                System.out.print("   ");
            }
            for (int c=0; c<=i;c++ ){
                System.out.print(" * ");
            }


            for(j=0; j<=row; j++)
            {
                System.out.print("   ");
            }
            for(j=0; j<=row; j++)
            {
                System.out.print(" * ");
            }

            System.out.println("");
        }


        for(i=0; i<=row; i++)
        {
            for(j=0; j<=row; j++)
            {
                System.out.print("   ");
            }
            for (j=0; j<i ;j++){
                System.out.print("   ");
            }
            for (int c=row; c>=i;c-- ){
                System.out.print(" * ");
            }
            for(j=row; j>i; j--)
            {
                System.out.print(" * ");
            }


            for (int c=0; c<=i;c++ ){
                System.out.print("   ");
            }
            for(j=0; j<=row; j++)
            {
                System.out.print("   ");
            }
            for(j=0; j<=row; j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public void butterfly(){
        System.out.println("8. Butterfly");
        System.out.print("Write a number of row to print: ");
        int row = takeinput.nextInt();
        int i, j;

        for (i=0; i<=row; i++ ){
            for (int c=1; c<=i;c++ ){
                System.out.print(" * ");
            }
            for (j=row; j>i ;j--){
                System.out.print("   ");
            }
            for (j=row; j>i ;j--){
                System.out.print("   ");
            }
            for (int c=1; c<=i;c++ ){
                System.out.print(" * ");
            }
            System.out.println("");
        }
        for(i=0; i<=row; i++)
        {
            for(j=row-1; j>=i; j--)
            {
                System.out.print(" * ");
            }
            for (j=0; j<i ;j++){
                System.out.print("   ");
            }
            for (j=0; j<i ;j++){
                System.out.print("   ");
            }
            for (int c=row-1; c>=i;c-- ){
                System.out.print(" * ");
            }
            for (j=1; j<i ;j++){
                System.out.print("   ");
            }
            for (j=0; j<i ;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public void diamond(){
        System.out.println("9. Diamond");
        System.out.print("Write a number of row to print: ");
        int row = takeinput.nextInt();
        int i, j;

        for (i=0; i<=row; i++ ){
            for (j=row; j>i ;j--){
                System.out.print("   ");
            }
            for (int c=0; c<=i;c++ ){
                System.out.print(" * ");
            }
            for (int c=1; c<=i;c++ ){
                System.out.print(" * ");
            }
            System.out.println("");
        }
        for (i=1; i<=row; i++ ){
            for (j=0; j<i ;j++){
                System.out.print("   ");
            }
            for (int c=row; c>=i;c-- ){
                System.out.print(" * ");
            }
            for(j=row; j>i; j--)
            {
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }

    public void sandGlass(){
        System.out.println("10. Sand Glass");
        System.out.print("Write a number of row to print: ");
        int row = takeinput.nextInt();
        int i, j;

        for (i=0; i<=row; i++ ){
            for (j=0; j<i ;j++){
                System.out.print("   ");
            }
            for (int c=row; c>=i;c-- ){
                System.out.print(" * ");
            }
            for(j=row; j>i; j--)
            {
                System.out.print(" * ");
            }
            System.out.println("");
        }
        for (i=0; i<=row; i++ ){
            for (j=row; j>i ;j--){
                System.out.print("   ");
            }
            for (int c=0; c<=i;c++ ){
                System.out.print(" * ");
            }
            for (int c=1; c<=i;c++ ){
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }

    public void leftPascalTriangle(){
        System.out.println("11. Left Pascal's Triangle");
        System.out.print("Write a number of row to print: ");
        int row = takeinput.nextInt();
        int i, j;

        for(i=0; i<row; i++)
        {
            for(j=0; j<=i; j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
        for(i=0; i<=row; i++)
        {
            for(j=row; j>=i; j--)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public void rightPascalTriangle(){
        System.out.println("12. Right Pascal's Triangle");
        System.out.print("Write a number of row to print: ");
        int row = takeinput.nextInt();
        int i, j;

        for (i=0; i<=row; i++ ){
            for (j=row; j>i ;j--){
                System.out.print("   ");
            }
            for (int c=0; c<=i;c++ ){
                System.out.print(" * ");
            }
            System.out.println("");
        }
        for (i=0; i<=row; i++ ){
            for (j=-1; j<i ;j++){
                System.out.print("   ");
            }
            for (int c=row-1; c>=i;c-- ){
                System.out.print(" * ");
            }

            System.out.println("");
        }
    }
    public void square(){
        System.out.println("13. Square");
        System.out.print("Write a number of row to print: ");
        int row = takeinput.nextInt();
        int i, j;

        for(i=0; i<=row; i++)
        {
            for(j=0; j<=row; j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
