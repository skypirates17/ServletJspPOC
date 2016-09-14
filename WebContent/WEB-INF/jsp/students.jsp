<%@include file="_header.jspf"%>
        <p>Displaying List of Students</p>
        <table>
		<tbody>
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Role</th>
		</tr>
		<c:forEach items="${studentList}" var="student">
		<tr>
			<td> 
				<c:out value="${student.id}"></c:out>
			</td>
			<td>
				<c:out value="${student.name}"></c:out>
			</td>
			<td>
				<c:out value="${student.section}"></c:out>
			</td>
		</tr>
		</c:forEach>
		</tbody>
		</table>
        
<%@include file="_footer.jspf"%>
