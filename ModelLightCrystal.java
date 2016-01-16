// Date: 11/07/2012 4:15:24 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package net.minecraft.src;

public class ModelLightCrystal extends ModelBase
{
  //fields
    ModelRenderer Crystal;
    ModelRenderer Rod;
    ModelRenderer Bottom;
  
  public ModelLightCrystal()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Crystal = new ModelRenderer(this, 9, 0);
      Crystal.addBox(0F, 0F, 0F, 4, 4, 4);
      Crystal.setRotationPoint(-2F, 8F, -2F);
      Crystal.setTextureSize(64, 32);
      Crystal.mirror = true;
      setRotation(Crystal, 0F, 0F, 0F);
      Rod = new ModelRenderer(this, 0, 0);
      Rod.addBox(0F, 0F, 0F, 2, 12, 2);
      Rod.setRotationPoint(-1F, 12F, -1F);
      Rod.setTextureSize(64, 32);
      Rod.mirror = true;
      setRotation(Rod, 0F, 0F, 0F);
      Bottom = new ModelRenderer(this, 9, 9);
      Bottom.addBox(0F, 0F, 0F, 4, 1, 4);
      Bottom.setRotationPoint(-2F, 23F, -2F);
      Bottom.setTextureSize(64, 32);
      Bottom.mirror = true;
      setRotation(Bottom, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    Crystal.render(f5);
    Rod.render(f5);
    Bottom.render(f5);
  }
  
  public void renderModel(float f1)
  {
    Crystal.render(f1);
    Rod.render(f1);
    Bottom.render(f1);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5);
  }

}
