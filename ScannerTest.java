public class bill{
public static void main(String args[]){
 int units;
 double amount;
 units=125;
 if(units<=30)
{
amount=(units*3);
}
else if(units<=60)
{
amount=((30*3)+((units-60)*4));
}
else if(units<=90)
{
amount=((30*3)+(30*4)+((units-90)*5));
}
else if(units<=120)
{
amount=((30*3)+(30*4)+(30*5)+((units-120)*7));
}
else 
{
amount=((30*3)+(30*4)+(30*5)+(30*7)+((units-120)*10));
}
System.out.println("total bill is :" +amount);
}}