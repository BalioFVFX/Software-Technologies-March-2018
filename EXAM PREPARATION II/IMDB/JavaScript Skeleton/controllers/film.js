const Film = require('../models').Film;

module.exports = {
	index: (req, res) => {
        Film.findAll().then(films => {
        	res.render('film/index', {'films':films});
		});
	},

	createGet: (req, res) => {
        res.render('film/create');
	},

	createPost: (req, res) => {
        let filmArgs = req.body;


        Film.create(filmArgs).then(film => {
        	res.redirect("/");
		}).catch(err => {
			console.log(err.message);
			res.render('film/create', {'film':filmArgs});
		})
	},

	editGet: (req, res) => {
        Film.findById(req.params.id).then(currentFilm =>{
        	res.render('film/edit', {'name':currentFilm['name'],
				'genre':currentFilm['genre'],
				'director':currentFilm['director'],
				'year':currentFilm['year'],
				'id':req.params.id}); // Sending the id, because the form action '<form action="/edit/{{id}}" method="POST">'
		});
	},

	editPost: (req, res) => {
		Film.findById(req.params.id).then(currentFilm => {
			currentFilm.updateAttributes(req.body).then(() => {
                res.redirect('/');
			});
		})
	},

	deleteGet: (req, res) => {
        Film.findById(req.params.id).then(currentFilm =>{
            res.render('film/delete', {'name':currentFilm['name'],
                'genre':currentFilm['genre'],
                'director':currentFilm['director'],
                'year':currentFilm['year'],
                'id':req.params.id}); // Sending the id, because the form action '<form action="/edit/{{id}}" method="POST">'
        });
	},

	deletePost: (req, res) => {
        Film.findById(req.params.id).then(currentFilm =>{
            currentFilm.destroy().then(() => {
                res.redirect('/');
			});
        });
	}
};