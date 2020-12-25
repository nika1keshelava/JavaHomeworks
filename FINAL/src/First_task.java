import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Random;

public class First_task {
        ArrayList<String> arrayList1 = new ArrayList<>();
        Random rand = new Random();

        public void Method1(){
            for(int i = 0 ; i <20; i ++){
                byte[] array = new byte[7];
                rand.nextBytes(array);

                String stringi = new String(array, Charset.forName("UTF-8"));
                arrayList1.add(stringi);
            }
            System.out.println("arrayList1: "+arrayList1);
        }

        public void Method2(){
            for ( int i = 0 ; i < arrayList1.size(); i++){
                if(arrayList1.get(i).contains("a")){
                    byte[] array = new byte[7];
                    rand.nextBytes(array);

                    String stringi = new String(array, Charset.forName("UTF-8"));

                    if (!stringi.contains("a")){
                        arrayList1.set(i,stringi);
                    }
                }
            }
            System.out.println("method2 "+ arrayList1);
        }

        public void Method3(){
            int index = rand.nextInt(arrayList1.size());
            for(int i = 0; i < 5; i++){
                String numstr = "";
                numstr += String.valueOf(rand.nextInt(10));
                arrayList1.add(index, numstr);
                index -= 1;
            }
            System.out.println("method3 "+ arrayList1);
        }

        public void Method4(){
            System.out.println("Method4: " + arrayList1);
        }
}
