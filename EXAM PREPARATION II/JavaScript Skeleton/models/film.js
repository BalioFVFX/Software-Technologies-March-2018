const Sequelize = require('sequelize');

module.exports = function(sequelize){
    const Films = sequelize.define('Film', {
        name:{
            type: Sequelize.TEXT,
            allowNull: false
        },
        genre:{
            type: Sequelize.TEXT,
            allowNull: false
        },
        director:{
            type: Sequelize.TEXT,
            allowNull: false
        },
        year:{
            type: Sequelize.INTEGER,
            allowNull: false
        },
    });

    return Films;
};