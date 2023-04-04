import model.JdbcImpl;
import model.Topic;

import java.util.Scanner;

public class Main {
    private static JdbcImpl jdbc;
    private static Scanner scanner;
    public static void main(String[] args) {
//        String url = "jdbc:postgresql://localhost:5432/postgres";
//        String username = "postgres";
//        String password = "391738";

//        try(Connection connection =  DriverManager.getConnection(url,username,password)) {
//            //1. Create SQL Statement
//            String selectSql = "SELECT * FROM topic";
//            PreparedStatement statement= connection.prepareStatement(selectSql);
//            //2. Execute SQL Statement
//            ResultSet resultSet = statement.executeQuery();
//            //3. Process Result with ResultSet
//            List<Topic> topics = new ArrayList<>();
//             JdbcImpl jdbc = new JdbcImpl();
//
////        (Connection connection = jdbc.dataSource().getConnection());
//            while (resultSet.next()){
//                Integer id = resultSet.getInt("id");
//                String name = resultSet.getString("name");
//                String description = resultSet.getString("description");
//                Boolean status = resultSet.getBoolean("status");
//                topics.add(new Topic(id, name, description, status));
//            }
//            topics.stream()
//                    .forEach(System.out::println);
//        } catch (SQLException e) {
//           e.printStackTrace();
//        }
        jdbc =new JdbcImpl();
        scanner = new Scanner(System.in);
        int option = 0;
        do{
            System.out.println("1.Insert Students in operation");
            System.out.println("2.Display students in operation");
            System.out.println("3.update students in operation");
            System.out.println("4.Delete students in operation");
            System.out.println("5.select student in database");
            System.out.println("6.Exit");
            System.out.println("Choose:");
            Topic topic = new Topic();
            option = scanner.nextInt();
            switch (option) {
                case 1 -> {
                    System.out.println("======================insert student in operation===============");

                    System.out.println("Enter id:");
                    topic.setId(scanner.nextInt());
                    System.out.println("Enter name:");
                    topic.setName(scanner.next());
                    System.out.println("Enter gender:");
                    topic.setGender(scanner.next());
                    insertStudents(topic);
                    System.out.println("=================================================================");
                }
                case 2 -> {
                    System.out.println("=================Display student in operation=================");
                    selectStudents();
                    System.out.println("=============================================================");
                }
                case 3 -> {
                    int id;
                    String newName;
                    String newGender;
                    System.out.println("===========Update Student in operation=============");
                    System.out.println("Enter id:");
                    id=scanner.nextInt();
                    System.out.println("Enter new name:");
                    newName=scanner.next();
                    System.out.println("Enter new gender:");
                    newGender =scanner.next();
                    updateStudent(id,newName,newGender);
                }
                case 4 -> {
                    int delete;
                    System.out.println("=============delete Student by id operation===============");
                    System.out.println("Enter id:");
                    delete = scanner.nextInt();
                    deleteStudentById(delete);
                }
                case 5 -> {
                    System.out.println("==============select Student in operation=================");
                    int Option=0;
                    do{
                        System.out.println("1.select by id operation");
                        System.out.println("2.select by name operation");
                        System.out.println("3.exit");
                        System.out.println("Choose:");
                        Option =scanner.nextInt();
                        switch (Option){
                            case 1->{
                                int id;
                                System.out.println("=================select by id===============");
                                System.out.println("Enter id:");
                                id=scanner.nextInt();
                                selectStudentById(id);
                            }
                            case 2->{
                                System.out.println("===================select by name======================");
                                System.out.println("Enter name:");
                                String name =scanner.next();
                                selectStudentByName(name);
                            }
                            default -> {
                                System.out.println("Exit the program....!");
                                break;
                            }
                        }
                    }while (Option!=3);
                }
                default -> {
                    System.out.println("Exit the program....!");
                    break;
                }
            }


        } while (option != 6);
    }

    private static void insertStudents(Topic students) {
    }

    private static void selectStudents() {
    }

    private static void updateStudent(int id, String newName, String newGender) {
    }

    private static void deleteStudentById(int delete) {
    }

    private static void selectStudentByName(String name) {
    }

    private static void selectStudentById(int id) {
    }
}