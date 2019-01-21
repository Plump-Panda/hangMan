#credits to plaintextlist.com

from bs4 import BeautifulSoup
import requests

#opening file for storing country names
countryNameFile = open('Country Name List.txt', 'w')


website = requests.get("https://www.plaintextlist.com/geography/list_of_countries_and_territories/").text
websiteObj = BeautifulSoup(website, 'lxml')

for i in websiteObj.findAll('p', class_= "content_item"):
    countryNameFile.write(i.text+"\n")

