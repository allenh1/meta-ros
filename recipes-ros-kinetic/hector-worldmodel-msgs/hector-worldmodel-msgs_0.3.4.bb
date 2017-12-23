# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "hector_worldmodel_msgs is a message package to comes with the hector_worldmodel "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native geometry-msgs message-generation message-runtime sensor-msgs"
SRC_URI = "https://github.com/tu-darmstadt-ros-pkg-gbp/hector_worldmodel-release/archive/release/kinetic/hector_worldmodel_msgs/0.3.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8268f9984821c01eba702feb810d710c"
SRC_URI[sha256sum] = "1ab708070d327862301d048d17a06346ea18b3e72eeacc2bcf756b1060f2da9f"
S = "${WORKDIR}/hector_worldmodel-release-release-kinetic-hector_worldmodel_msgs-0.3.4-0"

inherit catkin
