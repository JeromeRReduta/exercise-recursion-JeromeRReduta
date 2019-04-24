public class RecursionDriver
{
	public static void main (String[] args)
	{
		RecursionLab r = new RecursionLab();
		System.out.println(r.countToBy(10,1));
     	System.out.println(r.countToBy(25,4));
     	System.out.println(r.countToBy(30,4));
     	System.out.println(r.countToBy(34,5));
     	System.out.println(r.countToBy(3,6));
     	System.out.println(r.countToBy(17,3)+"\n");

      int[] array1 = {11,4,6};
      int[] array2 = {11,11};
      int[] array3 = {1,2,3};
      int[] array4 = {11,2,11,3,11,11,5,11};
      System.out.println(r.array11(array1,0));
      System.out.println(r.array11(array2,0));
      System.out.println(r.array11(array3,0));
      System.out.println(r.array11(array4,0)+"\n");

      System.out.println(r.zigzag(1));
      System.out.println(r.zigzag(2));
      System.out.println(r.zigzag(3));
      System.out.println(r.zigzag(4));
      System.out.println(r.zigzag(5));
      System.out.println(r.zigzag(10)+"\n");

      String s1 = "I love USF";
      String s2 = "i Love school";
      String s3 = "i Love sc.";
      System.out.println(r.nonMatching(s1, s2));
      System.out.println(r.nonMatching(s2, s3)+"\n");

      System.out.println(r.evenNumeros(8342116));
      System.out.println(r.evenNumeros(35179));
      System.out.println(r.evenNumeros(3451279)+"\n");
	}
}
