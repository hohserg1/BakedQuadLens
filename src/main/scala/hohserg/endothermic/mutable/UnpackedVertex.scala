package hohserg.endothermic.mutable

import hohserg.endothermic.BaseVertex
import hohserg.endothermic.format.AttributeRepresentation
import net.minecraft.client.renderer.vertex.VertexFormat

class UnpackedVertex(vertexP: AttributeRepresentation.Vertex)(implicit protected val quadData: Array[Int], protected val format: VertexFormat) extends BaseVertex[UnpackedVertex] {

  override implicit protected def vertex: AttributeRepresentation.Vertex = vertexP

  override def getUpdateDestination: UnpackedVertex = this
}
