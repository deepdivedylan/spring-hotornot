DROP TABLE IF EXISTS rating;
DROP TABLE IF EXISTS captain;

CREATE TABLE captain (
  captainId INT UNSIGNED AUTO_INCREMENT NOT NULL,
  captainName VARCHAR(32) NOT NULL,
  captainImage VARCHAR(128) NOT NULL,
  PRIMARY KEY(captainId)
);

CREATE TABLE rating (
  ratingId INT UNSIGNED AUTO_INCREMENT NOT NULL,
  ratingCaptainId INT UNSIGNED NOT NULL,
  ratingTeaEarlGreyHot TINYINT UNSIGNED NOT NULL,
  FOREIGN KEY(ratingCaptainId) REFERENCES captain(captainId),
  PRIMARY KEY(ratingId)
);