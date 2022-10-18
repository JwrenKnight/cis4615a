//Rule 00. Input Validation and Data Sanitization (IDS) IDS03-J

if (loginSuccessful) {
  logger.severe("User login succeeded for: " + sanitizeUser(username));
} else {
  logger.severe("User login failed for: " + sanitizeUser(username));
}
