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

				<h1 class="text-center mb-3">Change product details</h1>

				<form action="${pageContext.request.contextPath }/handle-product" method="post">
				<input type="hidden" value="${product.id }" name="id">
					<div class="form-group">
						<label for="exampleInputEmail1">Product Name</label> <input
							type="text" class="form-control" id="name"
							aria-describedby="emailHelp" placeholder="Enter product name"
							name="name"
							value="${product.name }"
							> <small id="emailHelp"
							class="form-text text-muted">We'll never share your email
							with anyone else.</small>
					</div>

					<div class="form-group">
						<label for="description">product description</label>
						<textarea rows="5" class="form-control" name="description"
							id="description" placeholder="enter the product description">${product.description }
							</textarea>
					</div>

					<div class="form-group">
						<label for="price">product price</label> <input type="text"
							class="form-control" id="price"
							value="${product.price }" placeholder="enter product price"
							name="price">
					</div>

					<div class="container text-center">
						<a
													href="${pageContext.request.contextPath }/"
						
							class="btn btn-outline-danger">back</a>
						<button type="submit" class="btn btn-warning">update</button>

					</div>
				</form>

			</div>
		</div>
	</div>

</body>
</html>