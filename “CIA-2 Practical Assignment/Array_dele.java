import java.util.*;
class delete
{
	delete()
	{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Enter the element to be deleted: ");
        int element = scanner.nextInt();

        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (array[i] == element) {
                for (int j = i; j < size - 1; j++) {
                    array[j] = array[j + 1];
                }
                found = true;
                size--; // Decrease array size after deletion
                break;
            }
        }

        if (found) {
            System.out.println("Array after deletion: ");
            System.out.print("=============================");
            for (int i = 0; i < size; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.print("=============================");
        } else {
            System.out.println("Element not found");
        }
    }
}
class Array_dele
{
	public static void main(String args[])throws InputMismatchException
	{
		delete d=new delete();
		
	}
} 