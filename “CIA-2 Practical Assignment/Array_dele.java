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

       for (int i = 0; i < size; i++) {
             if (array[i] == element) {
        // Shift elements to the left
        for (int j = i; j < size - 1; j++) {
            array[j] = array[j + 1];
        }
        size--; // Decrease array size after deletion

        // Print the updated array
        System.out.println("Array after deletion: ");
        System.out.println("=============================");
        for (int k = 0; k < size; k++) {
            System.out.print(array[k] + " ");
        }
        System.out.println("=============================");
        return; // Exit the loop after deletion
    }
}

// If element is not found
System.out.println("Element not found");

    }
}
class Array_dele
{
	public static void main(String args[])throws InputMismatchException
	{
		delete d=new delete();
		
	}
} 
