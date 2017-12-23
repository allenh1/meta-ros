# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "hector_xacro_tools"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native xacro"
SRC_URI = "https://github.com/tu-darmstadt-ros-pkg-gbp/hector_models-release/archive/release/kinetic/hector_xacro_tools/0.4.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f74e2c6ff1ad9d95369d3c399cd6791a"
SRC_URI[sha256sum] = "53d61c582555f9d3e09d8c1e5e6b4f60cc5c2792f0fefa8a72868c611f3d2712"
S = "${WORKDIR}/hector_models-release-release-kinetic-hector_xacro_tools-0.4.2-0"

inherit catkin
