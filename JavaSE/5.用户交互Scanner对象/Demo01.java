public class Demo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextLine()) {
            String content = scanner.nextLine();
            System.out.println(content);
        }

        scanner.close();
    }
}