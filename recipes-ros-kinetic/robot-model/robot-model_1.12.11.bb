# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "contains packages for modeling various     aspects of robot information, specifi"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=17;endline=17;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native collada-parser collada-urdf joint-state-publisher kdl-parser liburdfdom-tools resource-retriever urdf urdf-parser-plugin"
SRC_URI = "https://github.com/ros-gbp/robot_model-release/archive/release/kinetic/robot_model/1.12.11-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "084b0edd62876344de10b547ff1cab14"
SRC_URI[sha256sum] = "520f64793de633ac49e6457697e098a40a2d2702a7d04123df1495c84356e051"
S = "${WORKDIR}/robot_model-release-release-kinetic-robot_model-1.12.11-0"

inherit catkin
