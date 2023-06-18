

const express = require('express');

const bcrypt = require('bcrypt');

const app = express();

 //using express bcrypt


// Mock user data

const users = [

  {

    id: 1,

    username: 'john',

    passwordHash: '$2b$10$B6BLoqKhd3RkxMln3FbJROA7.E0vlWC24CKCCs60mdTLflol6li8O' // Hashed password: 'password123'

  },

  // Add more users as needed

];

//Replace the users array with your actual user data. Each user object should have properties like id, username, and passwordHash. The passwordHash should be the hashed version of the user's password


// Middleware for parsing JSON in request body

app.use(express.json());


// Login endpoint

app.post('/login', (req, res) => {

  const { username, password } = req.body;


  // Find user by username in list

  const user = users.find(user => user.username === username);

  if (!user) {

    return res.status(404).json({ message: 'User not found' });

  }


  // Compare hashed password using bcrypt

  bcrypt.compare(password, user.passwordHash, (err, result) => {

    if (err) {

      return res.status(500).json({ message: 'Internal server error' });

    }


    if (result) {

      // Passwords match, authentication successful

      return res.status(200).json({ message: 'Authentication successful' });

    } else {

      // Passwords do not match

      return res.status(401).json({ message: 'Invalid credentials' });

    }

  });

});


// Start the server

app.listen(3000, () => {

  console.log('Server is running on port 3000');
});
