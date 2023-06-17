import requests
import json

def get_products_info(product_name):
    api_url = f"https://www.example.com/products/{product_name}"
    response = requests.get(api_url)
    
    if response.status_code == 200:
        product_info = json.loads(response.text)
        return product_info
    else:
        return None

def chatbot():
    print("Welcome to the Foodie Chatbot!")
    print("How can I assist you today?")
    
    while True:
        user_input = input("User: ")
        
        if user_input.lower() == "exit":
            print("Chatbot: Goodbye!")
            break
        
        # Extract the product name from user input
        product_name = user_input
        
        # Query the RESTful API for product information
        product_info = get_products_info(product_name)
        
        if product_info:
            print(f"Chatbot: The product '{product_name}' is available.")
            print(f"Chatbot: And the price is {product_info['price']}.")
        else:
            print(f"Chatbot: I'm sorry, the product '{product_name}' is not available.")
            
chatbot()
