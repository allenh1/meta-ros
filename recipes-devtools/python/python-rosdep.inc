DESCRIPTION = "rosdep package manager abstraction tool for ROS"
SECTION = "devel/python"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=e910b35b0ef4e1f665b9a75d6afb7709"
SRCNAME = "rosdep"

SRC_URI = "http://download.ros.org/downloads/rosdep/rosdep-${PV}.tar.gz"

S = "${WORKDIR}/${SRCNAME}-${PV}"

RDEPENDS_${PN} += "${PYTHON_PN}-catkin-pkg ${PYTHON_PN}-rospkg ${PYTHON_PN}-pyyaml ${PYTHON_PN}-netclient ${PYTHON_PN}-rosdistro"

BBCLASSEXTEND += "native"
