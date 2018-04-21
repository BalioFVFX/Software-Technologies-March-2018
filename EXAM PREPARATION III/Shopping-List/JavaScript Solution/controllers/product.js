const Product = require('../models').Product;

module.exports = {
	index: (req, res) => {
		Product.findAll().then(products => {
			res.render('product/index', {'entries':products});
		});
	},

	createGet: (req, res) => {
		res.render('product/create');
	},

	createPost: (req, res) => {
		let productArgs = req.body;

		Product.create(productArgs).then(product => {
			res.redirect('/');
		}).catch(err => {
            console.log(err.message);
            res.render('product/create', {'entries':productArgs});
        });
	},

	editGet: (req, res) => {
		Product.findById(req.params.id).then(currentProduct => {
			res.render('product/edit', {'priority':currentProduct['priority'],
                'name':currentProduct['name'],
                'quantity':currentProduct['quantity'],
                'status':currentProduct['status'],
				'id':currentProduct['id']});
		});
	},

	editPost: (req, res) => {
		let filmArgs = req.body;

		Product.findById(req.params.id).then(currentFilm => {
			currentFilm.updateAttributes(filmArgs).then(() => {
				res.redirect('/');
			});
		});
	}
};