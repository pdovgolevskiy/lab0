package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        class triangle
        {
            
            class Point {
                public double x; // абсцисса точки
                public double y; // ордината точки

                // возвращает строку с описанием точки
                public String toString() {
                    return "("+x+";"+y+")";
                }
                // выводит на экран описание точки
                public void print() {
                    System.out.print(this.toString());
                }
                // метод перемещает точку на указанный вектор
                public void move(double a, double b) {
                    x = x + a;
                    y = y + b;
                }
                // метод изменяет координаты точки на указанные
                public void set(double a, double b) {
                    x = a;
                    y = b;
                }
                // конструктор по умолчанию, создающий точку с указанными пользователем координатами
                public Point() {
                    boolean err;
                    do {
                        err = false;
                        System.out.print("Введите абсциссу точки: ");
                        Scanner scan = new Scanner(System.in);
                        if(scan.hasNextDouble()) {
                            x = scan.nextDouble();
                        } else {
                            System.out.println("Вы ввели не число, попробуйте снова");
                            err = true;
                        }
                    } while (err);
                    do {
                        err = false;
                        Scanner scan = new Scanner(System.in);
                        System.out.print("Введите ординату точки: ");
                        if(scan.hasNextDouble()) {
                            y = scan.nextDouble();
                        } else {
                            System.out.println("Вы ввели не число, попробуйте снова");
                            err = true;
                        }
                    } while (err);
                }
                // конструктор, создающий точку с указанными координатами
                public Point(double a, double b) {
                    x = a;
                    y = b;
                }
                // метод вычисляющий расстояние между точками
                public double length(Point p) {
                    return Math.sqrt( Math.pow(p.x-x,2) + Math.pow(p.y-y,2) );
                }
                // метод проверяющий совпадают ли точки
                public boolean equalsPoint(Point p) {
                    if(this.x == p.x && this.y == p.y) {
                        return true;
                    } else {
                        return false;
                    }
                }
            }
        }
        ll<Integer> test = new ll<Integer>();
        test.insert(1);
        test.insert(4);
        test.insert(17);
        test.printList();
	// write your code here
    }
}
