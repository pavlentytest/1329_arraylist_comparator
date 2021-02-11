package ru.samsung.itschool.mdev;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	/*
	Collection
	Collections
	Коллекции

	1) List-ы (Списки) - упорядоченное множество. У каждого элемента есть свой номер
	2) Set-ы (Множества) - уникальные, неупорядоченные.
	3) Map-ы (Словари) - тут у каждого элемента есть имя (ключ). Данные хранятся в виде пары ключ-значение. Неупоряд.


    Реализации в Java:
    1) Listы: ArrayList, LinkedList, Stack
    2) Setы: TreeSet, HashSet, SortedSet
    3) Mapы: TreeMap, HashMap, SortedMap, ?Hashtable?

	 */
        // Collection - это интерфейс
        // Collections - это класс. В котороем есть статич. методы по работе с коллекциями

        int[] a = new int[10];

        List ppp = new ArrayList();
        ppp.add(new Object());
        ppp.add(1);

        System.out.println((int)ppp.get(1));

        List<String> list = new ArrayList<>(); // 10
        list.add("New"); // 0
        list.add("Old");  // 1
        list.get(1);
        list.remove(1);

        // обычный цикл for

        for(String s: list) System.out.println(s);

        int x[] = {348484,4533,234,3,23,234,23,-9};
        Arrays.sort(x);
        System.out.println(Arrays.toString(x));

        List<Integer> c = new ArrayList<>();
        for(int i=0;i<x.length;i++) c.add(x[i]);
        int result = Collections.binarySearch(c,1);
        System.out.println(result);


        List<String> bbb = new ArrayList<>();
        Collections.addAll(bbb,"sdfsdf","sdfsdf","d","sdfsdf");

        bbb.add(0,"dddd");
        for(String s: bbb) System.out.println(s);

        List<Double> t = new ArrayList<>();
        Collections.addAll(t,4.3,5.67,9.321);
        Double[] t_ = t.toArray(new Double[t.size()]);
        System.out.println(Arrays.toString(t_));


        List<Student> students = new ArrayList<>();
        students.add(new Student("Ivan",15));
        students.add(new Student("Petr",24));
        students.add(new Student("Sidor",14));
        students.add(new Student("Olga",35));
        students.add(new Student("Maria",16));

        Collections.sort(students);
        for(Student s: students) System.out.println(s.getAge() + "=> "+s.getName());

        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Bmw",2010));
        cars.add(new Car("Toyoya",2018));
        cars.add(new Car("Tesla",2020));
        cars.add(new Car("VW",2015));
        cars.add(new Car("Audi",2001));

        Comparator<Car> cars_compare_rule = new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        Collections.sort(cars,cars_compare_rule);

        for(Car q: cars) System.out.println(q.getName() + ": "+q.getYear());

    }
}
