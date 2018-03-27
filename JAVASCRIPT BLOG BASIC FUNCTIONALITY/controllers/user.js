const User = require('../models').User
const encryption = require('../utilities/encryption');
module.exports = {
    registerGet: (req, res) => {
        res.render('user/register');
    },
    loginGet: (req, res) =>{
        res.render('user/login');
    },
    detailsGet:(req, res) => {
        res.render('user/details', {user:req.user.dataValues.fullName, email:req.user.dataValues.email});

    },
    loginPost:(req, res) => {
        let loginArgs = req.body;
        console.log(loginArgs);

        User.findOne({where: {email: loginArgs.email}}).then(user => {
            if(!user ||!user.authenticate(loginArgs.password)){
                let errorMsg = 'Either username or password is invalid';
                loginArgs.error = errorMsg;
                res.render('user/login', loginArgs);
                return;
            }

            req.logIn(user, (err) =>{
                if(err){
                    res.redirect('/user/login', {error: err.message});
                    return;
                }

                res.redirect('/');

            })
        })


    },
    logout: (req, res) =>{
        req.logOut();
        res.redirect('/');
    },
    registerPost:(req, res) => {
        let registerArgs = req.body;

        User.findOne({where: {email: registerArgs.email}}).then(user => {
            let errorMsg = '';
            if(user){
                errorMsg = 'User with the same username exists!';
            }else if(registerArgs.password !== registerArgs.repeatedPassword){
                errorMsg = 'Passwords do not match!';
            }

            if(errorMsg){
                registerArgs.error = errorMsg;
                res.render('user/register', registerArgs);
            }
            else{
                let salt = encryption.generateSalt();
                let passwordHash = encryption.hashPassword(registerArgs.password, salt);

                let userObject = {
                    email: registerArgs.email,
                    passwordHash: passwordHash,
                    fullName: registerArgs.fullName,
                    salt: salt
                };

                User.create(userObject).then(user => {
                    req.logIn(user, (err) =>{
                        if(err){
                            registerArgs.error = err.message;
                            res.render('user/register', registerArgs);
                            return;
                        }
                        res.redirect('/')
                    })
                })
            }
        })
    }
};