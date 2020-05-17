    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number : ");
        int number = scanner.nextInt();
        System.out.println("Please enter order number : ");
        int order = scanner.nextInt();
        int value_number = number;
        int sum = 0;// toplam burada basamak sayılarının üslerini toplarken yardımcı olacak //
        do {
            int percent = value_number % 10;
            value_number /= 10;
            sum += Math.pow(percent, order);
        } while (value_number > 0);
        if (sum == number) {
            System.out.println("This number is an armstrong number");
        } else {
            System.out.println("This number is not an armstrong number");
        }
    }
