CREATE TABLE IF NOT EXISTS accounts (
	id INT AUTO_INCREMENT PRIMARY KEY,
	tenant_id VARCHAR (255),
	account_id VARCHAR(255),
	parent_account_id VARCHAR(255),
	type VARCHAR(255),
	associated_vendor_id VARCHAR (255),
	company_name VARCHAR(255),
	phone VARCHAR(255),
	email VARCHAR(255),
	fax VARCHAR(255),
	website_url VARCHAR(255),
	duns_number VARCHAR(255),
	industry_type VARCHAR(255),
	annual_revenue VARCHAR(255),
	number_of_employees INTEGER,
	created_by VARCHAR(255),
	modified_by VARCHAR(255),
	creation_date DATE,
	modify_date DATE,
	extended JSON
);

CREATE TABLE IF NOT EXISTS products (
    resource_product_id INT PRIMARY KEY,
    resource_product_name VARCHAR(255),
    vendor_account_id INT,
    resource_unit_name VARCHAR(255),
    resource_unit_id INT,
    resource_unit_of_measure VARCHAR(255),
    resource_time_unit VARCHAR(255),
    created_by VARCHAR(255),
    creation_date DATE,
    modified_by VARCHAR(255),
    modified_date DATE,
    extended JSON
);

CREATE TABLE IF NOT EXISTS productprice (
    resource_measure_price_id INT PRIMARY KEY,
    vendor_account_id INT,
    resource_product_id INT FOREIGN KEY,
    resource_unit_name INT,
    resource_unit_id INT,
    base_unit_price DECIMAL,
    min_unit_limit INT,
    max_unit_limit INT,
    additional_unit_price DECIMAL,
    created_by VARCHAR(255),
    creation_date DATE,
    modified_by VARCHAR(255),
    modified_date DATE,
    extended JSON
);