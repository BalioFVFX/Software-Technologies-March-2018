using Microsoft.EntityFrameworkCore;

namespace TODOLIST.Models
{
    public class TaskDbContext : DbContext
    {
        public DbSet<Task> tasks { get; set; }
        public object Tasks { get; internal set; }

        public TaskDbContext()
        {
            this.Database.EnsureCreated();
        }

        protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
        {
            optionsBuilder.UseMySQL("server=localhost;database=todo;user=root");
        }
    }
}
