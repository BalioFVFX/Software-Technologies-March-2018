const Project = require('../models').Project;

module.exports = {
    index: (req, res) => {
        // Find all projects and display them
        Project.findAll().then(projects => {
            res.render('project/index', {'projects':projects});
        });

    },
    createGet: (req, res) => {
        res.render('project/create');
    },
    createPost: (req, res) => {
        // Get the project from the form
        let projectArgs = req.body.project;

        // Save the project in the database
        Project.create(projectArgs).then(project =>{
            res.redirect('/');
        }).catch(err =>{
            console.log(err.message);
            res.render('project/create', {error:err.message});
        })
    },
    editGet: (req, res) => {
        Project.findById(req.params.id).then(currentProject => {
            res.render('project/edit', {'project':currentProject});

        });
    },

    editPost: (req, res) => {
        // Get the current project
        Project.findById(req.params.id).then(currentProject => {
            // Update the current project with the new one from the form
            currentProject.updateAttributes(req.body.project);
            res.redirect("/");
        })
    },

    deleteGet: (req, res) => {
        Project.findById(req.params.id).then(currentProject => {
            res.render('project/delete', {'project':currentProject});
        });
    },
    deletePost: (req, res) => {
        // Get the current project
        Project.findById(req.params.id).then(currentProject => {
            // Delete the current project and redirect to index
            currentProject.destroy().then(() => {
                res.redirect("/");
            });
        })
    }
};