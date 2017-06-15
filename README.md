#Title 
Digg / Reddit clone with upvote and downvotes Description: A website will allows users to contribute topics and upvote or downvote these topics. Environment: JDK 1.8, Linux, Eclipse IDE, RESTful Webservices, Tomcat 8.x, Maven, AngularJS

#Explanation

▪When you click on submit button on form, it actually calls POST operation to create new resource. 
▪ Every time you submit data, it calls refereshTopicData( ) to refresh topic table below. 
▪ When you call $http, you need to pass method type and URL, it will call it accordingly 
▪ When you click on Like/DisLike button on form, it actually calls PUT operation to update existing resource and display. 
▪ On successful operation of GET,PUT and POST topics are displayed on the basis of Likes(descending order) 

GitHub Link : https://github.com/githubpratibha/TopicManagement


#Steps To Run Application On Amazon AWS EC2:

URL To Access WebPage: http://54.152.42.70:8080/TopicManagementTest/

URL To Access BackEnd: http://54.152.42.70:8080/TopicManagement/rest/topics
	▪ Use REST Client to fire GET/PUT/POST requests

#Steps To Run Application On Localhost:

▪Right click on project -> run as -> run on server.Select apache tomcat and click on finish

▪Open index.html file in browser. You will see the web page.
 Index.html is present on this path : TopicManagement\WebContent\WEB-INF

▪ Hit Submit button to post topics

▪ Hit Like/DisLike button to cast your votes

#check Get method for Rest API

▪Test your get method REST service URL :“ http://localhost:8080/TopicManagement/rest/topics” 

▪Content type :application/json

▪You will get following output:

[  
   {  
      "id":1,
      "topicName":"Carousell is a mobile and online consumer to consumer marketplace for buying and selling new and secondhand goods. It is headquartered in Singapore.",
      "upVotes":0,
      "downVotes":0
   },
   {  
      "id":2,
      "topicName":"Flipkart is an electronic commerce company headquartered in Bangalore, Karnataka. It was founded in October 2007 by Sachin Bansal and Binny Bansal.",
      "upVotes":0,
      "downVotes":0
   },
   {  
      "id":3,
      "topicName":"Amazon.com, also called Amazon, is an American electronic commerce and cloud computing company that was founded on July 5, 1994, by Jeff Bezos and is based in Seattle, Washington.",
      "upVotes":0,
      "downVotes":0
   },
   {  
      "id":4,
      "topicName":"Facebook is an American for-profit corporation and an online social media and social networking service based in Menlo Park, California.",
      "upVotes":0,
      "downVotes":0
   }
]