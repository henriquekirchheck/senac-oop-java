package br.dev.henriquekh.senacCourse;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello World!");
        Car car = new Car("Toyota", "Corolla", "preta");
        Swimmer swimmer = new Swimmer("Vitoria", 19);

        car.description();

        System.out.println(String.format("Nadador(a):\n\tNome: %s\n\tIdade: %d", swimmer.name, swimmer.age));

        Product product = new Product("Sonic The Hedgehog 2 - Com uma linha", Float.POSITIVE_INFINITY, 1);
        System.out.println(String.format("Produto: %s\n\tPreço: %f\n\tQuantidade: %d", product.getName(),
                product.getPrice(), product.getQuantity()));

        Book book = new Book();
        book.author = "George Orwell";
        book.title = "1984";

        Computer computer = new Computer(true, 0x1000);
        computer.displayStatus();
    }
}
