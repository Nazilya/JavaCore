package urok5.Homework;

public class Homework {
    public static final String PATH = "src/main/java/urok5/Homework/demo.csv";
    public static final String OTHER_PATH = "src/main/java/urok5/Homework/other_demo.csv";

    public static void main(String[] args) {
        String[] headers = {"Value 1", "Value 2", "Value 3"};
        int[][] data = {
                { 100, 200, 123 },
                { 300, 400, 500 }
        };
        AppData appData = new AppData(headers, data);
        String[] otherHeaders = { "First", "Second", "Third" };
        int[][] otherData = {
                { 52, 424, 111 },
                { 76, 2, 321}
        };
        AppData otherAppData = new AppData(otherHeaders, otherData);

        appData.writeToFile(PATH);
        AppData receivedAppData = AppData.readFromFile(PATH);
        System.out.println(receivedAppData);

        otherAppData.writeToFile(PATH);
        AppData otherReceivedAppData = AppData.readFromFile(PATH);
        System.out.println(otherReceivedAppData);

        AppData receivedFromOtherPathAppData = AppData.readFromFile(OTHER_PATH);
        System.out.println(receivedFromOtherPathAppData);
    }
}