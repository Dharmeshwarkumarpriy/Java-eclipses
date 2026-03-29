<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="./base.jsp"%>
</head>
<body>

	<div class="container mt-3">
		<div class="row">
			<div class="col-md-6 offset-md-3">

				<h1 class="text-center mb-3">Fill the product detail</h1>

				<form action="handle-product" method="post">
					<div class="form-group">
						<label for="exampleInputEmail1">Product Name</label> <input
							type="text" class="form-control" id="name"
							aria-describedby="emailHelp" placeholder="Enter product name"
							name="name"> <small id="emailHelp"
							class="form-text text-muted">We'll never share your email
							with anyone else.</small>
					</div>

					<div class="form-group">
						<label for="description">product description</label>
						<textarea rows="5" class="form-control" name="description"
							id="description" placeholder="enter the product description"></textarea>
					</div>

					<div class="form-group">
						<label for="price">product price</label> <input type="text"
							class="form-control" id="price" placeholder="enter product price"
							name="price">
					</div>

					<div class="container text-center">
						<a
													href="${pageContext.request.contextPath }/"
						
							class="btn btn-outline-danger">back</a>
						<button type="submit" class="btn btn-primary">add</button>

					</div>
				</form>

			</div>
		</div>
	</div>

</body>
</html>