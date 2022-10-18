//NUM09-J. Do not use floating-point variables as loop counters

for (int count = 1; count <= 10; count += 1) {
  float x = count/10.0f;
  System.out.println(x);
}
