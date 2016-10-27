package com.mimaraslan;
import org.springframework.expression.*;
import org.springframework.expression.spel.standard.*;
import org.springframework.expression.spel.support.*;

public class Merkez {
public static void main(String[] args) {
					
ExpressionParser parser = new SpelExpressionParser();
 
//literal ifadeler 
Expression exp1 = parser.parseExpression("'Ehtiram Abdullayev'");
String mesaj1 = exp1.getValue(String.class);
System.out.println(mesaj1);
 
//method invocation(çağırma) 
Expression exp2 = parser.parseExpression("'Ehtiram Abdullayev'.length()");  
int mesaj2 = (Integer) exp2.getValue();
System.out.println(mesaj2);
 
//Matematiksel operatörler 
Expression exp3 = parser.parseExpression("14 * 53");  
int mesaj3 = (Integer) exp3.getValue();
System.out.println(mesaj3);
 
//Bir nesne oluşturuyoruz ve EL ile nesneyi test ediyoruz
Kaynak kaynak = new Kaynak();
StandardEvaluationContext testContext = new StandardEvaluationContext(kaynak);
 
//kaynaktaki bir property'yi yani değişkeni al. 
Expression exp4 = parser.parseExpression("eposta");
String mesaj4 = exp4.getValue(testContext, String.class);
System.out.println(mesaj4);
 
//epostaları karşılaştırıyoruz
Expression exp5; 
exp5 = parser.parseExpression("eposta == 'ehtiram.abdullayev.54@facebook.com'");
boolean mesaj5 = exp5.getValue(testContext, Boolean.class);
System.out.println(mesaj5);
}
}




















