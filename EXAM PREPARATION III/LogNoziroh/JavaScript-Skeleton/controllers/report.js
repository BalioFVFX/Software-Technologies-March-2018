const Report = require('../models').Report;

module.exports = {
    index: (req, res) => {
        Report.findAll().then(reports => {
            res.render('report/index', {'reports':reports});
        });
    },
    createGet: (req, res) => {
        res.render('report/create');
    },
    createPost: (req, res) => {

        let reportArgs = req.body;

        Report.create(reportArgs).then(report => {
            res.redirect('/');
        }).catch(err => {
            console.log(err.message);
            res.render('report/create', {'report':reportArgs});
        });
    },
    detailsGet: (req, res) => {
        Report.findById(req.params.id).then(currentReport => {
            res.render('report/details', {'status':currentReport['status'], 'message':currentReport['message'], 'origin':currentReport['origin']});
        });
    },
    deleteGet: (req, res) => {
        Report.findById(req.params.id).then(currentReport => {
            res.render('report/delete', {'status':currentReport['status'], 'message':currentReport['message'], 'origin':currentReport['origin']});
        });
    },
    deletePost: (req, res) => {
        Report.findById(req.params.id).then(currentReport => {
            currentReport.destroy().then(() => {
                res.redirect('/');
            });
        });
    }
};