<%@page import="com.example.MyWebApp.Item"%>
<%@page import="java.util.ArrayList"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Todo-List</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
	<link type="text/css"
          rel="stylesheet"
          href="pages/styles.css">
</head>
<body>
    	<center><h2 class="title" style="color:white;">Todo - List</h2></center>
    
    <div id="todo-table">
        <div class="todo-form">
            <form action="additem" method="get">
                <input type="text" name="task" placeholder="Add new task ..." required>
                <input type="text" name="date" placeholder="Date" required>
                <input type="text" name="time" placeholder="Time" >
                <button type="submit">Add item</button>
            </form>
    
        </div>
        <h1 class="title" >Todo - List</h1>
        <div class="todo-item">
            <table class="table table-dark">
                <thead>
                  <tr>
                    <th scope="col">SL No</th>
                    <th scope="col">Task</th>
                    <th scope="col">Date</th>
                    <th scope="col">Time</th>
                  </tr>
                </thead>
                <tbody>
                <% ArrayList<Item> items = (ArrayList<Item>)request.getAttribute("items"); %>
                
                <% 
                   try
                 	  {
                   for(int i=0;i < items.size();i++){ %>
                  <tr>
                    <th><%= items.get(i).getId()%> </th>
                    <td><%= items.get(i).getTask()%></td>
                    <td><%= items.get(i).getDate()%></td>
                    <td><%= items.get(i).getTime()%></td>
                  </tr>
                <%}
                
                }
                catch(Exception e){
                	
                }%>

                </tbody>
              </table>
        </div>


    </div>
</body>
</html>