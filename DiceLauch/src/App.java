/*
 * Simulates 100 dice's lauches
 */
public class App {
    public static void main(String[] args) throws Exception {
        int face1 = 0, face2 = 0, face3 = 0, face4 =0, face5 = 0, face6 = 0;

        for (int index = 0; index < 1_000; index++) {
            var value = (int)(Math.random()*10_000) % 6 + 1;
            switch(value) {
                case 1:
                    face1++;
                    break;
                case 2:
                    face2++;
                    break;
                case 3:
                    face3++;
                    break;
                case 4:
                    face4++;
                    break;
                case 5:
                    face5++;
                    break;
                case 6:
                    face6++;
                    break;
                default:
                    System.err.println("Invalid face");
            }
        }
        System.out.println("Face 1: " + face1);
        System.out.println("Face 2: " + face2);
        System.out.println("Face 3: " + face3);
        System.out.println("Face 4: " + face4);
        System.out.println("Face 5: " + face5);
        System.out.println("Face 6: " + face6);
    }
}
