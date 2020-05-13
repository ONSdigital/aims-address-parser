# aims-address-parser

This repository wraps the parser module extracted from the [Address-Index-API](https://github.com/ONSdigital/address-index-api) in a Spring Boot App. An address string input will be transformed into a tokenised output following the rules set out in the Address Index API.

*Supported OS: Linux, Windows and Mac*

### Running the Parser

* Clone the repo
* Run the code in your IDE of choice

### Example Input and Output

<http://localhost:8081/tokens?address=Acme%20Flowers%20Ltd%20First%20And%20Second%20Floor%20Flat%2039b%20Cranbrook%20Road%20Windleybury%20GU166DE>


Will return:

```json
{
   "organisationName":"ACME FLOWERS LTD",
   "departmentName":"",
   "subBuildingName":"FIRST AND SECOND FLOOR FLAT",
   "buildingName":"39B",
   "buildingNumber":"",
   "paoStartNumber":"39",
   "paoStartSuffix":"B",
   "paoEndNumber":"",
   "paoEndSuffix":"",
   "saoStartNumber":"",
   "saoStartSuffix":"",
   "saoEndNumber":"",
   "saoEndSuffix":"",
   "streetName":"CRANBROOK ROAD",
   "locality":"WINDLEYBURY",
   "townName":"",
   "postcode":"GU16 6DE",
   "postcodeIn":"6DE",
   "postcodeOut":"GU16"
}
```


