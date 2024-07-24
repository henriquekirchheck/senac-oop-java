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

        Movie movie = new Movie("Your Name", new String[] { "Ryunosuke Kamiki",
                "Mone Kamishiraishi" }, "Makoto Shinkai", 2016, "tt12345678");
        movie.displayInfo();

        City city = new City("Llanfairpwllgwyngyllgogerychwyrndrobwllllantysiliogogogoch", 3106);
        city.setPopulation(3107);
        System.out.printf("%s (%d habitantes)\n", city.getName(), city.getPopulation());

        BankAccount bankAccount = new BankAccount(100);
        bankAccount.setBalance(bankAccount.getBalance() + 25);
        System.out.printf("Conta: %s\nSaldo: R$%.02f\n", bankAccount.getId().toString(), bankAccount.getBalance());

        Course course = new Course("Curso de Git", 31.4);
        System.out.printf("%s (%d horas)\n", course.getName(), ((int) course.getDurationHours()));

        Worker worker = new Worker("Art McArtist", 0);
        System.out.printf("%s (R$%.02f)\n", worker.getName(), ((int) worker.getSalary()));
    }
}
