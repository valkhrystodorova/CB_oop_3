package Document;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String key = scanner.nextLine();
        DocumentWorker worker;
        if (key.equals("exp")){
            worker = new ExpertDocumentWorker();

        }
        else if (key.equals("pro")){
            worker = new ProDocumentWorker();

        }
        else {
            worker = new DocumentWorker();

        }
        worker.openDocument();
        worker.editDocument();
        worker.saveDocument();

    }
}
