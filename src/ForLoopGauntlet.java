import javax.print.attribute.IntegerSyntax;
import javax.swing.JOptionPane;

public class ForLoopGauntlet {
public static void main(String[] args) {
	Year();
	}

void goinUp() {
	for(int i=0;i<101;i++){
	System.out.println(i);
	}
}
static void goinDown(){
for(int y=100;y>=0;y--){
	System.out.println(y);
}
}
static void goinUpE(){
for(int e=2;e<=100; e++){
	if(e%2==0){
	System.out.println(e);	
}
}
}
static void goinUpO(){
for(int o=2;o<=100; o++){
	if(o%2==1){
	System.out.println(o);	
}
}
}
static void goinUp500() {
	for(int n=0;n<501;n++){
	if(n%2==0){
		System.out.println(n + " even");
	}
	else if(n%2==1){
		System.out.println(n + " odd");
	}
	
	
	}
}
static void goinUp777(){
for(int s=2;s<=777; s++){
	if(s%7==0){
	System.out.println(s);	
}
}
}
static void Year(){
String Year = JOptionPane.showInputDialog("What year were you born?");
int year = Integer.parseInt(Year);
int age = 0;
if(year>=1930){
	System.out.println("In" + year + ", you were" + age );
age++;
year++;
}
}}



