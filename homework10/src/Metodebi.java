import java.util.*;

public class Metodebi {
    Scanner scanner = new Scanner(System.in);

    Random rand = new Random();


    public void davaleba1(){
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        for(int i = 0; i<5; i++){
            arrayList1.add(rand.nextInt(10));
        }
        System.out.println("davaleba1: " + arrayList1);
    }




    public void davaleba2(){
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        for(int i = 0; i <5; i++){
            arrayList2.add(rand.nextInt(20));
        }

        System.out.println("davaleba2: " +arrayList2);

        for (Integer i:arrayList2){
            System.out.print(i+", ");
        }
        System.out.println(" ");
        System.out.print("reverse meore davaleba:");
        for (int i = arrayList2.size()-1; i>=0; i--){
            System.out.print(arrayList2.get(i)+", ");
        }

    }
    public void davaleba3(){
        System.out.println("");
        System.out.print("mesame davaleba: ");
        ArrayList<Integer> arrayList3 = new ArrayList<>();

        for(int i = 0; i < 5; i++ ){
            arrayList3.add(rand.nextInt(20));
        }
        Collections.sort(arrayList3);

        for (Integer element:arrayList3
             ) {
            System.out.print(element+", ");
        }
    }

    public void davaleba4(){
        System.out.println("");
        System.out.print("meotxe davaleba: ");
        ArrayList<Integer> arrayList4 = new ArrayList<>();

        for(int i = 0; i < 5; i++ ){
            arrayList4.add(rand.nextInt(20));
        }
        Collections.sort(arrayList4);
        for (int i = arrayList4.size()-1; i>=0; i--){
            System.out.print(arrayList4.get(i)+", ");
        }
    }


    public void davaleba5(){
        System.out.println("");
        ArrayList<Integer> arrayList5 = new ArrayList<>();
        for(int i=0; i<5; i++){
            arrayList5.add(rand.nextInt(10 ));
        }
        System.out.println("tavdapirveli array5: "+arrayList5);
        for (int i=0; i<3;i++){
            arrayList5.add(rand.nextInt(50));
        }
        System.out.println("updated array5: "+arrayList5);
    }


    public void davaleba7(){
        ArrayList<Integer> arrayList7 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arrayList7.add(rand.nextInt(20));

        }
        System.out.println("source array7: "+ arrayList7);
        System.out.println("n?: ");
        int n = scanner.nextInt();
        arrayList7.add(n, rand.nextInt(80));
        System.out.println("updated array7: "+ arrayList7);
    }

    public void davaleba8(){
        System.out.println("davaleba8: ");
        ArrayList<Integer> arrayList8 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arrayList8.add(rand.nextInt(30));
        }
        System.out.println("array8: "+ arrayList8);

        for (int i = 0; i < 3; i++) {
            arrayList8.remove(arrayList8.get(0));
        }
        System.out.println("changed array8: "+ arrayList8);
    }

    public void davaleba9(){
        int n = 3; //vitom scanneria )))
        ArrayList<Integer> arrayList9 = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            arrayList9.add(rand.nextInt(30));
        }
        System.out.println("array9: "+ arrayList9);

        arrayList9.remove(arrayList9.get(n));
        System.out.println("changed array9: " + arrayList9);
    }

    public void davaleba10(){
        ArrayList<Integer> arrayList10 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arrayList10.add(rand.nextInt(30));
        }
        System.out.println("array10: "+ arrayList10);

        int index = 1;
        Iterator<Integer> iterator = arrayList10.iterator();
        while (iterator.hasNext()){
            iterator.next();
            if(index++ % 2 != 0){
                iterator.remove();
            }
        }
        System.out.println("changed array10: "+ arrayList10);
    }


    public void davaleba11(){
        ArrayList<Integer> arrayList11 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arrayList11.add(rand.nextInt(50));
        }
        System.out.println("array11: "+ arrayList11);

        //for (Integer element:arrayList11
             //) {
            //if(element==30){
                //arrayList11.remove(element);

        //Trying to remove items using a for loop or a for-each loop
        // would not work correctly because the collection
        // is changing size at the same time that the code is trying to loop.

        Iterator<Integer> iterator = arrayList11.iterator();
        while(iterator.hasNext()){
            Integer i = iterator.next();
            if(i==30){
                iterator.remove();
            }
        }
        System.out.println("shecvlili array11: " + arrayList11);
    }

    public void davaleba12(){
        ArrayList<Integer> arrayList12 = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            arrayList12.add(rand.nextInt(50));
        }
        System.out.println("array12: "+ arrayList12);

        ArrayList<Integer> new_arrayList12 = new ArrayList<>();

        Iterator<Integer> iterator = arrayList12.iterator();

        int index = 7;
        while (iterator.hasNext()){
            iterator.next();
            if(index<15){
                new_arrayList12.add(arrayList12.get(index));
                index++;
            }
        }
        System.out.println("new array12: " + new_arrayList12);
    }

    public void davaleba13(){
        ArrayList<String> arrayList13 = new ArrayList<>();
        arrayList13.add("nika");
        arrayList13.add("salomxe");
        arrayList13.add("xnika");
        arrayList13.add("salome");
        System.out.println("array13: " + arrayList13);

        arrayList13.removeIf(str-> str.contains("x"));
        System.out.println("shecvlili array13: " + arrayList13);
    }

}




