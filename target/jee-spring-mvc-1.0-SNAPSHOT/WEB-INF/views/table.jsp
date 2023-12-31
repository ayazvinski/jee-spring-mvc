<%--
  Created by IntelliJ IDEA.
  User: mac
  Date: 31/12/2023
  Time: 09:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Table</title>
    <style>

         table {
            border: 2px solid #dededf;
            table-layout: fixed;
            border-collapse: collapse;
            border-spacing: 1px;
            text-align: left;
        }

         caption {
            caption-side: top;
            text-align: center;
        }

         th {
            border: 1px solid #dededf;
            background-color: #eceff1;
            color: #000000;
            padding: 15px;
        }

         td {
            border: 2px solid #dededf;
            background-color: #ffffff;
            color: #000000;
            padding: 15px;
        }
    </style>
</head>
<body>
<table>
    <c:forEach begin="0" end="${rows}" var="row">
        <tr>
            <c:forEach begin="0" end="${colm}" var="col">
                <c:choose>
                    <c:when test="${row == 0 && col == 0}">
                        <th>
                            x
                        </th>
                    </c:when>
                    <c:when test="${row == 0}">
                        <th>
                                ${col}
                        </th>
                    </c:when>
                    <c:when test="${col == 0}">
                        <td>
                                ${row}
                        </td>
                    </c:when>
                    <c:otherwise>
                        <td>
                                ${col * row}
                        </td>
                    </c:otherwise>
                </c:choose>
            </c:forEach>
        </tr>
    </c:forEach>
</table>
</body>
</html>
