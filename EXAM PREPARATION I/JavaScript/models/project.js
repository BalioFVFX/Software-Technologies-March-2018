const Sequelize = require('sequelize');

module.exports = function (sequelize) {
   const Project = sequelize.define('Project', {
      title:{
         type: Sequelize.TEXT,
         allowNull: false
      },
       description:{
           type: Sequelize.TEXT,
           allowNull: false
       },
       budget:{
           type: Sequelize.INTEGER,
           allowNull: false
       },
   });

    return Project;
};