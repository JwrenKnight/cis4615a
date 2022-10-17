// ERR02-J. Prevent exceptions while logging data

try {
  // ...
} catch (SecurityException se) {
  System.err.println(se);
  // Recover from exception
}