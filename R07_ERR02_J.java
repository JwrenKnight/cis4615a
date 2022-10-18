// ERR02-J. Prevent exceptions while logging data

try {
  // ...
} catch(SecurityException se) {
  logger.log(Level.SEVERE, se);
  // Recover from exception
}
