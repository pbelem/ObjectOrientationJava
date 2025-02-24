package main;

import CountNumbers.Numbers;
import calculator.Comparison;
import calculator.MathOperations;
import entities.Person;
import entities.Stock;
import entities.Student1;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Which exercise would you like to run?");
            switch (input.nextByte()) {
                case 1:
                    System.out.println("Enter 2 numbers: ");
                    System.out.print("The bigger number is: " + Comparison.BiggerBetweenTwoNumbers(input.nextDouble(), input.nextDouble()));
                    break;
                case 2:
                    System.out.println("Enter 2 numbers: ");
                    System.out.print("Are it equals: " + Comparison.compareEqualsAndShowsBigger(input.nextDouble(), input.nextDouble()));
                    break;
                case 3:
                    System.out.println("Enter 2 numbers: ");
                    System.out.println("Answer: " + MathOperations.multiply(input.nextDouble(), input.nextDouble()));
                    break;
                case 4:
                    System.out.println("Enter 2 numbers: ");
                    System.out.println("Which operation would you like to perform?\n1)addition\n2)subtraction\n3)multiplication\n4)division");
                    switch (input.nextByte()) {
                        case 1:
                            System.out.println("Answer: " + MathOperations.add(input.nextDouble(), input.nextDouble()));
                            break;
                        case 2:
                            System.out.println("Answer: " + MathOperations.subtract(input.nextDouble(), input.nextDouble()));
                            break;
                        case 3:
                            System.out.println("Answer: " + MathOperations.multiply(input.nextDouble(), input.nextDouble()));
                            break;
                        case 4:
                            System.out.println("Answer: " + MathOperations.divide(input.nextDouble(), input.nextDouble()));
                            break;
                        default:
                            System.out.println("Wrong operation!");
                    }
                    break;
                case 5:
                    System.out.println("What is the product name?");
                    input.nextLine();
                    String productName = input.nextLine();
                    System.out.println("Enter minimum stock and maximum stock: ");
                    int storageMin = input.nextInt();
                    int storageMax = input.nextInt();
                    Stock stock1 = new Stock(productName, storageMin, storageMax);
                    System.out.println("the product name is: " + stock1.getProductName() + "\nand the average stock is: " + Stock.averageStock(stock1.getStockMin(), stock1.getStockMax()));
                    break;
                case 6:
                    System.out.println("What is the name of the person?");
                    input.nextLine();
                    String namePerson = input.nextLine();
                    System.out.println("What is the Person's height?");
                    double heightPerson = input.nextDouble();

                    boolean sexPerson;
                    while (true) {
                        System.out.println("What is the Person's sex?\n(m)male\n(f)female");
                        if (input.next().charAt(0) == 'm') {
                            sexPerson = true;
                            break;
                        } else if (input.next().charAt(0) == 'f') {
                            input.nextLine();
                            sexPerson = false;
                            break;
                        } else {
                            System.out.println("Invalid input. Please enter 'm' for male or 'f' for female.");
                        }
                    }
                    Person person1 = new Person(namePerson, heightPerson, sexPerson);
                    System.out.println(person1);
                    break;
                case 7:
                    Numbers.OneUntilHundred();
                    break;
                case 8:
                    Numbers.PairNumbersUntilFifty();
                    break;
                case 9:
                    Numbers.OddNumbersUntilFifty();
                    break;
                case 10:
                    Numbers.primeNumbersUntilFifty();
                    break;
                case 11:
                    System.out.println("What is the name of the student?");
                    input.nextLine();
                    String NameStudent = input.nextLine();
                    System.out.println("What is the Student's first score?");
                    double firstScoreStudent = input.nextDouble();
                    System.out.println("What is the Student's second score?");
                    double secondScoreStudent = input.nextDouble();
                    System.out.println("What is the Student's third score?");
                    double thirdScoreStudent = input.nextDouble();
                    Student1 student1 = new Student1(NameStudent, firstScoreStudent, secondScoreStudent, thirdScoreStudent);
                    System.out.println(student1);
                    break;
                default:
                    System.out.println("Invalid input");
            }
            System.out.println("Do you want to continue? (y/n)");
            String answer = input.next();
            if (answer.equals("n")) {
                break;
            }
        } while (true);
    }
}

//
//1)Crie uma classe java que contenha um método que receba dois números inteiros e
//imprima o maior entre eles.

//2)Crie uma classe java que contenha um método que receba dois números e indique se
//são iguais ou se são diferentes. Mostre o maior e o menor (nesta sequência).

//3)Crie uma classe java que contenha um método que receba dois números e efetue a
//multiplicação destes números.

//4)Crie uma classe java em que o usuário informe dois números e a operação que deve
//executar e apresente o resultado.

//5)Crie uma classe em java para calcular o estoque médio de um produto. O estoque
//médio é calculado pela formula: estoque médio = (quantidade mínima + quantidade
//máxima)/2. Deverá ser solicitado ao usuário o nome do produto, a quantidade mínima
//e a quantidade máxima do produto.

//6)Crie uma classe que receba como entrada o nome, a altura e o sexo da pessoa. Faça o
//cálculo do peso ideal obedecendo a seguinte fórmula: para homens = (72.7*h) – 58
//e para mulheres = (62.1 *h) - 44.7.

//7)Faça um programa que exiba os números de 1 até 100.

//8)Faça um programa que exiba os números pares de 1 até 50.

//9)Faça um programa que exiba os números ímpares de 1 até 50.

//10)Faça um programa que exiba os números primos de 1 até 50.

//11)Escrever um programa que leia o nome de um aluno e as notas das três provas que ele
//obteve no semestre. No final informar o nome do aluno e a sua média (aritmética).
//MEDIA = nota1 + nota2 + nota3 / 3.