//DCL02-J. Do not modify the collection's elements during an enhanced for statement

List<Integer> list = Arrays.asList(new Integer[] {13, 14, 15});
boolean first = true;
 
System.out.println("Processing list...");
for (final Integer i: list) {
  Integer item = i;
  if (first) {
    first = false;
    item = new Integer(99);
  }
  System.out.println(" New item: " + item);
  // Process item
}
 
System.out.println("Modified list?");
for (Integer i: list) {
  System.out.println("List item: " + i);
}
