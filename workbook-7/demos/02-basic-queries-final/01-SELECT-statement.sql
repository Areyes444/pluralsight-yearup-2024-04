SELECT * -- * means all columns
FROM country;

-- use quoted identifiers if column name is a keyword - backtick
SELECT `Code`, `Name`, `Continent`
FROM country;

-- stack column names
SELECT Code
    , Name
    , Continent
    , Region
FROM country
WHERE Region = 'Caribbean';



