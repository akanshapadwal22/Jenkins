from flask import Flask, render_template

# Create a Flask application
app = Flask(__name__)

# Define the route for the welcome page
@app.route('/')
def welcome():
    return '''
        <html>
            <head>
                <title>Welcome Page</title>
                <style>
                    body {
                        font-family: Arial, sans-serif;
                        background-color: #f4f4f9;
                        text-align: center;
                        padding: 50px;
                    }
                    h1 {
                        color: #4CAF50;
                    }
                    p {
                        font-size: 18px;
                        color: #333;
                    }
                </style>
            </head>
            <body>
                <h1>Welcome to My Website!</h1>
                <p>We are glad to have you here. Explore and enjoy!</p>
            </body>
        </html>
    '''

# Run the app
if __name__ == '__main__':
    app.run(debug=True)
